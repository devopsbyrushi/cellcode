package flipkart.client;

import flipkart.client.flipTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class flipSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for Test");
    suite.addTestSuite(flipTest.class);
    return suite;
  }
}
