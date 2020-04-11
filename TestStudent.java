import java.util.Scanner;

public class TestStudent {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String matricNo;
        double test1,test2;

        Student [] studDegree = new Student[3];
        //complete your code here
        for(int i=0;i<3;i++) {
            System.out.print("Matric No: ");
            matricNo = input.next();
            System.out.print("Test 1   : ");
            test1 = input.nextDouble();
            System.out.print("Test 2   : ");
            test2 = input.nextDouble();
            studDegree[i]= new Student(matricNo, test1, test2);
        }

        System.out.println("*******************************");
        System.out.printf("       STUDENT INFORMATION      \n");
        System.out.println("*******************************");
        System.out.printf("\tMatric No\tAverage Mark\n");
        for(int j=0;j<3;j++){
            studDegree[j].calculateAverage();
            System.out.println(studDegree[j].getStudentInfo());
        }

    }//end of main method
}//end of class TestStudent