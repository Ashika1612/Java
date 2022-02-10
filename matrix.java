package Method;

public class demoMethod {

	public static void main(String[] args) {
	
		int x[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int y[][] = {{1,3,4},{2,4,3},{1,2,4}};
		int z[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.println(z[i][j] + " ");
			}
		}System.out.println();
		
	}

}
