package bracuclassroom;

import javafx.application.Application; 
import static javafx.application.Application.launch;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.chart.BubbleChart; 
import javafx.stage.Stage;  
import javafx.scene.chart.NumberAxis; 
import javafx.scene.chart.XYChart; 
         
public class JavaFXBubble extends Application { 
     public static String FacultyID;
     public static int demo;
     public static float average1;
     public static float average2;
     public static float average3;
     public static float average4;
     public static float average5;
     
    public static int count1;
    public static int count2;
    public static int count3;
     public static int count4;
     public static int count5;
     
   public static  int First;
   public static  int Second;
   public static  int Third;
   public static  int Fourth;
public static   int Fifth;
     public static int limits;
     
     
   @Override 
   public void start(Stage stage) {     
      //Defining the axes               
         NumberAxis xAxis = new NumberAxis(0, 100, 10);        
      xAxis.setLabel("Section"); 
        
      NumberAxis yAxis = new NumberAxis(20, 200, 10); 
      yAxis.setLabel("Marks"); 
   
      
      
      //Creating the Bubble chart 
      BubbleChart bubbleChart = new BubbleChart(xAxis, yAxis);    
         
      //Prepare XYChart.Series objects by setting data        
      XYChart.Series series = new XYChart.Series();  
      series.setName("Limits"); 
         
      
     // series.getData().add(new XYChart.Data(5,80,30));  
     //standard
     
      series.getData().add(new XYChart.Data((First*10),limits,5*3));  
      series.getData().add(new XYChart.Data((Second*10),limits,5*3)); 
//      series.getData().add(new XYChart.Data((Third*10),limits,5*2)); 
//      series.getData().add(new XYChart.Data((Fourth*10),limits,5*2));    
//      series.getData().add(new XYChart.Data((Fifth*10),limits,5*2)); 
     
     
      series.getData().add(new XYChart.Data((First*10),limits,count1));  
      series.getData().add(new XYChart.Data((Second*10),limits,count2)); 
//      series.getData().add(new XYChart.Data((Third*10),limits,count3*2)); 
//      series.getData().add(new XYChart.Data((Fourth*10),limits,count4*2));    
//      series.getData().add(new XYChart.Data((Fifth*10),limits,count5*2));        
      
//      System.out.println("count1 "+count1);
//      System.out.println("count2 "+count2);
//      System.out.println("count3 "+count3);
//      System.out.println("count4 "+count4);
//      System.out.println("count5 "+count5);
//      System.out.println("Average1 "+average1);
//      System.out.println("Average2 "+average2);
//      System.out.println("Average3 "+average3);
//      System.out.println("Average4 "+average4);
//      System.out.println("Average5 "+average5);
     
       //String css = JavafxBubble.class.getResource("/bubble.css").toExternalForm();
      
      //Setting the data to bar chart         
      bubbleChart.getData().add(series); 
         
      //Creating a Group object  
      Group root = new Group(bubbleChart); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 400, 600);  
      
      //Setting title to the Stage 
      stage.setTitle("Bubble Chart"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();         
   }  
 public static void main(String args[]){ 
       
     launch(args); 
     
   } 
}


  
