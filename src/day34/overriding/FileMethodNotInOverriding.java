package day34.overriding;

class P
{
	
	public final void m1() {}
}

class C extends P{
	// Final not allowed in overriding in parent class method
	//public final void m1() {}
}

public class FileMethodNotInOverriding {

}
