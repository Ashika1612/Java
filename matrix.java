package new1;
import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
	
		System.out.println("1. ADDITION ");
		System.out.println("2. MULTIPLICATION");
		System.out.println("\nENTER YOUR CHOICE : ");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		int x[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int y[][] = {{1,3,4},{2,4,3},{1,2,4}};
		int z[][] = new int[3][3];
		
		switch(ch) {
		case 1:
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					z[i][j] = x[i][j] + y[i][j];
					System.out.println(z[i][j] + " ");
				}
			}System.out.println();
			break;
		case 2:
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					z[i][j] = x[i][j] * y[i][j];
					System.out.println(z[i][j] + " ");
				}
			}System.out.println();
			break;
		}
	}

}
