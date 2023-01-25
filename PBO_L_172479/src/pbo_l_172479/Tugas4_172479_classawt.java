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

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class Tugas4_172479_classawt extends Canvas {
    public void paint(Graphics g){
        setBackground(Color.darkGray);
        Graphics2D g2 = (Graphics2D)g;
         g.drawLine(70,70,70,158);
         g.setColor(Color.GRAY);
         g.fillArc(28, 72, 83,83, -90, 180);
         g.setColor(Color.BLACK);
         g.drawLine(85, 140, 135, 35);
         g.drawLine(85, 140, 94, 145);
         g.drawLine(94, 145, 145,35 );
         g.setColor(Color.red);
         g.fillRect(150, 38, 60, 13);
         g.setColor(Color.BLACK);
         g.fillOval(133, 33, 20, 20);
         g.setColor(Color.BLACK);
         g.fillOval(205, 33, 20, 20);
         CubicCurve2D b = new CubicCurve2D.Double(94,150,150,100,200,150,300,150);
         g2.setColor(Color.pink);
         g2.fill(b);
         CubicCurve2D c = new CubicCurve2D.Double(95,150,165,300,200,200,300,200);
         g2.fill(c);
         g.setColor(Color.BLACK);
         g.fillRect(278, 150, 120, 50);
         g.drawLine(94, 150, 74,280 );
         g.drawLine(110, 180,94 ,280 );
         g.fillOval(15, 250, 150, 150);
         g.setColor(Color.WHITE);
         g.fillOval(30, 265, 120, 120);
         CubicCurve2D d = new CubicCurve2D.Double(205,200,320,250,350,250,370,200);
         g2.setColor(Color.orange);
         g2.fill(d);
         g.setColor(Color.BLACK);
         g.drawLine(350,230, 365,280 );
         g.drawLine(360,230, 385,300 );
         g.setColor(Color.BLACK);
         g.fillOval(320, 250, 150, 150);
         g.setColor(Color.WHITE);
         g.fillOval(335, 265, 120, 120);
          
    }
}
