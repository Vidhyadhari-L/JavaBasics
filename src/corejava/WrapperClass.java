package corejava;

public class WrapperClass {

	public static void main(String[] args) {

	/*	int a=10;
		Integer i=Integer.valueOf(a);//converting int into integer
		Integer j=a;//autoboxing
		System.out.println(a+""+i+" "+j);

	}

}
///convert priimitive into object-->autoboxing
*/
		
//convert wrapper to primitive-->unboxing
		
		Integer a=new Integer(3);
		int i=a.intValue();//converting integer to int
		Integer j=a; //unboxing
		System.out.println(a+""+i+" "+j);

		
		
		
	}
}