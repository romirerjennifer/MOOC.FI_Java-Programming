

public class Checker {
  public boolean isDayOfWeek(String string){
    String regex="mon|tue|wed|thu|fri|sat|sun";
    return string.matches(regex);
  }
  public boolean allVowels(String string){
    String regex= "[aeiou]*";
    return string.matches(regex);
  }
  public boolean timeOfDay(String string){
    String regex= "([0-1]\\d|[2][0-3]):[0-5]\\d:[0-5]\\d";
    return string.matches(regex);
  }
}
