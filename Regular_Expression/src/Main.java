import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        while (!FuncValidation.checkId(id)) {
            System.out.println("Invalid id. Enter again: (exam: STD-1234)");
            id = sc.nextLine();
        }
        student.setId(id);
        System.out.println("Enter phone: ");
        String phone = sc.nextLine();
        while (!FuncValidation.checkPhone(phone)) {
            System.out.println("Invalid phone. Enter again: (exam: 0123456789 or +84123456789)");
            phone = sc.nextLine();
        }
        student.setPhone(phone);
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        while (!FuncValidation.checkEmail(email)) {
            System.out.println("Invalid email. Enter again: ");
            email = sc.nextLine();
        }
        student.setEmail(email);
        System.out.println("Student info: ");
        System.out.println("Id: " + student.getId());
        System.out.println("Phone: " + student.getPhone());
        System.out.println("Email: " + student.getEmail());
    }
}