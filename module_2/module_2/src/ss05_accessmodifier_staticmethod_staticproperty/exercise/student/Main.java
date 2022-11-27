package ss05_accessmodifier_staticmethod_staticproperty.exercise.student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Hieu");
        student1.setClasses("AO8222I1");
        System.out.println(student1.getName() + " học lớp " + student1.getClasses());
    }
}