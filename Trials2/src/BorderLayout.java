import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayout extends JFrame{
	
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	
	
	BorderLayout(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
        this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.black);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.green);
		
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.EAST);
		this.add(panel3, BorderLayout.WEST);
		this.add(panel4, BorderLayout.SOUTH);
		this.add(panel5, BorderLayout.CENTER);
		
	}
	

}
