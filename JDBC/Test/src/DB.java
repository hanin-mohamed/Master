import java.sql.*;
public class DB {

    public static void main(String[] args) throws Exception {
        //connect to DB
       // Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://localhost/login_shema";
        Connection conn = DriverManager.getConnection(connectionUrl,"root","hanona");
        System.out.println("Connected to database");
        //Execution
        ResultSet resultSet =null ;
        Statement statement=conn.createStatement();
        resultSet = statement.executeQuery("select * from users");
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        //Create new table;
        /*String s="create table books(bookid int,bookname char(10),bookprice int)";
        statement.executeUpdate(s);
        System.out.println("table created");*/
        //insert into table
        /*String insert = "insert into books values(123,'OOP',130),(33,'Head First',500)";
        statement.executeUpdate(insert);
        System.out.println("Insertation Done");*/
        String update ="update users set password='love' where name ='Mohamed'";
        statement.executeUpdate(update);
        System.out.println("Data updated successfully ! ");
        statement.close();
        conn.close();

    }
}