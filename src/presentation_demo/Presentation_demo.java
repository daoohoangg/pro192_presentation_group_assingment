package presentation_demo;

import data.Test1;
import java.util.Scanner;

public class Presentation_demo {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CheckAttend();
    }

    public static void CheckAttend() {
        String id, name;
        int yob;

        while (true) {
            System.out.print("Enter your id: ");
            id = sc.nextLine();
            boolean match = id.matches("^(HE|he)\\d{6}$");
            if (match == true) {
                break;
            } else {
                System.out.println("HEXXXXXX(X is a digit)");
            }
        }

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your yob: ");
        while (true) {
            try {
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập tử tế coi");
            }
        }

        Test1 x = new Test1(id, name, yob);
        System.out.println(x.toString());
    }

}
