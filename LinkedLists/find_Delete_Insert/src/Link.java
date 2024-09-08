public class Link {
    public int iData;
    public Link next;

    //constructor
    public Link(int id){
        iData = id;
        next = null;
    }

    public int displayLink(){
        System.out.println(iData);
        return 0;
    }
}
