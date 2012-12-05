package com.tim.ticd.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class StartDB{
  private static Connection con;
 
public void run() throws Exception {
 
  // sqlite driver
  Class.forName("org.sqlite.JDBC");
  // database path, if it's new database,
  // it will be created in the project folder
  con = DriverManager.getConnection("jdbc:sqlite:mydb.db");
  Statement stat = con.createStatement();
  stat.executeUpdate("drop table if exists Customer");
  stat.executeUpdate("drop table if exists Accommodation");
 
  //creating table
  stat.executeUpdate("CREATE TABLE Customer (id INT,"
    + "firstName VARCHAR(80)," + "surName VARCHAR(80), "
    + "property VARCHAR(80)," + "street varchar(100),"
    + "city VARCHAR(80)," + "postcode VARCHAR(7),"    
    + "phone VARCHAR(80)," + "mobile VARCHAR(80),"
    + "email VARCHAR(80)," + "dateofbirth DATE,"
    + "primary key (id));");
  
  stat.executeUpdate("CREATE TABLE Accommodation (id INT,"
	+ "name VARCHAR(80)," + "street VARCHAR(80),"
	+ "phone VARCHAR(80)," + "email VARCHAR(80),"
	+ "website VARCHAR(80)," + "roomsingle INT,"
	+ "roomdouble INT," + "pricesingle DECIMAL(5,2),"
	+ "pricedouble DECIMAL(5,2)," + "imagelink VARCHAR(80),"
	+ "primary key (id));");
  
  stat.executeUpdate("INSERT INTO Accommodation(name, street," 
    + "phone, email, website, roomsingle, roomdouble, pricesingle,"
    + "pricedouble, imagelink) VALUES('Testhotel', 'Teststrasse',"
    + "'012345', 'lol@test.com', 'www.lol.com', 10, 20, 123.45, 234.56,"
    + "'H://link.jpg')");
  
  // getting data
  ResultSet res = stat.executeQuery("SELECT * FROM Accommodation");
  while (res.next()) {
     System.out.println(res.getString("id") + " " + res.getString("name")
              + " " + res.getString("street") + " "
              + res.getString("phone") + " " + res.getString("email")
              + " " + res.getString("website"));
  }
}
  /**
  * @param args
  */
  public static void main(String[] args) {
    try {
      new StartDB().run();
    } catch (Exception e) {
       e.printStackTrace();
      }
  }
 
}