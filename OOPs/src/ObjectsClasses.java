public class ObjectsClasses {
    String name ;
    int age;
    char grade;

    ObjectsClasses(String name, int age, char grade){  //this is parameterized constructor so we dont
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public static void main(String[] args){
        ObjectsClasses OC = new ObjectsClasses("Ashu yadav", 21, 'A');

        System.out.println(OC.name);
        System.out.println(OC.age);
        System.out.println(OC.grade);
    }
}
