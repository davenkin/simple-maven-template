package davenkin.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldIT {

    @Test
    public void should_say_hello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.sayHello(), "Hello World!");
    }
}