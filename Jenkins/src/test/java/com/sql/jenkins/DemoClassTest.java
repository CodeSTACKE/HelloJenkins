package com.sql.jenkins;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class DemoClassTest {
    DemoClass dc=new DemoClass();
//    boolean status=dc.dBConnection();

    @Test
    public void testingForDbConnection(){
        int sid=101;
        String sName="jyoti";
       final  String URL= "jdbc:mysql://localhost:3306/jenkins_db_test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        assertEquals(1,dc.dBConnection(sid, sName,URL));
    }


}