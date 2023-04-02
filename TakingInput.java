import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user first Name
        String name = sc.next();
        //Enter user last name
        String lastName=sc.next();
        //Enter user Roll number
        int RollNumber=sc.nextInt();
        String fieldOfInterest = sc.next();
        System.out.println("Name:"+name+ " "+lastName);
        System.out.println("Roll Number:"+RollNumber);
        System.out.println("Field of Interest:"+fieldOfInterest);



        //Question 2.- Input two different string and print them in same line.
        //enter user first String
        String st1= sc.next();
        //enter user second String
        String st2 = sc.next();
        //user single output which is input by user
        System.out.println(st1+st2);




        //Question 3.If the marks of Robert in three subjects are entered through keyboard (each out of
        //100), write a program to calculate his total marks and percentage marks.
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int totalMark=num1+num2+num3;
        int percentageMark=(totalMark*100)/300;
        System.out.println("Total marks:"+totalMark);
        System.out.println("Percentage marks:"+percentageMark+"%");



        //Question 4.Given two numbers, return their sum in the following format:
        //Int t representing number of test cases
        //T lines of Two integers representing the numbers to be added
        int t= sc.nextInt();  //input user testcase
        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            System.out.println(sum);
        }



    }

}
