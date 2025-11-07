// 2️⃣ Student Grade System
// Task: Create a Student class that manages marks for three subjects.
// Requirements:
// Private fields: name (String), marks (int array of size 3)
// Getters for name and marks
// Setter for marks with validation (0–100 only)
// Method: calculateAverage() returns average marks
// Method: getGrade() returns A, B, C, D, or F based on average


class Student{
   private  String name;
    private int []marks=new int[3];
    
    Student (String name,int m1,int m2,int m3){
        this.name=name;
        this.marks[0]=m1;
        this.marks[0]=m1;
        this.marks[0]=m1;
        
    }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public int [] getMarks(){
       return marks;
   }
   
   public void setMarks(int index,int value){
       if(index>=0&&index<3&&value>=0){
           marks[index]=value;
       }else{
           System.out.println("Invalid mark in index");
       }
   }
   public int totalMarks(){
       return marks[0]+marks[1]+marks[2];
   }
   public double averageMarks(){
       return totalMarks()/3.0;
   }
   public void display(){
       System.out.println("Name of the Student:"+name);
       System.out.println("Marks:"+marks[0]+","+marks[1]+","+marks[2]);
       System.out.println("StudentTotal Number of Marks:"+totalMarks());
       System.out.println("Average Marks:"+averageMarks());
   }
} 
class StudentGradeSystem{
    public static void main(String []args){
        Student s=new Student("Goshal",85,95,70);
        s.display();
        
        s.setMarks(2,90);
        System.out.println("\nAfter marks>>>>>>>>>>>");
        s.display();
    }
}