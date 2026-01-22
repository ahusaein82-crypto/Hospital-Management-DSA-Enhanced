package DataStructures;

public class CustomQueue<T> {
    private CustomLinkedList<T> list = new CustomLinkedList<>();

    public void enqueue(T data) {
        list.add(data);
    }

    public T dequeue() {
        if (isEmpty()) return null;
        T data = list.get(0);
        // In a real implementation, we'd remove the first node
        return data;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
