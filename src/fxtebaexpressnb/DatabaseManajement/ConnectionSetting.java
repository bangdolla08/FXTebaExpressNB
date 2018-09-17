/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxtebaexpressnb.DatabaseManajement;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author AsusX450J
 */
public class ConnectionSetting {
    
    public static Connection getConnection(){
        String ConnectionDatabaseLocation;
        String ConnectionUser;
        String ConnectionPassword;
        String ConnectionDB;
        Connection connection = null;
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            ConnectionDatabaseLocation = "localhost:3306";
            ConnectionUser = "root";
            ConnectionDB="tebaexp_built";
            ConnectionPassword = "";
            connection=DriverManager.getConnection("jdbc:mysql://"+ConnectionDatabaseLocation+"/"+ConnectionDB,ConnectionUser,ConnectionPassword);
            //DefaultLogin
        }catch(Exception e){
            System.out.print(e);
        }
        return connection;
    }
}
