import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Truncate_Table {

    public static void main(String args[]){

        //Query
        String query = "Truncate student;";

        //Creating Cluster object
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        //Creating Session object
        Session session = cluster.connect("tp");

        //Executing the query
        session.execute(query);
        System.out.println("Table truncated");
    }
}