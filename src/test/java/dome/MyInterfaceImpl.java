package dome;

import java.util.ArrayList;
import java.util.List;

public class MyInterfaceImpl implements MyInterface {

    String str = "asdf";

    @Override
    public void run() {
        System.out.println("重写接口中的抽象方法");
    }

    @Override
    public List<String> getList() {
        List<String> strings = new ArrayList<>();
        strings.add("hjf");
        return strings;
    }
}
