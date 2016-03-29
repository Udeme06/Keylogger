import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.io.IOException;

public class Signup extends JFrame{	
	public static String userName;
	
	JTextField text = new JTextField(20);
	JLabel instruction = new JLabel("Please enter your Username to signup");
	JButton buttonTotemp = new JButton("Sign up");
	JButton buttonTologin = new JButton("Go to Login");
	JLabel instruction2 = new JLabel("<html><font color = 'red'>Please hit Enter after you type in your username</font><br>"
			+ "If you already have a Username, Click Signup.<html>");
	
	Signup(){  
	    JPanel newPanel = new JPanel(new GridBagLayout());
	    
	    buttonTotemp.addActionListener(new ActionListener() {
	        @Override public void actionPerformed(ActionEvent event) {
	        	signUp(userName);
	        	currentUser(userName);
	        	Gui go = new Gui();
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
	    
	    buttonTologin.addActionListener(new ActionListener() {
	        @Override public void actionPerformed(ActionEvent event) {
	            Login go = new Login();
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
		newPanel.add(text, constraints);
		
		constraints.gridx = 0;
	    constraints.gridy = 2;
		newPanel.add(instruction2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		newPanel.add(buttonTotemp, constraints);
		
		constraints.gridx = 1;
	    constraints.gridy = 3;
		newPanel.add(buttonTologin, constraints);
		
		add(newPanel);
		pack();
		setVisible(true);
		setTitle("Signup");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[]args){
       Signup newUser = new Signup();
  
	}
	
	public void createUser(String name){
	   try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name+".txt"), "utf-8"))){
		   writer.write(name);
		   ((BufferedWriter) writer).newLine();
		   writer.close();  
	   }
	   catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
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
	
	public void signUp(String name){
		File varTmpDir = new File(name+".txt");
		boolean exists = varTmpDir.exists();
        	if((name == "") || (exists == true)){
        		JOptionPane.showMessageDialog(null, "No Username input or User profile already exists");
            	System.exit(0);	
        		
            }
        	else{createUser(name);}
	}
}