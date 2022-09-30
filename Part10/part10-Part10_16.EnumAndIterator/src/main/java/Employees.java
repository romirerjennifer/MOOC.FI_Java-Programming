import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
  private List<Person> employees;
  public Employees(){
    this.employees= new ArrayList<>();
  }
  public void add(Person personToAdd){
    this.employees.add(personToAdd);
  }
  public void add(List<Person> peopleToAdd){
    this.employees.addAll(peopleToAdd);
  }
  public void print(){
    Iterator<Person> iterator = this.employees.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  public void print(Education education){
    Iterator<Person> iterator = this.employees.iterator();

    while (iterator.hasNext()) {
      Person check = iterator.next();
      if (education.equals(check.getEducation())) {
        System.out.println(check);
      }
    }
  }
  public void fire(Education education){
    Iterator<Person> iterator = this.employees.iterator();

    while (iterator.hasNext()) {
      if (education.equals(iterator.next().getEducation())) {
        iterator.remove();
      }
    }
  }
}
