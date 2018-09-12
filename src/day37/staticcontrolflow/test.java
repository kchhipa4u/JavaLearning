package day37.staticcontrolflow;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	public static void main(String[] args) {
		
		//String text ="\\;spid=12331\\;mcc=214\\;mnc=\\;ndpi\\;iso2=es!\\;auxinfo=str\\;altmnc=21411,21409";
		
		Map<String, String> responceTokenMap = new HashMap<String, String>();
		
        
		String text ="!^(.*)$!tel:\\\\1\\;spid=6294\\;mcc=214\\;mnc=04\\;ndpi\\;iso2=es!";
				
        String patternString = "(?<nitesh>[a-zA-z0-9]+)=(?<value>[a-zA-z0-9,]*[^\\\\;])";

        Pattern pattern = Pattern.compile(patternString);
        
        Matcher matcher = pattern.matcher(text);
        
        System.out.println(matcher.matches());

        int count = 0;
        while(matcher.find()) {
            count++;
           System.out.println("found: " + count + " : "  + matcher.group("nitesh") + " - " + matcher.group("value"));
            responceTokenMap.put(matcher.group("nitesh"),matcher.group("value"));
           // System.out.println(responceTokenMap);
        }
        System.out.println(responceTokenMap);
	}
}