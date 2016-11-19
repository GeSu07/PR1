
public class Person {
	public String firstName;
	public String lastName;
	public int age;
	public Address address;
	
	public void setAddress(String city, String zip, 
			String street)
	{
		double lat; 
		double lng;
		
		address = new Address();
		address.city = city;
		address.zip = zip;
		address.street = street;
	}
	
	public int getAge()
	{
		return age;
	}
}
