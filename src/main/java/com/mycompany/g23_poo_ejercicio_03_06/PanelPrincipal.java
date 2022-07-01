/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_03_06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;


public class PanelPrincipal extends JPanel implements MouseListener{
    
    private final int CIRCLE = 1;
    private final int STAR = 2;
    private final int SQUARE = 3;
    private final int RECTANGLE = 4;
    private final int TRIANGLE = 5;
    
    private int figura;
    private Color color;
    private int height;
    private int width;
    private Point point1 = new Point(10, 10);
    private Point point2 = new Point(-10, -10);

    public PanelPrincipal(int figura, Color color, int height, int width) {
        this.figura = figura;
        this.color = color;
        this.height = height;
        this.width = width;
        
        this.addMouseListener(this);
    }

   

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(color);
        
        
        if (this.figura == 1){
            
           g.fillOval(point1.x, point1.y, getWidthFig(),getHeightFig());
        }
        if (this.figura == 2){
            int [] coordenadasX = {point1.x,point1.x+20,point1.x+80,point1.x+30,
                point1.x+50,point1.x,point1.x-50,point1.x-30,point1.x-80,point1.x-20};
            
            int [] coordenadasY = {point1.y,point1.y+70,point1.y+70,point1.y+110,point1.y+180,
                point1.y+140,point1.y+180,point1.y+110,point1.y+70,point1.y+70};
            int nPuntos = 10;
            g.fillPolygon(coordenadasX, coordenadasY, nPuntos);
            
        }
        if (this.figura == 3){
           g.fillRect(point1.x, point1.y, getWidthFig(),getHeightFig());
        }
        if (this.figura == 4){
           g.fillRect(point1.x, point1.y, getWidthFig(),getHeightFig());
        }
        if (this.figura == 5){
            int [] coordenadasX = {point1.x,point1.x-50,point1.x+50};
            int [] coordenadasY = {point1.y,point1.y+200,point1.y+200};
            int nPuntos = 3;
            g.fillPolygon(coordenadasX, coordenadasY, nPuntos);
        }
        
    }

    public int getFigura() {
        return figura;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }

    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHeightFig() {
        return height;
    }

    public void setHeightFig(int height) {
        this.height = height;
    }

    public int getWidthFig() {
        return width;
    }

    public void setWidthFig(int width) {
        this.width = width;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setPoint1(e.getPoint());
        System.out.println("evento: "+e.getPoint());
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
    
}
