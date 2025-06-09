import java.util.Random;
public class conditions{
	Random r = new Random();
	public static void main(String[] args){
		Random r = new Random();
		int var1 = r.nextInt(10);
		if(var1 > 5){
			System.out.println("greater");
		}else{
			System.out.println("lesser");
		}

	}
}