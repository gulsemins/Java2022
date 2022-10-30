package abstractClasses;

public abstract class BaseGameCalculator {
	public abstract void hesapla(); // ya abstract olarak yaparız ya da bodysine dafault değer yazarız
	
	public void gameOver() {
		System.out.println("Oyun bitti!");
	}
	/* Anlamı baseGameCalculatoru kim kullanıyorsa gameOver() metodunu olduğu gibi  kullanmalı bu hiçbir zaman değişmeyecek bir kuraldır.
	 * Hesapla() ise kim implemente yani inherit ediyorsa override etmeli yani kedni hesaplasını yazmalı
	 * 
	 */

}
