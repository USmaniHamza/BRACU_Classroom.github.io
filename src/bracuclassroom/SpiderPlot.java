package bracuclassroom;

//this is extra stuff

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import static junit.framework.Assert.assertTrue;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;


public class SpiderPlot extends JFrame {

   private static final long serialVersionUID = 1L;
 
    private static String FacultyName;
    private static String FacultyID;
    public  static String StudentName;
    public static String StudentID;
    private static String Section;
    private static String CurrentSemester;
    private static String Course;
    private static int Quiz1; //raw data ta emne emnei convert kore nibe
    private static int Quiz2;
    private static int Quiz3;
    private static int Assignment;
    private static  int MidExam;
    private static int FinalExam;
    private static int TotalMarksBeforeMid;
    private static int TotalMarksFinal;
    private static String FinalGrade;
      private static int  MaximumQuiz1; //the best ones taken
    private static int MaximumQuiz2;
    
    public SpiderPlot(int Quiz1, int Quiz2 ,int Quiz3, int Assignment, int MidExam ,int FinalExam,int TotalMarksBeforeMid,int TotalMarksFinal ,String FinalGrade){

 this.Quiz1=Quiz1;
 this.Quiz2=Quiz2;
 this.Quiz3=Quiz3;
 this.Assignment=Assignment;
 this.MidExam=MidExam;
 this.FinalExam=FinalExam;
 this.TotalMarksBeforeMid=TotalMarksBeforeMid;
 this.TotalMarksFinal=TotalMarksFinal;
 this.FinalGrade=FinalGrade;
 
   if(this.Quiz1>=this.Quiz2){ //for Quiz 1 check
MaximumQuiz1=this.Quiz1;
}
else if(this.Quiz2>=this.Quiz1){ //for Quiz 2 check
MaximumQuiz1=this.Quiz2;
}
MaximumQuiz2=this.Quiz3;

 
 System.out.println("StudentID "+ this.StudentID);
}   
 public String getFacultyName(){
 return FacultyName;
 } 
 public String getFacultyID(){
 return FacultyID;
 }
 public String getStudentName(){
 return StudentName;
 }
 public String getStudentID(){
 return StudentID;
 }
 public String getSection(){
 return Section;
 }
 public String getCurrentSemester(){
 return CurrentSemester;
 }
 public String getCourse(){
 return Course;
 }
 public int getQuiz1(){
 return Quiz1;
 }
 public int getQuiz2(){
 return Quiz2;
 }
 public int getQuiz3(){
 return Quiz3;
 }
 public int getAssignment(){
 return Assignment;
 }
 public int getMidExam(){
 return MidExam;
 }
 public int getFinalExam(){
 return FinalExam;
 }
  public int getTotalMarksBeforeMid(){
 return TotalMarksBeforeMid;
 }
   public int getTotalMarksFinal(){
 return TotalMarksFinal;
 }
public String getFinalGrade(){
 return FinalGrade;
 } //end of the method
 
    

   public SpiderPlot(String title) {
       /////////////
       ////////////DONT TOUCH
       
      super(title);
      
      // Create dataset
      XYDataset dataset = getXYDataset();
   
      // Create chart
      JFreeChart chart = ChartFactory.createPolarChart(
            "Web Plot of student "+SpiderPlot.StudentName+" before mids ", // Chart title
            dataset,            true,
            true,
            false
            );
      

      ChartPanel panel = new ChartPanel(chart);
      panel.setMouseZoomable(false);
     setContentPane(panel);

   /////////////
       ////////////DONT TOUCH
   }

   private XYDataset getXYDataset() {
     
      XYSeriesCollection dataset = new XYSeriesCollection();
    //    DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
      XYSeries series1 = new XYSeries("Best Quiz and Assignment and MidExam starting for Clockwise from North");
      //angle and cordinates
      //eta chilo demo
//      series1.add(45,SpiderPlot.MaximumQuiz1);  //quiz3 converted from 20
//      series1.add(315, SpiderPlot.Assignment);//Finalexam from 40
//      series1.add(180, SpiderPlot.MidExam);//Till Mid  Marks
//      
            series1.add(45,SpiderPlot.MaximumQuiz1);  //quiz3 converted from 20
      series1.add(315, SpiderPlot.MidExam);//Finalexam from 40
      series1.add(180, SpiderPlot.Assignment);//Till Mid  Marks


      dataset.addSeries(series1);
      

   
//      
//      dataset.addSeries(series2);
      return dataset;
   }
   

   public static void main(String[] args) {
       
       
       
            SpiderPlot demo = new SpiderPlot("Performance of "+SpiderPlot.StudentID+" before the Mids");
        
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        
//        System.out.println("Quiz 3 "+SpiderPlot.Quiz3);
//        System.out.println("Final Exam "+SpiderPlot.FinalExam);
//        System.out.println("Mid Exam "+SpiderPlot.MidExam);
        demo.setVisible(true);
      SwingUtilities.invokeLater(() -> {
    JOptionPane.showMessageDialog(null,"45 degrees for the best Quiz\n180 degrees for the Assignment\n315 degrees for the Midterm exam");
  
         demo.setSize(800, 400);
         demo.setLocationRelativeTo(null);
         demo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         demo.setVisible(true);
         
         
         
         
      });
   }
}