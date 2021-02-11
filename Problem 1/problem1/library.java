package problem1;

import java.util.Scanner;

public class library {
   public static void main(String[] args)
   {
	   dsabook s=new dsabook();
	   algobook t=new algobook();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("What is your action?:\n1.Take book.\n2.Return book\n");
	   int n=sc.nextInt();
	   
	   if(n==1)
	   {
		   System.out.println("Which book would you take?:\n1.DSA book\n2.Algorith book\n");
		   int m=sc.nextInt();
		   if(m==1)
		   {
			   s.booksIssued();
		   }
		   else if(m==2)
		   {
			   t.booksIssued();
		   }
	   }
	   else if(n==2)
	   {
		   System.out.println("Which book would you return?:\n1.DSA book\n2.Algorith book\n");
		   int m=sc.nextInt();
		   if(m==1)
		   {
			   s.booksReturned();
		   }
		   else if(m==2)
		   {
			   t.booksReturned();
		   }
	   }
	   
   }
}
