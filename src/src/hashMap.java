import java.util.HashMap;
import java.util.Map;

public class hashMap {
    Map<String,String> map1=new HashMap<>();
    Map<String,String> map2=new HashMap<>();

    public void compare(){
        map1.put("Name","Krunal");
        map1.put("Age","28");
        map1.put("Job","QA");

        map2.put("Name","Jay");
        map2.put("Age","29");
        map2.put("Job","Developer");

        for (String key:map1.keySet()){
            String map1Value=map1.get(key);
            String map2Value=map2.get(key);

            if (map1Value.equals(map2Value)){
                System.out.print("Value Matches for "+key);
            }
            else {
                System.out.print("Value do not match for "+key);
            }
        }

    }

    public static void main(String args[]){
        hashMap map=new hashMap();
        map.compare();
    }
}
