import java.io.Serializable;

public class SLNode implements Serializable {
    private String name;
//    private String email;
    private String phoneNumber;
    private SLNode text;
    private SLNode next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SLNode getText() {
        return text;
    }

    public void setText(SLNode text) {
        this.text = text;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }
    public String toString() {
        return "Name = " + name +",Phone Number = "
                + phoneNumber;

    }
}
