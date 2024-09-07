public class Tree {

        private Node root;
        public Tree() {
            root = null;
        }

        //insert method
        public void insert (int id, double dd){
            Node newNode = new Node();
            newNode.iData=id;
            newNode.dData=dd;

            if (root==null)//no node in root
                root=newNode;
            else {
                Node current =root;//start at root
                Node parent;

                while (true){
                 parent = current;
                 if (id<current.iData)/*go left*/{
                     current=current.leftChild;
                     if (current==null){
                         parent.leftChild=newNode;
                         return;
                     }
                 }
                 else /*go right*/{
                     current=current.rightChild;
                     if (current==null){
                         parent.rightChild=newNode;
                         return;
                     }
                 }

                }
            }
        }

        //delete method
        public boolean delete (int id){
            return false;
        }

        //find method
        public Node find(int iData){
            Node current = root;

            while (current.iData != iData){
                if(iData<current.iData)
                    current=current.leftChild;
                else
                    current=current.rightChild;
                if(current==null)
                    return  null;
            }
            return current;
        }
    }

