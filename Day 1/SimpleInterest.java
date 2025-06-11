import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pri = sc.nextInt();
		float rate = sc.nextFloat();
		float time = sc.nextFloat();
		System.out.println((pri*rate*time)/100);
	}
}