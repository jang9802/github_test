package lamda;

interface LamInterEx02{
	public void lam();
}

public class LamdaEx02 {

	public static void main(String[] args) {
		LamInterEx02 lc=new LamInterEx02() {
			@Override
			public void lam() {
				System.out.println("구현");
			}
		};
		
		
		lc.lam();

	}
}
