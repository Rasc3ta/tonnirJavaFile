
public class Main {


    public static void main(String[] args) {

        Student Tonni = new Student("Tonni", 652637, 3.27);
        Student maruf = new Student("maruf", 652616, 4.00);
        Student Maruf = new Student(maruf);


        Tonni.display();
        System.out.println("---------------------------------");
        Maruf.display();
    }
    

}