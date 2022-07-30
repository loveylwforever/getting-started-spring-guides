package hello;

import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSayHello(){
        Assert.assertEquals(greeter.sayHello(), "Hello World");
    }
}
