
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.System.err;
import static java.lang.System.out;

public class bd {

    private static final String URL = "jdbc:mysql://localhost:3306/mytestbd";
    private static final String USERNAME = "root";
    private static final String PASSWORD= "root";


    public static String getURL() {
        return URL;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void main(String[] args){
        Connection connection ;
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            if (!connection.isClosed()){
                out.println("Соединение с БД установлено"); }

                connection.close();


            if(connection.isClosed()){
                out.println("Соединение закрыто");
            }

        } catch (SQLException e) {
            err.println("Не удалось загрузить драйвер");
        }

    }

}


