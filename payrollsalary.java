import java.util.Scanner;
class Employee
{ 
  Scanner sc=new Scanner(System.in);
   void employeedetails()
  {
    System.out.println("enter Employee id:");
    double id=sc.nextint();
    System.out.println("enter Employee Name:");
    String name=sc.next();
    System.out.println("enter Employee dept:");
    String dept=sc.next();
    System.out.println("enter Employee address:");
    String addr=sc.next();
    System.out.println("enter Employee mobile number:");
    int mob=sc.nextInt();
    System.out.println("enter Employee email-id:");
    String email=sc.next();
    
  }
  void grosspay()
  {
   String Str1="Manager";
   String Str2="TechnicalEngineer";
   String Str3="SeniorSoftwareEngineer";
   String Str4="SoftwareEngineer";
   
    System.out.println("enter Employee Designation:");
    String Design=sc.next();
    String Designation=Design;
    if(Designation.compareTo(Str1)==0)
       {
        double basicpay=30000;
        double grosssalary=basicpay+27000+2700;
        double netpay=grosssalary-6000;
        System.out.println("Gross Salary\t:"+grosssalary);
        System.out.println("Netpay:"+netpay);
       }
    else if(Designation.compareTo(Str2)==0)
        {
          double basicpay=25000;
        double grosssalary=basicpay+22500+2250;
        double netpay=grosssalary-5000;
        System.out.println("Gross Salary\t:"+grosssalary);
        System.out.println("Netpay:"+netpay);
        }
    else if(Designation.compareTo(Str3)==0)
        {
          double basicpay=20000;
        double grosssalary=basicpay+18000+1800;
        double netpay=grosssalary-4000;
        System.out.println("Gross Salary\t:"+grosssalary);
        System.out.println("Netpay:"+netpay);
        }
    else if(Designation.compareTo(Str4)==0)
        {
          double basicpay=15000;
        double grosssalary=basicpay+13500+1350;
        double netpay=grosssalary-3000;
        System.out.println("Gross Salary\t:"+grosssalary); 
        System.out.println("Netpay:"+netpay);
        }
    else
    {
      System.out.println("Enter correct Designation");
    }

  }
}
class Main
{
  public static void main(String ab[])
  {
    Employee emp=new Employee();
	emp.employeedetails();
    emp.grosspay();
  }
}