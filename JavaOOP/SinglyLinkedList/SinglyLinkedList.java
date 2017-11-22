public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else{
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        Node runner = this.head;
        if(runner == null){
            System.out.println("This SLL is Empty");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            while(runner.next.next != null){
                runner = runner.next;
            }
            runner.next = null;
        }    
    }

    public void printAll(){
        Node runner = this.head;
        if(runner == null){
            System.out.println("This SLL is Empty");
        }
        else{
            while (runner != null){
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }

}