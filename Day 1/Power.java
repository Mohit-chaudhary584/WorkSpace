import java.lang.Math;
import java.util.Scanner;
class Power{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int expo = sc.nextInt();
		System.out.println(Math.pow(base,expo));
	}
}