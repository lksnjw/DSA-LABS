public class stack {
    class StackX{
        private double []stkArray;
        private int maxSize;
        private int top;

        //constructor
        public StackX(int s){
            maxSize=s;
            stkArray=new double[maxSize];
            top=-1;
        }

        //push method
        public void push(double j){
            if(top==maxSize-1)
                System.out.println("Stack is Full");
            else
                stkArray[++top]=j;
        }

        //pop method
        public double pop(){
            if(top==-1){
                System.out.println("Stack is Empty");
                return -99;
            }
            else
                return stkArray[top--];
        }

        //peek method
        public double peek(){
            if(top==-1){
                System.out.println("Stack is Peek");
                return -99;
            }
            else
                return stkArray[top];
        }
    }
}
