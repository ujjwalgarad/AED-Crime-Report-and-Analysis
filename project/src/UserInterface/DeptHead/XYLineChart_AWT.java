/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DeptHead;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PoliceEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PoliceOfficerOrganization;
import Business.WorkQueue.WorkRequest;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author ujjwal.garad
 */
public class XYLineChart_AWT extends JFrame{

    public XYLineChart_AWT(String applicationTitle, String chartTitle, Enterprise e) {
        super(applicationTitle);
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
         chartTitle ,
         "Month" ,
         "Reported Incidents" ,
         createDataset(e) ,
         PlotOrientation.VERTICAL ,
         true , true , false);
         
      ChartPanel chartPanel = new ChartPanel( xylineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 600 , 600 ) );
      final XYPlot plot = xylineChart.getXYPlot( );
      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
      renderer.setSeriesPaint( 0 , Color.RED );
      renderer.setSeriesPaint( 1 , Color.GREEN );
      renderer.setSeriesPaint( 2 , Color.YELLOW );
      renderer.setSeriesPaint( 3 , Color.BLACK );
      renderer.setSeriesPaint( 4 , Color.CYAN );
      renderer.setSeriesPaint( 5 , Color.MAGENTA );
      renderer.setSeriesPaint( 6 , Color.ORANGE );
      renderer.setSeriesPaint( 7 , Color.PINK );
      renderer.setSeriesPaint( 8 , Color.WHITE );
      renderer.setSeriesStroke( 0 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 1 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 2 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 3 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 4 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 5 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 6 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 7 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 8 , new BasicStroke( 3.0f ) );
      plot.setRenderer( renderer ); 
      setContentPane( chartPanel );
    }
    
    private XYDataset createDataset(Enterprise e )
   {
       
       final XYSeriesCollection dataset = new XYSeriesCollection( );
       for(WorkRequest.Type type : WorkRequest.Type.values()){            
        int jan=0; int feb=0; int mar=0; int apr=0;int may=0; int jun=0;int jul=0;int aug=0;int sep=0;int oct=0;int nov=0; int dec=0;
                  
            for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                      if(o instanceof PoliceOfficerOrganization){
                          for(WorkRequest w : o.getWorkQueue().getWorkRequestList()){
                              if(w.getCrimeType().equals(String.valueOf(type))){
                        if(w.getCrimeDate().getMonth()==0){jan=jan+1;}
                        if(w.getCrimeDate().getMonth()==1){feb=feb+1;}
                        if(w.getCrimeDate().getMonth()==2){mar=mar+1;}
                        if(w.getCrimeDate().getMonth()==3){apr=apr+1;}
                        if(w.getCrimeDate().getMonth()==4){may=may+1;}
                        if(w.getCrimeDate().getMonth()==5){jun=jun+1;}
                        if(w.getCrimeDate().getMonth()==6){jul=jul+1;}
                        if(w.getCrimeDate().getMonth()==7){aug=aug+1;}
                        if(w.getCrimeDate().getMonth()==8){sep=sep+1;}
                        if(w.getCrimeDate().getMonth()==9){oct=oct+1;}
                        if(w.getCrimeDate().getMonth()==10){nov=nov+1;}
                        if(w.getCrimeDate().getMonth()==11){dec=dec+1;}
                              }
                          }
                      }
                  }
      
      final XYSeries crimeType = new XYSeries( String.valueOf(type) );          
      crimeType.add( 1 , jan );  
      crimeType.add( 2 , feb );  
      crimeType.add( 3 , mar );  
      crimeType.add( 4 , apr );  
      crimeType.add( 5 , may );  
      crimeType.add( 6 , jun );  
      crimeType.add( 7 , jul );  
      crimeType.add( 8 , aug );  
      crimeType.add( 9 , sep );  
      crimeType.add( 10 , oct );  
      crimeType.add( 11 , nov );  
      crimeType.add( 12 , dec );  
      dataset.addSeries(crimeType );        
       }
      return dataset;
   }
    
}
