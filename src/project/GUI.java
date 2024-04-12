package project;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;



//===================*=*=*=========================


public class GUI implements ActionListener{
	
	JFrame window;

	//for Text area
	JTextArea textArea;
	JScrollPane scrollPane;
	boolean wordWrapOn = false; 
	
	//Top Menu Bar;
	JMenuBar menuBar;
	JMenu menuFile, menuEdit, menuFormat, menuMode, menuSearch;
	
	//this is for the File Menu
	JMenuItem itemNew, itemOpen, itemSave, itemSaveAS, itemExit;
	
	//this is For the Edit Menu
	JMenuItem itemCut, itemCopy, itemPest;
	
	
	//this is for the Format menu
	JMenuItem itemWordWrap;
	JMenu itemFont, itemFontSize;
		//FOLLWING FOR FONT MENU ITEM.
			JMenuItem arial, comicSansMs, timeNewRoman, msGothic;
		//FOLLOWING FOR FONT SIZE MENU ITEM.
			JMenuItem font8, font10, font12, font14, font16, font18, font20, font22;
	
			
	//THSI IS FOR MENU ITEM OF MODE.
		JMenuItem darkMode, lightMode;
			
			
	//creating All Object Here 
		FileFunction file = new FileFunction(this);
		EditFunction edit = new EditFunction(this);
		FormatFunction format = new FormatFunction(this);
		ModeFunction mode = new ModeFunction(this);
	
	
	//GUI Constructor 
	public GUI() {
		
		createWindow();
		createTextArea();
		createMenuBar();
		createFileMenu();
		createEditMenu();
		createFormatMenu();
		createModeMenu();
		
		deafauntFontSize(16);
		
		window.setVisible(true);
	}
	
	
	//used for create Window 
	public void createWindow() {
		
		window = new JFrame("Notepad");
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	//Text Area method 
	public void createTextArea() {
		
		textArea = new JTextArea();
		
		scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		window.add(scrollPane);
		//window.add(textArea); this is also used but it not have scroll bar.
			
	}
	
	
	public void deafauntFontSize(int s) {
		
		Font arial;
		
		arial = new Font("Arial", Font.PLAIN, s);
		textArea.setFont(arial);
		
	}
	
	//Menu Bar method
	public void createMenuBar() {
		
		menuBar = new JMenuBar();
		window.setJMenuBar(menuBar);
		
		menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);
		
		menuFormat = new JMenu("Format");
		menuBar.add(menuFormat);
		
		menuMode = new JMenu("Mode");
		menuBar.add(menuMode);
		
		menuSearch = new JMenu("Search");
		menuBar.add(menuSearch);
		
		
		
	}
	
	//File Menu Item 
	public void createFileMenu() {
		
		
		itemNew = new JMenuItem("New File");
		itemNew.addActionListener(this);
		itemNew.setActionCommand("New");
		menuFile.add(itemNew);
		
		itemOpen = new JMenuItem("Open");
		itemOpen.addActionListener(this);
		itemOpen.setActionCommand("Open");
		menuFile.add(itemOpen);
		
		itemSave = new JMenuItem("Save");
		itemSave.addActionListener(this);
		itemSave.setActionCommand("Save");
		menuFile.add(itemSave);
		
		itemSaveAS = new JMenuItem("Save As");
		itemSaveAS.addActionListener(this);
		itemSaveAS.setActionCommand("SaveAS");
		menuFile.add(itemSaveAS);
		
		itemExit = new JMenuItem("Exit");
		itemExit.addActionListener(this);
		itemExit.setActionCommand("Exit");
		menuFile.add(itemExit);
		
		
	}
	
	//for Edit item
	public void createEditMenu() {
		
		itemCut = new JMenuItem("Cut");
		itemCut.addActionListener(this);
		itemCut.setActionCommand("Cut");
		menuEdit.add(itemCut);
		
		itemCopy = new JMenuItem("Copy");
		itemCopy.addActionListener(this);
		itemCopy.setActionCommand("Copy");
		menuEdit.add(itemCopy);
		
		itemPest = new JMenuItem("Past");
		itemPest.addActionListener(this);
		itemPest.setActionCommand("Past");
		menuEdit.add(itemPest);
		
		
	}
	
