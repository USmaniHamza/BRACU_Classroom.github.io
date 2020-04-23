package bracuclassroom;

import java.awt.Dimension;
import javax.swing.JFrame;

import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RefineryUtilities;

/**
 * A simple demonstration application showing how to create a spider chart.
 */
public class SpiderWebChartDemo1 extends JFrame {

     
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
    
    
    public SpiderWebChartDemo1(int Quiz1, int Quiz2 ,int Quiz3, int Assignment, int MidExam ,int FinalExam,int TotalMarksBeforeMid,int TotalMarksFinal ,String FinalGrade){

 this.Quiz1=Quiz1;
 this.Quiz2=Quiz2;
 this.Quiz3=Quiz3;
 this.Assignment=Assignment;
 this.MidExam=MidExam;
 this.FinalExam=FinalExam;
 this.TotalMarksBeforeMid=TotalMarksBeforeMid;
 this.TotalMarksFinal=TotalMarksFinal;
 this.FinalGrade=FinalGrade;
 
 System.out.println("StudentID "+ this.StudentID);
  if(this.Quiz1>=this.Quiz2){ //for Quiz 1 check
MaximumQuiz1=this.Quiz1;
}
else if(this.Quiz2>=this.Quiz1){ //for Quiz 2 check
MaximumQuiz1=this.Quiz2;
}
MaximumQuiz2=this.Quiz3;

 
}   
    public SpiderWebChartDemo1(String title) {
        super(title);
        JPanel chartPanel = createDemoPanel();
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }

    /**
     * Returns a sample dataset.
     *
     * @return The dataset.
     */
    
    private static CategoryDataset createDataset() {

        // row keys...
        String series1 = "First";
        String series2 = "Second";
        String series3 = "Third";

        // column keys...
        String category1 = "Best out of Quiz1 and Quiz2";
        String category2 = "Quiz3";
        String category3 = "Assignment";
        String category4 = "Mid Exam";
        String category5 = "Final Exam";

        // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(SpiderWebChartDemo1.MaximumQuiz1, series1, category1);
        dataset.addValue(SpiderWebChartDemo1.MaximumQuiz2, series1, category2);
        dataset.addValue(SpiderWebChartDemo1.Assignment, series1, category3);
        dataset.addValue(SpiderWebChartDemo1.MidExam, series1, category4);
        dataset.addValue(SpiderWebChartDemo1.MidExam, series1, category5);
//        dataset.addValue(50, series1, category5);

        dataset.addValue(20, series2, category1);
        dataset.addValue(20, series2, category2);
        dataset.addValue(10, series2, category3);
        dataset.addValue(20, series2, category4);
        dataset.addValue(20, series2, category5);
//        dataset.addValue(50, series2, category5);

    

        return dataset;

    }

    /**
     * Creates a sample chart.
     *
     * @param dataset  the dataset.
     *
     * @return The chart.
     */
    private static JFreeChart createChart(CategoryDataset dataset) {
        SpiderWebPlot plot = new SpiderWebPlot(dataset);
        plot.setStartAngle(54);
        plot.setInteriorGap(0.40);
        plot.setToolTipGenerator(new StandardCategoryToolTipGenerator());
        JFreeChart chart = new JFreeChart("Spider Web Chart for "+SpiderWebChartDemo1.StudentID,
                TextTitle.DEFAULT_FONT, plot, false);
        LegendTitle legend = new LegendTitle(plot);
        //legend.setPosition(RectangleEdge);
        chart.addSubtitle(legend);
      //  ChartUtilities.applyCurrentTheme(chart);
        return chart;

    }

    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     *
     * @return A panel.
     */
    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
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
 
    public static void main(String[] args) {
        SpiderWebChartDemo1 demo = new SpiderWebChartDemo1(
                SpiderWebChartDemo1.StudentName+"'s full performance");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }

}