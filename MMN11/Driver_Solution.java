
public class Driver_Solution {
    public static void main(String[]args) {
        /**
         * creating an array of size 10.
         */
        ComputerScienceStudent_Solution[] students = new ComputerScienceStudent_Solution[10];
        /**
         * Creating arrays for three students each one has: one for subjects(4 subjects) and one for grades(4 grades) . 
         */
        String[] oneStudentSub = {"Alegbra", "Java", "History", "Art"};
        double[] oneStudentGrades = {80, 100, 80, 100};
        String[] secondStudentSub = {"c", "Art", "English", "c++"};
        double[] secondStudentGrades = {70, 80, 80, 70};
        String[] thirdStudentSub = {"Music", "Python", "Sports", "Language"};
        double[] thirdStudentGrades = {80, 80, 90, 90} ;
        
        /**
         * Adding the students to the array of ComputerScienceStudent.
         */
        students[0]= new ComputerScienceStudent_Solution("Yotam", "Bib", 717171717, oneStudentSub , oneStudentGrades, "Java");
        students[1] = new ComputerScienceStudent_Solution("Gal", "Gir", 307901199, secondStudentSub, oneStudentGrades, "c");
        students[2]= new ComputerScienceStudent_Solution("Yossi", "It", 939393939, thirdStudentSub, thirdStudentGrades, "Python");
        /**
         * Checking who is the most excellent student, if there are more than one the first one is being chosen.
         */
        int index = 0;
        for(int i = 1; i < 3 ; i++){
            if(students[i].getAverageGrade() > students[index].getAverageGrade()){
                index = i;
            }
        }    
        /**
         * Printing the students details and the excellent student( if there are more than one the first one is being chosen). 
         */
        System.out.println("The students in the array are: " +"\n"+ students[0].toString()+"\n"+   students[1].toString() +"\n"+  students[2].toString() +"\n"+  "The most excellent student is: " + students[index].getFirstName() +" "+ students[index].getLastName()) ;
        }
    }

            
            
            
        
















