import java.lang.*;
import java.util.Scanner;
abstract class Operations{
	abstract void getOutput(int x,int y);
	
}
class Add extends Operations{
	void getOutput(int x,int y){
		System.out.println("result="+(x+y));
	}
}
class Subtract extends Operations{
	void getOutput(int x,int y){
		System.out.println("result="+(x-y));
	}
}
class Multiply extends Operations{
	void getOutput(int x,int y){
		System.out.println("result="+(x*y));
	}
}
class Division extends Operations{
	void getOutput(int x,int y){
		System.out.println("result="+(x/y));
	}
}
class Calculator{
	public static void main(String args[]){
		
		Operation ob;
		Scanner input=new Scanner(System.in);
		System.out.print("a");
		int a=input.nextInt();
		System.out.print("b");
		int b=input.nextInt();
		System.out.println("Enter an operator");
		char k=input.next().charAt(0);
		switch(k)
		{
		case'+':
			ob=new Add();
			ob.getOutput(a,b);
			break;
		case'-':
			ob=new Add();
			ob.getOutput(a,b);
			break;
		case'*':
			ob=new Add();
			ob.getOutput(a,b);
			break;
		case'/':
			ob=new Add();
			ob.getOutput(a,b);
			break;
		default:
			System.out.println("incorrect");
		}
		
	}
}