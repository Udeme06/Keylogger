import javax.swing.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;
import java.util.stream.IntStream;

public class Score extends JFrame{
	public static String[]collectuserTemp = new String[32];
	public static String[]collectDataTemp = new String[32];
	public static String[]userString  = new String[16];
	public static int[]userStringValue  = new int[16];
	public static String[]tempString  = new String[16];
	public static int[]tempStringValue  = new int[16];
	public static String[]userDigraph = new String[15];
	public static String[]tempDigraph  = new String[15];
	public static int[]userDigraphValue = new int[15];
	public static int[]tempDigraphValue  = new int[15];
	public static String[]moduserDigraph = new String[15];
	public static String[]modtempDigraph = new String[15];
	public static int[]moduserDigraphValue = new int[15];
	public static int[]modtempDigraphValue  = new int[15];
	static double score;
	public static String userName;
	static int index;
	
	JLabel result = new JLabel("");
	JLabel scoreNo = new JLabel("");
	JButton ok = new JButton("Ok");
	
	public void sortData(){
		//sort user characters
		int i = 0;
		int j = 1;
		while(i<=14){
			userString[i] = collectuserTemp[j];
			++i;
			j = j+2;
		}	
		//sort user characters values
		int x = 0;
		int y = 2;
		while(x<=14){
			userStringValue[x] = Integer.parseInt(collectuserTemp[y]);
			++x;
			y = y+2;
		}
		//sort temp characters
		int a = 0;
		int b = 1;
		while(a<=14){
			tempString[a] =collectDataTemp[b];
			++a;
			b = b+2;
		}	
		//sort temp values
		int c = 0;
		int d = 2;
		while(c<=14){
			tempStringValue[c] = Integer.parseInt(collectDataTemp[d]);
			++c;
			d = d+2;
		}	
	}
	
	public void diagraghUser(){	
		for(int i=0;i<userDigraph.length-1;i++){
		userDigraph[i] = userString[i]+userString[i+1];
		}
		for(int i=0;i<tempDigraph.length-1;i++){
			tempDigraph[i] = tempString [i]+tempString[i+1];
			}
	}
	
	public void digraphUserValue(){
		for(int i=0;i<userDigraphValue.length-1;i++){
			if((userStringValue[i]) < (userStringValue[i+1])){
				userDigraphValue[i] = userStringValue[i+1] - userStringValue[i];
			}
			else{
			   userDigraphValue[i] = userStringValue[i] - userStringValue[i+1];
			}
		}
			
			for(int i=0;i<tempDigraphValue.length-1;i++){
			    if((tempStringValue[i]) < (tempStringValue[i+1])){
			    	tempDigraphValue[i] = tempStringValue[i+1] - tempStringValue[i];
			    }
				else{
				tempDigraphValue[i] = tempStringValue[i] - tempStringValue[i+1];
				}
			}
	}
	
	public void searchCommon(){
		//for common values in user template at temp keystroke
		for(int i=0;i<moduserDigraph.length-1;i++){
			
			for(int j=0;j<moduserDigraph.length-1;j++){
				if(userDigraph[i].equals(tempDigraph[j])){
					moduserDigraph[i] = userDigraph[i];
				}
			}
		}
		//sort user values
		for(int i = 0;i<moduserDigraph.length-1;i++){
		if(moduserDigraph[i]!= null){
	
			moduserDigraphValue[i] = userDigraphValue[i];
		}
		else{ 
			moduserDigraphValue[i] = 0;
		}
		}
		
		//for common values in temp
        for(int i=0;i<modtempDigraph.length-1;i++){
			
			for(int j=0;j<modtempDigraph.length-1;j++){
				if(tempDigraph[i].equals(userDigraph[j])){
					modtempDigraph[i] = tempDigraph[i];
				}
		    }
	     }
        for(int i = 0;i<moduserDigraph.length-1;i++){
    		if(modtempDigraph[i]!= null){
    	
    			modtempDigraphValue[i] = tempDigraphValue[i];
    		}
    		else{ 
    			moduserDigraphValue[i] = 0;
    		}
    		}
        for(int i = 0;i<moduserDigraph.length-1;i++){
    		if(modtempDigraphValue[i]== 0){
    	
    			modtempDigraph[i] = null;
    		}
    	  }
        for(int i = 0;i<moduserDigraph.length-1;i++){
    		if(moduserDigraphValue[i]== 0){
    	
    			moduserDigraph[i] = null;
    		}
    	  }      
	}
	
