package br.com.fiap;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class InitText extends JTextField{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public InitText() {
			super(20);
			init();
		}

		private void init() {
			this.setForeground(new Color(50,50,50));
			this.setBackground(Color.white);
			this.setBorder(BorderFactory.create());
		}
}
