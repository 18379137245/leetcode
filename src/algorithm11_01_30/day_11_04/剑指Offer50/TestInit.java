package algorithm11_01_30.day_11_04.剑指Offer50;

/**
 * 准备阶段：为static变量
 *
 * 初始化阶段
 * 父类静态变量初始化 和 静态语句块 （顺序是源码顺序）
 * 子类静态变量初始化 和 子类静态语句块（顺序是源码顺序）
 *
 * 父类非静态变量初始化 和 父类语句块 （顺序是源码顺序）
 * 父类构造函数
 * 子类非静态变量初始化 和 子类语句块 （顺序是源码顺序）
 * 子类构造函数
 *
 * 总结：
 * 类执行顺序：父类和之类    结论：运行父类
 * 类成员执行顺序：静态、非静态、构造方法、入口方法
 */
public class TestInit {
    public static void main(String[] args) {
        staticFunction();
    }

    static boolean flag1 = true;
    static TestInit st = new TestInit();
    private final int aint = 123;
    static boolean flag = true;
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
        System.out.println(aint);
        System.out.println(flag1);
        System.out.println(flag);
    }
    TestInit() {
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }
    public static void staticFunction() {
        System.out.println("4");
    }
    int a = 110;
    static int b = 112;
    static {
        System.out.println("b=" + b);
    }
}
