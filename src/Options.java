
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kriti
 */
public class Options extends javax.swing.JFrame {

    /**
     * Creates new form Options
     */
    public Options() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        slvBtn = new javax.swing.JButton();
        addLocBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        updatePaBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hmavBtn = new javax.swing.JButton();
        pavBtn = new javax.swing.JButton();
        updateHmaBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        paComboBox = new javax.swing.JComboBox<>();
        hmaComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Sampling Locations");

        slvBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        slvBtn.setText("View");
        slvBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        slvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slvBtnActionPerformed(evt);
            }
        });

        addLocBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        addLocBtn.setText("Add Location");
        addLocBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addLocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLocBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Physico-chemical Analysis");

        updatePaBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        updatePaBtn.setText("Update");
        updatePaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatePaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePaBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Heavy Metal Analysis");

        hmavBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        hmavBtn.setText("View");
        hmavBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hmavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmavBtnActionPerformed(evt);
            }
        });

        pavBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pavBtn.setText("View");
        pavBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pavBtnActionPerformed(evt);
            }
        });

        updateHmaBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        updateHmaBtn.setText("Update");
        updateHmaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateHmaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateHmaBtnActionPerformed(evt);
            }
        });

        nextBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        nextBtn.setText("Next");
        nextBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Monospaced", 0, 30)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        paComboBox.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        paComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "pH", "Moisture", "Solids", "Ignition Loss", "Ash", "Carbon", "Nitrogen", "Sulphur" }));
        paComboBox.setSelectedIndex(-1);
        paComboBox.setToolTipText("");
        paComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paComboBoxActionPerformed(evt);
            }
        });

        hmaComboBox.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        hmaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Cadmium", "Cobalt", "Lead", "Nickel", "Manganese", "Chromium", "Copper", "Iron", "Zinc" }));
        hmaComboBox.setSelectedIndex(-1);
        hmaComboBox.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updatePaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hmaComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateHmaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hmavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(slvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addLocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(slvBtn)
                            .addComponent(addLocBtn))
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(updatePaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hmaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hmavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(updateHmaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateHmaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateHmaBtnActionPerformed
        // TODO add your handling code here:
        new Options().setVisible(false);
        this.dispose();
        new UpdateHma().setVisible(true);
    }//GEN-LAST:event_updateHmaBtnActionPerformed

    private void slvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slvBtnActionPerformed
        // TODO add your handling code here:
         try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://desktop-tbno2fe\\sqlexpress:1433;databaseName=Waste_Management;integratedSecurity=true;");

               
                Statement st = conn.createStatement();
                StringBuilder strBuilder = new StringBuilder();
                strBuilder.append("Ward\tDate of Sampling\tLocation\tArea\n");
                ResultSet rs = st.executeQuery("select * from Sampling_Locations");
                
                while(rs.next())
                {
                    String a=rs.getString("Locations");
                    String b=rs.getString("Area_Name");
                    String c=rs.getString("Date_of_Sampling");
                    String d=rs.getString("Ward");
                    
                strBuilder.append(d).append("\t").append(c).append("\t\t").append(a).append("\t\t").append(b);
                strBuilder.append("\n");

            }
            textArea.setText(strBuilder.toString());
            conn.close();

          }catch(Exception ex)
          {
              ex.printStackTrace();
              JOptionPane.showMessageDialog(null, ex);
          }
    }//GEN-LAST:event_slvBtnActionPerformed

    private void pavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pavBtnActionPerformed
        // TODO add your handling code here:
        try{
                String msg=(String)paComboBox.getSelectedItem();
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://desktop-tbno2fe\\sqlexpress:1433;databaseName=Waste_Management;integratedSecurity=true;");
                Statement st = conn.createStatement();
                StringBuilder strBuilder = new StringBuilder();
                ResultSet rs = st.executeQuery("select * from Physicochemical");
            switch(msg)
            {
                case "All": //ResultSet rs = st.executeQuery("select * from Physicochemical");
                strBuilder.append("Ward\tpH\tMoisture\tSolids\tIgnition Loss\tAsh\tCarbon\tNitrogen\tSulphur\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("pH");
                    String c=rs.getString("Moisture");
                    String d=rs.getString("Solids");
                    String e=rs.getString("Ignition_Loss");
                    String f=rs.getString("Ash");
                    String g=rs.getString("Carbon");
                    String h=rs.getString("Nitrogen");
                    String i=rs.getString("Sulphur");
                    strBuilder.append(a).append("\t").append(b).append("\t").append(c).append("\t\t").append(d).append("\t").append(e).append("\t\t").append(f).append("\t").append(g).append("\t").append(h).append("\t\t").append(i);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "pH": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tpH\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("pH");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Moisture": 
                strBuilder.append("Ward\tMoisture\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("Moisture");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Solids": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tSolids\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("Solids");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Ignition Loss": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tIgnition Loss\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("Ignition_Loss");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Ash": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tAsh\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("Ash");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Carbon": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tCarbon\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("Carbon");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Nitrogen": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tNitrogen\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("Nitrogen");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Sulphur": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tSulphur\n");
                while(rs.next())
                {
                    String a=rs.getString("Ward");
                    String b=rs.getString("Sulphur");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
        }
          }catch(Exception ex)
          {
              JOptionPane.showMessageDialog(null, ex);
          }
    }//GEN-LAST:event_pavBtnActionPerformed

    private void hmavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmavBtnActionPerformed
        // TODO add your handling code here:
        try{
                String msg=(String)hmaComboBox.getSelectedItem();
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://desktop-tbno2fe\\sqlexpress:1433;databaseName=Waste_Management;integratedSecurity=true;");
                Statement st = conn.createStatement();
                StringBuilder strBuilder = new StringBuilder();
                ResultSet rs1 = st.executeQuery("select * from Heavy_Metals");
            switch(msg)
            {
                case "All": //ResultSet rs = st.executeQuery("select * from Physicochemical");
                strBuilder.append("Ward\tCadmium\tCobalt\tLead\tNickel\tManganese\tChromium\tCopper\tIron\t\tZinc\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Cadmium");
                    String c=rs1.getString("Cobalt");
                    String d=rs1.getString("Lead");
                    String e=rs1.getString("Nickel");
                    String f=rs1.getString("Manganese");
                    String g=rs1.getString("Chromium");
                    String h=rs1.getString("Copper");
                    String i=rs1.getString("Iron");
                    String j=rs1.getString("Zinc");
                    strBuilder.append(a).append("\t").append(b).append("\t").append(c).append("\t").append(d).append("\t").append(e).append("\t").append(f).append("\t\t").append(g).append("\t\t").append(h).append("\t").append(i).append("\t").append(j);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Cadmium": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tCadmium\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Cadmium");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Cobalt": 
                strBuilder.append("Ward\tCobalt\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Cobalt");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Lead": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tLead\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Lead");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Nickel": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tNickel\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Nickel");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Manganese": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tManganese\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Manganese");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Chromium": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tChromium\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Chromium");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Copper": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tCopper\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Copper");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Iron": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tIron\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Iron");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
                break;
                case "Zinc": //ResultSet rs = st.executeQuery("select Ward,pH from Physicochemical");
                strBuilder.append("Ward\tZinc\n");
                while(rs1.next())
                {
                    String a=rs1.getString("Ward");
                    String b=rs1.getString("Zinc");
                    strBuilder.append(a).append("\t").append(b);
                strBuilder.append("\n");
                    //JOptionPane.showMessageDialog(null,d+"\t"+a+"\t"+b+"\t"+c);
                }
                textArea.setText(strBuilder.toString());  
                conn.close();
        }
          }catch(Exception ex)
          {
              JOptionPane.showMessageDialog(null, ex);
          } 
    }//GEN-LAST:event_hmavBtnActionPerformed

    private void paComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paComboBoxActionPerformed
        // TODO add your handling code here:
        //String msg=(String)paComboBox.getSelectedItem();
    }//GEN-LAST:event_paComboBoxActionPerformed

    private void addLocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLocBtnActionPerformed
        // TODO add your handling code here:
        new Options().setVisible(false);
        this.dispose();
        new AddSL().setVisible(true);
    }//GEN-LAST:event_addLocBtnActionPerformed

    private void updatePaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePaBtnActionPerformed
        // TODO add your handling code here:
        new Options().setVisible(false);
        this.dispose();
        new UpdatePa().setVisible(true);
    }//GEN-LAST:event_updatePaBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        new Options().setVisible(false);
        this.dispose();
        new WardOptions().setVisible(true);
    }//GEN-LAST:event_nextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLocBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> hmaComboBox;
    private javax.swing.JButton hmavBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JComboBox<String> paComboBox;
    private javax.swing.JButton pavBtn;
    private javax.swing.JButton slvBtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton updateHmaBtn;
    private javax.swing.JButton updatePaBtn;
    // End of variables declaration//GEN-END:variables
}
