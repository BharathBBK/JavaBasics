package base;

public class MasterCls {
	
	
	String name ="Bharath Kumar";
	
	public void m1() {
		
		int a = 11;
		a++;
		System.out.println(a);
	}
	
	public void m2(int a,int b,int c) {
		
		int d = a+b+c;
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MasterCls MSC = new MasterCls();
        
		//System.out.println("Bharath Kumar");
		System.out.println(MSC.name);
		MSC.m1();
		MSC.m2(10, 22);
	}

}
