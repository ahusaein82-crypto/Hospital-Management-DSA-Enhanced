package Modules;

import DataStructures.*;
import config.DesignConstants;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class DataStructuresPage extends javax.swing.JFrame {

    public DataStructuresPage() {
        setTitle("Data Structures & Algorithms Showcase");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JPanel buttonPanel = new JPanel(new GridLayout(0, 1, 5, 5));

        JButton btnLoad = new JButton("1. Load Data (Linked List & BST)");
        btnLoad.addActionListener(e -> {
            DataManager.loadPatientsFromDb();
            outputArea.append("Data loaded into Linked List and Binary Search Tree.\n");
        });

        JButton btnSort = new JButton("2. Sort Patients (Merge Sort)");
        btnSort.addActionListener(e -> {
            Patient[] patients = DataManager.getPatientsAsArray();
            SortingAlgorithms.mergeSort(patients, 0, patients.length - 1);
            outputArea.append("Patients sorted by ID using Merge Sort:\n");
            for (Patient p : patients) outputArea.append(p.toString() + "\n");
        });

        JButton btnRadix = new JButton("3. Sort Patients (Radix Sort)");
        btnRadix.addActionListener(e -> {
            Patient[] patients = DataManager.getPatientsAsArray();
            SortingAlgorithms.radixSort(patients);
            outputArea.append("Patients sorted by ID using Radix Sort:\n");
            for (Patient p : patients) outputArea.append(p.toString() + "\n");
        });

        JButton btnSearch = new JButton("4. Search Patient (Binary Search)");
        btnSearch.addActionListener(e -> {
            String idStr = JOptionPane.showInputDialog("Enter Patient ID to search:");
            if (idStr != null) {
                int id = Integer.parseInt(idStr);
                Patient[] patients = DataManager.getPatientsAsArray();
                SortingAlgorithms.mergeSort(patients, 0, patients.length - 1);
                int index = SearchingAlgorithms.binarySearchRecursive(patients, 0, patients.length - 1, id);
                if (index != -1) outputArea.append("Found: " + patients[index].toString() + "\n");
                else outputArea.append("Patient not found.\n");
            }
        });

        JButton btnHash = new JButton("5. Compute Name Hash (Polynomial Hashing)");
        btnHash.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter Name to hash:");
            if (name != null) {
                long hash = PolynomialHashing.computeHash(name);
                outputArea.append("Hash for '" + name + "': " + hash + "\n");
            }
        });

        buttonPanel.add(btnLoad);
        buttonPanel.add(btnSort);
        buttonPanel.add(btnRadix);
        buttonPanel.add(btnSearch);
        buttonPanel.add(btnHash);

        mainPanel.add(buttonPanel, BorderLayout.WEST);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel);
    }
}
