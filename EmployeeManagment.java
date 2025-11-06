// ✅ Program 4: Employee Management – Role Based Bonus
// Classes:
// Employee (parent)
// fields: name, salary
// method: calculateBonus()
// Developer (child)
// 15% bonus
// overrides calculateBonus()
// Tester (child)
// 10% bonus
// overrides calculateBonus()
// ✅ Use method overriding + dynamic dispatch.

class Employee{
    String name;
    double salary;
    
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    void calculateBonus(){
        System.out.println("Employee Name is:"+name);
        System.out.println("Employee salary is Salary:"+salary);
    }
}
class Developer extends Employee{
    Developer(String name, double salary){
        super(name,salary);
    }
    @Override
    void calculateBonus(){
        double bonus=salary*0.15;
        System.out.println("Developer Bonus:"+bonus);
        System.out.println("Developer Salary:"+(salary+bonus));
    }
}
class Tester extends Employee{
    Tester(String name, double salary){
        super(name,salary);
    }
    @Override
        void calculateBonus(){
        double bonus=salary*0.10;
        System.out.println("Tester Bonus:"+bonus);
        System.out.println("Tester Salary:"+(salary+bonus));
    }
}
class EmployeeManagment{
    public static void main(String []args){
      Employee e1=new Developer("Malik",50000.0);
      Employee e2=new Tester("Afroz",30000.0);
      e1.calculateBonus();
      System.out.println("-------------------------------");
      e2.calculateBonus();
    }
}
