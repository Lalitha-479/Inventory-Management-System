
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gadde
 */
public class tables {
    public static void main(String args[]){
        Connection con = null;
        Statement st = null;
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobileNumber varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50) )");
              st.executeUpdate("insert into appuser (userRole,name,mobileNumber,email,password,address,status) values('SuperAdmin','Super Admin','12345','superadmin@gmail.com','admin','India','Active')");
              JOptionPane.showMessageDialog(null,"Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){}
    }
    
}
}
