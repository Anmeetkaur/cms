/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cms;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author 91904
 */
public class ViewerBlog extends javax.swing.JFrame {

    /**
     * Creates new form ViewerHome
     */
    Color mouseEnterColor = new Color(102,0,153);
    Color mouseExitColor = new Color(51,0,102);
    
    public void setBlogDetails(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3305/cms?useSSL=true&requireSSL=true&verifyServerCertificate=false", "root", "abcd");
        
        // Specify the columns you want to retrieve
        String sql = "SELECT date, title FROM blogdetails";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        // Convert ResultSet to JTable model using DbUtils
        table_Blog1.setModel(DbUtils.resultSetToTableModel(rs));
        
        // Close resources
       
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public ViewerBlog() {
        initComponents();
        setBlogDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_Blog1 = new rojeru_san.complementos.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 20, 41));

        jLabel2.setBackground(new java.awt.Color(51, 0, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Blogs List");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 6, 130, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CMSPackage/JFreeChart/AddNewBookIcons/AddNewBookIcons/adminIcons/adminIcons/icons8_Book_Shelf_50px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("<");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\91904\\OneDrive\\Desktop\\cmsblog.png")); // NOI18N

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        table_Blog1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Title"
            }
        ));
        table_Blog1.setAltoHead(30);
        table_Blog1.setColorBackgoundHead(new java.awt.Color(51, 0, 102));
        table_Blog1.setColorBordeFilas(new java.awt.Color(51, 0, 102));
        table_Blog1.setColorBordeHead(new java.awt.Color(255, 255, 255));
        table_Blog1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table_Blog1.setColorFilasForeground1(new java.awt.Color(51, 0, 102));
        table_Blog1.setColorFilasForeground2(new java.awt.Color(51, 0, 102));
        table_Blog1.setColorSelBackgound(new java.awt.Color(255, 255, 255));
        table_Blog1.setColorSelForeground(new java.awt.Color(51, 0, 102));
        table_Blog1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        table_Blog1.setFuenteFilas(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        table_Blog1.setFuenteFilasSelect(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        table_Blog1.setFuenteHead(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        table_Blog1.setGridColor(new java.awt.Color(51, 0, 102));
        table_Blog1.setMaximumSize(new java.awt.Dimension(30, 20));
        table_Blog1.setMinimumSize(new java.awt.Dimension(30, 20));
        table_Blog1.setRowHeight(19);
        table_Blog1.setSelectionBackground(new java.awt.Color(204, 153, 255));
        table_Blog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_Blog1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_Blog1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                table_Blog1MouseExited(evt);
            }
        });
        jScrollPane4.setViewportView(table_Blog1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Select a Blog");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 850, 510));

        setSize(new java.awt.Dimension(845, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void table_Blog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_Blog1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)table_Blog1.getModel();
        int Myindex=table_Blog1.getSelectedRow();
        String titles = model.getValueAt(Myindex,1).toString(); 
        TemplateBlog obj = new TemplateBlog(titles);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_table_Blog1MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        FrontPage ob = new FrontPage();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void table_Blog1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_Blog1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_table_Blog1MouseEntered

    private void table_Blog1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_Blog1MouseExited
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_table_Blog1MouseExited

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
            java.util.logging.Logger.getLogger(ViewerBlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewerBlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewerBlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewerBlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewerBlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private rojeru_san.complementos.RSTableMetro table_Blog1;
    // End of variables declaration//GEN-END:variables
}
