package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator(); static yaptığımız için gerek yok
		if(ProductValidator.isValid(product)) {
		System.out.println("Eklendi");
		}else {
		System.out.println("Ürün bilgileri geçersizdir.");
	}

}
	 }
