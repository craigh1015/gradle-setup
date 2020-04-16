package hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.joda.time.DateTimeUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.DateTime;
import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void mainTest() {
    final PrintStream original = System.out;
    final OutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    DateTimeUtils.setCurrentMillisFixed(DateTime.parse("04/02/2011 20:27:05", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss")).getMillis());

    String[] args = null;
    HelloWorld helloWorld = new HelloWorld();
    assertNotNull(helloWorld);
    HelloWorld.main(args);

    System.setOut(original);

    assertEquals(baos.toString(), "The current local time is: 20:27:05.000\nHello world!\n");
  }
}