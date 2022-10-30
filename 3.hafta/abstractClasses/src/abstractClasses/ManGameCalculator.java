package abstractClasses;

public class ManGameCalculator extends BaseGameCalculator {
	// bu cinsiyet şeyini base de kadin erkek ve çocuk için if kullanaarak da yapabilirdik ama bizim amacımız if kullanmaktan kaçınmak çünkü sonra spagetti oluyo
	@Override
	public void hesapla() {
		System.out.println("Puaniniz: 90");
	}

}
