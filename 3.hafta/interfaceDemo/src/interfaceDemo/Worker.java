package interfaceDemo;
//bizim bankanın kendi çalışanı
public class Worker implements IWorkable, IEatable, IPayable{
	@Override
	public void work() {
		
	}
	// burada eat metodunu koyduk çünkü biz kendi çalışanlarımıza yemek sağlıyoruz ama outsource elemanlara yemek desteği sağlamaıyoruz bu yüzden outsource classına bu metodu yazmadık
	@Override
	public void eat() {
		}
	@Override
	public void pay() {
		
	}
}
