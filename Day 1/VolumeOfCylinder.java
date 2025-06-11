import java.util.Scanner;
import java.lang.Math;
class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		int hei = sc.nextInt();
		System.out.println(Math.PI * Math.pow(rad,2) * hei);
	}
}