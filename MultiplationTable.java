package practice2;
 
public class MultiplationTable {
	public static void main(String[] args) {
		
		int num=1;
		for(int i=1;i<=10;i++) {
				
			for (int j=1;j<=10;j++) {
				System.out.println(num+" * "+j +" = "+ (num*j) );
				
			}
			System.out.println();
			num++;
		}
			
	}
}
