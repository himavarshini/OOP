import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;


public class ScoreBoard{
	JFrame f;  
	
	Match m = new Match();
	Batsman b1 = new Batsman();
	Batsman b2 = new Batsman();
	Bowler bow = new Bowler();
	int runs = 0 ;
	int wickets = 0;
	String ta = m.t2.getTeamName().toString();
	  String tb = m.t1.getTeamName().toString();
	ScoreBoard(){  
	    f=new JFrame("ScoreCard");  
	 //   JButton l4=new JButton("Batting*:   " + b1.getPlayerName().toString());;  
	//    JButton l7=new JButton("Batting:  "+b2.getPlayerName().toString());;  
	 //   JButton l6=new JButton("Bowling:  " + bow.getPlayerName().toString());;  
	    JButton l1=new JButton("Date:  " + m.getDate().toString());;  
	    JButton l8=new JButton("Captain-Team1:  " + m.t1.getCaptainName().toString());;  
	  //  JButton l5=new JButton("Score: " + this.runs + " / "+ this.wickets);; 
	    JButton l5=new JButton("Score");
	    l5.addActionListener(new CustomActionListener());
	  JButton l9 = new JButton("Captain-Team2:  " +m.t2.getCaptainName1().toString());;
	  
	    JButton l2 = new JButton("Team-A:  " + ta);;
	    JButton l3 = new JButton("Team-B:  " + tb);;
		f.add(l1);f.add(l2);f.add(l3);//f.add(l4);
		f.add(l5);  
	   // f.add(l6);f.add(l7);
		f.add(l8); f.add(l9);
	    f.setLayout(new GridLayout(2,2));  
	    f.setSize(1000,600);  
	    f.setVisible(true);  
	}
	
	
	class CustomActionListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	        JFrame f1 = new JFrame("Current Score: "+ ta);
	        f1.setSize(500, 500);
	        f1.setVisible(true);
	        JPanel panel = new JPanel();
	        GroupLayout layout = new GroupLayout(f1.getContentPane());
	        f1.getContentPane().setLayout(layout);
	        panel.setLayout(layout);
	       layout.setAutoCreateGaps(true);
	       layout.setAutoCreateContainerGaps(true);
	        JLabel p1 = new JLabel();
	        JLabel p2 = new JLabel();
	        Timer timer = new Timer(1000, this);
	        timer.setRepeats(true);
	        	        JLabel wickets = new JLabel(Integer.toString(bow.getWickets()));
	        JLabel runs = new JLabel(Integer.toString(b1.getRuns()));
	        layout.setHorizontalGroup(
	        		   layout.createSequentialGroup()
	        		   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        		      .addComponent(p1)
	        		      .addGap(50, 50, 50)
	        		      .addComponent(p2)
	        		      .addGap(100, 100, 100)
	        		       .addComponent(runs)
	        		           .addGap(200, 200, 200)
	        		           .addComponent(wickets))
	        		      );
	        layout.setVerticalGroup(
	        		   layout.createSequentialGroup()
	        		      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE) 	
	        		           .addComponent(p1)
	        		          .addComponent(p2)
	        		           .addComponent(runs))
	        		      .addComponent(wickets)	
	      		 );
	        timer.start();
	        for(Overs.overNum=1;Overs.overNum<=20;Overs.overNum++){
	        p1.setText(b1.getPlayerName().toString());
	        p2.setText(b2.getPlayerName().toString());
	        }
	        timer.stop();
	     //  f1.pack();
	       }
	}	
	public static void main(String [] args)
	{
		ScoreBoard s = new ScoreBoard();
	}
}
