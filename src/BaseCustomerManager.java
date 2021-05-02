
public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public  void save(Customer customer) {
		
		System.out.println("Veritabanýna Kaydedildi:"+customer.getFirstName());
	}

}