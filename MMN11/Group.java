
/**
 * Write a description of class Group here.
 *
 * @yona goncharov
 * @id: 312631187
 * 
 */
public class Group
{
    //instance variables
       private final int MAX=10;
       private Person [] _personsArr;
       private int _numOfPersons;
       private final int DEFAULT_VAL=0, MAX_MONTH=12;
    
      //constructors
    /**
     * Construct a empty persons array with a maximum length.
     */
    public Group()
    {
    _personsArr = new Person[MAX];
    _numOfPersons=DEFAULT_VAL;
}
    
    /**
     * Add Person to persons array.
     * If person is added return true.
     * @param p The optional person to add.
     * @return True if person is added.
     */

    
  public boolean addPerson(Person P)
  {
      if(_numOfPersons ==MAX || P== null)// verify if array is full or person not valid
      return false; 
   
        for(int i=0; i<_numOfPersons; i++)//check if p doesn't exist in array.
            if(_personsArr[i].equals(P))
                return false;

     
        _personsArr[_numOfPersons++] = new Person(P);
        return true;
    }

    /**
     * Return how many persons were born on received date.
     * @param d The date to check how many people were born there.
     * @return How many persons were born on received date.
     */

    public int bornInDate(Date d)
    {
        int counter = DEFAULT_VAL;
        if(_numOfPersons == DEFAULT_VAL || d == null)// check if array is empty or received date is null.
            return counter;

        for(int i=0; i<_numOfPersons; i++)
            if(_personsArr[i].getDateOfBirth().equals(d))
                counter++;

        return counter;
    }

    /**
     * Return how many persons were born on received month.
     * Received month should be between 1-12, otherwise it return 0.
     * @param m The month to check how many people were born there.
     * @return How many persons were born on received month.
     */

    public int bornInMonth(int m)
    {
        int counter = DEFAULT_VAL;
        if(_numOfPersons == DEFAULT_VAL || !(m > DEFAULT_VAL && m <= MAX_MONTH))// check if array is empty or received month is invalid.
            return counter;

        for(int i=0; i<_numOfPersons; i++)
            if(_personsArr[i].getDateOfBirth().getMonth() == m)
                counter++;

        return counter;
    }

    /**
     * Return the oldest person in the array.
     * @return The oldest person in the array.
     */

    public Person oldestPerson()
    {
        if(_numOfPersons == DEFAULT_VAL)
            return null;

        Person oldest = _personsArr[0];
        for(int i=1; i<_numOfPersons; i++)
            if(_personsArr[i].older(oldest))
                oldest = _personsArr[i];

        return new Person(oldest);
    }

    /**
     * Return first name of person whose last name appears first in the dictionary.
     * If there are some people with the same last name, return first name of person
     * whose first name appears first in the dictionary.
     * @return First name of person whose last name appears first in the dictionary.
     */

    public String firstPerson()
    {
        if(_numOfPersons == DEFAULT_VAL)
            return null;

        String firstPer = _personsArr[0].getFirstName();
        String lastNamePer = _personsArr[0].getLastName();
        for(int i=1; i<_numOfPersons; i++)
        {
            if(_personsArr[i].getLastName().compareTo(lastNamePer)<DEFAULT_VAL)
            {
                firstPer = _personsArr[i].getFirstName();
                lastNamePer = _personsArr[i].getLastName();
            }
            else if(_personsArr[i].getLastName().equals(lastNamePer) 
            && _personsArr[i].getFirstName().compareTo(firstPer)< DEFAULT_VAL)
            {
                firstPer = _personsArr[i].getFirstName();
                lastNamePer = _personsArr[i].getLastName();
            }
        }
        return firstPer;
    }

    /**
     * Return a string of all persons in this group.
     * @return A string of all persons in this group.
     */

    public String toString()
    {
        String output = "";
        for (int i=0; i<_numOfPersons; i++) 
        {
            output += _personsArr[i] + "\n";
        }
        return output;
    }
}
