/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracuclassroom;

import static bracuclassroom.HomePageFacultyOntheGo2.FacultyID;
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
       import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.chart.BubbleChart; 
import javafx.stage.Stage;  
import javafx.scene.chart.NumberAxis; 
import javafx.scene.chart.XYChart;

/**
 *
 * @author hamza
 */
public class HomePageFacultyOntheGo extends javax.swing.JFrame{
 public static String FacultyID;
    private String[] args;
    /**
     * Creates new form HomePageFacultyOntheGo
     */
    public HomePageFacultyOntheGo() {
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

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanelJtableDisplay = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7_ShowGraphs = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Faculty_Course_Section = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(162, 155, 254));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(127, 143, 166));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home Page");
        sidepane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(64, 115, 158));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPanel5Table2(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Post Grades");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bracuclassroom/images/grades.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidepane.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 60));

        jPanel6.setBackground(new java.awt.Color(64, 115, 158));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Upload Tasks");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bracuclassroom/images/presentation.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );

        sidepane.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, 50));

        jPanelJtableDisplay.setBackground(new java.awt.Color(64, 115, 158));
        jPanelJtableDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJtableDisplayMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Taken");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bracuclassroom/images/open-book (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanelJtableDisplayLayout = new javax.swing.GroupLayout(jPanelJtableDisplay);
        jPanelJtableDisplay.setLayout(jPanelJtableDisplayLayout);
        jPanelJtableDisplayLayout.setHorizontalGroup(
            jPanelJtableDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJtableDisplayLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanelJtableDisplayLayout.setVerticalGroup(
            jPanelJtableDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJtableDisplayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sidepane.add(jPanelJtableDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, 50));

        jPanel4.setBackground(new java.awt.Color(64, 115, 158));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Log Out");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bracuclassroom/images/door.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 60));

        jPanel7_ShowGraphs.setBackground(new java.awt.Color(64, 115, 158));
        jPanel7_ShowGraphs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7_ShowGraphsMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Show Statistics");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bracuclassroom/images/pie-chart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7_ShowGraphsLayout = new javax.swing.GroupLayout(jPanel7_ShowGraphs);
        jPanel7_ShowGraphs.setLayout(jPanel7_ShowGraphsLayout);
        jPanel7_ShowGraphsLayout.setHorizontalGroup(
            jPanel7_ShowGraphsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7_ShowGraphsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7_ShowGraphsLayout.setVerticalGroup(
            jPanel7_ShowGraphsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7_ShowGraphsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        sidepane.add(jPanel7_ShowGraphs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 50));

        jPanel7.setBackground(new java.awt.Color(64, 115, 158));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("show marked student");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bracuclassroom/images/door.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        sidepane.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 370, 230, 70));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 240, 440));

        jPanel1.setBackground(new java.awt.Color(131, 149, 167));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 530, 100));

        jTable_Faculty_Course_Section.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_Faculty_Course_Section.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Faculty Name", "Section", "Course"
            }
        ));
        jTable_Faculty_Course_Section.setShowHorizontalLines(false);
        jTable_Faculty_Course_Section.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable_Faculty_Course_Section);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 480, 340));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
 LoginForm rgf = new LoginForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        this.dispose();
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jPanel4MouseClicked

    
    public ArrayList<Faculty> facultylist() throws Exception{
    PreparedStatement ps;
ArrayList<Faculty> facultyList=new ArrayList<>();
//this is the array

    try{ 
 String query1="SELECT * FROM mydb.facultystudent WHERE `FacultyID`=? "; //////the query that filters
   ps = MyConnection.getConnection().prepareStatement(query1);
    ps.setString(1, FacultyID);
         
// Statement st=conn.createStatement();
 ResultSet rs; //=st.executeQuery(query1);
 rs = ps.executeQuery();
 Faculty faculty;
 while(rs.next()){
 faculty=new Faculty(rs.getString("FacultyName"),rs.getString("FacultyID"),rs.getString("StudentName"),rs.getString("StudentID"),rs.getString("Section"),rs.getString("CurrentSemester"),rs.getString("Course"),rs.getInt("Quiz1"),rs.getInt("Quiz2"),rs.getInt("Quiz3"),rs.getInt("Assignment"),rs.getInt("MidExam"),rs.getInt("FinalExam"),rs.getInt("TotalMarksBeforeMid"),rs.getInt("TotalMarksFinal"),rs.getString("FinalGrade")); //ektar na basically shobar tai ase not just a single row not a single tuple
 facultyList.add(faculty); ///GETTING THE RAW DATA FROM THE DATABASE AND SAVING IT IN VARIABLES in faculty.java
 //faculty list is an array over here
 
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
    DefaultTableModel model =(DefaultTableModel)jTable_Faculty_Course_Section.getModel();
    Object[] row =new Object[3];
    for(int i=0;i<list.size();i++){
    row[0]=list.get(i).getFacultyName(); //fetch the data from the database
    
    
    row[1]=list.get(i).getSection();
    row[2]=list.get(i).getCourse();
    model.addRow(row);  
    }
       
    }     
    private void jPanelJtableDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJtableDisplayMouseClicked
        
    HomePageFacultyOntheGo obj = new HomePageFacultyOntheGo();
        obj.FacultyID=FacultyID;
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        this.dispose();   ///setting my sail to the homepage
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
          try {
         obj.show_table();
     } catch (Exception ex) {
         Logger.getLogger(HomePageFacultyOntheGo.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
     
    }//GEN-LAST:event_jPanelJtableDisplayMouseClicked

    private void JPanel5Table2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanel5Table2
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       HomePageFacultyOntheGo2 obj = new HomePageFacultyOntheGo2();
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
        
    
    
   
    /////this is lowkey refreshing
    //then what to do we do
//    
//    JavaFXBubble.FacultyID=FacultyID;
//      JavaFXBubble.demo=90;
//  JavaFXBubble.main(args);
   
    
    
    }//GEN-LAST:event_JPanel5Table2

    private void jPanel7_ShowGraphsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7_ShowGraphsMouseClicked

      SectionSelection SS=new SectionSelection();
 SS.FacultyID=FacultyID;
        SS.setVisible(true);
        SS.pack();
        SS.setLocationRelativeTo(null);
        this.dispose();   ///setting my sail to the homepage
        SS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   ///setting my sail to the homepage
  //      J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
        
  
//         
//public class JavafxBubble extends Application { 
//   @Override 
//   public void start(Stage stage) {     
//      //Defining the axes               
//      NumberAxis xAxis = new NumberAxis(0, 100, 10);        
//      xAxis.setLabel("Age"); 
//        
//      NumberAxis yAxis = new NumberAxis(20, 100, 10); 
//      yAxis.setLabel("Weight"); 
//      
//      //Creating the Bubble chart 
//      BubbleChart bubbleChart = new BubbleChart(xAxis, yAxis);    
//         
//      //Prepare XYChart.Series objects by setting data        
//      XYChart.Series series = new XYChart.Series();  
//      series.setName("work"); 
//         
//      series.getData().add(new XYChart.Data(10,30,4));  
//      series.getData().add(new XYChart.Data(25,40,5)); 
//      series.getData().add(new XYChart.Data(40,50,9)); 
//      series.getData().add(new XYChart.Data(40,50,20)); 
//      series.getData().add(new XYChart.Data(55,60,7));    
//      series.getData().add(new XYChart.Data(70,70,9));        
//      series.getData().add(new XYChart.Data(85,80,6));
//       //String css = JavafxBubble.class.getResource("/bubble.css").toExternalForm();
//      
//      //Setting the data to bar chart         
//      bubbleChart.getData().add(series); 
//         
//      //Creating a Group object  
//      Group root = new Group(bubbleChart); 
//         
//      //Creating a scene object 
//      Scene scene = new Scene(root, 600, 400);  
//      
//      //Setting title to the Stage 
//      stage.setTitle("Bubble Chart"); 
//         
//      //Adding scene to the stage 
//      stage.setScene(scene); 
//         
//      //Displaying the contents of the stage 
//      stage.show();         
//   }  
//   public static void main(String args[]){ 
//      launch(args); 
//   } 
//}
//        
        
    }//GEN-LAST:event_jPanel7_ShowGraphsMouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked

           MarkedStudent SS=new MarkedStudent();
 SS.FacultyID=FacultyID;
        SS.setVisible(true);
        SS.pack();
        SS.setLocationRelativeTo(null);
        this.dispose();   ///setting my sail to the homepage
        SS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   ///setting my sail to the homepage
  //      J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }//GEN-LAST:event_jPanel7MouseClicked

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
            java.util.logging.Logger.getLogger(HomePageFacultyOntheGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageFacultyOntheGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageFacultyOntheGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageFacultyOntheGo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageFacultyOntheGo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel7_ShowGraphs;
    private javax.swing.JPanel jPanelJtableDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Faculty_Course_Section;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