	private class BoostString {
	    int boost;
	    String str;

	    public BoostString(int boost, String str) {
	        this.boost = boost;
	        this.str = str;
	    }
	}
	
	
	
	public void sortAsc(){
		final String[] sorted = IntStream.range(0, moduserDigraphValue.length)
		        .mapToObj(i -> new BoostString(moduserDigraphValue[i], moduserDigraph[i])) // Create the instance
		        .sorted(Comparator.comparingInt(b -> b.boost))         // Sort using a Comparator
		        .map(b -> b.str)                                       // Map it back to a string
		        .toArray(String[]::new);
		
		final String[] sorted2 = IntStream.range(0, modtempDigraphValue.length)
		        .mapToObj(i -> new BoostString(modtempDigraphValue[i], modtempDigraph[i])) // Create the instance
		        .sorted(Comparator.comparingInt(b -> b.boost))         // Sort using a Comparator
		        .map(b -> b.str)                                       // Map it back to a string
		        .toArray(String[]::new);
	
		int total=0;
		int count=0;
		for(int i = 0; i<sorted.length-1;i++){
    		for(int j = 0; j<sorted2.length-1; j++){
    			if((sorted[i] != null)&&(sorted2[j] != null)){
    				if(sorted[i].equals(sorted2[j])){
    				++count;
    				total += Math.abs(i-j);
    				}
    			}
    		}
    	  }
		  
		if(count%2==0){
			score = (double)total/((count*count)/2);
			score = format(score);
		}
		else{
			score = (double)total/(((count*count)-1)/2);
			score = format(score);
		}
		scoreNo.setText(String.valueOf(score));		
		if(score<0.54){
			result.setText("You are the correct user");	
			index = 0;
		}
		else{
			result.setText("You are not the correct user");
			index = -1;
		}
	}
	
	public double format(double value){
        //Function adjust values to 4 decimal places
		double factor = 1e3;
		double result = Math.round(value*factor)/factor;
		return result;
	}
	
	 public void collectDiagragh(){
		  String fileName = userName+".txt";
	      String line = null;
	      
	      try {
	          FileReader fileReader = 
	              new FileReader(fileName);
	          BufferedReader bufferedReader = 
	              new BufferedReader(fileReader);
	              int i=0;
	          while((line = bufferedReader.readLine()) != null) {           	
	        	  collectuserTemp[i]=line;
	        	  if(i==31){
	        		  break;
	        	  }
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
	        	  if(i==31){
	        		  break;
	        	  }
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

	  Score(){
		  readCurrentuser();
			collectDiagragh();
			sortData();
			diagraghUser();
			digraphUserValue();
			searchCommon();
			sortAsc();
		 JPanel newPanel = new JPanel();
			newPanel.setLayout(new BorderLayout());
			
		    ok.addActionListener(new ActionListener() {
		        @Override public void actionPerformed(ActionEvent event) {
		         if(index == -1){
		        	//setVisible(false);
		        	System.exit(0);	
		        	try{
		        		 FileWriter fwOb = new FileWriter("tempKeystroke.txt", false); 
		        	        PrintWriter pwOb = new PrintWriter(fwOb, false);
		        	        pwOb.flush();
		        	        pwOb.close();
		        	        fwOb.close();
		    		}catch (IOException e) {
		    		    //exception handling left as an exercise for the reader
		    		}
		         }
		         else{
		        	 try{
		        		 FileWriter fwOb = new FileWriter("tempKeystroke.txt", false); 
		        	        PrintWriter pwOb = new PrintWriter(fwOb, false);
		        	        pwOb.flush();
		        	        pwOb.close();
		        	        fwOb.close();
		    		}catch (IOException e) {
		    		    //exception handling left as an exercise for the reader
		    		}
		        	 setVisible(false);
		        	 Resource go = new Resource();
		            }
		          }
		        });
		   			
			newPanel.add(result, BorderLayout.NORTH);
			newPanel.add(scoreNo, BorderLayout.CENTER);
			newPanel.add(ok, BorderLayout.SOUTH);
	
			add(newPanel);
			setTitle("Score");
			setSize(200,200);
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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