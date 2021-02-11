package problem2;

import java.util.Scanner;

public class Library {
   public static void main(String[] args)
   {
	   int ndsa=13;
	   int nalgo=14;
	   DSA s=new DSA(ndsa);
	   Algo t=new Algo(nalgo);
	   Scanner sc=new Scanner(System.in);
	   System.out.println("What is your action?:\n1.Take book.\n2.Return book\n");
       int n=sc.nextInt();
	   
	   if(n==1)
	   {
		   System.out.println("Which book would you take?:\n1.DSA book\n2.Algorith book\n");
		   int m=sc.nextInt();
		   if(m==1)
		   {
			   s.bookIssued();
		   }
		   else if(m==2)
		   {
			   t.bookIssued();
		   }
	   }
	   else if(n==2)
	   {
		   System.out.println("Which book would you return?:\n1.DSA book\n2.Algorith book\n");
		   int m=sc.nextInt();
		   if(m==1)
		   {
			   s.bookReturned();
		   }
		   else if(m==2)
		   {
			   t.bookReturned();
		   }
	   }
	   
   }
}