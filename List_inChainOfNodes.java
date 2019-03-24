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
         Node temp = headReference;
         headReference = new Node(val, temp);

        return true;
     }
}
