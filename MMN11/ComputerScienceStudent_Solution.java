public class ComputerScienceStudent_Solution extends Student_Solution{
    //Instance variables
    private String _programmingLanguage;
    // The constant variable
    private final String PROGRAMMING_LANGUAGE = "Java";
    /**
     * A constractor that initializes the instance variables of computer science student and set 
     * the programming language to the default value.
     * @param: firstName - the first name of the computer science student.
     * @param: lastName - the last name of the computer science student.
     * @param: id - the id of the computer science student .
     */
    public ComputerScienceStudent_Solution(String firstName, String lastName, long id){
        super(firstName, lastName, id);
        _programmingLanguage = PROGRAMMING_LANGUAGE;
    }
    /**
     * A constractor that initializes the first name,last name,grades, courses, programming language and id of computer science student.
     * @param: firstName - the first name of the computer science student.
     * @param: lastName - the last name of the computer science student.
     * @param: id - the id of the computer science student.
     * @param: courses - the student's courses.
     * @param: grades - the student's grades.
     * @param: programmingLanguage - the student's programming language.
     */
    public ComputerScienceStudent_Solution(String firstName, String lastName, long id, String[] courses, double[] grades, String programmingLanguage){
        super(firstName, lastName, id, courses, grades);
        _programmingLanguage = programmingLanguage;
    }
    /**
     * A method that returns the  student's programming language.
     * @return: String - student's programming language.
     */
    public String getProgrammingLanguage(){
        return _programmingLanguage;
    }
    /**
     * A method that sets the programming language.
     * @param: programmingLanguage - the language to set.
     */
    public void setProgrammingLanguage(String programmingLanguage){
        _programmingLanguage = programmingLanguage;
    }
    /**
     * A method that returns a string that contains student's first name, last name , id ,courses, grades and programming language.
     * @return: string that contains student's first name, last name , id ,courses, grades and programming language.
     */
    public String toString(){
        return super.toString() + "Programming Language is: " + _programmingLanguage;
    }
}
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

