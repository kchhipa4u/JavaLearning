package day31.overloading;
class IntegerAdd
  {
  /*
      public void sum(int a, int b) {
    	  System.out.println("2 argumets added");
      }
	  
	  public void sum(int a, int b, int c) {
		  System.out.println("3 argumets added");
	  }
	  
	  public void sum(int a, int b, int c, int d) {
		  System.out.println("4 argumets added");
	  }
	  
	  public void sum(int a, int b, int c, int d, int e) {
		  System.out.println("5 argumets added");
	  }*/
	  
	  public void sum(int... is)
	  {
		  System.out.println("var args called " + is[1]);
	  }
	  
	  public static void main(String[] args) {
		  IntegerAdd a = new IntegerAdd();
		  a.sum(10, 20);
		  a.sum(10, 20, 40);
	}
  
  }