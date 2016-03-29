import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Keyrecord{
	private String stringInput;
	private String userName;
	
	
	Keyrecord(){
		userName = JOptionPane.showInputDialog("Please enter your User Name.\n");
	       signUp(userName);
	       System.exit(0);
	}
	
	public static void main(String[]args){
       Keyrecord mo = new Keyrecord();
	}

	public void createUser(String name)throws IOException{
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name+".txt"), "utf-8"));
	   writer.write(name);
	   writer.close();
	}
	
	public void signUp(String name){
		try{
        	if(name == ""){
            	System.exit(0);
            }
        createUser(name);
        }catch(IOException e){}
	}
}