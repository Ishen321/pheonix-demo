package pheonix.smiles.pheonix;


interface Person{
    void greet();
}


/*class Student implements Person{
    public void greet() {
        System.out.println("Namaste");
    }
}
public class AnnonymusInnerClassDemo {

    public static void main(String[] args) {
        Person student = new Student();
        student.greet();
    }
}
class Student implements Person{
    public void greet() {
        System.out.println("Namaste");
    }
}*/
public class AnnonymusInnerClassDemo {

    public static void main(String[] args) {
        Person person = new Person() {
            public void greet() {
                System.out.println("Namaste");
            }

        };
    }
}
