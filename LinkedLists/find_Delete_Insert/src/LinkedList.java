public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty()
       {
         return (first == null);
       }

    public void displayList() {
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    //find method
    public boolean find(int id) {
        Link current = first;

        while (current != null) {
            if (current.iData == id)
                return true;
            else
                current = current.next;
        }
        return false;
    }

    //insert method
    public void insertFirst(int id) {
        Link newLink = new Link(id);
        newLink.next = first;
        first = newLink;
    }

    public void insertMiddle(int key, int id) {
        Link newLink = new Link(id);
        Link current = first;

        while (current != null) {
            if (current.iData == key) {
                newLink.next = current.next;
                current.next = newLink;
            } else
                current = current.next;
        }
    }

    //delete method
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;

        return temp;
    }

}
