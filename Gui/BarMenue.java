import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarMenue extends JFrame implements ActionListener {
	JMenuItem loaditem;
	JMenuItem newitem;
	JMenuItem exititem;
	  BarMenue(){
		 JMenuBar bar = new JMenuBar();
		 
		 JMenu filemenu = new JMenu("File");
		 JMenu editmenu = new JMenu("Edit");
		 JMenu savemenu = new JMenu("Save");
		 
		 newitem = new JMenuItem("New");
		 loaditem = new JMenuItem("Load file..");
		 exititem = new JMenuItem("Exit");
		 
		 filemenu.add(newitem);
		 filemenu.add(loaditem);
		 filemenu.add(exititem);
		 
		 loaditem.addActionListener(this);
		 newitem.addActionListener(this);
		 exititem.addActionListener(this);
		 
		 bar.add(filemenu);
		 bar.add(editmenu);
		 bar.add(savemenu);
		  
		 this.setLayout(new FlowLayout());
		 this.setSize(400,400);
		 this.add(bar);
		 this.setVisible(true);
	  }
	
	 @Override
	 public void actionPerformed(ActionEvent e){
	 if (e.getSource() == loaditem) {
	      new Thread(() -> {
	    ProgressBarExample pb = new ProgressBarExample();
	            }).start();
	        }
	 if(e.getSource()== newitem) {
	   JFileChooser file = new JFileChooser();
	      file.showOpenDialog(null);
		 }
	 if(e.getSource()== exititem) {
		      this.dispose();
		}
	 }
	
	 public static void main(String args[]) {
		new BarMenue();
	}
}