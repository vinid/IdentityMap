public class Person {
  private int key;
  private String name;
  private String surname;

  public Person(int _key, String _name, String _surname)
  {
    key =_key;
    name = _name;
    surname = _surname;
  }

  public String toString() {
    return "Ciao, io sono " + this.name;
  }

  public void setName(String _name) {
    this.name = _name;
  }
  
  public int getKey() {
    return this.key;
  }
}
