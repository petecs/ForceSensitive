/**
* A very basic Person class that describes a generic person as would be used in a Human Resources Application or Video Game Character.
*
* @author	Brian Bourgon
* @version	1.0
*/

public class Person
{
	//Properties of a Person object
	private String firstName;
	private String lastName;
	private String middleName;
	private String courtesyTitle;
	private String suffix;
	private String gender;
	private byte age;
	
	/**
	* No argument constructor that creates a generic Person object
	*/
	public Person()
	{
		firstName = "Jane";
		lastName = "Doe";
		middleName = null;
		courtesyTitle = null;
		suffix = null;
		gender = "female";
		age = 0;
	}
	
	/**
	* A constructor that create a Person object with the most common properties set at Construction time
	*
	* @param fN		The first or given name of the new Person object
	* @param lN		The last or family name of the new Person object
	* @param sex	The gender or sex of the new Person object (valid values are "male", "female", and "unspecified")
	* @param age 	The age in years of the new Person object (age must be a positive integer less than 128)
	* @throws IllegalArgumentException	Thrown if the passed in gender is not "male", "female", or "unspecified"; or if the age is negative
	*/
	public Person(String fN, String lN, String sex, byte age)
	{
		firstName = fN;
		lastName = lN;
		if (sex.equals("male") || sex.equals("female") || sex.equals("unspecified"))
		{
			gender = sex;
		}
		else
		{
			throw new IllegalArgumentException("All Person objects must be \"male\", \"female\", or \"unspecified\"");
		}
		
		if (age < 0)
		{
			throw new IllegalArgumentException("All Person objects must be at least 0 years of age");
		}
		else
		{
			this.age = age;
		}
	}
	
	/**
	* A constructor that create a Person object with the all of the properties set at Construction time
	*
	* @param fN		The first or given name of the new Person object
	* @param lN		The last or family name of the new Person object
	* @param mN		The middle name of the new Person object
	* @param title	The courtesy title of the new Person object (valid values are "Mr", "Mrs", "Miss", "Ms", and "Dr")
	* @param suffix The name suffix of the new Person object (valid values are "Jr", "II", "III", "IV", and "PhD")
	* @param sex	The gender or sex of the new Person object (valid values are "male", "female", and "unspecified")
	* @param age 	The age in years of the new Person object (age must be a positive integer less than 128)
	* @throws IllegalArgumentException	Thrown if the passed in courtesy title is not one of "Mr", "Mrs", "Miss", "Ms", or "Dr";
	*			the name suffix is not one of "Jr", "II", "III", "IV", or "PhD"; the gender is not "male", "female", or "unspecified";
	*			or if the age is negative
	*/
	public Person(String fN, String lN, String mN, String title, String suffix, String sex, byte age)
	{
		firstName = fN;
		lastName = lN;
		middleName = mN;
		if (title.equals("Mr") || title.equals("Mrs") || title.equals("Miss") || title.equals("Ms") || title.equals("Dr"))
		{
			courtesyTitle = title;
		}
		else
		{
			throw new IllegalArgumentException("All Person objects can only have courtesy titles \"Mr\", \"Mrs\", \"Miss\", \"Ms\", or \"Dr\"");
		}
		if (suffix.equals("Jr") || suffix.equals("II") || suffix.equals("III") || suffix.equals("IV") || suffix.equals("PhD"))
		{
			this.suffix = suffix;
		}
		else
		{
			throw new IllegalArgumentException("All Person objects can only have name suffixes of \"Jr\", \"II\", \"III\", \"IV\", or \"PhD\"");
		}
		if (sex.equals("male") || sex.equals("female") || sex.equals("unspecified"))
		{
			gender = sex;
		}
		else
		{
			throw new IllegalArgumentException("All Person objects must be \"male\", \"female\", or \"unspecified\"");
		}
		
		if (age < 0)
		{
			throw new IllegalArgumentException("All Person objects must be at least 0 years of age");
		}
		else
		{
			this.age = age;
		}
	}
	
	/**
	* A method to set the value of this Person object's given name
	*
	* @param fN		The first or given name of this Person object
	*/
	public void setFirstName(String fN)
	{
		firstName = fN;
	}
	
