package new1;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER ANY NUMBER : ");
		int num = sc.nextInt();
		boolean isPrime = true;
		//for loop is all about non prime
		for(int i = 2; i < num; i++) {
			//condition for non prime
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " IS A PRIME NUMBER");
		}
		else {
			System.out.println(num + " IS NOT A PRIME NUMBER");
  	}

	}
  
}
