package base;

public class MasterCls {
	
	
	String name ="Bharath Kumar";
	
	public void m1() {
		
		int a = 10;
		a++;
		System.out.println(a);
	}
	
	public void m2(int a,int b) {
		
		int c = a+b;
		System.out.println(c);
		
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
