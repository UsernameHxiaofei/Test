package dome;

import java.util.List;

public interface MyInterface {

    //接口中的静态的变量跟讲台的方法都是属于接口的直接可以使用接口直接调用
     static String str = "12312";

    //接口中的抽象方法

    void run ();

    List<String> getList ();


    public default void test01 () {
        System.out.println(1111);
    }

    public static  void test02 () {
        System.out.println("我是静态的方法");
    }


}
