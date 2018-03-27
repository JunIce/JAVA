package Test;

public class Test {
	public static void main(String[] args) {
		int num = 150;
		A a = new A( num );
		Boolean b = a.size();
		
		if(b) {
			System.out.println("小了");
		}else {
			System.out.println("大了");
		}
	}
}



class A {
	private int num = 100;
	private int user_num;
	
	public A(int a) {
		this.user_num = a;
	}
	
	public boolean size() {
		if(this.num > this.user_num) {
			return true;
		}else {
			return false;
		}
	}
}