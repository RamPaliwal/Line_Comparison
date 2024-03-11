import java.util.Scanner;
public class Line_Comparison {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinate x1 : ");
        int x1=sc.nextInt();
        System.out.println("Enter the coordinate y1 : ");
        int y1=sc.nextInt();
        System.out.println("Enter the coordinate x2 : ");
        int x2=sc.nextInt();
        System.out.println("Enter the coordinate y2 : ");
        int y2=sc.nextInt();

        System.out.println("Enter the coordinate x3 : ");
        int x3=sc.nextInt();
        System.out.println("Enter the coordinate y3 : ");
        int y3=sc.nextInt();
        System.out.println("Enter the coordinate x4 : ");
        int x4=sc.nextInt();
        System.out.println("Enter the coordinate y4 : ");
        int y4=sc.nextInt();

        float length_of_line1 = (float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        float length_of_line2 = (float) Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));

        if(String.valueOf(length_of_line1).equals(String.valueOf(length_of_line2))){
            System.out.println("Both the lines are of equal length");
        }
        else{
            System.out.println("Both the lines are not of equal length");
        }

    }
}