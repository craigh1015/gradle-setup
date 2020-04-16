package hello;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreeterTest {

  @Test
  public void sampleTest() {
    Greeter greeter = new Greeter();
    assertEquals("Hello world!", greeter.sayHello());
  }
}