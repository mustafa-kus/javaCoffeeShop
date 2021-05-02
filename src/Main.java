import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Mustafa");
		customer.setLastName("Kuþ");
		customer.setDateOfBirth(LocalDateTime.now());
		customer.setNationalId("1234");
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(customer);
		
		
	}

}
