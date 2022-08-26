package Elevenfeatures;
interface Example{
	double cal(int a , double am);
}
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example c = (var a, var b) -> a * (b/100);

		System.out.println("Calculted Intrest is  = " +c.cal(8000,3) );

	}

}
