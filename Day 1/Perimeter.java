import java.util.Scanner;
class Perimeter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int wid = sc.nextInt();
		System.out.println(2*(len+wid));
	}
}