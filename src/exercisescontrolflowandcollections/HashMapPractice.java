package exercisescontrolflowandcollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapPractice {
    public static void main(String[] args){
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");


        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));
        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : students.entrySet()){
            System.out.println("Student/ID: " + student.getKey() + "/" + student.getValue());
        }
        System.out.println("Number of students in roster: " + students.size());


    }
}
