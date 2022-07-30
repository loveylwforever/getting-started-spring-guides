package ltd.laima.gsrestservice;

public class Greeting {
    // 当final修饰的是一个基本数据类型数据时, 这个数据的值在初始化后将不能被改变。
    // final修饰属性可以考虑变量赋值的方式有：显示初始化、代码块中初始化、构造器初始化。
    // 本例就是采用构造器初始化的方式

    /*当final修饰的是一个引用类型数据时, 也就是修饰一个对象时,
    引用在初始化后将永远指向一个内存地址, 不可修改。
    但是该内存地址中保存的对象信息, 是可以进行修改的。*/
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
