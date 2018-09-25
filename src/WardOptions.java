
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kriti
 */
public class WardOptions extends javax.swing.JFrame {

    /**
     * Creates new form WardOptions
     */
    public WardOptions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        aBtn.setText("Ward A");
        aBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        exitBtn.setText("Logout");
        exitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        bBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        bBtn.setText("Ward B");
        bBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBtnActionPerformed(evt);
            }
        });

        cBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        cBtn.setText("Ward C");
        cBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtnActionPerformed(evt);
            }
        });

        dBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        dBtn.setText("Ward D");
        dBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 727, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new WardOptions().setVisible(false);
        this.dispose();
        new Options().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        new WardOptions().setVisible(false);
        this.dispose();
        new Logout().setVisible(true);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void aBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBtnActionPerformed
        // TODO add your handling code here:
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://desktop-tbno2fe\\sqlexpress:1433;databaseName=Waste_Management;integratedSecurity=true;");
                Statement st = conn.createStatement();
                StringBuilder strBuilder = new StringBuilder();
                ResultSet rs = st.executeQuery("select * from Ward_A");
                strBuilder.append("Components\t\tMax(%)\tMin(%)\tAvg(%)\n");
                while(rs.next())
                {
                    String a=rs.getString("Components");
                    float b=rs.getFloat("MaxPercent");
                    float c=rs.getFloat("MinPercent");
                    float d=rs.getFloat("AvgPercent");
                    
                    strBuilder.append(a).append("\t\t").append(b).append("\t").append(c).append("\t").append(d);
                strBuilder.append("\n");
                    if(a.equals("Radioactive")&&d>3.5)
                       JOptionPane.showMessageDialog(null, "Warning: High Radioactivity!!");
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
        }catch(Exception ex)
          {
              JOptionPane.showMessageDialog(null, ex);
          }
    }//GEN-LAST:event_aBtnActionPerformed

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        // TODO add your handling code here:
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://desktop-tbno2fe\\sqlexpress:1433;databaseName=Waste_Management;integratedSecurity=true;");
                Statement st = conn.createStatement();
                StringBuilder strBuilder = new StringBuilder();
                ResultSet rs = st.executeQuery("select * from Ward_B");
                strBuilder.append("Components\t\tMax(%)\tMin(%)\tAvg(%)\n");
                while(rs.next())
                {
                    String a=rs.getString("Components");
                    float b=rs.getFloat("MaxPercent");
                    float c=rs.getFloat("MinPercent");
                    float d=rs.getFloat("AvgPercent");
                    
                    strBuilder.append(a).append("\t\t").append(b).append("\t").append(c).append("\t").append(d);
                strBuilder.append("\n");
                    if(a.equals("Radioactive")&&d>3.5)
                       JOptionPane.showMessageDialog(null, "Warning: High Radioactivity!!");
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
        }catch(Exception ex)
          {
              JOptionPane.showMessageDialog(null, ex);
          }
    }//GEN-LAST:event_bBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        // TODO add your handling code here:
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://desktop-tbno2fe\\sqlexpress:1433;databaseName=Waste_Management;integratedSecurity=true;");
                Statement st = conn.createStatement();
                StringBuilder strBuilder = new StringBuilder();
                ResultSet rs = st.executeQuery("select * from Ward_C");
                strBuilder.append("Components\t\tMax(%)\tMin(%)\tAvg(%)\n");
                while(rs.next())
                {
                    String a=rs.getString("Components");
                    float b=rs.getFloat("MaxPercent");
                    float c=rs.getFloat("MinPercent");
                    float d=rs.getFloat("AvgPercent");
                    
                    strBuilder.append(a).append("\t\t").append(b).append("\t").append(c).append("\t").append(d);
                strBuilder.append("\n");
                    if(a.equals("Radioactive")&&d>3.5)
                       JOptionPane.showMessageDialog(null, "Warning: High Radioactivity!!");
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
        }catch(Exception ex)
          {
              JOptionPane.showMessageDialog(null, ex);
          }
    }//GEN-LAST:event_cBtnActionPerformed

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        // TODO add your handling code here:
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://desktop-tbno2fe\\sqlexpress:1433;databaseName=Waste_Management;integratedSecurity=true;");
                Statement st = conn.createStatement();
                StringBuilder strBuilder = new StringBuilder();
                ResultSet rs = st.executeQuery("select * from Ward_D");
                strBuilder.append("Components\t\tMax(%)\tMin(%)\tAvg(%)\n");
                while(rs.next())
                {
                    String a=rs.getString("Components");
                    float b=rs.getFloat("MaxPercent");
                    float c=rs.getFloat("MinPercent");
                    float d=rs.getFloat("AvgPercent");
                    
                    strBuilder.append(a).append("\t\t").append(b).append("\t").append(c).append("\t").append(d);
                strBuilder.append("\n");
                
                    if(a.equals("Radioactive")&&d>3.5)
                       JOptionPane.showMessageDialog(null, "Warning: High Radioactivity!!"); 
                }
                textArea.setText(strBuilder.toString());
                conn.close();
                
        }catch(Exception ex)
          {
              JOptionPane.showMessageDialog(null, ex);
          }
    }//GEN-LAST:event_dBtnActionPerformed

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
            java.util.logging.Logger.getLogger(WardOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WardOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WardOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WardOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WardOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aBtn;
    private javax.swing.JButton bBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cBtn;
    private javax.swing.JButton dBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}