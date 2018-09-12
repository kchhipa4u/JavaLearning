package day20.statakandheap;

public class Learn {

	String instanceVar1;
	String var2;
	String var3;
	String var4;
	String var5;
	
	public void m1(Learn tm) {      /// ThisMethod tm = tt;
		System.out.println(tm.instanceVar1);
		tm.var2 = "AAAA";
	}
	
	public void m2()
	{
		m1(this);
	}
	
	public static void main(String[] args) {
		Learn tt = new Learn();
		tt.instanceVar1 = "Abu";
		tt.m2();
	}
}
