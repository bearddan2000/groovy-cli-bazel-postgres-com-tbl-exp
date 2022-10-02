package example;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class Main {

  public static void main(String[] args) {
    final String connectionStr = "jdbc:postgresql://db/animal?user=maria&password=pass";

    example.chain.ILink obj = new example.chain.Driver();

    if (obj.hasResource("org.postgresql.Driver", connectionStr)){
      example.db.print.output.IOutput output = new example.db.print.output.ToConsole();

      java.util.List<String> tblNames = new java.util.ArrayList<String>();
      tblNames << "\"public\".\"dog\"";
      tblNames << "\"public\".\"breedLookup\"";
      tblNames << "\"public\".\"colorLookup\"";
      tblNames << "\"public\".\"dog_expanded\"";
      tblNames << "\"public\".\"breed_count\"";

      for ( String tbl : tblNames)
        example.db.DBQuery.query(connectionStr, tbl, output);
    }
  }
}
