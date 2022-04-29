import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int stat;
        int communication;
        int software_engineering;
        int pak_study;
        int oop;
        int discret;
        float total_obtained;
        float total_marks;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter obtained marks of Statistics: ");
        stat = input.nextInt();
        System.out.print("Enter obtained marks of Communication: ");
        communication = input.nextInt();
        System.out.print("Enter obtained marks of Software Engineering: ");
        software_engineering = input.nextInt();
        System.out.print("Enter obtained marks of Pak Studies: ");
        pak_study = input.nextInt();
        System.out.print("Enter obtained marks of OOP: ");
        oop = input.nextInt();
        System.out.print("Enter obtained marks of Discret: ");
        discret = input.nextInt();
        total_obtained = stat + communication + software_engineering + pak_study + oop + discret;
        System.out.println("Total obtained marks: " + total_obtained);
        System.out.print("Enter total marks: ");
        total_marks = input.nextInt();
        total_marks = (total_obtained * 100) / total_marks;
        System.out.print("Percentage: " + total_marks + "%");
        
    }
        




       

        
}
