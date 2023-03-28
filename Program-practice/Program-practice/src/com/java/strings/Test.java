package com.java.strings;

 class Driver {
//	public void method1 (int num1,float num2){
//        System.out.println("int-float method");
//   }
//   public void method1(float num1,int num2){
//        System.out.println("float-int method");
//   }
//    
//
//	public static void main(String[] args) {
//		Test interviewBit=new Test();
//        interviewBit.method1(40,20);
//
//	}
//	int fun (int n) 
//    {
//        int result;
//        result = fun (n - 1);
//        return result;
//    }
	  public int num1;
	     static int num2;
	       void calculate(int a, int b)
	       {
	           num1 +=  a ;
	           num2 +=  b;
	       }       
} 
class Test{
    public static void main(String args[]) 
    {
//    	Driver ib = new Driver() ;
//        System.out.print(ib.fun(12));
    	
    	Driver obj1 = new Driver();
    	Driver obj2 = new Driver();   
        obj1.num1 = 0;
        obj1.num2 = 0;
        obj1.calculate(1, 2);
        obj2.num1 = 0;
        obj2.calculate(2, 3);
        System.out.println(obj1.num1 + " " + obj2.num2); 
    }
}

