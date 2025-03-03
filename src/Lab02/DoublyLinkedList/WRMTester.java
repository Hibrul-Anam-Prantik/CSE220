package Lab02.DoublyLinkedList;

import java.util.Scanner;

public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        WRM p = new WRM();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        while (true) {
            System.out.println("==Choose an option:");
            System.out.println("1. Register Patient");
            System.out.println("2. Serve Patient");
            System.out.println("3. Show All Patients");
            System.out.println("4. Can Doctor Go Home?");
            System.out.println("5. Cancel All Appointments");
            System.out.println("6. Reverse the Line");
            System.out.println("7. Exit");
            System.out.print("Option: ");

            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1) {
                System.out.print("ID         : ");
                int id = sc.nextInt();  sc.nextLine();
                System.out.print("Name       : ");
                String name = sc.nextLine();
                System.out.print("Age        : ");
                int age = sc.nextInt();  sc.nextLine();
                System.out.print("Blood Group: ");
                String bloodGroup = sc.nextLine();
                p.registerPatient(id, name, age, bloodGroup);
            }
            else if (opt == 2) {
                p.servePatient();
            }
            else if (opt == 3) {
                p.showAllPatient();
            }
            else if (opt == 4) {
                if (p.canDoctorGoHome()) {
                    System.out.println("Doctor Can Go Home");
                } else {
                    System.out.println("Doctor Can't Go Home");
                }
            }
            else if (opt == 5) {
                p.cancelAll();
            }
            else if (opt == 6) {
                p.reverseTheLine();
            }
            else if (opt == 7) {
                System.out.println("WRM Closed!\nThanks For Your Patience :)");
                sc.close();
                System.out.println();
                break;
            } else {
                System.out.println("INVALID OPTION!");
            }
            System.out.println();
        }
    }
}
