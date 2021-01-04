package JDBCDemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

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

       // String sql ="insert into student values(8,'rajesh','Comp',67)";
       // String sql ="update student set branch='IT' where rno=8";
        String sql ="delete from student where rno=2";

        st.executeUpdate(sql);













    }
}
