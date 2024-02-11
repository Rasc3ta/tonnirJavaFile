public class Student {
    int Roll;
    String Name;
    double GPA;


    Student(String name, int roll, double gpa) {
        Name = name;
        Roll = roll;
        GPA = gpa;
    }
    

    Student(Student s) {
        Name = s.Name;
        Roll = s.Roll;
        GPA = s.GPA;
    }


    void display(){
        System.out.println("Name : " + Name);
        System.out.println("Roll : " + Roll);
        System.out.println("GPA : " + GPA);
    }
    
    
}
