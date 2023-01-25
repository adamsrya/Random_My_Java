/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_l_172479;

/**
 *
 * @author Adam
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi { // koneksi ke database
    private static Connection mysqlkonek;
    public static Statement stm;
    public static Connection koneksiDB() {
       try {
            String url ="jdbc:mysql://localhost/siaka_172479";
            String user="root";
            String pass="12345678";
            Class.forName("com.mysql.jdbc.Driver");
            mysqlkonek  =DriverManager.getConnection(url,user,pass);
            stm = mysqlkonek.createStatement();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"gagal koneksi");
        }
        return mysqlkonek;
    }
}
        /*if(mysqlkonek==null){
           try {
                String DB="jdbc:mysql://localhost:3306/siaka_172479"; // delta_db database
                String user="root"; // user database
                String pass="12345678"; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/siaka_172479?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return mysqlkonek;
    }*/

       


