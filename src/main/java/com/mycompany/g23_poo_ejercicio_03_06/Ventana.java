/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g23_poo_ejercicio_03_06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


/**
 *
 * @author Diego
 * NO TOCAR, NO SIRVE ESTA CLASE
 */
public class Ventana extends JFrame implements ActionListener{
    
    private JPanel configPanel;
    private JPanel dimensionPanel;
    private JPanel buttonsPanel;
    private JPanel formColorPanel;
    private PanelPrincipal panelPrincipal;
    private ArrayList<JLabel> labelList;
    private JTextField jTextFieldHeight;
    private JTextField jTextFieldWidth;
    private JComboBox jComboBoxFigure;
    private JComboBox jComboBoxColors;
    private JButton jButtonDraw;
    private JButton jButtonClear;
    

    public Ventana(String title) {
        super(title);
        this.setSize(600, 600);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        initComponents();
        
        
    }
    
    private void initComponents(){
        
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        configPanel = new JPanel();
        configPanel.setBorder(new TitledBorder("Config"));
        
        formColorPanel = new JPanel();
        dimensionPanel = new JPanel();
        buttonsPanel = new JPanel();
        
        panelPrincipal = new PanelPrincipal(4, Color.RED, 286,45);
        panelPrincipal.setBorder(new TitledBorder("Dibujo"));
        
        getContentPane().add(configPanel);
        configPanel.add(formColorPanel);
        configPanel.add(dimensionPanel);
        configPanel.add(buttonsPanel);
    
        initLabels();
        initTextFields();
        initComboBox();
        initButtons();
        
        setPanels();
        
    }
    
    private void setPanels(){
       formColorPanel.add(labelList.get(0));
       formColorPanel.add(jComboBoxFigure);
       formColorPanel.add(labelList.get(1));
       formColorPanel.add(jComboBoxColors);
       
       dimensionPanel.add(labelList.get(2));
       dimensionPanel.add(labelList.get(3));
       dimensionPanel.add(jTextFieldHeight);
       dimensionPanel.add(labelList.get(4));
       dimensionPanel.add(jTextFieldWidth);
       
       buttonsPanel.add(jButtonDraw);
       buttonsPanel.add(jButtonClear);
        
    }
    
    private void initLabels(){
        labelList = new ArrayList<>();
       
        labelList.add(new JLabel("Seleccionar Figura"));
        labelList.add(new JLabel("Seleccionar Color"));
        labelList.add(new JLabel("Dimensiones:"));
        labelList.add(new JLabel("Alto"));
        labelList.add(new JLabel("Ancho"));
        
        
    }
    
    private void initTextFields(){
        jTextFieldHeight = new JTextField(3);
        jTextFieldWidth = new JTextField(3);
    }
    
    private void initComboBox(){
        
        jComboBoxColors = new JComboBox();
        jComboBoxFigure = new JComboBox();
        
        jComboBoxFigure.addItem("Elegir");
        jComboBoxFigure.addItem("Circulo");
        jComboBoxFigure.addItem("Estrella");
        jComboBoxFigure.addItem("Cuadrado");
        jComboBoxFigure.addItem("Rectangulo");
        jComboBoxFigure.addItem("Triangulo");
        
        jComboBoxColors.addItem("Elegir");
        jComboBoxColors.addItem("Amarillo");
        jComboBoxColors.addItem("Azul");
        jComboBoxColors.addItem("Rojo");
        jComboBoxColors.addItem("Verde");
        
    }
    
    private void initButtons(){
        jButtonClear = new JButton("Limpiar");
        jButtonDraw = new JButton("Dibujar");
        this.jButtonDraw.addActionListener(this);
        this.jButtonClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(this.jButtonClear)){
            
            this.panelPrincipal.repaint();
        }
        
        if(e.getSource().equals(this.jButtonDraw)){

            if(this.jComboBoxFigure.getSelectedIndex()==1)
            {
                var a = this.jTextFieldHeight.getText();
                this.panelPrincipal.setHeightFig(Integer.valueOf(a));

                var b = this.jTextFieldWidth.getText();
                this.panelPrincipal.setWidthFig(Integer.valueOf(b));

                this.panelPrincipal.setFigura(1);
                this.panelPrincipal.repaint();   
            }
            if(this.jComboBoxFigure.getSelectedIndex()==2)
            {
                this.panelPrincipal.setFigura(2);
                this.panelPrincipal.repaint();   
            }
            if(this.jComboBoxFigure.getSelectedIndex()==3)
            {
                var a = this.jTextFieldHeight.getText();
                this.panelPrincipal.setHeightFig(Integer.valueOf(a));

                var b = this.jTextFieldWidth.getText();
                this.panelPrincipal.setWidthFig(Integer.valueOf(b));

                this.panelPrincipal.setFigura(3);
                this.panelPrincipal.repaint();   
            }
            if(this.jComboBoxFigure.getSelectedIndex()==4)
            {
                var a = this.jTextFieldHeight.getText();
                this.panelPrincipal.setHeightFig(Integer.valueOf(a));

                var b = this.jTextFieldWidth.getText();
                this.panelPrincipal.setWidthFig(Integer.valueOf(b));

                this.panelPrincipal.setFigura(4);
                this.panelPrincipal.repaint();   
            }
            if(this.jComboBoxFigure.getSelectedIndex()==5)
            {
                this.panelPrincipal.setFigura(5);
                this.panelPrincipal.repaint();   
            }


            if(this.jComboBoxColors.getSelectedIndex()==1)
            {
                this.panelPrincipal.setColor(Color.YELLOW);
                this.panelPrincipal.repaint();   
            }
            if(this.jComboBoxColors.getSelectedIndex()==2)
            {
                this.panelPrincipal.setColor(Color.BLUE);
                this.panelPrincipal.repaint();   
            }
            if(this.jComboBoxColors.getSelectedIndex()==3)
            {
                this.panelPrincipal.setColor(Color.RED);
                this.panelPrincipal.repaint();   
            }
            if(this.jComboBoxColors.getSelectedIndex()==4)
            {
                this.panelPrincipal.setColor(Color.GREEN);
                this.panelPrincipal.repaint();   
            }

            getContentPane().add(panelPrincipal);
        
    }
        
    
    
    }
    
}
