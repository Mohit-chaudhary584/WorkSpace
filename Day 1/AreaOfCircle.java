import java.util.Scanner;
import java.lang.Math;

class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		System.out.println(Math.PI * Math.pow(rad,2));
	}
}