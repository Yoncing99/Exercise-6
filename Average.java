import java.util.Scanner;
public class Average {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.println("Enter 3 integer:");
        System.out.print("Integer 1: ");
        num1 = sc.nextInt();
        System.out.print("Integer 2: ");
        num2 = sc.nextInt();
        System.out.print("Integer 3: ");
        num3 = sc.nextInt();
        System.out.println("Average for 3 integer = " + average(num1,num2,num3));

        System.out.println("Enter another integer:");
        System.out.print("Integer 4: ");
        num4 = sc.nextInt();
        System.out.println("Average for 4 integer  = " + average(num1,num2,num3,num4));
    }

    public static double average(int num1, int num2, int num3){
        double avg= ((double)(num1+num2+num3))/3;
        return avg;
    }

    public static double average(int num1, int num2, int num3, int num4){
        double avg = ((double)(num1+num2+num3+num4))/4;
        return avg;
    }
}