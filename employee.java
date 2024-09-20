package main;

public class employee {

    public String empName;
    public int age;
    public String city;
    public double salary;
    public String companyName;
    public int empId;
    public String empDesignation;
    public String empDepartment;

    public void printDetails(){
        System.out.println("name: "+empName);
        System.out.println("age: "+age);
        System.out.println("city: "+city);
        System.out.println("salary: "+salary);
        System.out.println("companyName: "+companyName);
        System.out.println("empId: "+empId);
        System.out.println("empDesignation: "+empDesignation);
        System.out.println("empDepartment: "+empDepartment);
    }

    public void setDetails(String empName,int age,String city,double salary, String companyName, int empId, String empDesignation, String empDepartment  ){

        this.empName = empName;
        this.age = age;
        this.city = city;
        this.salary = salary;
        this.companyName = companyName;
        this.empId = empId;
        this.empDesignation = empDesignation;
        this.empDepartment = empDepartment;

    }

    public employee(){
        empName = "Ritika";
        age = 23;
        city = "Rourkela";
        salary = 9.0000000;
        companyName = "mthree";
        empId= 021;
        empDesignation = "software developer trainee";
        empDepartment ="IT";
        printDetails();

    }

    public employee(String empName,int age,String city,double salary, String companyName, int empId, String empDesignation, String empDepartment  )
    {
        this.empName = empName;
        this.age = age;
        this.city = city;
        this.salary = salary;
        this.companyName = companyName;
        this.empId = empId;
        this.empDesignation = empDesignation;
        this.empDepartment = empDepartment;
        printDetails();
    }
    public static void main(String []args){
        employee obj = new employee();
        System.out.println("======================First Print=======================");
        obj.setDetails("Ritika", 23, "Rourkela",4.000000,"LTTS",012,"GET", "IT");
        System.out.println("======================Second Print=======================");
        obj.printDetails();
        System.out.println("======================Third  Print=======================");
        employee obj2 = new employee("Ritika", 23, "Rourkela",4.000000,"LTTS",012,"GET", "IT");
        System.out.println("======================Fourth Print=======================");
        obj2.printDetails();
    }
}
