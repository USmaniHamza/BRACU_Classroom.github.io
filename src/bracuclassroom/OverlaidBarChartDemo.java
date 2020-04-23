/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracuclassroom;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.renderer.AbstractRenderer;

/**
 * A simple demonstration application showing how to create a bar chart overlaid
 * with a line chart.
 */
public class OverlaidBarChartDemo extends ApplicationFrame {
public static float Value1=0;
public static float Value2=0;
public static float Value3=0;
public static float Value4=0;
public static float Value5=0;

public static int first=0;
public static int second=0;
public static int third=0;
public static int fourth=0;
public static int fifth=0;



public static int limit;
//public static String a="hello "+String.valueOf(3);    
    
    
    /////////////////
    /////////////////  
    /////////////////
    //Section change korte hobe 
    /**
     * Default constructor.
     *
     * @param title  the frame title.
     */
    public OverlaidBarChartDemo(final String title) {

        super(title);

        // create the first dataset...
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        //STANDARD
        
        System.out.println("First section"+" "+this.Value1);
        System.out.println("Second section"+" "+this.Value2);
        System.out.println("Third section"+" "+this.Value3);
        System.out.println("Fourth section"+" "+this.Value4);
        System.out.println("Fifth section"+" "+this.Value5);
        if(this.Value1==0){
        
        }else{
             String First="Section "+first;

    dataset1.addValue(OverlaidBarChartDemo.limit, "S1", First);
        }
   if(this.Value2==0){
    
    }else{
       
 String Second="Section "+second;

          dataset1.addValue(OverlaidBarChartDemo.limit, "S1", Second);
    }
   
   if(this.Value3==0){
    
    
   }else{
       String Third="Section "+third;
    dataset1.addValue(OverlaidBarChartDemo.limit, "S1", Third);
    }
   
   if(this.Value4==0){
   
   
   }else{
       String Fourth="Section "+fourth;
          dataset1.addValue(OverlaidBarChartDemo.limit, "S1", Fourth);
    }
   
   if(this.Value5==0){
    
    }else{
    String Fifth="Section "+fifth;
     dataset1.addValue(OverlaidBarChartDemo.limit, "S1", Fifth);
    }
    
//        dataset1.addValue(9, "S1", "Category 6");
//        dataset1.addValue(23, "S1", "Category 7");
//        dataset1.addValue(98, "S1", "Category 8");

//ACTUAL
 if(this.Value1==0){
        
        }else{
     String First="Section "+first;
    dataset1.addValue(this.Value1, "S2", First);
    }
 if(this.Value2==0){
    
    }else{
     String Second="Section "+second;
          dataset1.addValue(this.Value2, "S2", Second);
    }if(this.Value3==0){
    
    
    }else{
        String Third="Section "+third;
    dataset1.addValue(this.Value3, "S2", Third);
    }if(this.Value4==0){
    
    
    }else{
        String Fourth="Section "+fourth;
          dataset1.addValue(this.Value4, "S2",Fourth);
    }if(this.Value5==0){
    
   }else{
   String Fifth="Section "+fifth;
    dataset1.addValue(this.Value5, "S2", Fifth);
    }
      //  dataset1.addValue(Value1, "S2", "Category 1");
//        dataset1.addValue(70, "S2", "Category 2");
//        dataset1.addValue(60, "S2", "Category 3");
//        dataset1.addValue(80, "S2", "Category 4");
//        dataset1.addValue(40, "S2", "Category 5");
//        dataset1.addValue(40, "S2", "Category 6");
//        dataset1.addValue(20, "S2", "Category 7");
//        dataset1.addValue(10, "S2", "Category 8");

//////////BAR
        // create the first renderer...
  //     final CategoryLabelGenerator generator = new StandardCategoryLabelGenerator();
        final CategoryItemRenderer renderer = new BarRenderer();
    //    renderer.setLabelGenerator(generator);
       // renderer.setBaseItemLabelsVisible(true);
       
        final CategoryPlot plot = new CategoryPlot();
        plot.setDataset(dataset1);
        plot.setRenderer(renderer);
       
        plot.setDomainAxis(new CategoryAxis("Category"));
        plot.setRangeAxis(new NumberAxis("Value"));

        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setRangeGridlinesVisible(true);
        plot.setDomainGridlinesVisible(true);

       
        //the line graphs
        // now create the second dataset and renderer...
//        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
//        dataset2.addValue(9.0, "T1", "Category 1");
//        dataset2.addValue(7.0, "T1", "Category 2");
//        dataset2.addValue(2.0, "T1", "Category 3");
//        dataset2.addValue(6.0, "T1", "Category 4");
//        dataset2.addValue(6.0, "T1", "Category 5");
//        dataset2.addValue(9.0, "T1", "Category 6");
//        dataset2.addValue(5.0, "T1", "Category 7");
//        dataset2.addValue(4.0, "T1", "Category 8");
//
//        final CategoryItemRenderer renderer2 = new LineAndShapeRenderer();
//        plot.setDataset(1, dataset2);
//        plot.setRenderer(1, renderer2);

        // create the third dataset and renderer...
//        final ValueAxis rangeAxis2 = new NumberAxis("Axis 2");
//        plot.setRangeAxis(1, rangeAxis2);
//
//        DefaultCategoryDataset dataset3 = new DefaultCategoryDataset();
//        dataset3.addValue(94.0, "R1", "Category 1");
//        dataset3.addValue(75.0, "R1", "Category 2");
//        dataset3.addValue(22.0, "R1", "Category 3");
//        dataset3.addValue(74.0, "R1", "Category 4");
//        dataset3.addValue(83.0, "R1", "Category 5");
//        dataset3.addValue(9.0, "R1", "Category 6");
//        dataset3.addValue(23.0, "R1", "Category 7");
//        dataset3.addValue(98.0, "R1", "Category 8");
//
//        plot.setDataset(2, dataset3);
//        final CategoryItemRenderer renderer3 = new LineAndShapeRenderer();
//        plot.setRenderer(2, renderer3);
//        plot.mapDatasetToRangeAxis(2, 1);

        // change the rendering order so the primary dataset appears "behind" the
        // other datasets...
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
       
        plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        final JFreeChart chart = new JFreeChart(plot);
        chart.setTitle("Overlaid Bar Chart");
      //  chart.setLegend(new StandardLegend());

        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);

    }

    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void main(final String[] args) {
        final OverlaidBarChartDemo demo = new OverlaidBarChartDemo("Performances");
        
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        
        
        demo.setVisible(true);

    }

  

}