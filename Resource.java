import javax.swing.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class Resource extends JFrame implements KeyListener{
	public String keyString;
	static char[]charcters = new char[50];
	private long start;
	private long end;
	private int timeMilliSecs;
	public static String userName;
	public static String[]collectuserTemp = new String[31];
	public static String[]collectDataTemp = new String[31];
	
	JTextArea keystrokeText = new JTextArea(20,20);
	JLabel instruction = new JLabel("Have fun with Our text Editor");
	JButton done = new JButton("Save Note");
	
//set up gui
 Resource() {
	 readCurrentuser();
	JPanel newPanel = new JPanel();
	newPanel.setLayout(new BorderLayout());
	JScrollPane scrollbar = new JScrollPane(keystrokeText);
	keystrokeText.addKeyListener(this);
	
	done.addActionListener(new ActionListener() {
        @Override public void actionPerformed(ActionEvent event) {
        	Score go = new Score(); //usually this would be called using system time--periodic checking
          }
        });


	newPanel.add(instruction, BorderLayout.NORTH);
	newPanel.add(scrollbar, BorderLayout.CENTER);
	newPanel.add(done, BorderLayout.SOUTH);
	
	add(newPanel);
	
	setTitle("Type for fun...");
	setSize(600,800);
	setVisible(true);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 public void keyTyped (KeyEvent e){
	 
 }
 
 public void keyPressed (KeyEvent e){
	 int keyCode = e.getKeyCode();
	 if(keyCode == KeyEvent.VK_A){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	 }
	 if(keyCode == KeyEvent.VK_B){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	 }
	 if(keyCode == KeyEvent.VK_C){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	 }
	 if(keyCode == KeyEvent.VK_D){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	 }
	 if(keyCode == KeyEvent.VK_E){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_F){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_G){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_H){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_I){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_J){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_K){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_L){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_M){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_N){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_O){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_P){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_Q){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_R){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_S){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_T){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);

	 }
	 if(keyCode == KeyEvent.VK_U){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_V){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		
	 }
	 if(keyCode == KeyEvent.VK_W){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_X){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_Y){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 if(keyCode == KeyEvent.VK_Z){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
	
	 }
	 	 
}
  
public void keyReleased (KeyEvent e){
	 int keyCode = e.getKeyCode(); 
	if(keyCode == KeyEvent.VK_A){
		end = System.currentTimeMillis();
		timeMilliSecs =(int) ((int) end - start);
		makeTemplate();
	}
	 if(keyCode == KeyEvent.VK_B){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_C){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_D){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_E){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_F){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_G){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_H){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_I){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_J){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_K){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_L){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_M){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_N){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate(); 
	 }
	 if(keyCode == KeyEvent.VK_O){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_P){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_Q){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_R){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_S){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_T){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_U){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_V){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_W){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_X){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_Y){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 }
	 if(keyCode == KeyEvent.VK_Z){
		 end = System.currentTimeMillis();
		 timeMilliSecs =(int) ((int) end - start);
		 makeTemplate();
	 } 
 }

  public void makeTemplate(){
	File f = new File("tempKeystroke.txt");
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(f, true)))) {
		    out.println(keyString);
		    out.println(timeMilliSecs);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
  }
  
  public void readCurrentuser(){
	  String fileName = "currentUser.txt";
      String line = null;
     
      try {
          FileReader fileReader =  new FileReader(fileName);
          BufferedReader bufferedReader = new BufferedReader(fileReader);
            
          while((line = bufferedReader.readLine()) != null) {           	
          	userName = line;	
          }   
          bufferedReader.close();         
      }
      catch(FileNotFoundException ex) {
          JOptionPane.showInternalMessageDialog(null, "Unable to open file '" + fileName + "'");                
      }
      catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
      
	  }
  
 /*applying algorithm
  * 
  *  
  *  
  *  
  *  
  *  */
  
  public void collectDiagragh(){
	  String fileName = "joseph.txt";
      String line = null;
      
      try {
          FileReader fileReader = 
              new FileReader(fileName);
          BufferedReader bufferedReader = 
              new BufferedReader(fileReader);
              int i=0;
          while((line = bufferedReader.readLine()) != null) {           	
        	  collectuserTemp[i]=line;
          	i++;
          }   
          bufferedReader.close();         
      }
      catch(FileNotFoundException ex) {
    	  JOptionPane.showMessageDialog(null,
              "Unable to open file '" + 
              fileName + "'");                
      }
      catch(IOException ex) {
    	  JOptionPane.showMessageDialog(null,
              "Error reading file '" 
              + fileName + "'");                  
      }
      
      String fileName1 = "tempKeystroke.txt";
      String line1 = null;
      
      try {
          FileReader fileReader = 
              new FileReader(fileName1);
          BufferedReader bufferedReader = 
              new BufferedReader(fileReader);
              int i=0;
          while((line1 = bufferedReader.readLine()) != null) {           	
        	  collectDataTemp[i]=line1;
          	i++;
          }   
          bufferedReader.close();         
      }
      catch(FileNotFoundException ex) {
    	  JOptionPane.showMessageDialog(null,
              "Unable to open file '" + 
              fileName1 + "'");                
      }
      catch(IOException ex) {
    	  JOptionPane.showMessageDialog(null,
              "Error reading file '" 
              + fileName1 + "'");                  
      }  
  }
}