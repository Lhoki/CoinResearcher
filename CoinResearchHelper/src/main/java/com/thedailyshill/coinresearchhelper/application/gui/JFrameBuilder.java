package com.thedailyshill.coinresearchhelper.application.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.thedailyshill.coinresearchhelper.application.gui.sliders.CirculatingSupplySlider;
import com.thedailyshill.coinresearchhelper.services.JsonPrettier;
import com.thedailyshill.coinresearchhelper.services.tickerservices.returnresultsbyfield.ReturnByPrice;

public class JFrameBuilder {
	CirculatingSupplySlider gui = new CirculatingSupplySlider();
	JFrame frame = new JFrame();

	public JFrameBuilder() {

		// frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(220, 200);
		frame.getContentPane().add(gui, BorderLayout.CENTER);
		JButton button = new JButton("click");
		button.setVisible(true);
		frame.add(gui);
		frame.add(button, BorderLayout.SOUTH);
		button.addActionListener(new Action());

		frame.getContentPane().add(button, BorderLayout.SOUTH);
		// button.addActionListener(new Action());
	}

	class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JsonPrettier jp = new JsonPrettier();
			ReturnByPrice rbp = new ReturnByPrice();
			Double value = (double) gui.getMinPrice();
			Double value2 = (double) gui.getMaxPrice();

			try {
				if (value == null) {
					value = 0.01;
				}

				if (value2 == null) {
					value2 = 1000000.00;
				}

				System.out.println(jp.prettyFy(rbp.ReturnByPriceRange(value, value2)));

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

			}

		}
	}

}
