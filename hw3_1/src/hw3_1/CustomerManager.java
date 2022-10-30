package hw3_1;

public class CustomerManager {
	private Customer customer;
    private TeacherCreditManager iCreditManager;

    public CustomerManager(Customer customer, TeacherCreditManager teacherCreditManager) {
        this.customer = customer;
        this.iCreditManager = teacherCreditManager;
    }

    public void CustomerManager1(Customer customer2, TeacherCreditManager teacherCreditManager) {
		// TODO Auto-generated constructor stub
	}

	public void save() {
        System.out.println("Müşteri kaydedildi : " );
    }

    public void delete() {
        System.out.println("Müşteri silindi : " );
    }

    public void giveCredit() {
        iCreditManager.calculate();
        System.out.println("Kredi verildi.");
    }

}
