import java.util.ArrayList;
import java.util.List;

// Student class to store student name and exam score
class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main {

    // Main method to execute the program
    public static void main(String[] args) {
        // Sample student exam records
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ahmed", 85));
        students.add(new Student("Mahmoud", 70));
        students.add(new Student("Ali", 95));
        students.add(new Student("Sara", 60));

        System.out.println("--- Before Sorting ---");
        printStudents(students);

        // Sort students in ascending order using Merge Sort (Guaranteed O(n log n))
        List<Student> sortedStudents = mergeSort(students);

        System.out.println("\n--- After Sorting (Ascending Order) ---");
        printStudents(sortedStudents);
    }

    // Merge Sort recursive function
    public static List<Student> mergeSort(List<Student> students) {
        // Base case: if the list has 1 or 0 elements, it is already sorted
        if (students.size() <= 1) {
            return students;
        }

        // Find the middle index to split the list into two halves
        int mid = students.size() / 2;
        List<Student> leftHalf = new ArrayList<>(students.subList(0, mid));
        List<Student> rightHalf = new ArrayList<>(students.subList(mid, students.size()));

        // Recursively sort both halves
        leftHalf = mergeSort(leftHalf);
        rightHalf = mergeSort(rightHalf);

        // Merge the sorted halves back together
        return merge(leftHalf, rightHalf);
    }

    // Helper method to merge two sorted lists in ascending order
    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> sortedList = new ArrayList<>();
        int i = 0, j = 0;

        // Compare elements from both lists and add the smaller one
        while (i < left.size() && j < right.size()) {
            if (left.get(i).score <= right.get(j).score) {
                sortedList.add(left.get(i));
                i++;
            } else {
                sortedList.add(right.get(j));
                j++;
            }
        }

        // Append any remaining elements from the left list
        while (i < left.size()) {
            sortedList.add(left.get(i));
            i++;
        }

        // Append any remaining elements from the right list
        while (j < right.size()) {
            sortedList.add(right.get(j));
            j++;
        }

        return sortedList;
    }

    // Helper method to print student details
    private static void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println("Student Name: " + s.name + " | Score: " + s.score);
        }
    }
}