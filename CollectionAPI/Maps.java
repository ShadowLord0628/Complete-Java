package CollectionAPI;

import java.util.Map;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Harsh", 56);
        students.put("Sakshi", 99);
        students.put("Ravi", 57);
        students.put("Ram", 58);

        students.put("Harsh", 77);

        System.out.println(students.keySet());

        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }

    }
}

/*
 * HashTable and HashMap both are same in working but Hashtable is synchronized.
 */
