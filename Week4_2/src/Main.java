import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer();
		customer1.DateOfBirth =LocalDate.of(1993,12, 13);
		customer1.Id =1;
		customer1.FirstName ="Cem";
		customer1.LastName ="Eröksüz";
		customer1.NdtionalityId="12345678910";
		
		baseCustomerManager.Save(customer1);
	}

}
