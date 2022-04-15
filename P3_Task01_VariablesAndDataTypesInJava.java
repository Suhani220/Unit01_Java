package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {
	static int q = 11;
	int p = 10;
	
	public static void main(String[] args){
		
		int a, b, c;
		float pi;
		double d;
		char e;
		
		pi = 3.14f;
		d = 20.22d;
		e = 'v';
		
		a = 10;
		b = 10;
		c = 10;
		
		System.out.println("Inside main method : ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		double f;
		int i = 10;
		f = i;
		
		double g = 10;
		int j;
		j = (int)g;
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		byte k = 10;
		boolean l = true;
		long m = 10l;
		float n = 1.2f;
		double o = 1.2d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println("\nAccessing ABC class : ");
		System.out.println(ABC.j);            // As j is a static member, so we can call it without making an object
		
		ABC obj1 = new ABC();
		System.out.println(obj1.i);
		ABC.display();
		
		System.out.println();
		display();     // Cannot make a static reference to the non-static method. 
		               // So, we will make display method as static.
		
		// 96 - 113
		
	}
	
	int r = 10;
	
	static void display() {
		
		int a = 5;
		System.out.println("This is Display Method!");
		System.out.println("a = " + a);
		
	}
	
}

class ABC{
	
	static int j = 10;
	int i = 10;
	
	static void display() {
		int a = 5;
		System.out.println("This is Display Method in class ABC");
		System.out.println(a);
		
	}
	
	static void typeConversionAndTypeCasting() {
		
		double f;
		int i = 10;
		f = i;
		System.out.println(f);
		
		double g = 10;
		int j;
		j = (int)g;
		
		System.out.println(i);
		System.out.println(j);
		
	}
}
