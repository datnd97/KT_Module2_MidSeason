import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        SLList newList = new SLList();
        Scanner sc = new Scanner(System.in);
        String fileName= " ";
        String menu;
        boolean done = false;

        do {
            System.out.println();
            System.out.format("****************************************************************************************************************%n");
            System.out.format("(A)dd  \n(D)elete  \n(P)rint List \n(R)estore from database \n(S)earch \n(W)rite to Disk \n(Q)uit%n");
            System.out.format("****************************************************************************************************************%n");
            System.out.format("Please Enter a command: ");
            menu = sc.nextLine().toUpperCase();
            switch (menu) {
                case "A":
                    System.out.println("Add a entry: ");
                    System.out.println("Enter a FIRST and Last name:");
                    String name = sc.nextLine();

                    System.out.println("Enter a phone Number: ");
                    String phoneNumber = sc.nextLine();
                    newList.add(name,phoneNumber);
                    break;
                case "P":
                    System.out.println("Print Phonebook: ");
                    newList.printList();
                    break;
                case "D" :
                    System.out.println("Enter index number to delete" );
                    int delete = sc.nextInt();
                    newList.delete(delete);
                    break;
                case "S" :
                    System.out.println("Enter a name to search to: ");
                    String sName = sc.nextLine();
                    newList.nameSearch(sName);
                case "Q" :
                    System.out.println("Exiting");
                    done = true;
                    break;
                default:
                    System.out.println("Unknown entry");
            }

        }while (!done);
    }
}
