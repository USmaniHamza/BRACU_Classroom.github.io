/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracuclassroom;
import javax.swing.JFrame;
import java.text.*;
import java.sql.*;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hamza
 */
public class MarkedStudent extends javax.swing.JFrame {
public static String FacultyID;
//the session variable is here

public static String Section;
public static String Course;

    /**
     * Creates new form MarkedStudent
     */
    public MarkedStudent() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1_Section = new javax.swing.JTextField();
        jTextField2_Course = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Faculty_MarkedStudent = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 597, -1));

        jPanel2.setBackground(new java.awt.Color(75, 119, 190));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marked Students");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));
        getContentPane().add(jTextField1_Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 50));
        getContentPane().add(jTextField2_Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 50));

        jLabel1.setText("Course");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel2.setText("Section");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 40));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Faculty_MarkedStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_Faculty_MarkedStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student Name", "Student ID", "Section"
            }
        ));
        jTable_Faculty_MarkedStudent.setShowHorizontalLines(false);
        jTable_Faculty_MarkedStudent.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable_Faculty_MarkedStudent);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 280));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 450, 300));

        jButton2.setText("Go Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                
         Section=jTextField1_Section.getText();
         Course=jTextField2_Course.getText();
      
            PreparedStatement ps;

System.out.println("CALCULATIO BEGIN");

    try{ 
 String query1="SELECT * FROM mydb.facultystudent WHERE`FacultyID`=? AND `Section`=? AND `Course`=? AND `TotalMarksBeforeMid`<50 ;  "; //////the query that filters
   ps = MyConnection.getConnection().prepareStatement(query1);
    ps.setString(1, FacultyID);
    ps.setString(2, Section);     
    ps.setString(3, Course);  
// Statement st=conn.createStatement();
 ResultSet rs1; //=st.executeQuery(query1);
 rs1 = ps.executeQuery();

 Faculty grade = null;
 
 while(rs1.next()){
 grade=new Faculty(rs1.getString("StudentName"),rs1.getString("StudentID"));
 

   String StudentName=grade.getStudentName();//name found
   //works
  String StudentID=grade.getStudentID();
 
  
  //lowkey marking them out

  ////////////////////////////////////////////////////////////////////////////////from facultyonthego2
  
      
  ////////////////////////////////////////////////////////////////////////////////from facultyonthego2      
  
  
  
  
 }
        MarkedStudent obj = new MarkedStudent();
        obj.FacultyID=FacultyID;
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
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

                  HomePageFacultyOntheGo SS=new HomePageFacultyOntheGo();
        SS.FacultyID=FacultyID;
        SS.setVisible(true);
        SS.pack();
        SS.setLocationRelativeTo(null);
        this.dispose();   ///setting my sail to the homepage
        SS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   ///setting my sail to the homepage
        //      J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }//GEN-LAST:event_jButton2MouseClicked

    
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


 
 String query1="SELECT * FROM mydb.facultystudent WHERE `FacultyID`=? AND `Section`=? AND `Course`=? AND `TotalMarksBeforeMid`<50 "; //////the query that filters
   ps = MyConnection.getConnection().prepareStatement(query1);
    ps.setString(1, FacultyID);
    ps.setString(2, Section);
    ps.setString(3, Course);
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
   
    public void show_table() throws Exception{
    ArrayList<Faculty> list= facultylist();
    
    System.out.println("inside SHOWTABLE ");
    
    DefaultTableModel model =(DefaultTableModel)jTable_Faculty_MarkedStudent.getModel();
    Object[] row =new Object[3];
    for(int i=0;i<list.size();i++){
    row[0]=list.get(i).getStudentName();
    row[1]=list.get(i).getStudentID();
    row[2]=list.get(i).getSection();
    
    model.addRow(row);     
    }
    }
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
            java.util.logging.Logger.getLogger(MarkedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkedStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Faculty_MarkedStudent;
    private javax.swing.JTextField jTextField1_Section;
    private javax.swing.JTextField jTextField2_Course;
    // End of variables declaration//GEN-END:variables
}

