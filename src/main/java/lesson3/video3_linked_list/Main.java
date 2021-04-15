package lesson3.video3_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.insert("Artem");
        list.insert("Roman");

        list.display();

        System.out.println("\n" + list.find("Artem"));
    }
}
