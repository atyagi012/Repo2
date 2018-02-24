package myPack1;

public class NormalClass {
	
	public void method3(){
		WithStatic.method1();
		System.out.println(WithStatic.i);
	}
	
	public static void main(String arg[]){
		NormalClass obj = new NormalClass();
		obj.method3();
	}

}
