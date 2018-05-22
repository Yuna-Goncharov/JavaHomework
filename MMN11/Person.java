
/**
 * * This class represent a person, with name, id number and birth date.
 *
 * @Yona Goncharov
 * @id: 312631187
 */
public class Person
{  
    //instance variables
  private String _firstName, _lastName;
  private long _idNum;
  private Date _birthday;
  
  
  
   //constructors
    /**
     * Constructor for a Person object.
     * @param first The first name of person.
     * @param last The last name of person.
     * @param id The id of person.
     * @param d The day on birth date of person.
     * @param m The month on birth date of person.
     * @param y The year on birth date of person.
     */
    public Person(String first,String last, long id, int d, int m, int y)
    {
        _firstName= first;
        _lastName = last;
        _idNum = id;
        _birthday = new Date (d,m,y);
     
        
    }
    /**
     * Copy constructor for a Person object
     * @param p The Person object from which to construct the new person.
     */
    
    public Person (Person p)
    {
        _firstName = p._firstName;
        _lastName = p._lastName;
        _idNum = p._idNum;
        _birthday = new Date(p._birthday);
    }
    
    //get methods
    /**
     * Returns the date of birth of person.
     * @returns The date of birth of person.
     */
 
    public Date getDateOfBirth()
    {
        return new Date(_birthday);
    }
    /**
     * Returns the first name of the person.
     * @return The first name of the person.
     */
    
    public String getFirstName()
    {
    return _firstName;
    }
    /**
     * Returns the last name of the person.
     * @return The last name of the person.
     */
    
    public String getLastName()
    {
        return _lastName;
    }
    
    /**
     * Returns the Id number of the person.
     * @return Id number of the person.
     */
    
    public long getId()
    {
        return _idNum;
    }
    
    //set methods
     /**
     * Changes the date of birth of person.
     * @param d The day of the new date of birth.
     * @param m The month of the new date of birth.
     * @param y The year of the new date of birth.
     */
    
    public void setDateOfBirth(int d, int m, int y)
    {
        _birthday = new Date (d,m,y);
    
    }
     /**
     * Changes person's first name.
     * @param name The new first name of person
     */
    
    
    public void setFirstName(String name)
    {
    _firstName= name; 
    }
    
    
     /**
     * Changes person's last name.
     * @param name The new last name of person
     */
    
    public void setLastName(String name)
    {
        _lastName= name; 
    }

    
    /**
     * Changes person's Id number.
     * @param id The new Id number of person
     */
    
    public void setId(long id)
    {
       _idNum = id; 
    }
    
      //other methods
    /**
     * Check if the received person is equal to this person.
     * @param other The person to be compared with this person.
     * @return True if the received person is equal to this person.
     */
    
    public boolean equals(Person other)
    {
        return _firstName.equals(other._firstName)&& _lastName.equals(other._lastName)&& _idNum==other._idNum &&
        _birthday.equals(other._birthday);
    }
    
     /**
     * Check if this person is older than received person.
     * Person older than other person if he was born before, that is, his birth date before
     * other birth date.
     * @param other The person whose birth date is to be compared with this person's birth date.
     * @return True if this person older than other person.
     */ 
    
    public boolean older(Person other)
    {
        return _birthday.before(other._birthday);
    }
    
    /**
     * Check if this person and other person were born on the same dates of birth.
     * @param other The person to check date of birth with this person.
     * @return True if this person and other person were born on the same dates of birth.
     */
    
    public boolean sameBirthday(Person other)
    {
        return _birthday.equals(other._birthday);
    }
    
    /**
     * Return a string that represent this person.
     * @return String representation of this person 
     */
    
    public String toString()
    {
        return "Last Name: " + _lastName + ", First Name: " + _firstName + ", ID: " + _idNum
        + ", Date of birth: " + _birthday;
    }
}

