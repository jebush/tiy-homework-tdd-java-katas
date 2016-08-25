import java.util.HashMap;

/**
 * Created by rush on 8/24/16.
 */
public class Map1 {

    public static HashMap <String, String> mapBully(HashMap<String, String> map){
        if (map.containsKey("a") && !(map.containsValue(""))){
            map.put("b", map.get("a"));
            map.put("a", "");
            return map;
        } else {
            return map;
        }
    }

    public static HashMap <String, String> mapShare(HashMap<String, String> map){

        if (map.containsKey("a") && !(map.containsValue(""))){
            map.put("b", map.get("a"));
            map.remove("c");
        }
        map.remove("c");
        return map;
    }

    public static HashMap <String, String> mapAB(HashMap<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")){
            map.put("ab", (map.get("a") + map.get("b")));
        } return map;
    }

    public static HashMap<String, String> topping1(HashMap<String, String> map) {

        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
            map.put("bread", "butter");
            return map;

        } else {
            map.put("bread", "butter");
            return map;
        }
    }

    public static HashMap <String, String> topping2(HashMap<String, String> map){
        if (map.containsKey("ice cream") && !(map.containsValue(""))){
            map.put("yogurt", map.get("ice cream"));

        } if (map.containsKey("spinach")){
            map.put("spinach", "nuts");

        }else{
            return map;
        }
        return map;
    }

    public static HashMap <String, String> topping3(HashMap<String, String> map){
        if (map.containsKey("potato") && !(map.containsValue(""))){
            map.put("fries", map.get("potato"));

        } if (map.containsKey("salad") && !(map.containsValue(""))){
            map.put("spinach", map.get("salad"));

        }else{
            return map;
        }
        return map;
    }

}
