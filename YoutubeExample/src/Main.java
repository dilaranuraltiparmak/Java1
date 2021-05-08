
public class Main {

	public static void main(String[] args) {
	    BaseCustomerManager customerManager = new NeroCustomerManager();
       Customer customer = new Customer();
       customer.FirstName="dilaranur";
       customer.DateOfBrith="1999";
       customer.id=3;
       customer.NationalityId="12345890084";
       customer.LastName="altýparmak";
       customerManager.Save(customer);
    
    }

	}


