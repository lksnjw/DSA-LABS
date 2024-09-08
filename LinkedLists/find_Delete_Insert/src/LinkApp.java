public class LinkApp {
    public static void main(String [] args){

        LinkedList line = new LinkedList();
        line.insertFirst(10);
        line.insertFirst(20);
        line.insertFirst(30);
        line.insertFirst(40);

        line.displayList();

        while(!line.isEmpty()){
            Link temp = line.deleteFirst();
            //System.out.println(temp.displayLink());
            System.out.println("Deleted");
            temp.displayLink();
        }
    }
}
