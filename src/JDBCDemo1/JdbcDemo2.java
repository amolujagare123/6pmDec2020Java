package JDBCDemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String url = "jdbc:mysql://localhost:3306/730batch";
        String user = "root";
        String pass = "root";

        Connection con = DriverManager.getConnection(url,user,pass);
        // 3 . creating a statement

        Statement st = con.createStatement();
        // 4. execute query
        // select , insert , update ,delete
        // DDL - Data definition language - select , crate , grant ,drop
        // DML - Data manupulation language - insert , update ,delete

        String sql1 ="insert into student values(9,'rajesh','Comp',67)";
        String sql2 ="insert into student values(10,'sameer','Comp',67)";
        String sql3 ="insert into student values(11,'chinmay','Comp',67)";
        String sql4 ="insert into student values(12,'Sachin','Comp',67)";

        st.addBatch(sql1);
        st.addBatch(sql2);
        st.addBatch(sql3);
        st.addBatch(sql4);

        st.executeBatch();

        // st.executeUpdate(sql);













    }
}
