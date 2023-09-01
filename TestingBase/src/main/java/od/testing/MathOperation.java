/**
 * 
 */
package od.testing;

/**
 * 
 */
public class MathOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("result:" + add(2, 4));

	}
	
	public static long add(int n1, int n2) {
		return n1+n2;
	}

	public static long multiply(int m1, int m2) {
//		long r = m1;
//		for(int i=1;i<m2;i++) {
//			r+=m1;
//		}
//		return r;
		return m1*m2;
	}

}
