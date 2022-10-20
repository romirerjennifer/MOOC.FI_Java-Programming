package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

  private List<Sensor> list;
  private List<Integer> readings;

  public AverageSensor() {
    this.list = new ArrayList<>();
    this.readings = new ArrayList<>();
  }


  public void addSensor(Sensor toAdd) {
    list.add(toAdd);
  }

  public List<Integer> readings(){
    return this.readings;
  }

  @Override
  public boolean isOn() {
    for (Sensor sensor : list) {
      if (!sensor.isOn()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public void setOn() {
    for (Sensor sensor : list) {
      sensor.setOn();
    }
  }

  @Override
  public void setOff() {
    for (Sensor sensor : list) {
      sensor.setOff();
    }
  }

  @Override
  public int read() {
    if (isOn()) {
      double average = list.stream()
        .mapToInt(s -> s.read())
        .average()
        .getAsDouble();
      this.readings.add((int) average);
      return (int) average;
    }
    throw new IllegalStateException("The sensor is turned off!");
  }

}
