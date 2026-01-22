package DataStructures;

public class CustomStack<T> {
    private CustomLinkedList<T> list = new CustomLinkedList<>();

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        if (isEmpty()) return null;
        // Simplified pop for demonstration
        T data = list.get(list.size() - 1);
        // In a real implementation, we'd remove the last node
        return data;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
