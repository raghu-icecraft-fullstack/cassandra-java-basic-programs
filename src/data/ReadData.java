import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class ReadData {

    public static void main(String args[])throws Exception{

        //queries
        String query = "SELECT * FROM emp";

        //Creating Cluster object
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        //Creating Session object
        Session session = cluster.connect("tutorialspoint");

        //Getting the ResultSet
        ResultSet result = session.execute(query);

        System.out.println(result.all());
    }
}