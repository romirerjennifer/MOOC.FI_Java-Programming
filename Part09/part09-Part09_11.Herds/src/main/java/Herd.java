import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{

  private List<Movable> herd;

  public Herd() {
    this.herd = new ArrayList<>();
  }

  public void addToHerd(Movable movable){
    this.herd.add((Organism) movable);
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder= new StringBuilder();
    for(Movable movable: herd) {
      stringBuilder.append(movable.toString());
      stringBuilder.append("\n");
    }
    return stringBuilder.toString();
  }

  @Override
  public void move(int dx, int dy) {
    for(Movable movable: herd) {
      movable.move(dx,dy);
    }
  }
}
