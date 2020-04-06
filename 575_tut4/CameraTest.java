package ic.doc.camera;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class CameraTest {

  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  @Test
  public void switchingTheCameraOnPowersUpTheSensor() {

    final Sensor sensor = context.mock(Sensor.class);


    Camera camera = new Camera();

    //expectations
    try {
      context.checking(new Expectations() {{

        exactly(1).of(sensor).powerUp();
        //oneOf (sensor).powerUp();
      }});
    }
    catch (Exception e)
    {
      System.out.println("WRONG!");
      System.out.println(e.toString());
      System.out.println(e.toString());
    }
    //execute
    System.out.println("hahaha!");


    camera.setSensor(sensor);
    camera.powerOn();
  }

}
