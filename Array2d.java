import java.util.Scanner;
class Array2d {
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++){
				a[i][j] = obj.nextInt();
			}
		}
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
				
	}
	
}