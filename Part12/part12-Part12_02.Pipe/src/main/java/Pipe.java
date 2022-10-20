import java.util.ArrayList;

public class Pipe<T> {

  private ArrayList<T> stack;
  private int start;
  private int end;

  public Pipe() {
    this.stack = new ArrayList<>();
    this.start = 0;
    this.end = 0;
  }

  public void putIntoPipe(T arvo) {
    if (this.stack.isEmpty()) {
      this.stack.add(arvo);
      start = this.stack.indexOf(arvo);
      end = this.stack.indexOf(arvo);
    } else {
      this.stack.add(arvo);
      end = this.stack.indexOf(arvo);
    }
  }

  public T takeFromPipe() {
    if (!this.stack.isEmpty()) {
      T toRet = this.stack.get(start);
      this.stack.remove(start);
      end--;
      return toRet;
    }

    return null;
  }

  public boolean isInPipe() {
    return !this.stack.isEmpty();
  }
}
