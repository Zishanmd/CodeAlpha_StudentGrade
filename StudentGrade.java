import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("STUDENT GRADE TRACKER:");
        ArrayList<Double> grades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int studentNumber = 1;
        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter student " + studentNumber + " grade: ");
            grades.add(sc.nextDouble());

            System.out.print("Do you want to enter more student grades (y/n)?: ");
            //String choice = sc.next();
            if (sc.next().equalsIgnoreCase("y")) {
                studentNumber++;
            } else {
                continueInput = false;
            }
        }

        sc.close();
        System.out.println("\nTotal Students: " + grades.size());
        System.out.println("Grades: " + grades);
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        if (!grades.isEmpty()) {
            double average = sum / grades.size();
            System.out.println("Average Grade: " + average);
        }
        System.out.println("max grade :"+ Collections.max(grades));
        System.out.println("min grade :" +Collections.min(grades));
    }
}
