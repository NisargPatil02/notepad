package project;

import java.awt.Color;

public class ModeFunction {
	
	GUI gui;
	
	public ModeFunction(GUI gui){
		this.gui = gui;
	}
	
	public void darkMode() {
		
		gui.textArea.setBackground(new Color(101,114,108));
		gui.textArea.setForeground(Color.white);	
	}
	
	public void lightMode(){
	
		gui.textArea.setBackground(Color.white);
		gui.textArea.setForeground(Color.black);
		
	}

}
