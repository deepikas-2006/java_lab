import java.util.Scanner;

class calculator
 {
       public static void main (String[] args)
       {
              Scanner sc=new Scanner(System.in);
	      System.out.print("enter first number:");
	      double num1=sc.nextDouble();
              System.out.print("enter operator(+,-,*,/):");
              char operator=sc.next().charAt(0);
              System.out.print("enter second number:");
	      double num2=sc.nextDouble();
	      double result; 
              switch (operator){
                 
                       case'+':
                         result=num1+num2;
                         break;
         
                       case'-':
		         result=num1-num2;
		         break;
		    
                       case'*':
                         result=num1*num2;
                         break;

                       case'/':
                         if(num2==0)
                         {
                            System.out.println("error:division by 0 is not possible");
                            return;
                         }
                         result=num1/num2;
                         break;
                       default:
                         System.out.println("invalid operator");
                         return;
                 }
                 System.out.println("result"+result);
                 sc.close();
         }
       
 }