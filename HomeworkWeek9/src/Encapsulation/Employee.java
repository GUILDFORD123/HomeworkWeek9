package Encapsulation;
/*13. Write a Java program to create a class called Employee with private instance variables
employee_id, employee_name, and employee_salary. Provide public getter and setter
methods to access and modify the id and name variables, but provide a getter method
for the salary variable that returns a formatted string.*/


public class Employee {


    private int emp_id;
    private String emp_name;
    private int emp_salary;


    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public String getFormattedSalary(int employee_salary) {
        return String.format("Employee Salary: £%d", employee_salary);
    }

}



