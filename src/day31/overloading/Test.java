package day31.overloading;
class Test{
    public void m1(int i){
     System.out.println("int argument");
    }
    
    public void m1(float f){
     System.out.println("float argument");
    }
    
    public static void main(String[] args) {
		Test t = new Test();
		t.m1(10);
		t.m1(10.7f);
		
		// Overloading , At the time of method resolution, automation promotion happens
		// byte -> short ->  int ->  long ->  float -> double
		t.m1('c');
		t.m1(25l);
		//t.m1(17.5);  // CTE, promotion will not happen here
	}
}