package miniProje5sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5; // aranacak sayiyi dizinin içinde bulmaya çalışacağız
		
		boolean varMi=false;
		
		for(int sayi:sayilar) { //bu yolla dizilerde bütün elemanlai gezebiliyoruz
			if(sayi == aranacak) {
				varMi =true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayi mevcuttur");
			
		}else {
			System.out.println("Sayi mevcut degildir");
		}
	}

}
