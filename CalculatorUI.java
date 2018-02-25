package UserInterface;

import BusinessLogic.*;

import java.util.Scanner;
public class CalculatorUI {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String c="Y";
while(c.equals("Y"))
{
System.out.println("Enter the expression : ");String exp;
exp=scan.nextLine();
Distinguisher calFac=new Distinguisher();
CalculatorInterface cal=calFac.getOperation(exp);
double result=cal.evaluate(exp);
System.out.println("Answer is "+result);
System.out.print("Do You Want to continue(Y/N):");
c=scan.nextLine();
}
scan.close();
}
}