	//for Format item
	public void createFormatMenu() {
		
		itemWordWrap = new JMenuItem("Word Wrap : OFF");
		itemWordWrap.addActionListener(this);
		itemWordWrap.setActionCommand("WordWrap");
		menuFormat.add(itemWordWrap);
		
		itemFont = new JMenu("Font");
		menuFormat.add(itemFont);
		
		itemFontSize = new JMenu("Font Size");
		menuFormat.add(itemFontSize);
		
		
		//this is for FONT Item.
		arial = new JMenuItem("Arial");	
		arial.addActionListener(this);
		arial.setActionCommand("arial");
		itemFont.add(arial);
		
		comicSansMs = new JMenuItem("Comic Sans MS");
		comicSansMs.addActionListener(this);
		comicSansMs.setActionCommand("comicSansMs");
		itemFont.add(comicSansMs);
		
		timeNewRoman = new JMenuItem("Time New Roman");
		timeNewRoman.addActionListener(this);
		timeNewRoman.setActionCommand("timeNewRoman");
		itemFont.add(timeNewRoman);
		
		msGothic = new JMenuItem("Lucida Console");
		msGothic.addActionListener(this);
		msGothic.setActionCommand("Lucida Console");
		itemFont.add(msGothic);
		
		
		//this is for FONT SIZE MENU Item.
		font8 = new JMenuItem("8");	
		font8.addActionListener(this);
		font8.setActionCommand("8");
		itemFontSize.add(font8);
		
		font10 = new JMenuItem("10");	
		font10.addActionListener(this);
		font10.setActionCommand("10");
		itemFontSize.add(font10);
		
		font12 = new JMenuItem("12");	
		font12.addActionListener(this);
		font12.setActionCommand("12");
		itemFontSize.add(font12);
		
		font14 = new JMenuItem("14");	
		font14.addActionListener(this);
		font14.setActionCommand("14");
		itemFontSize.add(font14);
		
		font16 = new JMenuItem("16");	
		font16.addActionListener(this);
		font16.setActionCommand("16");
		itemFontSize.add(font16);
		
		font18 = new JMenuItem("18");	
		font18.addActionListener(this);
		font18.setActionCommand("18");
		itemFontSize.add(font18);
		
		font20 = new JMenuItem("20");	
		font20.addActionListener(this);
		font20.setActionCommand("20");
		itemFontSize.add(font20);
		
		font22 = new JMenuItem("22");	
		font22.addActionListener(this);
		font22.setActionCommand("20");
		itemFontSize.add(font22);
		
		
	}
	
	
	public void createModeMenu() {
		
		darkMode = new JMenuItem("Dark Mode");
		darkMode.addActionListener(this);
		darkMode.setActionCommand("DarkMode");
		menuMode.add(darkMode);
		
		lightMode = new JMenuItem("Light Mode");
		lightMode.addActionListener(this);
		lightMode.setActionCommand("LightMode");
		menuMode.add(lightMode);
		
		
	} 
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		
		//FOR THE FILE MENU ITEM.
		switch(command) {
		case "New": file.newFile(); break;
		case "Open": file.openFile(); break;
		case "Save": file.saveFile(); break; 
		case "SaveAS": file.saveASFile(); break;
		case "Exit": file.exitFile(); break; 
		}
		
		//FOR THE EDIT MENU ITEM.
		switch(command) {
		case "Cut": edit.cutText(); break;
		case "Copy": edit.copyText(); break;
		case "Past": edit.pastText(); break;
		
		}
		
		//FOR THE FORMAT MENU ITEM.
		switch(command) {
		case "WordWrap": format.wordWrap(); break;
		
		case "8": format.createFont(8); format.currentFontSize = 8; break;
		case "10": format.createFont(10); format.currentFontSize= 10; break;
		case "12": format.createFont(12); format.currentFontSize = 12; break;
		case "14": format.createFont(14); format.currentFontSize = 14; break;
		case "16": format.createFont(16); format.currentFontSize= 16; break;
		case "18": format.createFont(18); format.currentFontSize = 18; break;
		case "20": format.createFont(20); format.currentFontSize = 20; break;
		case "22": format.createFont(22); format.currentFontSize = 22; break;
		
		case "arial": format.setFont(command, format.currentFontSize); break;
		case "comicSansMs": format.setFont(command, format.currentFontSize); break;
		case "timeNewRoman": format.setFont(command, format.currentFontSize); break;
		case "Lucida Console": format.setFont(command, format.currentFontSize); break;
		
		
		}
		
		//FOR THE MODE MENU ITEM.
		switch(command) {
		case "DarkMode": mode.darkMode(); break;
		case "LightMode":  mode.lightMode(); break;
		
		}
		
		
}

	
	
	
public static void main(String[] args) {
		
		GUI g = new GUI();
	}

}
