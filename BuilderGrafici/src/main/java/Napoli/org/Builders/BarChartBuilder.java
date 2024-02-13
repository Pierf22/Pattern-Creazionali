package Napoli.org.Builders;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Queue;

public class BarChartBuilder implements Builder{
    DefaultCategoryDataset dataset= new DefaultCategoryDataset();;
    String title;
    public BarChartBuilder(String title){
        this.title=title;
    }

    public void addData(String key, double value) {
        dataset.setValue(value, "", key);
    }



    public JFrame getChart() {
        JFreeChart barChart= ChartFactory.createBarChart(title, "", "percentuale", dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel chartPanel=new ChartPanel(barChart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);

        JFrame frame=new JFrame("grafico a Barre");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setAlwaysOnTop(true);

        return frame;

    }
}
