/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author clairegao
 */

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import nrghacks2025.Survey;


public class SurveyPanel extends javax.swing.JPanel implements MouseListener{
    private SoreStoreFrame soreStoreFrame;
    private Image absImage;
    private Image backImage;
    private Image chestImage;
    private Image larmImage;
    private Image rarmImage;
    private Image llegImage;
    private Image rlegImage;
    private Rectangle absArea;
    private Rectangle backArea;
    private Rectangle chestArea;
    private Rectangle larmArea;
    private Rectangle rarmArea;
    private Rectangle llegArea;
    private Rectangle rlegArea;
    
    private Survey survey;

    /**
     * Creates new form SurveyPanel
     */
    public SurveyPanel(SoreStoreFrame frame) {
        initComponents();
        setVisible(true);
        this.soreStoreFrame = frame;
        survey = new Survey();
        
        absArea = new Rectangle(21, 10, 500, 500);
        backArea = new Rectangle(600, 50, 700, 700);
//        chestArea = new Rectangle(40, 20, 100, 100);
//        larmArea = new Rectangle(45, 30, 50, 50);
//        rarmArea = new Rectangle(50, 25, 50, 50);
//        llegArea = new Rectangle(50, 50, 100, 100);
//        rlegArea = new Rectangle(60, 60, 100, 100);
        
        addMouseListener((MouseListener) this);

        jButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.switchPanel("calendar");
            }
            
        });

        try {
            // Load image from file or resources (adjust the path!)
            absImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/0abs.png"));
            backImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/0back.png"));
            chestImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/0chest.png"));
            larmImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/0larm.png"));
            rarmImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/0rarm .png"));
            rlegImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/0rleg.png"));
            llegImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/0lleg.png"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }

        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Clear the panel first
        if (absImage != null) {
            // Draw the image to fill the entire panel
            g.drawImage(absImage, 19, 8, 780, 780, this);
        }
        if (backImage != null) {
            // Draw the image to fill the entire panel
            g.drawImage(backImage, 600, 50, 700, 700, this);   
        }
        if (chestImage != null) {
            // Draw the image to fill the entire panel
            g.drawImage(chestImage, 40, 20, 730, 730, this);   
        }
        if (larmImage != null) {
            // Draw the image to fill the entire panel
            g.drawImage(larmImage, 45, 30, 730, 730, this);   
        }
        if (rarmImage != null) {
            // Draw the image to fill the entire panel
            g.drawImage(rarmImage, 50, 25, 730, 730, this);   
        }
        if (llegImage != null) {
            // Draw the image to fill the entire panel
            g.drawImage(llegImage, 50, 50, 700, 700, this);   
        }
        if (rlegImage != null) {
            // Draw the image to fill the entire panel
            g.drawImage(rlegImage, 60, 60, 700, 700, this);   
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        // Get the mouse click coordinates
        int x = e.getX();
        int y = e.getY();

        if (absArea.contains(x, y)) {
            // Trigger your function
            System.out.println("Clicked inside the designated area!");
            int absNum = survey.updatePainLevel("abs");
            try {
                absImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/"+absNum+"abs.png"));
                repaint();
            } catch (IOException ex) {
                Logger.getLogger(SurveyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (backArea.contains(x, y)) {
            // Trigger your function
            System.out.println("Clicked inside the designated area!");
            int backNum = survey.updatePainLevel("back");
            try {
                backImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/"+backNum+"back.png"));
                repaint();
            } catch (IOException ex) {
                Logger.getLogger(SurveyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//        if (chestArea.contains(x, y)) {
//            // Trigger your function
//            System.out.println("Clicked inside the designated area!");
//            int chestNum = survey.updatePainLevel("chest");
//            try {
//                chestImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/"+chestNum+"chest.png"));
//                repaint();
//            } catch (IOException ex) {
//                Logger.getLogger(SurveyPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        if (larmArea.contains(x, y)) {
//            // Trigger your function
//            System.out.println("Clicked inside the designated area!");
//            int larmNum = survey.updatePainLevel("larm");
//            try {
//                larmImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/"+larmNum+"larm.png"));
//                repaint();
//            } catch (IOException ex) {
//                Logger.getLogger(SurveyPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        if (rarmArea.contains(x, y)) {
//            // Trigger your function
//            System.out.println("Clicked inside the designated area!");
//            int rarmNum = survey.updatePainLevel("rarm");
//            try {
//                rarmImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/"+rarmNum+"rarm.png"));
//                repaint();
//            } catch (IOException ex) {
//                Logger.getLogger(SurveyPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        if (llegArea.contains(x, y)) {
//            // Trigger your function
//            System.out.println("Clicked inside the designated area!");
//            int llegNum = survey.updatePainLevel("lleg");
//            try {
//                llegImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/"+llegNum+"lleg.png"));
//                repaint();
//            } catch (IOException ex) {
//                Logger.getLogger(SurveyPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        if (rlegArea.contains(x, y)) {
//            // Trigger your function
//            System.out.println("Clicked inside the designated area!");
//            int rlegNum = survey.updatePainLevel("rleg");
//            try {
//                rlegImage = ImageIO.read(new File("/Users/clairegao/NetBeansProjects/NRGHacks2025/NRGHacks2025/src/resources/images/"+rlegNum+"rleg.png"));
//                repaint();
//            } catch (IOException ex) {
//                Logger.getLogger(SurveyPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setText("Skip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
