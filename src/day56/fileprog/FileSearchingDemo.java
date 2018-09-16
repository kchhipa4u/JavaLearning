package day56.fileprog;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FileSearchingDemo {

	static int currentLN = 0;
	static List<Integer> aa = null;
	
	public static void main(String[] args) throws IOException {
		
		List<Path> allFiles = Files.list(Paths.get("E:\\Kanhaiya\\Sample"))
        .filter(Files::isRegularFile).collect(Collectors.toList());
       
		for (Path path : allFiles) {
			
			Map<Integer, List<String>> requiredNodes = Files.lines(path, Charset.defaultCharset())
				 .map(line -> {
					 currentLN = currentLN+1;
					 return line;
					 })
			     .filter(line -> line.equalsIgnoreCase("<start>") || line.equalsIgnoreCase("Term file") || line.equalsIgnoreCase("abu"))
			     .collect(Collectors.groupingBy(
			    	        line -> currentLN, TreeMap::new, Collectors.toList()));
			
			Set<Entry<Integer, List<String>>> entrySet = requiredNodes.entrySet();
			Map<Integer, List<Integer>> finalMap = new HashMap<>();
			int cnt =1;
			List<Integer> files = null;
			for(Entry<Integer, List<String> >ele : entrySet) {
				if(ele.getValue().get(0).equals("<start>")) {
					files = new ArrayList<>();
				}
				files.add(ele.getKey());
				if(ele.getValue().get(0).equals("Term file")) {
					finalMap.put(cnt, files);
					cnt++;
				}
			}
			
			System.out.println(finalMap);
			System.out.println(requiredNodes);
		}
		
	}

}


