package tClass;

import HW2.Map;
import java.util.HashMap;


public class tMap {
    private static HashMap<String, String> MY_MAP = createMap();

    private static HashMap<String, String> createMap() {
        HashMap<String, String> result = new HashMap<String,String>();
        result.put("1", "one");
        result.put("2", "two");
        result.put("3","three");
        return result;
    }
    public static void testMap() {
        System.out.println("Кол-во одинаковых элементов: " + Map.countElementsInMap("Ерохин","Сергей"));
        System.out.println(" ");
        System.out.println(Map.deleteValueFromMap(MY_MAP,"two"));
        System.out.println(Map.deleteValueFromMap(MY_MAP,"three"));
        System.out.println(" ");
    }
}
