//Queue Implementation
class QueueX {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int noOItems;

    public QueueX(int s){
        maxSize = s;
        queArray = new int [maxSize];
        front = 0;
        rear = -1;
        noOItems = 0;
    }
}

    //Insert method
    public void insert(int j){
        //check whether queue is full
        if(rear==maxSize-1)
            System.out.println("Queue is full");
        else {
            queArray[++rear] = j;
            noOItems++;
        }
    }

    //remove method
    public int remove(){
        if(noOItems==0){
            System.out.println("Queue is Empty");
            return -99;
        }
        else {
            return queArray[front++];
        }
    }

    //peekFront method
    public int peekFront(){
    if(noOItems==0){
        System.out.println("Queue is Empty");
        return -99;
    }
    else{
        return queArray[front];
    }
    }

    //Exercise 1
    public boolean isFull(){
        return(rear==maxSize-1);
    }
    public boolean isEmpty(){
        return(noOItems==0);
    }

    //Circular Method
    //Insert
    public int insert(int j){
    //check whether queue is full
     if(noOItems == maxSize)
         System.out.println("Queue is full");
     else{
         if(rear == maxSize-1)
             rear = -1;
         queArray[++rear]=j;
         noOItems++;
     }
        return j;
    }

    //remove
    public int remove(){
    //check whether queue is empty
        if(noOItems == 0)
            System.out.println("Queue is Empty");
        else{
            int temp = queArray[front++];
            if(front==maxSize)
                front=0;
            noOItems--;
            return temp;
        }
    }

}

Ex2
//main app
class QueueApp{
    public static void main(String[] args){
        QueueX q = new QueueX(10);

        q.insert(10);
        q.insert(25);
        q.insert(55);
        q.insert(65);
        q.insert(85);

        while(!q.isEmpty())
            System.out.println(q.remove());

    }
}

