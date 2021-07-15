package thisEg;

public class ThisPrg1 {
	
	int a,b;
	
	ThisPrg1(int a,int b){
		this();
		this.a=a;
		this.b=b;
		
		
	}
	
	ThisPrg1(){
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		
		ThisPrg1 obj=new ThisPrg1(5,2);
		
		System.out.println(obj.a +" "+obj.b);
		
         obj.add();		


	}
	//method to add
	void add() {
		int c=a+b;

		System.out.println("Sum ="+c);
		
		this.sub();//obj.sub();
		
	}

	void sub() {
		int c= a-b;
		System.out.println("Difference ="+ c);
	}
	
}
