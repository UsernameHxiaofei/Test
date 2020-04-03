package dome;

public abstract class FuLei {

    /**
     * 抽象方法  含有抽象方法的类是抽象类
     * 但是抽象类中不一定有抽象的方法
     *
     * 一个抽象类 可能用抽象的方法， 有具体的方法
     *
     * 抽象类不能直接创建对象， 需要子类要继承他 重写里面的抽象的方法 然后有子类创建对象
     *
     */
    public abstract  void run ();


    public void run01 () {
        System.out.println("<context: component-scan base-backing=''>");
    }
}
