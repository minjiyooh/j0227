package t2_연산자;

public class Test1 {
	public static void main(String[] args) {
		int su = 0;
		System.out.println("1.su : " + su);
		
		su = su +1;
		System.out.println("2.su : " + su);
		
		su +=1;
		System.out.println("3.su : " + su);
		
		++su;
		System.out.println("4.su : " + su);
		
		su++;
		System.out.println("5.su : " + su);
		System.err.println("============================");
		
		int res = 0;
		res = su;
		System.out.println("6.su : "+su+" , res : " + res );
		
		res = ++su + 10; // su:5 res :15
		System.out.println("7.su : "+su+" , res : " + res );
		
		res = su++ + 10; // su:6 res :16
		System.out.println("8.su : "+su+" , res : " + res ); 
		//후위 연산자는 연산 다 하고 마지막에 자기 스스로 혼자 증가함
	
		res = --su + 10; // su:5 res :15
		System.out.println("9.su : "+su+" , res : " + res ); 
		
		
		res = su-- + 10; // su:4 res :15
		System.out.println("10.su : "+su+" , res : " + res ); 
		
		res = ++su + su-- + 10; // su:4 res :20
		System.out.println("11.su : "+su+" , res : " + res ); 
		
		
		
		
		
		
	}

}
