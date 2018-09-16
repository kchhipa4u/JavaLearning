package day56.fileprog;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitAndSortTempFiles implements Runnable {

	int startLine;
	int endLine;
	String filePath;

	private CountDownLatch doneCountLatch;

	public SplitAndSortTempFiles(int startLine, int endLine, String filePath, CountDownLatch doneCountLatch) {
		super();
		this.startLine = startLine;
		this.endLine = endLine;
		this.filePath = filePath;
		this.doneCountLatch = doneCountLatch;
	}

	@Override
	public void run() {
		boolean isRunningInDaemonThread = Thread.currentThread().isDaemon();
		String threadType = isRunningInDaemonThread ? "DAEMON" : "USER";

		String currentThreadName = Thread.currentThread().getName();

		System.out.println("##### [" + currentThreadName + ", " + threadType + "]  STARTING #####");

		int totalLines = endLine + 1 - startLine;

		try (Stream<String> chunks = Files.lines(Paths.get(SortLargeFileWithThread.fPath), Charset.defaultCharset())
				.skip(startLine - 1)
				.limit(totalLines)
				.map(line -> line.trim())
				.filter(line -> line.length() > 0)
				.map(ele -> ele.replaceAll("\"", ""))
				.map(e -> e.replaceAll("\'", ""))) {

			BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath));

			chunks.forEach(line -> {
				writeToFile(writer, line);
			});
			System.out.println(" Done Writing " + Thread.currentThread().getName());
			writer.close();

			sortFileContent();

			if (doneCountLatch != null) {
				doneCountLatch.countDown();

				System.out.println("***** [" + currentThreadName + ", " + threadType + "] <" + " LATCH COUNT = "
						+ doneCountLatch.getCount());
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void writeToFile(BufferedWriter writer, String line) {
		try {
			writer.write(line + "\r\n");

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void sortFileContent() throws IOException {
		List<String> lines = new ArrayList<>();
		try (Stream<String> ln = Files.lines(Paths.get(filePath), Charset.defaultCharset())) {
			lines = ln.distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		}

		try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(filePath))) {
			for (String line : lines) {
				bw.write(line);
				bw.write("\r\n");
			}
		}

	}

}
