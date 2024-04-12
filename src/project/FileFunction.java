package project;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileFunction {
	
	GUI gui;
	String fileName;
	String fileAddress;
	
	public FileFunction(GUI gui) {
		
		this.gui = gui;
		
	}
	
	
	public void newFile() {
		
		gui.textArea.setText(null);
		gui.window.setTitle("New File");
		fileName = null;
		fileAddress = null;
		
	}
	
	public void openFile() {
		
		 FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
		 fd.setVisible(true);
		 
		 if(fd.getFile()!=null) {
			 fileName = fd.getFile();
			 fileAddress = fd.getDirectory();
			 gui.window.setTitle(fileName);
			 
		 }
		 
		 //this is for exception handling file not found 
		 try {

			 //this is used for read the file using BufferReader. 
			 
			 BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
			 
			 if(fileName != null) {
				 gui.textArea.setText(null);
			 }
			 
			 String line = null;
			
			 while((line = br.readLine())!=null) {
				 gui.textArea.append(line + "\n");
			 }
			 br.close();
			 
		 }catch(Exception e) {
			 
			 System.out.println(" FILE NOT OPEN ");
			 
			 
		 }
		 
	}
	
	public void saveFile() {
		

		
		if(fileName == null) {
			saveASFile();
		}
		else{
			try {
				FileWriter fw = new FileWriter(fileAddress + fileName);
				String text = gui.textArea.getText();
				fw.write(text);
				gui.window.setTitle(fileName);
				fw.close();
				
			}catch(Exception e) {
				System.out.println("somethis wrong");
			}
			
		}
		
	}
	public void saveASFile() {
		
		FileDialog fd = new FileDialog(gui.window, "open", FileDialog.SAVE);
		fd.setVisible(true);
		
		if(fd.getFile()!=null) {
			
			fileName = fd.getFile();
			fileAddress = fd.getDirectory();
			gui.window.setTitle(fileName);
			
		}
		
		try {
			
			FileWriter fw = new FileWriter(fileAddress + fileName);
			fw.write(gui.textArea.getText());
			fw.close();
			
		}catch(Exception e) {
			System.out.println("somethis wrong");
		}
		
	}
	public void exitFile() {
		
		System.exit(0);
		
	}

}
