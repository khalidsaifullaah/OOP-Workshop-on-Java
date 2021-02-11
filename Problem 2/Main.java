package com.company;

import java.util.Scanner;

public class Main {
  static Scanner X = new Scanner(System.in);
  static Book tb =new Book();
    public static void main(String[] args) {

        while (true){

            System.out.println("**********Welcome*********");
            System.out.println("1.Issued Book");
            System.out.println("2.Returned Book");
            System.out.println("3.Exit");
            System.out.print("Choice One : ");

            int n = X.nextInt();

            if(n==1){

                System.out.println(" Which book would you take from Library? ");
                System.out.println(" 1.Algorithms ");
                System.out.println(" 2.Data Structure ");
                System.out.print(" Choice One : ");
                int k = X.nextInt();
                if(k==1){

                    System.out.print("Enter take total number of book: ");
                    int C = X.nextInt();
                     tb.total1= tb.total1-C;
                     if(tb.total1==2 || tb.total1==1){
                         System.out.println("Thank You! \nYour book name is Algorithm. \nYou take total book : "+C);
                         System.out.printf("Only %d book here!\n",tb.total1);
                     }
                     else if(tb.total1<1){
                         System.out.println("Sorry! No Copy Here!");
                    }
                     else
                     {
                         System.out.println("Thank You! \nYour book name is Algorithm. \nYou take total book : "+C);
                     }

                }
                else if(k==2){

                    System.out.print(" Enter take total number of book: ");
                    int c = X.nextInt();
                    tb.total2= tb.total2-c;
                    if(tb.total2==2 || tb.total2==1){
                        System.out.println("Thank You! \nYour book name is Data Structure. \nYou take total book : "+c);
                        System.out.printf("Only %d book here!\n",tb.total2);
                    }
                    else if(tb.total2<1){
                        System.out.println("Sorry! No Copy Here!");
                    }
                    else
                    {
                        System.out.println("Thank You! \nYour book name is Data Structure. \nYou take total book : "+c);
                    }

                }

            }

            else if(n==2){

                System.out.println("Which book would you can be returned to Library?");
                System.out.println("1.Algorithms");
                System.out.println("2.Data Structure");
                System.out.print("Choice One : ");
                int k = X.nextInt();

                if(k==1){

                    System.out.print("Enter how many book returned now : ");
                    int C = X.nextInt();
                    tb.total1= tb.total1+C;
                    System.out.printf("Thank You for returned the book! \nYour book name is Algorithm. \n %d books returned from you\nNow total Algorithm books are %d \n: ",C,tb.total1);

                }

                else if(k==2){

                    System.out.print("Enter how many book returned now : ");
                    int c = X.nextInt();
                    tb.total2= tb.total2+c;
                    System.out.printf("Thank You for returned the book! \nYour book name is Data Structure. \n %d books returned from you\nNow total Data Structure books are %d \n: ",c,tb.total2);


                }
            }

            else if (n==3){
                break;
            }

            else {
                System.out.println("Try again!");
            }


        }

    }
}
class Book {

    int total1=50,total2=50;



}
