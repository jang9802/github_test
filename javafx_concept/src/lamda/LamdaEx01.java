package lamda;

interface LamInterEx01{
	public void lam();
}
class LamClassEx01 implements LamInterEx01{

	@Override
	public void lam() {
		System.out.println("구현");
		
	}
	
}
public class LamdaEx01 {

	public static void main(String[] args) {
		LamClassEx01 lc=new LamClassEx01();
		lc.lam();

	}
}
