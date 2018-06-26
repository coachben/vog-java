import java.sql.*;

public class Basicjdbc{
    public static void main (String []args){
        System.out.println("Mysql Connect example");
        
        Connection conn =null;
        Statement stmt = null;
        PreparedStatement prep =null;
        ResultSet res =null;
        
        String url ="jdbc:mariadb://ensembldb.ensembl.org/";
        String db ="asiadb";
        String user ="root";
        String pass ="";
        String driver ="com.mysql.jdbc.Driver";
        
        try{
            //Instanciate driver class
           Class.forName(driver);
        
            //create object for the connection
            conn = DriverManager.getConnection(url+db,user,pass);
            System.out.println("Connected to the databse");
            conn.close();
            System.out.println("Database is nwo disconnected");
            
            //create a statement object to run query
            stmt = conn.createStatement();
            //Insert records
            String sql = "INSERT INTO employee (id,name,salary) VALUES ("+ 1 +","+ "'Benny',"+"1000)";
            System.out.println("sql statement is: "+ sql);
            int val = stmt.executeUpdate(sql);
            System.out.println("Statement update Successful");
            
            //Displaying data from a table
            
            String sql2 = "SELECT * FROM employee";
            res=stmt.executeQuery(sql2);
            System.out.println("Employee Code: "+ "\t" + "Employee Name");
            
            while(res.next()){
                int i = res.getInt("id");
                String s= res.getString("name");
                System.out.println(i + "\t\t "+s);
            }
            
            
            //update a record
            String sql3= "UPDATE employee SET salary='10000' WHERE name='john'";
            int val2 = stmt.executeUpdate(sql3);
            System.out.println("update Successful. REcords affected is :" + val2 );
            
            //Delete records
            String sql4= "DELETE * FROM Employee";
            int val3 = stmt.executeUpdate(sql4);
            System.out.println("update Successful. REcords affected is :" + val3 );
            
            
            
            //catching generated exceptions.
            conn.close();
        }catch (SQLException e){
          System.out.println("Sql Statement has an error" + e.getMessage());
        }catch(Exception s){
            s.printStackTrace();
        }
    }
}