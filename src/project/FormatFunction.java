package project;

import java.awt.Font;



public class FormatFunction {
	
	GUI gui;
	Font arial, comicSansMS, timeNewRoman, lucidaConsole;
	String selectedFont="timeNewRoman";
	int currentFontSize = 16;
	
	public void assignFont(int fontSize) {
		arial = new Font("Arial", Font.PLAIN, fontSize);
		comicSansMS = new Font("Comic Sans MS",Font.PLAIN, fontSize);
		timeNewRoman = new Font("Time New Roman", Font.PLAIN, fontSize);
		lucidaConsole = new Font("Lucida Console", Font.PLAIN, fontSize);
	}
	
	
	public FormatFunction(GUI gui) {
		this.gui = gui;
	}
	
	
	
	public void wordWrap() {
		
		if(gui.wordWrapOn == false) {
			gui.wordWrapOn = true;
			//setLineWrap(true) IS METHOD USED FOR WORD WRAP
			gui.textArea.setLineWrap(true);
			gui.textArea.setWrapStyleWord(true);//LINE BREAK ANY WHERE SO THI BREK LINE BUT NOT WORD,
			gui.itemWordWrap.setText("Word Wrap : ON");
		}
		else {
			gui.wordWrapOn = false;
			gui.textArea.setLineWrap(false);
			gui.itemWordWrap.setText("Word Wrap : OFF");
		}
		
	}

	public void createFont(int fontSize){
		
		setFont(selectedFont, fontSize);
		
	}
	
	public void setFont(String font, int fontSize) {
		
		assignFont(fontSize); 
		selectedFont = font;
		
		switch(selectedFont) {
		
		case "arial": 
			gui.textArea.setFont(arial);
			break;
			
		case "comicSansMs": 
			gui.textArea.setFont(comicSansMS);
			break;
			
		case "timeNewRoman": 
			gui.textArea.setFont(timeNewRoman);break;
			
		case "Lucida Console":
			gui.textArea.setFont(lucidaConsole);break;
			
		}
		
		
		
	}

}
