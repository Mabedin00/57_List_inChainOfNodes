/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );

        // // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());

        //set()

        System.out.println("set changed list the value " + list.set(2,"a") + " to form " + list);

        //get()
        System.out.println(list.get(2));

        //add at the front
        list.add(0,"A");
        System.out.println(list);

        //add at middle
        list.add(4,"d");
        System.out.println(list);

        //add at end
        list.add(list.size(),"2");
        System.out.println(list);

        // remove at the front
        list.remove(0);
        System.out.println(list);

        // remove at the middle
        list.remove(4);
        System.out.println(list);

        // remove at the end
        list.remove(list.size()-1);
        System.out.println(list);


    }


}