	/**
	* A method to set the value of this Person object's family name
	*
	* @param lN		The last or family name of this Person object
	*/
	public void setLastName(String lN)
	{
		lastName = lN;
	}
	
	/**
	* A method to set the value of this Person object's middle name
	*
	* @param mN		The middle name of this Person object
	*/
	public void setMiddleName(String mN)
	{
		middleName = mN;
	}
	
	/**
	* A method to set the value of this Person object's courtesy title
	*
	* @param title	The courtesy title of the new Person object (valid values are "Mr", "Mrs", "Miss", "Ms", and "Dr")
	* @throws IllegalArgumentException  Thrown if the passed in courtesy title is not one of "Mr", "Mrs", "Miss", "Ms", or "Dr"
	*/
	public void setCourtesyTitle(String title)
	{
		if (title.equals("Mr") || title.equals("Mrs") || title.equals("Miss") || title.equals("Ms") || title.equals("Dr"))
		{
			courtesyTitle = title;
		}
		else
		{
			throw new IllegalArgumentException("All Person objects can only have courtesy titles \"Mr\", \"Mrs\", \"Miss\", \"Ms\", or \"Dr\"");
		}
	}
	
	/**
	* A method to set the value of this Person object's name suffix
	*
	* @param suffix	courtesy title is not one of "Mr", "Mrs", "Miss", "Ms", or "Dr"
	* @throws IllegalArgumentException	name suffix is not one of "Jr", "II", "III", "IV", or "PhD"
	*/
	public void setSuffix(String suffix)
	{
		if (suffix.equals("Jr") || suffix.equals("II") || suffix.equals("III") || suffix.equals("IV") || suffix.equals("PhD"))
		{
			this.suffix = suffix;
		}
		else
		{
			throw new IllegalArgumentException("All Person objects can only have name suffixes of \"Jr\", \"II\", \"III\", \"IV\", or \"PhD\"");
		}
	}
	
	/**
	* A method to set the value of this Person object's gender
	*
	* @param sex	The gender or sex of this Person object (valid values are "male", "female", and "unspecified")
	* @throws IllegalArgumentException	Thrown if the passed in gender is not "male", "female", or "unspecified"
	*/
	public void setGender(String sex)
	{
		if (sex.equals("male") || sex.equals("female") || sex.equals("unspecified"))
		{
			gender = sex;
		}
		else
		{
			throw new IllegalArgumentException("All Person objects must be \"male\", \"female\", or \"unspecified\"");
		}
	}
	
	/**
	* A method to set the value of this Person object's age
	* 
	* @param age	The age in years of this Person object (age must be a positive integer less than 128)
	* @throws	IllegalArgumentException	Thrown if the passed in age is less than zero (0)
	*/
	public void setAge(byte age)
	{
		if (age < 0)
		{
			throw new IllegalArgumentException("All Person objects must be at least 0 years of age");
		}
		else
		{
			this.age = age;
		}
	}
	
	/**
	* A method to retreive the given name of this Person object
	* 
	* @return	firstName	The first or given name of this Person object
	*/
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	* A method to retreive the family name of this Person object
	* 
	* @return	lastName	The last or family name of this Person object
	*/
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	* A method to retreive the middle name of this Person object
	* 
	* @return	middleName	The middle name of this Person object
	*/
	public String getMiddleName()
	{
		return middleName;
	}
	
	/**
	* A method to retreive the courtesy title of this Person object
	* 
	* @return	courtesyTitle`	The courtesy title of this Person object
	*/
	public String getCourtesyTitle()
	{
		return courtesyTitle;
	}
	
	/**
	* A method to retreive the name suffix of this Person object
	* 
	* @return	suffix	The name suffix of this Person object
	*/
	public String getSuffix()
	{
		return suffix;
	}
	
	/**
	* A method to retreive the gender of this Person object
	*
	* @return	gender	The gender of sex of this Person object
	*/
	public String getGender()
	{
		return gender;
	}
	
	/**
	* A method to retreive the age of this Person object
	*
	* @return	age	The age of this Person object
	*/
	public byte getAge()
	{
		return age;
	}
}