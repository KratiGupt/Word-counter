    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproject1;


import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*; 

public class Word_counter extends javax.swing.JFrame implements ActionListener {
    JLabel b1,b2;
    JTextArea ta;
    JButton b;
    JButton pad,text;
    JFrame frame=new JFrame();
   public  Word_counter() {
       
        b1=new JLabel("Characters: ");
        b1.setBounds(50,50,100,20);
         b2=new JLabel("Words: ");
        b2.setBounds(50,80,100,20);
        
        b = new JButton("Count Words");
        b.setBounds(40, 320, 110, 30);
        b.addActionListener(this);  
        
        
        ta=new JTextArea();
        ta.setBounds(50,110,300,200);
        ta.setLineWrap(true);
        
        pad=new JButton("Pad Color");
        pad.setBounds(150,320,110,30);
        pad.addActionListener(this);
        
         text=new JButton("Text Color");
        text.setBounds(260,320,110,30);
        text.addActionListener(this);
        
        add(b1);add(b2);add(ta);add(b);add(pad);add(text);  
        
        setSize(400,400);  
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon=new ImageIcon("wallpaperflare.com_wallpaper.jpg");
        frame.setIconImage(icon.getImage());
    } 
@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            String text=ta.getText();
            b1.setText("Characters: "+text.length());
            String Words[]=text.split(" ");
            b2.setText("Words: "+Words.length);
            
}

else if(e.getSource()==pad){
    Color c=JColorChooser.showDialog(this,"choose color" , Color.BLACK);
    
    ta.setBackground(c);
}
else if(e.getSource()==text){
    Color c=JColorChooser.showDialog(this,"choose color" , Color.BLACK);
   ta.setForeground(c);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Word_counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Word_counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Word_counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Word_counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(()-> new Word_counter().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
