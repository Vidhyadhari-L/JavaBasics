package corejava;

import java.util.Scanner;
public class CalculateArea {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the base of the Triangle");
                double base=sc.nextDouble();
                System.out.println("Enter the height of the Triangle");
                double height=sc.nextDouble();

                double area=(base*height/2);
                System.out.println("Area of triangle is " +area);


            }

        }


