
public class Student_Solution extends Person_Solution{
    //Instance variables
    private int  _numOfCourses;
    private double _averageGrade;
    private String[] _courses;
    private double[] _grades;
    // The constant variable
    private final int MAX_NUM_OF_COURSES = 10;
    
    /**
     * A constractor that initializes the first name,last name,id, create two arrays:one of courses and one of grades and initializes the num of courses and average grade to be zero.
     * @param: firstName - the first name of the student
     * @param: lastName - the last name of the student
     * @param: id - the id of the student 
     */
    public Student_Solution(String firstName, String lastName, long id){
        super(firstName, lastName, id);
        _courses = new String[MAX_NUM_OF_COURSES];
        _grades = new double[MAX_NUM_OF_COURSES];
        _numOfCourses = 0;
        _averageGrade = 0;
    }
    /**
     *A constructor that receives first name, last name, id, array of courses and an array of grades and initializes them  according to the given parameters and calculates the grades average.
     * @param: firstName - the first name of the computer science student.
     * @param: lastName - the last name of the computer science student.
     * @param: id - the id of the computer science student.
     * @param: courses - an array of the student's courses.
     * @param: grades - an array of the student's grades.
     */
    public Student_Solution(String firstName, String lastName, long id, String[] courses, double[] grades){
        super(firstName, lastName, id);
        _courses = new String[MAX_NUM_OF_COURSES];
        _grades = new double[MAX_NUM_OF_COURSES];
        _numOfCourses = courses.length;
        for (int i = 0; i < _numOfCourses; i++) {
            _courses[i] = courses[i];
            _grades[i]  = grades[i];
        }
        _averageGrade = returnAverageGrade();
    }
    /**
     * Gets the number of courses
     * @return: the number of the student's courses
     */
    public int getNumOfCourses(){
        return _numOfCourses;
    }
    /**
     * Gets the average grade of the student
     * @return: average grade of the student
     */
    public double getAverageGrade(){
        return _averageGrade;
    }
    //Sets the num of courses
    private void setNumOfCourses(int numOfCourses){
        _numOfCourses = numOfCourses;
    }
    // Sets the student average grade
    private void setAverageGrade(double averageGrade){
        _averageGrade = averageGrade;
    }
    //calculates the average grade
    private double returnAverageGrade(){
        double av = 0; 
        for(int i = 0; i < _numOfCourses; i++){
            av += _grades[i];
        }
        return av / (_numOfCourses);
    }
    /**
     * Adds a course to the array
     * @param: courseName-the course name
     * @param: courseGrade- the course grade
     * @return: true if the course is added and false if not
     */
    public boolean addCourse(String courseName, double courseGrade){
        if(_numOfCourses >= MAX_NUM_OF_COURSES){
            return false;
        }else{
            _courses[_numOfCourses] = new String(courseName);
            _grades[_numOfCourses] = (courseGrade);
            _numOfCourses++;
            _averageGrade = returnAverageGrade();
            return true;
        }
    }
    /**
     * A method that returns a string that contains student's first name, last name , id ,courses and grades .
     * @return: string that contains student's first name, last name , id ,courses and  grades.
     */
    public String toString(){
       String result = super.toString() + "\ncourses:\n";
       for(int i = 0; i < _numOfCourses; i++){
           result = result + _courses[i] + ":   "+ _grades[i] + "\n";
        }
       return result;
    }

}

