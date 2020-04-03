package dome;

import com.dome.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class ExtendsTest {

    @Test
    public void test01 () {
        FuClass fu = new ZiClass();
//        zi.test01();
        Map<String, Object> map = fu.getMap();
        System.out.println("map = " + map);
        fu.setObj("hjf");
        String obj = fu.getObj();
        System.out.println("obj = " + obj);

    }


    @Test
    public void test02 () {
//        MyInterface myInterface = new MyInterfaceImpl();
//        System.out.println(myInterface.str);
//        myInterface.run();
//        myInterface.test01();
//        MyInterface.test02();
        new MyInterface() {
            @Override
            public void run() {
                System.out.println("true = " + true);
            }

            @Override
            public List<String> getList() {
                return null;
            }
        }.run();
    }


    @Test
    public void test03 () {
        //只能调用父类或者父接口中存在的方法
        DuotaInterface duotaInterface = new DoutaiZi1();
        if (duotaInterface instanceof DoutaiZi1) {
            //向下转型
            DoutaiZi1 doutaiZi1 = (DoutaiZi1) duotaInterface;
            doutaiZi1.test1();
        } else {
            System.out.println("false");
        }
    }


    @Test
    public void test04 () {
        List<String> strings = new ArrayList<>();
        strings.add("张无忌");
        strings.add("张三");
        strings.add("乔峰");
        strings.add("段誉");

//        List<String> zhangList = new ArrayList<>();
//        //遍历过滤集合中带有张
//        for (String string : strings) {
//            if (string.startsWith("张") && string.length() >= 3) {
//                zhangList.add(string);
//            }
//
//        }
//
//
//        System.out.println(zhangList);

        //使用Stream流对象
        List<String> list = strings.stream()
                .filter(string -> string.length() >= 3 && string.startsWith("张"))
                .collect(Collectors.toList());
//        System.out.println("list = " + list);

        List<String> collect = strings.stream().map(s -> s + "111").collect(Collectors.toList());
        System.out.println("collect = " + collect);

    }

    public Map<String,String> test05 () {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone","123123");
        map.put("code","412421");
        return map;
    }
    @Test
    public void test06 () {

        HashMap<String, String> map = new HashMap<>();
        ArrayList<Map<String, String>> maps = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            map.put("hjf"+i,"lmy");
            maps.add(map);
        }
        System.out.println("maps = " + maps);
    }


    public void test07 () {
        System.out.println("我是test07");
    }
    public void test08() {
        System.out.println("我是test08");
    }

    public void test10 () {
        System.out.println("我是test10");
    }

    public void test11 () {
        System.out.println("我是test11");
    }

    public void test12 () {
        System.out.println("我是test12");
    }





}
