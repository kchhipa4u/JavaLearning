package day19.staticindetails;
public class IIBDemo
{
    // Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends
 
    public IIBDemo()
    {
        System.out.println("Default Constructor invoked");
    }
    public IIBDemo(int x)
    {
        System.out.println("Parametrized constructor invoked");
    }
    public static void main(String arr[])
    {
    	IIBDemo obj1, obj2;
        obj1 = new IIBDemo();
        obj2 = new IIBDemo(0);
        
        /*if (!StringUtils.isNumeric("491753245966")){
        	
        }*/
    }
}