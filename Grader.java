import java.util.*;


public class Grader {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numStudents = Integer.parseInt(scan.nextLine()); 
        int grade = 0;
        

        for (int i = 0; i < numStudents; i++) {
            grade = Integer.parseInt(scan.nextLine());
            int nextMultipleOfFive = grade + (5 - grade % 5);
            if (grade < 38) {
                System.err.println(grade);
            } else if (nextMultipleOfFive - grade < 3) {
                System.err.println(nextMultipleOfFive);
            } else {
                System.err.println(grade);
            }
        }
        
    }
}
