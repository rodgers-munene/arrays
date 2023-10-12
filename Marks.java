import java.util.Scanner;

public class Marks {
    public static void main(String[] args){
        int i, j;
        String grade;
        Scanner input = new Scanner(System.in);
        int marks[][] = new int[4][3];
        String names[] = new String[4];
        int total[] = new int[4];
        String rollNo[] = new String[4];
        // int grade[];

        for(i = 0; i < 4; i++){
            System.out.print("Enter Student's " + (i+1) + " Roll Number: ");
            rollNo[i] = input.next();
            System.out.print("Enter Student's " + (i+ 1) + " Name: ");
            names[i] = input.next();
            for(j = 0; j < 3; j++){
                System.out.print("Enter the marks for " + names[i] + " subject " + (j + 1)+ ": ");
                marks[i][j] = input.nextInt();
                total[i] += marks[i][j];
            }
            System.out.println("The total is " + total[i]);
        }

        System.out.println("\n");
        System.out.println("*******************************************************************");
        System.out.println("                          STUDENT MARKLIST");
        System.out.println("*******************************************************************");
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
        for(i = 0; i < 4; i++){
            System.out.print(rollNo[i]);
            System.out.print("\t");
            System.out.print(names[i]);
            System.out.print("\t");
            for(j = 0; j < 3; j++){
                System.out.print(marks[i][j] + "\t " );
            }
            System.out.print(total[i]);
            System.out.print("\t");
            if(total[i]/3 >= 50){
                System.out.print("P");
            }else{
                System.out.print("F");
            }
            System.out.print("\t");
            System.out.print(String.format("%.1f", total[i]/3f));
            System.out.print("\t");
            if(total[i]/3 >= 70) {
                grade = "A";
            }else if(total[i]/3 >= 50){
                grade = "B";
            }else{
                grade = "C";
            }
            System.out.println(grade);
        }
    }
}
