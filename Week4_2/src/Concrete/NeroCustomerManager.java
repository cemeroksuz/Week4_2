package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
	
	this.customerCheckService = customerCheckService;
}
	@Override
	public void Save(Customer customer)  {
		if(customerCheckService.checkIfRealPerson(customer)) {
			 super.Save(customer);
			
		}
		
	}

}
