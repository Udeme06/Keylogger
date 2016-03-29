import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.io.IOException;

public class Login extends JFrame{	
	public static String userName;
	
	JTextField text = new JTextField(20);
	JLabel instruction = new JLabel("Please enter your Username to login");
	JButton buttonTosignup = new JButton("Go to Signup");
	JButton buttonTologin = new JButton("login");
	JLabel instruction2 = new JLabel("<html><font color = 'red'>Please hit Enter after you type in your username</font><br>"
			+ "If you already have a Username, Click login.<html>");
	
	Login(){  
	    JPanel newPanel = new JPanel(new GridBagLayout());
	    
	    buttonTologin.addActionListener(new ActionListener() {
	        @Override public void actionPerformed(ActionEvent event) {
	        	login(userName);
	        	createUser(userName);
	        	currentUser(userName);
	   
	        	Resource go = new Resource();
	        	setVisible(false);
	          }
	        });
	    
	    buttonTosignup.addActionListener(new ActionListener() {
	        @Override public void actionPerformed(ActionEvent event) {
	        	
	        	Signup go = new Signup();
	        	setVisible(false);
	          }
	        });
	    
	    text.addActionListener(new ActionListener() {
	        @Override public void actionPerformed(ActionEvent event) {
	            String input = "";
	            input = String.format("%s", event.getActionCommand());
	            userName = input;
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
		newPanel.add(text, constraints);
		
		constraints.gridx = 0;
	    constraints.gridy = 2;
		newPanel.add(instruction2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		newPanel.add(buttonTosignup, constraints);
		
		constraints.gridx = 1;
	    constraints.gridy = 3;
		newPanel.add(buttonTologin, constraints);
		
		add(newPanel);
		pack();
		setVisible(true);
		setTitle("Login");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[]args){
       Login User = new Login();
    
	}
	
	public void createUser(String name){		
	   try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tempKeystroke.txt"), "utf-8"))){
		   writer.write(name);
		   ((BufferedWriter) writer).newLine();
		   writer.close();  
	   }
	   catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	}
	
	public void currentUser(String name){
		   try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("currentUser.txt"), "utf-8"))){
			   writer.write(name);
			   writer.close();  
		   }
		   catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
		}
	
	public void login(String name){
		File varTmpDir = new File(name+".txt");
		boolean exists = varTmpDir.exists();
        	if((name != "") && (exists == true)){
            	createUser(name);
            }
        	else{
        		JOptionPane.showMessageDialog(null, "No Username profile matches your description");
            	System.exit(0);	
        	}
	}
}