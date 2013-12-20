import java.sql.*;

public class PersonMapper {

  public PersonMapper() {
  }

  public static Person getPerson(int key) throws Exception, ClassNotFoundException, SQLException {
       
    Person person = IdentityMap.isInto(key);
    if(person!=null)
    {
      return person;
    }
    else {
      Person trovata = findinDB(key);
      IdentityMap.add(trovata);
      return trovata;
    } 
    
  }

private static Person findinDB(int key) throws Exception{
      Class.forName("org.sqlite.JDBC");
      
      //Open connection with the sql lite database

      Connection conn = DriverManager.getConnection("jdbc:sqlite:person.db");
      Statement stat = conn.createStatement();
      
      //this is the query that will get the Person data
      String query = "select * from people where key = " + '\'' + key + '\'';
      
      ResultSet rs = stat.executeQuery(query);
      
      if (rs.next()) {
        String name = rs.getString("name");
        String surname = rs.getString("surname");

        rs.close();
        conn.close();
      
      Person trovata = new Person(key, name, surname);

      return trovata;

      }
      else {
        System.out.println("Record not found");
        System.exit(1);

      }
    
    return null;
  }
} 
