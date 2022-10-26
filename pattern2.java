
public class pattern_2 {

	public static void main(String[] args) {
		
		int i, j; 
		int n=8;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*"); 

			}
			for (j = i*2; j < n*2; j++) {
				
				System.out.print(" "); 

			}
			for (j = i; j >= 1; j--) {
				System.out.print("*"); 

			}
			System.out.println();
		}


	}

}
