public class Person_Solution {
    //instance variable
    protected String _firstName;
    protected String _lastName;
    protected long _id;
    public static final String NO_NAME="";
    
    
    /**
     *  A constructor that accepts three values and initialize them
     *  @param: firstName - the first name of the person
     *  @param: lastName  - the last name of the person
     *  @param: id - the id of the person 
     */
    public Person_Solution(String firstName, String lastName, long id){
        _firstName = firstName;
        _lastName = lastName;
        _id = id;
    }
    /**
     *  A copy constactor 
     *  @param: p - a person object to be coppied
     */
    public Person_Solution(Person p) {
        _firstName = p._firstName;
        _lastName = p._lastName;
        _id = p._id;
    }
    /**
     * A method that gets the first name
     * @return: the first name
     */
    public String getFirstName() {
        return _firstName;
    }
    /**
     * A method that gets the last name
     * @return: the last name
     */
    public String getLastName() {
        return _lastName;
    }
    /**
     * A method that gets the id
     * @return: the id
     */
    public long getId() {
        return _id;
    }
    /** 
     * A method that sets the first name
     * @param: firstName - the first name to be set 
     */
    public void setFirstName(String firstName) {
        _firstName = firstName;
    }
    /**
     * A method that sets the last name
     * @param: lastName - the last name to be set
     */
    public void setLastName(String lastName) {
        _lastName = lastName;
    }
    //A method that sets the id
    private void setId(long otherId){
        _id = otherId;
    }
    /**
     * A method that prints a string
     * @return: a string, for example  "Last Name: last name, First Name: first name, ID: id "  
     */
    public String toString () {
        return "Last Name: "+_lastName+", "+"First Name: "+_firstName+", "+"ID: "+_id;
    }
    }
