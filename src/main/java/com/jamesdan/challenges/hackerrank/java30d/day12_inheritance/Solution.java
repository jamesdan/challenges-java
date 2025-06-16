import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;

        // if(firstName.length()<1 || lastName.length()<1 || firstName.length()>10 || lastName.length()>10 || id>9999999 || id<1000000) System.exit(0);
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        char result = '\0';
        double averageScore = 0;
        double totalScore = 0;
        int testScoresCount = testScores.length;

        for(int i=0; i<testScoresCount; i++) {
            int score = testScores[i];
            // if(score<0 || score>100) System.exit(0);
            totalScore += score;
        }
        averageScore = totalScore/testScoresCount;

        if(90<=averageScore && averageScore<=100) {
            result = 'O';
        } else if(80<=averageScore && averageScore<90) {
            result = 'E';
        } else if(70<=averageScore && averageScore<80) {
            result = 'A';
        } else if(55<=averageScore && averageScore<70) {
            result = 'P';
        } else if(40<=averageScore && averageScore<55) {
            result = 'D';
        } else if(averageScore<40) {
            result = 'T';
        }

        return result;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}