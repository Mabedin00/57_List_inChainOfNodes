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

     public boolean set(int index, Object val){
         int counter = 0;
         Node currentNode = headReference;
         while (counter < size()){
             if (counter == index -1){
                 Node temp = currentNode.getReferenceToNextNode();
                 Node newNode = new Node(val, temp.getReferenceToNextNode());
                 currentNode.setReferenceToNextNode(newNode);
                 return true;
             }
             counter++;
             currentNode = currentNode.getReferenceToNextNode();
         }
         return true;

     }

     public Object get(int index){
         int counter = 0;
         Node currentNode = headReference;
         while (counter < size()){
             if (index == counter) return currentNode.getCargoReference();
             currentNode = currentNode.getReferenceToNextNode();
             counter++;
         }
         return null;
     }

     public boolean add(int index, Object val){
         if (index == 0) this.addAsHead(val);
         int counter = 0;
         Node currentNode = headReference;
         while (counter < size()){
             if (index - 1 == counter){
                 Node newNode = new Node(val, currentNode.getReferenceToNextNode());
                 currentNode.setReferenceToNextNode(newNode);
                 return true;
             }
             currentNode = currentNode.getReferenceToNextNode();
             counter++;
         }
         return true;
     }

     public boolean remove(int index){
         int counter = 0;
         Node currentNode = headReference;
         while (counter < size()){
             if (index == 0){
                headReference = headReference.getReferenceToNextNode();
                return true;
             }
             else if (counter == index -1){
                 Node temp = currentNode.getReferenceToNextNode();
                 currentNode.setReferenceToNextNode(temp.getReferenceToNextNode());
                 return true;
             }
             else if (index == size() - 1 && counter == index - 1){
                 currentNode.setReferenceToNextNode(null);
                 return true;
             }
             currentNode = currentNode.getReferenceToNextNode();
             counter++;
         }
         return true;
     }
}
