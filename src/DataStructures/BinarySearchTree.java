package DataStructures;

public class BinarySearchTree {
    private Node root;

    private static class Node {
        Patient patient;
        Node left, right;

        Node(Patient patient) {
            this.patient = patient;
        }
    }

    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private Node insertRecursive(Node root, Patient patient) {
        if (root == null) {
            return new Node(patient);
        }
        if (patient.getId() < root.patient.getId()) {
            root.left = insertRecursive(root.left, patient);
        } else if (patient.getId() > root.patient.getId()) {
            root.right = insertRecursive(root.right, patient);
        }
        return root;
    }

    public Patient search(int id) {
        return searchRecursive(root, id);
    }

    private Patient searchRecursive(Node root, int id) {
        if (root == null || root.patient.getId() == id) {
            return root == null ? null : root.patient;
        }
        if (id < root.patient.getId()) {
            return searchRecursive(root.left, id);
        }
        return searchRecursive(root.right, id);
    }
}
