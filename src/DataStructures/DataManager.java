package DataStructures;

import DbConfig.CrudManager;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static CustomLinkedList<Patient> patientList = new CustomLinkedList<>();
    private static BinarySearchTree patientTree = new BinarySearchTree();
    private static CustomStack<String> actionHistory = new CustomStack<>();
    private static CustomQueue<Patient> appointmentQueue = new CustomQueue<>();

    public static void loadPatientsFromDb() {
        patientList.clear();
        Object[][] data = CrudManager.read("SELECT * FROM patients");
        for (Object[] row : data) {
            Patient p = new Patient(
                (int) row[0], (String) row[1], (String) row[2], (String) row[3],
                (String) row[4], (String) row[5], (String) row[6], (String) row[7],
                (String) row[8], (String) row[9]
            );
            patientList.add(p);
            patientTree.insert(p);
        }
    }

    public static Patient[] getPatientsAsArray() {
        Patient[] arr = new Patient[patientList.size()];
        for (int i = 0; i < patientList.size(); i++) {
            arr[i] = patientList.get(i);
        }
        return arr;
    }

    public static void addAction(String action) {
        actionHistory.push(action);
    }

    public static void enqueuePatient(Patient p) {
        appointmentQueue.enqueue(p);
    }

    public static Patient searchPatient(int id) {
        return patientTree.search(id);
    }
    
    public static long getPatientNameHash(String name) {
        return PolynomialHashing.computeHash(name);
    }
}
