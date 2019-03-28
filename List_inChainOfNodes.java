/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;
    /**
      Construct an empty list
     */

    public List_inChainOfNodes(){
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        int output = 0;
        Node currentNode = new Node(headReference);
        currentNode = headReference;
        while (currentNode != null){
            currentNode = currentNode.getReferenceToNextNode();
            output++;
        }
        return output;
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String output = "[";
        int counter = 0;
        Node currentNode = headReference;
        while (counter < size()){
            output += currentNode.getCargoReference();
            counter++;
            currentNode = currentNode.getReferenceToNextNode();
        }
        return output + "]";
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        headReference = new Node( val, headReference);
        return true;
     }

     private Node iteration(int index){
         Node val;
         int i;
         for ( i = 0, val = headReference;
               i < index;
               i++, val = val.getReferenceToNextNode()) {
               }
         return val;
     }

     public Object set(int index, Object val){
         Object output;
         if (index == 0){
             output = headReference.getCargoReference();
             headReference = new Node(val, headReference.getReferenceToNextNode());
             return output;
         }
         Node previousNode = this.iteration(index - 1);
         output = this.iteration(index).getCargoReference();
         Node currentNode = new Node(val, this.iteration(index + 1));
         previousNode.setReferenceToNextNode(currentNode);
         return output;

     }

     public Object get(int index){
         return iteration(index).getCargoReference();
     }


     public boolean add(int index, Object val){
        if (index == 0) {
            this.addAsHead(val);
            return true;
        }
        else if (index == this.size()){
            Node newNode = new Node(val);
            Node currentNode = this.iteration(index - 1);
            currentNode.setReferenceToNextNode(newNode);
            return true;
        }
        Node currentNode = this.iteration(index);
        Node newNode = new Node(val, this.iteration(index + 1));
        currentNode.setReferenceToNextNode(newNode);
        return true;

     }

     public boolean remove(int index){

         if (index == 0){
            headReference = headReference.getReferenceToNextNode();
            return true;
         }
         else if (index == this.size()){
            Node previousNode = this.iteration(index-1);
            previousNode.setReferenceToNextNode(null);
         }
         Node previousNode = this.iteration(index-1);
         Node nextNode = this.iteration(index + 1);
         previousNode.setReferenceToNextNode(nextNode);
         return true;
     }
}
