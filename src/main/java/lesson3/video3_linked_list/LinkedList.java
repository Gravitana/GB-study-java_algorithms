package lesson3.video3_linked_list;
/*
    грубый пример самостоятельной реализации LinkedList
 */



public class LinkedList<T> {
    private Link<T> first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(T link) {
        Link<T> temp = new Link<>(link);
        temp.setNext(first);
        first = temp;
    }

    public Link<T> delete() {
        Link<T> temp = first;
        first = first.getNext();
        return temp;
    }

    public void display() {
        Link<T> current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public T find(T searchNode) {
        Link<T> findNode = new Link<>(searchNode);
        Link<T> current = first;
        while (current != null) {
            if (current.getValue().equals(findNode.getValue())) {
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

}
