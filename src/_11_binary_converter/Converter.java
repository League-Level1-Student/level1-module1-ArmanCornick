package _11_binary_converter;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Converter implements ActionListener {

	JFrame frame = new JFrame();	
	JPanel panel = new JPanel();
	JTextField type = new JTextField(20);
	Button button = new Button("convert");

	public static void main(String[] args) {
		Converter vert = new Converter();
		vert.setup();
	}

	public void setup() {
		frame.add(panel);
		panel.add(button);
		panel.add(type);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String string = type.getText();
		String returnValue = convert(string);
		JOptionPane.showMessageDialog(null, returnValue);
	}

}
