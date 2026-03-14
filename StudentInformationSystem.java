/*## 🎯 Learning Outcomes

This project serves as a practical implementation of Week 1 Java fundamentals:
- Understanding Java compilation and execution
- Working with different data types and operators
- Implementing conditional logic
- Organizing code with methods
- Building interactive console applications
import java.util.Scanner;

public class StudentInformationSystem {
    
    // Method to display student information
    public static void displayStudentInfo(String name, int age, String grade) {
        System.out.println("\n=== STUDENT INFORMATION ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("===========================\n");
    }
    
    // Method to validate and process grade
    public static String processGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // Main method - program entry point
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("🎯 Welcome to Student Information System!");
        System.out.println("=========================================\n");
        
        // Get student information from user
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();
        
        System.out.print("Enter student score (0-100): ");
        double studentScore = scanner.nextDouble();
        
        // Process the grade based on score
        String studentGrade = processGrade(studentScore);
        
        // Display the formatted student information
        displayStudentInfo(studentName, studentAge, studentGrade);
        
        // Additional information based on grade
        System.out.println("📊 Performance Analysis:");
        if (studentGrade.equals("A") || studentGrade.equals("B")) {
            System.out.println("Excellent performance! Keep it up! 🎉");
        } else if (studentGrade.equals("C")) {
            System.out.println("Good work! There's room for improvement. 👍");
        } else if (studentGrade.equals("D")) {
            System.out.println("Needs improvement. Consider extra study time. 📚");
        } else {
            System.out.println("Please seek academic assistance. 💡");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        System.out.println("\nThank you for using Student Information System! 👋");
    }
}
