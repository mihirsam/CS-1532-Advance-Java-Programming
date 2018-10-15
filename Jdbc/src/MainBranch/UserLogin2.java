package MainBranch;

import java.sql.*;

public class UserLogin2
{
    public static void main(String args[])
    {
        try
        {
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //String url = "jdbc:odbc:Driver={MicrosoftAccessDriver(*.mdb,*.accdb)};DBQ=+ftp://ftpuser:ftpuser@142.93.222.36/files/";

            Connection conn;
            conn = DriverManager.getConnection("jdbc:ucanaccess:///home//xenon//Xenon//Study_Stuffs//Java//AdvanceJava//Resources//Database//student.accdb");
            //conn = DriverManager.getConnection("jdbc:ucanaccess:///run//user//1000//gvfs//ftp:host=142.93.222.36//files//student.accdb");
            //conn = DriverManager.getConnection("jdbc:ucanaccess://..//MainBranch//student.accdb");

            System.out.println("Connection Successfull");
            Statement stmt;
            stmt = conn.createStatement();

            ResultSet rs=stmt.executeQuery("select * from CustomerT");
            if(rs!=null)
            {
                while(rs.next())
                {
                    System.out.println("ID:"+rs.getString(1)+"\tName:"+rs.getString(2)+"\tPhone: "+rs.getString(12));
                }
            }
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            System.err.println("got an exception");
            System.err.println(e.getMessage());
        }
    }
}
