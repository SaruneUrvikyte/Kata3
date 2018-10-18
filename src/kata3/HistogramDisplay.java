package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 * @author Sarune Urvikyte
 */

public class HistogramDisplay extends ApplicationFrame{

    public static void main(String[] args) {
        HistogramDisplay histo = new HistogramDisplay();
        histo.execute();
    }  
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", 
                "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, 
                false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(5, "", "ulpgc.es");
        dataSet.addValue(2, "", "google.com");
        dataSet.addValue(10, "", "vu.lt");
        dataSet.addValue(7, "", "yahoo.com");
        return dataSet;
    }
}
