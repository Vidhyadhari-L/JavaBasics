package corejava;

public class TypeCasting {

	public static void main(String[] args) {
		// Widening typecasting-lower to higher-implicit casting
		
	/*	int i=100;
		long l=i;
		float f=l;
		System.out.println("Integer value is "+i);

		System.out.println("long value is "+l);
		System.out.println("float value is "+f);*/
		
		//Narrowing typecasting-higher to lower-explicit casting
		
		double d=1000;
		long l=(long)d;
		int i=(int)d;
		System.out.println("double value is "+i);

		System.out.println("long value is "+l);
		System.out.println("int value is "+i);

		
		

	

	
	}
	
}
	
