public class Main {
  public static void main(String[] args) throws Exception {
    
    PersonMapper pmap = new PersonMapper();
    
    Person filippo = pmap.getPerson(1);
    
    // 1) "Ciao io sono + this.getName();"
    System.out.println(filippo);
    
    Person martino = pmap.getPerson(1);

    // changing name
    martino.setName("Martino");
    
    // 2)
    System.out.println(filippo);
    
    // 3)
    System.out.println(martino);
  }
} 
