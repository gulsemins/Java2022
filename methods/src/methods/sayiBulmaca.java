package methods;

public class sayiBulmaca {

	public static void main(String[] args) { 
		int[] sayilar = new int[] {1, 2, 5, 7, 9, 0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi: sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
	
    String mesaj = "";
	if(varMi){
		mesaj = "Sayi mevccuttur: + aranacak";
		mesajVer(mesaj);

	}else
	{
		mesajVer("Sayi mevccut degildir:" + aranacak);
	}

	}

	public static void mesajVer (String mesaj) {
    	  System.out.println(mesaj);
      }
}
