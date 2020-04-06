package ic.doc.camera;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class Camera {
  private Sensor sensor = null;
  public void pressShutter() {
    // not implemented
  }

  public void setSensor(Sensor theSensor) {
    sensor = theSensor;
  }
  public void powerOn() {
    if (sensor != null) {
      sensor.powerUp();
    }
  }

  public void powerOff() {
    // not implemented
  }
}

