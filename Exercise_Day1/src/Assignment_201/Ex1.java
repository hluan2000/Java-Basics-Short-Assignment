package Assignment_201;

public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 101 / 3;
		boolean y = false && true,g=true && true, z = (false || false) && (true && true), f = (false && false) || (true && true);
		System.out.println("a) (101+0)/3 = " + x);
		System.out.println("b)  3.0e-6 * 10000000.1 = "+  3.0e-6 * 10000000.1);
		System.out.println("c) true && true -> "+ g);
		System.out.println("d) false && true -> "+ y);
		System.out.println("e) (false && false) || (true && true) -> "+ z);
		System.out.println("f) (false || false) && (true && true) -> "+ f);
	}
}
