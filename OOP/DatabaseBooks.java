/*
Database: ebookshop
Table: books
+-------+----------------------------+---------------+---------+-------+
| id    | title                      | author        | price   | qty   |
| (INT) | (VARCHAR(50))              | (VARCHAR(50)) | (FLOAT) | (INT) |
+-------+----------------------------+---------------+---------+-------+
| 1001  | Java for dummies           | Tan Ah Teck   | 11.11   |   11  |
| 1002  | More Java for dummies      | Tan Ah Teck   | 22.22   |   22  |
| 1003  | More Java for more dummies | Mohammad Ali  | 33.33   |   33  |
| 1004  | A Cup of Java              | Kumar         | 44.44   |   44  |
| 1005  | A Teaspoon of Java         | Kevin Jones   | 55.55   |   55  |
+-------+----------------------------+---------------+---------+-------+
create database if not exists ebookshop;
 
use ebookshop;
 
drop table if exists books;
create table books (
   id int,
   title varchar(50),
   author varchar(50),
   price float,
   qty int,
   primary key (id));
 
insert into books values (1001, 'Java for dummies', 'Tan Ah Teck', 11.11, 11);
insert into books values (1002, 'More Java for dummies', 'Tan Ah Teck', 22.22, 22);
insert into books values (1003, 'More Java for more dummies', 'Mohammad Ali', 33.33, 33);
insert into books values (1004, 'A Cup of Java', 'Kumar', 44.44, 44);
insert into books values (1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55);
 
select * from books;
*/

import java.sql.*;

public class DatabaseBooks{
    
    public static void main(String [] args){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String driver="com.mysql.jdbc.dDriver";
        String url="jdbc:mysql://localhost/bookshop"; //url contains db
        
        try{
            
            Class.forName(driver); ///loading driver. optional line
            
            Connection Conn = DriverManager.getConnection(url, "root","passcode");
            
            //now lets prepare statements by allocating statement object
            stmt = conn.createStatement();
            
            //execute query erturns a resultset
            rs =stmt.executeQuery("Select * From books");
            
            //time to read the data by scrolling forward
            int rowCount=0;
            while(rs.next()){
                int id=rs.getInt("id");
                String title=rs.getString("title");
                String author= rs.getString("author");
                Double price=rs.getDouble("price");
                int qty= rs.getInt("qty");
                System.out.println(id + ","+ title + "," +author +","+ price + "," + qty);

                rowCount++;   //count to the last number of records
            }
            
            System.out.println("Total number of records in table are " + rowCount);
            
            
            //code to update or insert code. using executeUpdate();
            //which returns an int indicating the number of rows affected.
            // Increase the price by 2% and qty by 1 for id=1001
            String strUpdate = "Update books set price =price+(price*0.2), qty =qty+1 where id = 1001";
            
            String strIns = "Insert into books " // need a space
               + "values (3001, 'Gone Flying', 'Obed', 11.50, 5)";;
            String strDel= "Delete * From Books Where id>='3000' and id<='4000'";
            
            int delcount=stmt.executeUpdate(strDel);
            System.out.println(delcount +" Records Affected on delete");

            int inscount=stmt.executeUpdate(strIns);
            System.out.println(inscount +" Records Affected on insert");
            
            
        }catch(SQLException e){
            e.printStackTrace();
            
        }catch(Exception m){
            m.getMessage();
        }finally{
         //closes
         
        }
    }
    
}