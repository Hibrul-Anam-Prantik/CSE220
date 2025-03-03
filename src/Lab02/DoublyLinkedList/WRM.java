package Lab02.DoublyLinkedList;

public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        // To Do
        Patient p = new Patient(id, name, age, bloodgroup, null, null);
        p.next = dh;
        p.prev = dh.prev;
        dh.prev.next = p;
        dh.prev = p;
        System.out.println("New Patient Registered - " + name);
    }

    public void servePatient() {
        // To do
        if(dh.next == null) {
            System.out.println("No Patients");
            return;
        }
        Patient p = dh.next;
        System.out.println("Patient Served Successfully - " + p.name);
        dh.next = p.next;
        p.next.prev = dh;
    }

    public void showAllPatient() {
        // To Do
        if (dh.next == null) {
            System.out.println("No Patients");
            return;
        }

        Patient curr = dh.next;
        while (curr != dh) {
            System.out.println("ID: " + curr.id);
            curr = curr.next;
        }
    }

    public boolean canDoctorGoHome() {
        // To Do
        if(dh.next == null) {
            return true;
        }
        return false;
    }

    public void cancelAll() {
        // To Do
        dh.next = dh;
        dh.prev = dh;
        System.out.println("All Appointments Canceled");
    }


    public void reverseTheLine() {
        // To Do
        if (dh.next == null || dh.next.next == null) {
            return;
        }

        Patient curr = dh.next;
        while (curr != dh) {
            Patient temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = temp;
        }
        Patient pt = dh.next;
        dh.next = dh.prev;
        dh.prev = pt;

        System.out.println("Patients' Line Reversed");

    }

}