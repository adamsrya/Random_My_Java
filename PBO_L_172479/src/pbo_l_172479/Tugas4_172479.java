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
import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager;
public class Tugas4_172479 extends JFrame{
    Dimension dam = Toolkit.getDefaultToolkit().getScreenSize();
    private Container dim = getContentPane();
    private Tugas4_172479_classawt motor = new Tugas4_172479_classawt();
    
   public Tugas4_172479(){
       super("Motor Tertampan");
       setVisible(true);
       setSize(800,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
       setLocation(dam.width/5-getWidth()/5,dam.height/5-getHeight()/5);
       dim.add(motor);
   }
   public static void main(String[]ar){
       try{
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
       }catch(UnsupportedLookAndFeelException e){
           
       }catch(ClassNotFoundException e){
           
       }catch(InstantiationException e){
           
       }catch(IllegalAccessException e){
           
       }new Tugas4_172479();
   }
}
