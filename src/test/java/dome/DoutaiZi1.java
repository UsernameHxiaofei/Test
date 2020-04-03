package dome;

public class DoutaiZi1 implements DuotaInterface {
    @Override
    public void run() {
        System.out.println("DoutaiZi1重写里面的run方法");
    }

    public void test1 () {
        System.out.println("test1");
    }
}
