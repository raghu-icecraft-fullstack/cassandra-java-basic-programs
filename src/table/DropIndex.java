import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class DropIndex {

    public static void main(String args[]){

        //Query
        String query = "DROP INDEX user_name;";

        //Creating cluster object
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();.

        //Creating Session object
        Session session = cluster.connect("tp");

        //Executing the query
        session.execute(query);

        System.out.println("Index dropped");
    }
}