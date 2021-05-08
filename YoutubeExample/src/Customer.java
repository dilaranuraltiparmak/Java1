
public class Customer implements IEntity {
public int id;
public String FirstName;
public String LastName;
public String NationalityId;
public String DateOfBrith;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getNationalityId() {
	return NationalityId;
}
public void setNationalityId(String nationalityId) {
	NationalityId = nationalityId;
}
public String getDateOfBrith() {
	return DateOfBrith;
}
public void setDateOfBrith(String dateOfBrith) {
	DateOfBrith = dateOfBrith;
}
@Override
public boolean checkRealPerson(Customer customer) {
	// TODO Auto-generated method stub
	return false;
}

}
