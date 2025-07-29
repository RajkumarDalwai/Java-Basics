package Keywords;

public class ChildDemo extends ParentDemo {
    String name = "QAClickAcademy";

    public ChildDemo() {
        super(); // this should always be at the first line
        System.out.println("Child class constructor");
    }

    public void getStringdata() {
        System.out.println(name);         // refers to child class variable
        System.out.println(super.name);  // refers to parent class variable
    }

    public void getData() {
        super.getData(); // calls parent method
        System.out.println("I am in child class");
    }

    public static void main(String[] args) {
        ChildDemo cd = new ChildDemo();
        cd.getStringdata();
        cd.getData();
    }
}
