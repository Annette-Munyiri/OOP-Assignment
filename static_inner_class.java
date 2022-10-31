class  static_inner_class{
	static class InnerNestedClass{
		public void m1(){
			System.out.println("Static class Method");
		}
	}
	public static void main(String[] args){
		InnerNestedClass inc = new InnerNestedClass();
		inc.m1();
		System.out.println("Outer Main Method");
	}
}

class Test{
	public static void main(String[] args){
		static_inner_class.InnerNestedClass inc = new static_inner_class.InnerNestedClass();
		inc.m1();
		System.out.println("Test Main Method");
	}
}


// output :- 
// Static class Method
// Test Main Method