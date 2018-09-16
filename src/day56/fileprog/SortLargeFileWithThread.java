package day56.fileprog;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kanhaiya.chhipa
 * 
 *
 */
public class SortLargeFileWithThread {

	private static final int CHUNK_IN_FILE = 20;

	public static final String fdir = "E:\\Neustar\\GDI\\TMT Countries Data\\";
	public static final String fPath = "E:\\Neustar\\GDI\\TMT Countries Data\\kan_IT_full.csv";

	public static void main(String[] args) throws IOException {
		
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");
		
		int startLine, endLine;

		Path path = Paths.get(fPath);
		long lineCount = Files.lines(path).count();
		int totalThreadCount = 0;

		if (lineCount <= CHUNK_IN_FILE) {
			if (lineCount % CHUNK_IN_FILE > 0) {
				totalThreadCount = totalThreadCount + 1;
			}
		} else {
			totalThreadCount = (int) (lineCount / CHUNK_IN_FILE);
			if (lineCount % CHUNK_IN_FILE > 0) {
				totalThreadCount = totalThreadCount + 1;
			}
		}
		startLine = 1;
		endLine = CHUNK_IN_FILE;

		long startTime = System.nanoTime();

		List<File> files = new ArrayList<>();
		
		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadsFactory());
		CountDownLatch doneSignal = new CountDownLatch(totalThreadCount);
		
		for (int i = 1; i <= totalThreadCount; i++) {
			String filepath = fdir + "op" + i + ".csv";
			files.add(new File(filepath));
			execService.execute(new SplitAndSortTempFiles(startLine, endLine, filepath, doneSignal));
			
			startLine = startLine + CHUNK_IN_FILE;
			endLine = endLine + CHUNK_IN_FILE;
		}
		execService.shutdown();
		
		try {
			doneSignal.await();
			System.out.println("[" + currentThreadName + "] " + currentThreadName + 
					" GOT THE SIGNAL TO CONTINUE ...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		FileSplitSortMergeUtilNew.mergeSortedFiles(files, "E:\\Neustar\\GDI\\TMT Countries Data\\output.csv",
				new StringComparator());
		long endTime = System.nanoTime();
		double timeTaken = (endTime - startTime) / 1e9;
		System.out.println(timeTaken);
	}
}
