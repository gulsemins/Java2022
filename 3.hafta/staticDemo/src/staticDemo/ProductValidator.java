  package staticDemo;
  //product validatorlar genellikle bir ürünü güncellerken kurallara uygun olup olmadığını bulmak için kullanırız

  
  public class ProductValidator{
	  
	  static {
			  System.out.println("Static yapıcı calisti");
		  }
		  
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
			
// static boolean dediğimiz için newlememize gerek yokama sadece public static void deseydik newlemeliydik				
			
			
		}
		
	}
	public void bisey() {
		//burada static olamdığı için managera gidip productvalidatoru  newlemeliyiz
	}
	
	public static class BaskaBirClass{
		public static void sil() {
			//bir classın içinde başka bir class tanımlarsan static kullanmalısın ayrıca buna "inner class" denir!
		}
	}

}
