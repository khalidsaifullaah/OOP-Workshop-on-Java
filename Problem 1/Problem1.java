package com.company;

import java.util.Scanner;

public class Problem1 {
  static Scanner X = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("**********Welcome*********");
        System.out.println("1.Issued Book");
        System.out.println("2.Returned Book");
        System.out.print("Choice One : ");

        int n = X.nextInt();

        if(n==1){

            System.out.println(" Which book would you take from Library? ");
            System.out.println(" 1.Algorithms ");
            System.out.println(" 2.Data Structure ");
            System.out.print(" Choice One : ");
            int k = X.nextInt();
            if(k==1){

                System.out.print("Enter Book List Number: ");
                int C = X.nextInt();
                System.out.println("Thank You! \nYour book name is Algorithm. \nYour Book Number is : "+C);

            }
            else if(k==2){

                System.out.print("Enter Book List Number: ");
                int C = X.nextInt();
                System.out.println("Thank You! \nYour book name is Data Structure. \nYour Book Number is : "+C);

            }

        }

          else if(n==2){

              System.out.println("Which book would you can be returned to Library?");
              System.out.println("1.Algorithms");
              System.out.println("2.Data Structure");
              System.out.print("Choice One : ");
              int k = X.nextInt();

               if(k==1){

                 System.out.print("Enter Book List Number: ");
                 int C = X.nextInt();
                System.out.println("Thank You for returned the book! \nYour book name is Algorithm. \nYour Book Number is : "+C);

               }

                else if(k==2){

                 System.out.print("Enter Book List Number: ");
                 int C = X.nextInt();
                System.out.println("Thank You for returned the book! \nYour book name is Data Structure. \nYour Book Number is : "+C);

                }
          }
    }
}