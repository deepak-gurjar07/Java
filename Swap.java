import java.lang.*;
class Swap{
	public static void main(String args[]){
		int a=20, b=10;
		System.out.println("Value of a and b before swaping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a and b after swaping: "+a+" "+b);
	}
}