package first;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.event.ActionListener;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.Box;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;

public class ImageTutorial extends JFrame
{
	private ImageIcon image1,image2;
	private JLabel labe11,label2;
	
	public ImageTutorial()
	{
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.MAGENTA);
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		Choice choice = new Choice();
		choice.setBounds(297, 111, 127, 20);
		desktopPane.add(choice);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(297, 143, 127, 22);
		desktopPane.add(splitPane);
		
		Checkbox checkbox = new Checkbox("New check box");
		splitPane.setLeftComponent(checkbox);
		checkbox.setBackground(new Color(0, 128, 0));
		desktopPane.setLayer(checkbox, 5);
		
		Button button = new Button("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
			}
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
			}
		});
		button.setActionCommand("Submit");
		button.setBounds(297, 229, 127, 22);
		desktopPane.add(button);
		setLayout(new FlowLayout());
		
		image1= new ImageIcon(getClass().getResource("D:\WORK & OTHER\Works\Sukanta Sharma\Dropbox\Java Program on Dropbox\Image Inserting Demo 1\pic1.jpg"));
		
		labe11 = new JLabel(image1);
		add(labe11);
		
		image2= new ImageIcon(getClass().getResource("D:\WORK & OTHER\Works\Sukanta Sharma\Dropbox\Java Program on Dropbox\Image Inserting Demo 1\pic2.jpg"));
		
		label2 = new JLabel(image2);
		add(labe11);
	}
	
	public static void main(String[] args)
	{
		ImageTutorial gui = new ImageTutorial();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
	}
}
