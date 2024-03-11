import java.util.Scanner;
public class Line_Comparison {
    public static void main(String[] args) {
    	System.out.print("Welcome to Line Comparison Computation Program");
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinate x1 : ");
        int x1=sc.nextInt();
        System.out.println("Enter the coordinate y1 : ");
        int y1=sc.nextInt();
        System.out.println("Enter the coordinate x2 : ");
        int x2=sc.nextInt();
        System.out.println("Enter the coordinate y2 : ");
        int y2=sc.nextInt();

        float length_of_line = (float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The length of line "+"("+x1+","+y1+")"+" and "+"("+x2+","+y2+")"+" is: "+length_of_line);
-
    }
}