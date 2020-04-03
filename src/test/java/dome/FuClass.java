package dome;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuClass {

     String name = "1234";

     Integer[] arr = new Integer[3];

     List<Double> list = new ArrayList<>();


     private String obj;

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    @Autowired
     Dome dome;



    public Map<String, Object> getMap () {
        HashMap<String, Object> map = new HashMap<>();
        map.put("phone","12345678");
        map.put("code","098765544332");
        System.out.println(map.get("phone"));
        return map;
    }
}
