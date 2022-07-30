package ltd.laima.gsrestservice;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello %s";
    private final AtomicLong counter = new AtomicLong();

    // 等同于 @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",  defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
