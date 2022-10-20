public class Hideout<T> {
  T hidden = null;
  public void putIntoHideout(T toHide){
    hidden = toHide;
  }
  public T takeFromHideout(){
    T take = hidden;
    hidden = null;
    return take;
  }
  public boolean isInHideout(){
    return hidden!= null;
  }
}
