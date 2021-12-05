package ainagulOdev1;

import java.util.Scanner;

public class NestedForLoopSekil {

	public static void main(String[] args) {
		
		/*Soru 12) Kullanicidan pozitif bir rakam girmesini isteyin;
		ve girilen rakama gore asagidaki sekli cizdirin
		*
		* *
		* * *
		* * * *
		*/
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen pozitif bir sayi giriniz: ");
		int sayi = scan.nextInt();
		
		for (int satir = 1; satir <=sayi; satir++) {
			
					for (int i = 1; i <= satir; i++) {
				
				System.out.print(" * ");
			}
		
		System.out.println("");
	}
	
	
}
}
