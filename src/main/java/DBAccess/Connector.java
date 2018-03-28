package DBAccess;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Connector {
//    private static final String url = "jdbc:mysql://localhost:3306/useradmin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//    private static final String username = "doorkeeper";
//    private static final String password = "bank3*andyouarein";
//
    private static Connection singleton;
//
    public static void setConnection(Connection con) {
        singleton = con;
    }
    


    
//
//    public static Connection connection() throws ClassNotFoundException, SQLException  {
//        if ( singleton == null ) {
//            Class.forName( "com.mysql.jdbc.Driver" );
//            singleton = DriverManager.getConnection( url, username, password );
//        }
//        return singleton;
//    }
//}

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (singleton == null) {
            MysqlDataSource source = new MysqlDataSource();
            source.setServerName("165.227.169.82");
            source.setPort(3306);
            source.setDatabaseName("useradmin");
            source.setUser("sunicolai");
            source.setPassword("root");
            singleton = source.getConnection();
        }
        return singleton;
    }
}

