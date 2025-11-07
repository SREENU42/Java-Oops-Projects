// 3️⃣ Employee Salary Management
// Task: Create an Employee class that encapsulates salary details.
// Requirements:
// Private fields: id (int), name (String), salary (double)
// Getter and setter for salary
// Validation: salary cannot be less than minimum wage (e.g., 15000)
// Method: applyBonus(double percent) increases salary by percentage
// Method: applyTax(double percent) decreases salary by percentage
// Hint:
// Keep salary private to prevent direct modification; always use methods for updates.

class Employee{
    private int id;
    private String name;
    private double salary;
    
    Employee (int id,String name,double salary){
        this.id=id;
        this.name=name;
        if(salary>=15000){
            this.salary=salary;
        }else{
            System.out.println("Salary>=15000,setting to 15000");
            this.salary=15000;
        }
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        if(salary>=15000){
           this.salary=salary;
        }else{
            System.out.println("Salary cannot be less than minimum wage(15000)");
        }
    }
    public String getName(){
        return name;
    }
        
    public void applyBonus(double percent) {
        if (percent > 0) {
            double bonusAmount = salary * (percent / 100);
            salary += bonusAmount;
            System.out.println("Bonus Applied: " + bonusAmount);
        } else {
            System.out.println("Invalid bonus percentage");
        }
    }

    public void applyTax(double percent) {
        if (percent > 0) {
            double taxAmount = salary * (percent / 100);
            salary -= taxAmount;
            System.out.println("Tax Deducted: " + taxAmount);
        } else {
            System.out.println("Invalid tax percentage");
        }
    }

 public void display(){
        System.out.println("Employee Id :"+id);
        System.out.println("Name of the employee:"+name);
        System.out.println("Salary of the employee:"+salary);
        
    }
    
}
class EmployeeSalaryManagement{
    public static void main(String[]args){
        Employee e=new Employee(22,"Afroz",50000.0);
        
        e.display();
        System.out.println("Appling Bonus 10%");
        e.applyBonus(10.0);
        e.display();
        System.out.println("Appling Tax 5%");
        e.applyTax(5.0);
        e.display();
        
        
    }
}
