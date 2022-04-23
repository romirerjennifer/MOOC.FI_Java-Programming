
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int countPassing=0;
        ArrayList<Integer> array=new ArrayList<>();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int input=0;
        while(input!=-1){
            input=Integer.valueOf(scanner.nextLine());
            if(input<=100&&input>=0){
                array.add(input);
                count++;
                if(input>=50){
                    countPassing++;
                }
            }
        }
        double average=(1.0)*sum(array)/count;
        System.out.println("Point average (all): " + average);
        double averagePassing=(1.0)*sumPassingGrade(array)/countPassing;
        System.out.println("Point average (passing): " + averagePassing);
        System.out.println("Pass percentage: " + (100.0)*countPassing/count);
        System.out.println("Grade distribution: ");
        printGradeDistribution(array);
    }
    public static int sum(ArrayList<Integer> array){
        int sum=0;
        for(int value:array){
            sum+=value;
        }
        return sum;
    }
    public static int sumPassingGrade(ArrayList<Integer> array){
       int sum=0;
       int passingGrade=50;
        for(int value:array){
            if(value>=passingGrade){
               sum+=value; 
            }
            
        }
        return sum; 
    }
     public static int numberOfGrades(ArrayList<Integer> array,int grade) {
        int count = 0;
        for (int received : array) {
            if (pointsToGrade(received) == grade) {
                count++;
            }
        }

        return count;
    }
    public static int pointsToGrade(int points) {
        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public static void printGradeDistribution(ArrayList<Integer> array) {
        int grade = 5;
        int stars=0;
        while (grade >= 0) {
            stars = numberOfGrades(array, grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}

