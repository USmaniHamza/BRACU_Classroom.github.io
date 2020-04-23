/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracuclassroom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hamza
 */
public class RedLine extends javax.swing.JFrame {
public static String StudentID;

    /**
     * Creates new form RedLine
     */
    public RedLine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize
     * the form. WARNING: Do NOT modify this code. The content of this
     * method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_SafeZone = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(64, 107, 125));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Safe Zone");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 130));

        jPanel2.setBackground(new java.awt.Color(64, 107, 125));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Show Marked Courses");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Go back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 280));

        jTable1_SafeZone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course", "Faculty Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1_SafeZone);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 410, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
           
         
      
            PreparedStatement ps;

System.out.println("CALCULATIO BEGIN");

    try{ 
 String query1="SELECT * FROM mydb.facultystudent WHERE`StudentID`=?  AND `TotalMarksBeforeMid`<50 ;  "; //////the query that filters
   ps = MyConnection.getConnection().prepareStatement(query1);
    ps.setString(1, StudentID);
 ////everything regarding the query is chosen
// Statement st=conn.createStatement();
 ResultSet rs1; //=st.executeQuery(query1);
 rs1 = ps.executeQuery();

 Faculty grade = null;
 
 while(rs1.next()){
 grade=new Faculty(rs1.getString("Course"),rs1.getString("FacultyName"));
 

   System.out.println(rs1.getString("Course"));
  System.out.println(rs1.getString("FacultyName"));
  //lowkey marking them out
//    JOptionPane.showMessageDialog(null,StudentName);
//  JOptionPane.showMessageDialog(null,StudentID);
  ////////////////////////////////////////////////////////////////////////////////from facultyonthego2
  
      
  ////////////////////////////////////////////////////////////////////////////////from facultyonthego2      
  
  
  
  
 }
        RedLine obj = new RedLine();
        obj.StudentID=StudentID;
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        this.dispose();   ///setting my sail to the homepage
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
          try {
         obj.show_table();
     } catch (Exception ex) {
         Logger.getLogger(HomePageFacultyOntheGo2.class.getName()).log(Level.SEVERE, null, ex);
     }
}catch(Exception ex){
    Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,ex);
 }

        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

          StudentHomePage SS=new StudentHomePage();
        SS.StudentID=StudentID;
        SS.setVisible(true);
        SS.pack();
        SS.setLocationRelativeTo(null);
        this.dispose();   ///setting my sail to the homepage
        SS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   ///setting my sail to the homepage
        //      J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }//GEN-LAST:event_jButton2MouseClicked


    public void show_table() throws Exception{
    ArrayList<Faculty> list= facultylist();
    
    System.out.println("inside SHOWTABLE ");
    
    DefaultTableModel model =(DefaultTableModel)jTable1_SafeZone.getModel();
    Object[] row =new Object[2];
    for(int i=0;i<list.size();i++){
    row[0]=list.get(i).getCourse();
    row[1]=list.get(i).getFacultyName();
    
    
    model.addRow(row);     
    }
    }
    
   public ArrayList<Faculty> facultylist() throws Exception{
    PreparedStatement ps;
ArrayList<Faculty> facultyList=new ArrayList<>();
    try{
//        Connection conn = null;
//Class.forName("com.mysql.cj.jdbc.Driver");  
//        //Connection DriverManager = null;
// conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
 /////////////////////////////////////////////////////////////////////////////////////////////////////////For Marks
System.out.println("inside the faculty list");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");System.out.println(" ");


 
 String query1="SELECT * FROM mydb.facultystudent WHERE `StudentID`=? AND `TotalMarksBeforeMid`<50 "; //////the query that filters
   ps = MyConnection.getConnection().prepareStatement(query1);
    ps.setString(1, StudentID);
    
// Statement st=conn.createStatement();
 ResultSet rs; //=st.executeQuery(query1);
 rs = ps.executeQuery();
 Faculty faculty;
 while(rs.next()){
 faculty=new Faculty(rs.getString("FacultyName"),rs.getString("FacultyID"),rs.getString("StudentName"),rs.getString("StudentID"),rs.getString("Section"),rs.getString("CurrentSemester"),rs.getString("Course"),rs.getInt("Quiz1"),rs.getInt("Quiz2"),rs.getInt("Quiz3"),rs.getInt("Assignment"),rs.getInt("MidExam"),rs.getInt("FinalExam"),rs.getInt("TotalMarksBeforeMid"),rs.getInt("TotalMarksFinal"),rs.getString("FinalGrade"));
 facultyList.add(faculty); ///GETTING THE RAW DATA FROM THE DATABASE AND SAVING IT IN VARIABLES in faculty.java
 //faculty list is an array over here
 System.out.println(rs.getString("StudentName"));
 System.out.println(" ");
 }
 
 
 
 
//System.out.println("Successss");
}catch(Exception ex){
    Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,ex);
 }


return facultyList;

//now display
        }
   
    
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
            java.util.logging.Logger.getLogger(RedLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedLine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_SafeZone;
    // End of variables declaration//GEN-END:variables
}