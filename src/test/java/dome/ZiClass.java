package dome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZiClass extends FuClass {
    /**
     * 继承子类只能访问父类中不是私有的成员变量，跟成员方法
     *
     */

    private Integer num = 123;

    private String name  = "9876";

    @Override
    public Map<String, Object> getMap() {
        //重名就重写父类中的方法
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("sole", Arrays.asList("hjf","lmy"));
//        map.put("jori","12341");
//        String obj = new FuClass().getObj();
//        return map;

        //沿袭父类的功能
        Map<String, Object> map = super.getMap();
        //在原来的基础上增强
        map.put("hjf","lmy");
        return map;
    }

    public void test01 () {
        //变量重名了要访问父类中的变量名就要架上super
        System.out.println("父类"+super.name);
        System.out.println(num);
        System.out.println("子类"+this.name);
    }


}
