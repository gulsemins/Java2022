package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		BaseGameCalculator baseGameCalculator = new WomanGameCalculator();
	    // normalde abstarc sıınıflar ala newlenemz ama burda game calculator paramatre olarak verip istersek woman man veya kids aldık
		
	}

}
