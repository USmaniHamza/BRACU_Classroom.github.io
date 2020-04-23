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

public class ShowGrades extends javax.swing.JFrame {
public static String StudentID;
    /**
     * Creates new form ShowGrades
     */
    public ShowGrades() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2_Grades = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(64, 107, 125));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jPanel4.setBackground(new java.awt.Color(64, 107, 125));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Semester Grades");

        jTable2_Grades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Course", "Section", "Quiz 1", "Quiz 2", "Quiz 3", "Assignment", "Mid Exam", "Final Exam", "Final Exam"
            }
        ));
        jScrollPane2.setViewportView(jTable2_Grades);

        jButton1.setText("Go back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        
        
          StudentHomePage SS=new StudentHomePage();
        SS.StudentID=StudentID;
        SS.setVisible(true);
        SS.pack();
        SS.setLocationRelativeTo(null);
        this.dispose();   ///setting my sail to the homepage
        SS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   ///setting my sail to the homepage
        //      J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }//GEN-LAST:event_jButton1MouseClicked

    
    public void show_table() throws Exception{
    ArrayList<Faculty> list= facultylist();
    
    System.out.println("inside SHOWTABLE ");
    
    DefaultTableModel model =(DefaultTableModel)jTable2_Grades.getModel();
    Object[] row =new Object[9];
    for(int i=0;i<list.size();i++){
    row[0]=list.get(i).getCourse();
    row[1]=list.get(i).getSection();
    row[2]=list.get(i).getQuiz1();
    row[3]=list.get(i).getQuiz2();
    row[4]=list.get(i).getQuiz3();
    row[5]=list.get(i).getAssignment();
    row[6]=list.get(i).getMidExam();
    row[7]=list.get(i).getFinalExam();
    row[8]=list.get(i).getFinalGrade();
    
    
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


 
 String query1="SELECT * FROM mydb.facultystudent WHERE `StudentID`=?  "; //////the query that filters
   ps = MyConnection.getConnection().prepareStatement(query1);
    ps.setString(1, StudentID);
    //student er shob kichu chai ekhane
    
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
            java.util.logging.Logger.getLogger(ShowGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2_Grades;
    // End of variables declaration//GEN-END:variables
}