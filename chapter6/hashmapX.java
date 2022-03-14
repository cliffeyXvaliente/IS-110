import java.util.HashMap;

import java.util.HashSet;

/**
 * 
 * 
 * @author clifford valiente
 * @version Java JDK 17
 * @category Hash og Hashset
 * @param
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class hashmapX {

    public static void main(String[] args) {
        // object
        HashMap<String, String> contactNumbersFriends = new HashMap<String, String>();

        contactNumbersFriends.put("James", "987 67 1241");
        contactNumbersFriends.put("Cameron", "4242 67 2411");

        System.out.println(contactNumbersFriends.get(""));

        HashSet<String> fruits = new HashSet<String>();
        fruits.add("Banana");
        fruits.add("Avocado");

        System.out.print(fruits.size());

    }

}
