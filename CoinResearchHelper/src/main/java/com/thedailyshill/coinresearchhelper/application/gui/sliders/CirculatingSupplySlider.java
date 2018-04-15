package com.thedailyshill.coinresearchhelper.application.gui.sliders;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CirculatingSupplySlider extends JPanel {

	JSlider slider;
	JSlider slider2;
	JLabel label;
	JLabel label2;
	private Double minPrice;
	private Double maxPrice;

	public CirculatingSupplySlider() {

		slider = new JSlider(JSlider.HORIZONTAL, 0, 10000, 0);
		slider2 = new JSlider(JSlider.HORIZONTAL, 0, 10000, 10000);
		slider.setMajorTickSpacing(100000);
		slider2.setMajorTickSpacing(100000);
		slider.setPaintTicks(true);
		slider2.setPaintTicks(true);
		add(slider);
		add(slider2);
		
		label = new JLabel("Min Price: 0");
		label2 = new JLabel("Max Price: 10000");
		add(label);
		add(label2);
		
		event e = new event();
		slider.addChangeListener(e);
		slider2.addChangeListener(e);

	}

	public class event implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int value = slider.getValue();
			int value2 = slider2.getValue();
			
			

			if (value < value2) {
			label.setText("Min Price: " + value);	
			minPrice = (double) value;
			label2.setText("Max Price: " + value2);
			maxPrice = (double) value2;
			}
		}
	}

	public Double getMinPrice() {
		return minPrice;
	}


	public Double getMaxPrice() {
		return maxPrice;
	}

	
	
}
