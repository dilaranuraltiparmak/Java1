
public abstract class StarbucksCustomerManager extends BaseCustomerManager {
	  private ICustomerService iCustomerService;

	    public StarbucksCustomerManager(ICustomerService iCustomerCheckService) {
	        this.iCustomerService = iCustomerCheckService;
	    }
	
	
	@Override
	
		public void Save(Customer customer) {

        if(iCustomerService.checkIfRealPerson(customer)){
            super.Save(customer);
        }
        else{
            System.out.println("star");
        }
	}

}
