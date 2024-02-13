package Napoli.org.Builders;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Queue;

public class PieChartBuilder implements Builder {
    String title;
    DefaultPieDataset<String>dataset= new DefaultPieDataset<String>();;
    public PieChartBuilder(String title){
        this.title=title;
    }
    public void addData(String key, double value) {
        dataset.setValue(key, value);

    }

    public JFrame getChart() {

        JFreeChart piechart= ChartFactory.createPieChart(title, dataset, true, true, true);
        ChartPanel chartPanel=new ChartPanel(piechart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);

        JFrame frame=new JFrame("grafico a Torta");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setAlwaysOnTop(true);


        return frame;
    }
    }

