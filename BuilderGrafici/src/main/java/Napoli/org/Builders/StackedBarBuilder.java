package Napoli.org.Builders;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Queue;

public class StackedBarBuilder implements Builder{
    DefaultCategoryDataset dataset= new DefaultCategoryDataset();;
    String title;

    public StackedBarBuilder(String title){
        this.title=title;
    }
    public void addData(String key, double value) {
        dataset.addValue(value, key, "");
    }

    public JFrame getChart() {
        JFreeChart stackedBarChart= ChartFactory.createStackedBarChart(title, "", "percentuale", dataset, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel=new ChartPanel(stackedBarChart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        CategoryPlot plot = (CategoryPlot) stackedBarChart.getPlot();
        StackedBarRenderer renderer = (StackedBarRenderer) plot.getRenderer();

        // Regola la larghezza delle colonne
        renderer.setMaximumBarWidth(0.2);

        JFrame frame=new JFrame("grafico a barre sovrapposte");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setAlwaysOnTop(true);

        return frame;
    }
}
