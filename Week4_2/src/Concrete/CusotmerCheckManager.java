package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CusotmerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
