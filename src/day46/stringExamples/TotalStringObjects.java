package day46.stringExamples;

public class TotalStringObjects {

	public static void main(String[] args) {
		String s1 = new String("Hello");
	    
		s1.concat(" friends");
	    
		String s2 = s1.concat(" Guys");
	    
		s1 = s1.concat(" Java");

	   System.out.println(s1);
	   System.out.println(s2);
	   
	   String s3 = new String("Kanhaiya");
	   System.out.println(s3.length());
	   
	   StringBuffer sb = new StringBuffer("Abu");
	   sb.append(" Bhai");
	   String s4 = new String(sb);
	   s4.concat(" Hello");
	   System.out.println(s4.length());
	   
	   
	   byte[] b = {65, 66, 67, 68};
	   
	   String s5 = new String( b);  
	   System.out.println(s5);
	   System.out.println(s5.isEmpty());
	   
	   String s6 = new String();
	   System.out.println(s6.isEmpty());
	   
	   String s7 ="ABCDE";
	   System.out.println(s7.isEmpty());
	   System.out.println(s7.length());
	   
	   String s8 ="";
	   System.out.println(s8.isEmpty());
	   System.out.println(s8.length());
	   
	   
	   String s9 = new String("Saving Account");
	   
	   if(s9.equals("SAVING ACCOUNT"))
	   {
		   System.out.println("This is correct statement");
	   }
	   else {
		   System.out.println("This is incorrect statement");
	   }
	   
	   String s10 = "jAVa";
	   System.out.println(s10.toUpperCase());
	   
	  /* s10.equalsIgnoreCase("JAVA");
	   
	  //s10.equalsIgnoreCase(s10.startsWith("j"));
	   
	   System.out.println(s10.toUpperCase().startsWith("J"));*/
	   
	   System.out.println(s10.indexOf("V"));
	   
	   System.out.println("thisisjavacojursejava".indexOf("java", 7));
	   
	   System.out.println("GU;AB;ONBBB;AB;CA".indexOf("AB", 0));
	   
	   String[] split = "GU;AO;BN;BB;BA;BA".split(";");
	   System.out.println("=======================================");
	   for (String string2 : "GU;AO;BN;BB;BA;BA".split(";", 3)) {
		System.out.println(string2);
	   }
	   System.out.println("=======================================");
	   
	   String[] strs = {"GU", "AO", "BN", "BB", "BA", "BA"};
	  
	   
	   
	   int[] arr = {1, 2, 3, 17, 21};
	   
	   for (String string : split) {
		System.out.println(string);
	}
	   
	   /*for (String str : split) {
		//System.out.println(str.contains("BB"));
		   if(str.indexOf("BB", 0) >= 0 ) {
			   System.out.println("Found");
			   break;
		   }
		//System.out.println(str.indexOf("BB", 0));
	}*/
	   
	  /* System.out.println("GU;AO;BN;BB;BA".indexOf("AB"));
	   
	   //"GU;AB;ONBBB;AB;CA".
	   
	   System.out.println("thisisjavacoursejava".lastIndexOf("java"));
	   
	   String s ="Kanhaiya";
	   System.out.println(s.charAt(4));
	   
	   System.out.println("Kanhaiya".compareToIgnoreCase("KANhaiya"));*/
	   
	   System.out.println(" Java course ".trim().length());
	   
	   System.out.println("java".replace("a", "A"));
	   
	   for (char c : "Abu".toCharArray()) {
		System.out.println(c);
	  }
	   
	   String strValue = "Will Smith-Male-USA";
		// check if String value contains a specific string
		boolean bool = strValue.contains("Male");
		// print the string equivalent of our boolean check
		System.out.println(String.valueOf(bool));
	   
	  // String valueOf = "Abu".valueOf(true);
	  String valueOf = String.valueOf(bool);
	  
	  System.out.println("Kanhaiya");
	  String output = String.format("%20s = %10d", "Kanhaiya", 35);
	  System.out.println(output);
	  System.out.printf("My name is: %s%n", "Kanhaiya Chhipa");
	  
	  String replaceAll = "Kanhaiya Anand".replaceAll("an", "tt");
	  
	  System.out.println(replaceAll);
	}
}
