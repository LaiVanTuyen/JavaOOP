//import java.util.Scanner;
//
//public class Main {
//    static class Person {
//        private String name;
//        private int age;
//
//        public Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        // Getters and setters
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//    }
//    static class Modify{
//        public  static String formatString(String name) {
//            String formattedName = name.toUpperCase();
//            return formattedName;
//        }
//
//        public static void formatPerson(Person p) {
//            String formattedName = formatString(p.getName());
//            p.setName(formattedName);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        int age = sc.nextInt();
//        sc.nextLine();
//        String modify = sc.nextLine();
//        if (modify.equals("fs")){
//            name = Modify.formatString(name);
//        }else if (modify.equals("fp")){
//            Person p = new Person(name, age);
//            Modify.formatPerson(p);
//            name = p.getName();
//            age = p.getAge();
//        }
//        System.out.println("Full name: "+name +"; "+ age+" years old.");
////        Person p = new Person(name, age);
////        Modify.formatPerson(p);
////        System.out.println(p.getName()+p.getAge()); // p.getName() = "JOHN SMITH"
//    }
//}
import java.util.Scanner;

class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Modify {
    public static void formatString(String name){
        System.out.print("Full name: " + name + "; ");
    }
    public static void formatPerson(Person p){
        System.out.println("Full name: " + p.name.toUpperCase() + "; " + p.age + " years old.");
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name =  scanner.nextLine();
        int age = scanner.nextInt();
        String method = scanner.next();
        Person p = new Person(name, age);
        switch (method){
            case "fs":
                Modify.formatString(p.name);
                System.out.println(p.age + " years old.");
                break;
            case "fp":
                Modify.formatPerson(p);
                break;
            default:
                break;
        }
    }
}