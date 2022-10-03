public class Driver {

    Node head;

    public static class Node {

        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
            next = null;
        }

    }


    public static void main(String[] args)
    {
        System.out.println("Hello Linked List");

        Driver list = new Driver();

        list = insertIntoLinkedList(list,"1");
        list = insertIntoLinkedList(list,"3");
        list = insertIntoLinkedList(list,"2");

        printList(list);

    }

    public static Driver insertIntoLinkedList(Driver list, String data){
        Node newNode = new Node(data);

        if(list.head==null){
            list.head = newNode;
        }else {
            Node last = list.head;

            while (last.next!=null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printList(Driver list)
    {
        int size = 0;
        Node currentNode = list.head;
        while (currentNode != null){
            size++;
            System.out.println("value"+ currentNode.data);
            currentNode = currentNode.next;
        }
//        int middle = (int) Math.ceil(size/2);
//        System.out.println(2/2);

    }
}
