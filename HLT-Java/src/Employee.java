import java.util.Scanner;

public class Employee {
    int eid;
    String ename;
    double salary;
    String email;
    String department;

    public void display()
    {
        System.out.println( " Hello employees");
        System.out.println(" Employee Id: " +eid);
        System.out.println(" Employee Name: " +ename);
        System.out.println("Salary: "+salary);
        System.out.println("Email ID : " +email);
        System.out.println("Department : "+department);
    }

    public void setName( String sName ){
        ename = sName ;
    }

    public void setID(int sID){
        eid = sID ;
    }
    public void setSalary( double salary1){
        salary = salary1;
    }
    public void setEmail( String email1){
        email = email1;
    }
    public void setDepartment( String department1){
        department = department1;
    }
    public static void main( String args[])
    {
        Employee Emp1 = new Employee();
        Emp1.setName("Asma");
        Emp1.setID(365);
        Emp1.setSalary(53443.56);
        Emp1.setEmail("asmae.noor@gmail.com");
        Emp1.setDepartment("Developer");
        Emp1.display();

        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter Name ");
        String uName =  sc.next();
        System.out.println( uName );

    }
}
