public class OOPS1 {
    public static void main(String[] args) {
       Student s1=new Student(); 
       Student s2=new Student("shradha"); 
       System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;

Student(){
   System.out.println("non parametrizes constructor..");
    }
    Student(String name){
    this.name=name;
    }
}
