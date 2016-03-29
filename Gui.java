import javax.swing.*;
import java.io.IOException;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class Gui extends JFrame implements KeyListener{
	public String keyString;
	static char[]charcters = new char[50];
	private long start;
	private long end;
	private int timeMilliSecs;
	public static String userName;
	
	JTextField keystrokeText = new JTextField(20);
	JLabel trackKey = new JLabel("Track");
	JLabel instruction = new JLabel("<HTML>Type in the following words carefully:<br><br>This is a"
			+ " simple paragraph that is meant to be nice <br>and easy to type which is why there "
			+ "will be commas no periods <br>or any capital letters so i guess this means "
			+ "that it cannot really <br>be considered a paragraph but just a series of"
			+ " run on sentences this<br> should help you get faster at typing as im trying"
			+ " not to use <br>too many difficult words in it</HTML>");
	JButton done = new JButton("Continue");
	

//set up gui
 Gui() {
	 readCurrentuser();
	JPanel newPanel = new JPanel(new GridBagLayout());
	keystrokeText.addKeyListener(this);
	
	done.addActionListener(new ActionListener() {
        @Override public void actionPerformed(ActionEvent event) {
        	Resource go = new Resource();
        	setVisible(false);
          }
        });

	GridBagConstraints constraints = new GridBagConstraints();
    constraints.anchor = GridBagConstraints.WEST;
    constraints.insets = new Insets(10, 10, 10, 10);
	
	constraints.gridx = 0;
    constraints.gridy = 0;
	newPanel.add(instruction, constraints);
	
	constraints.gridx = 0;
	constraints.gridy = 1;
	newPanel.add(keystrokeText, constraints);
	
	constraints.gridx = 0;
    constraints.gridy = 2;
	newPanel.add(trackKey, constraints);
	
	constraints.gridx = 0;
    constraints.gridy = 3;
	newPanel.add(done, constraints);
	
	add(newPanel);
	pack();
	setVisible(true);
	setTitle("Create User Template");
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
		 trackKey.setText(keyString); 
	 }
	 if(keyCode == KeyEvent.VK_B){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_C){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_D){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_E){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_F){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_G){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_H){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_I){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_J){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_K){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_L){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_M){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);	
	 }
	 if(keyCode == KeyEvent.VK_N){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_O){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_P){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_Q){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_R){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_S){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_T){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_U){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_V){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_W){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_X){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_Y){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
	 }
	 if(keyCode == KeyEvent.VK_Z){
		 start = System.currentTimeMillis();
		 keyString = KeyEvent.getKeyText(keyCode);
		 trackKey.setText(keyString);
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
	File f = new File(userName+".txt");
	if(f.exists() && !f.isDirectory()) { 
	    // do something
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(f, true)))) {
		    out.println(keyString);
		    out.println(timeMilliSecs);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
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
}