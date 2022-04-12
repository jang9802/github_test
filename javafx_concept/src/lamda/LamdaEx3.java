package lamda;

interface LamInterEx3{
	public void lam();
}

public class LamdaEx3 {

	public static void main(String[] args) {
		LamInterEx3 lc=() -> System.out.println("구현");
		
		lc.lam();
		
		lc=()->{
			System.out.println("람다식을 이용하여");
			System.out.println("인터페이스의 추상 메소드 내용을");
			System.out.println("현위치에서 구현");
		};
		lc.lam();
	}
}
