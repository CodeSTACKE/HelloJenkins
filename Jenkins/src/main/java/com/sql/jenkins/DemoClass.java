package com.sql.jenkins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoClass {
    public static int  dBConnection(Integer student_id , String student_name , String URL) {
        String userName = "root";
        String password = "Priya@123";
        int status=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection con = DriverManager.getConnection(URL, userName, password);
                String query = "insert into student(student_id,student_name) values('"+student_id+"','"+student_name+"')";
                Statement statement = con.createStatement();
                status=statement.executeUpdate(query);
                System.out.println(status);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return status;
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jenkins_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Integer sid=104;
        String sName="John";
    int  status= dBConnection(sid,sName,url);
        String msg = status==0 ?  "insertion  failed" : "insertion to the database is successful";
        System.out.println(msg);
  }
}