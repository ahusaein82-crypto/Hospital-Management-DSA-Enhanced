# Hospital Management System - Data Structures & Algorithms Integration

This project has been enhanced to include various data structures and algorithms as part of the Data Structures and Algorithms course requirements.

## 1. Data Structures Implemented

### Arrays
- Used throughout the project for data representation, especially in `DataManager.getPatientsAsArray()` to facilitate sorting and searching algorithms.

### Linked List
- **Class:** `DataStructures.CustomLinkedList`
- A custom generic implementation of a singly linked list used to store patient records dynamically.

### Stack
- **Class:** `DataStructures.CustomStack`
- Implemented using the custom linked list. Can be used for tracking user actions or history.

### Queue
- **Class:** `DataStructures.CustomQueue`
- Implemented using the custom linked list. Designed for managing patient appointment queues.

### Hashing
- **Class:** `DataStructures.PolynomialHashing`
- Implements **Polynomial Rolling Hash** for strings. Used to compute unique hash values for patient names.

### Trees
- **Class:** `DataStructures.BinarySearchTree`
- A standard BST implementation for efficient searching of patients by their ID.

## 2. Algorithms Implemented

### Sorting
- **Merge Sort:** Implemented in `SortingAlgorithms.mergeSort`. A recursive divide-and-conquer algorithm.
- **Radix Sort:** Implemented in `SortingAlgorithms.radixSort`. A non-comparative sorting algorithm for patient IDs.

### Searching
- **Binary Search:** Implemented both **Iteratively** and **Recursively** in `SearchingAlgorithms`. Used for fast retrieval of patient records from sorted arrays.

### Recursion
- Extensively used in:
  - Merge Sort
  - Binary Search (Recursive version)
  - Binary Search Tree (Insertion and Search)

## 3. Integration
A new module **"Algorithms"** has been added to the Dashboard. This page allows you to:
1. Load data from the database into the custom Linked List and BST.
2. Sort the loaded data using Merge Sort or Radix Sort.
3. Search for patients using Binary Search.
4. Compute polynomial hashes for names.

## 4. Files Added/Modified
- `src/DataStructures/`: New package containing all DS&A implementations.
- `src/Modules/DataStructuresPage.java`: New UI to showcase the algorithms.
- `src/Dashboard/DashboardPage.java`: Modified to include the Algorithms entry point.
- `src/Components/GridBox.java`: Modified to handle navigation to the new page.
