import java.util.*;


public class Practice {
    public static void main(String[] args) {
////        ArrayList<String> myList = new ArrayList<>();
////        myList.add("Cookies!");
////        myList.add("Ice Cream!!");
////
////        String[] cookieFlavors = new String[] {"Chocolate Chip", "Oatmeal Raisin", "Sugar Cookie"};
////        List<String> stringCookieFlavors = Arrays.asList(cookieFlavors);
//
////        LinkedList<String> iceCreamFlavors = new LinkedList<>();
////        iceCreamFlavors.add("Oreo");
////        iceCreamFlavors.add("Cherry Garcia");
//////create linke dlist and put in integers 1-10 print out its size then remove numbers 5-10
////
////        LinkedList<Integer> numList = new LinkedList<>();
////        for (int i = 1; i <= 10; i++){
////            numList.add(i);
////        }
////
////        System.out.println(numList.size());
////
////        for (int i = 1; i <= 6; i++){
////            numList.remove(4);
////        }
////        System.out.println(numList);
//
//        HashMap<String, String> dict = new HashMap<String, String>();
//        dict.put("apple", "fruit from a tree");
//        dict.put("lake", "A large body of water");
//        System.out.println(dict.get("apple"));

        LinkedList<String> myList = new LinkedList<String>();
            myList.add("One");
            myList.add("Two");
            myList.add("There");
            myList.add("Four");


        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int i = 0;
        for( String elem : myList){
           i++;
           hm.put(elem, i);
        }
        System.out.println(hm);

    }
}
