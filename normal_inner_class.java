class  normal_inner_class{
	int x = 10;
	static int y = 20;
	class InnerClass{
		public void m1(){
			System.out.println("Value of x = "+x);
			System.out.println("Value of y = "+y);
		}
	}
	public void m2(){
		InnerClass i = new  InnerClass();
		i.m1(); 
	}
	public static void main(String[] args){
		normal_inner_class o = new normal_inner_class();
		o.m2();
		System.out.println("Outer class main method");
	}
}

// Output :- 
// Value of x = 10
// Value of y = 20
// Outer class main method