import java.io.Serializable;

public class SLList implements Serializable {
    private SLNode head;
    private int length;

    public SLList() {
        head = null;
        length = 0;
    }
    public boolean isEmpty() {
        return(length == 0);
    }
    public void add(String name,String phoneNumber) {
        SLNode current = head;
        SLNode previous = null;
        SLNode newNode = new SLNode();

        newNode.setName(name);
//        newNode.setEmail(email);
        newNode.setPhoneNumber(phoneNumber);

        if (isEmpty()) {
            head = newNode;
            length++;
        }
        else {
            for (int i = 0; i < length; i++) {
                String[] ourNames1 = current.getName().split(" ");
                String[] ourNames2  = newNode.getName().split(" ");
                int result = ourNames1[ourNames1.length-1].compareToIgnoreCase(ourNames2[ourNames2.length-1]);
                if(result > 0) {
                    if(previous == null) {
                        newNode.setNext(current);
                        head = newNode;
                        length++;
                        break;
                    }
                    previous.setNext(newNode);
                    newNode.setNext(current);
                    length++;
                    break;
                }
                else {
                    if(current.getNext() == null) {
                        current.setNext(newNode);
                        newNode.setNext(null);
                        length++;
                        break;
                    }
                    previous = current;
                    current = current.getNext();
                }
            }
        }

    }
        public void printList() {
            SLNode tempNode = head;
            if(head == null) {
                System.out.println("The list is empty");
            }
            else {

                for(int i =0 ; i < length;i++) {
                    System.out.println("Index = "+(i + 1) + " ");
                    System.out.println(tempNode);
                    tempNode = tempNode.getNext();
                }
            }
            System.out.println();
        }
    public void nameSearch(String name) {
        SLNode current = head;
        boolean empty = true;

        if(isEmpty()){
            System.out.println("The list is empty");
        }
        else {
            for(int  i =0;i < length;i++) {
                if(current.getName().toLowerCase().contains(name.toLowerCase())){
                    System.out.println("Index = "+(i + 1)+" ");
                    System.out.println(current);
                    empty = false;
                }
            }
            current = current.getNext();
        }
        if(empty) {
            System.out.println("No matches to that name!");
        }
    }
    public void delete(int index) {
        SLNode current = head;
        SLNode previous = null;
        boolean empty = true;
        if(isEmpty()) {
            System.out.println("The list is empty");
        }
        else {
            for(int i = 0 ; i < length ;i++) {
                if((index - 1) == i) {
                    if( previous == null) {
                        head = head.getNext();
                        length--;
                        empty = false;
                        break;
                    } else if (current.getNext() ==null) {
                        previous.setNext(null);
                        length--;
                        empty = false;
                        break;
                    } else {
                        previous.setNext(current.getNext());
                        length--;
                        empty = false;
                        break;
                    }
                }
                else {
                    previous = current;
                    current = current.getNext();
                }
                if(empty) {
                    System.out.println("Index Does Not Exist!");
                }
                else {
                    System.out.println("Successfully deleted index "+index);
                }
            }
        }
    }
}
