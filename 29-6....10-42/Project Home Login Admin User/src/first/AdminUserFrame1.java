package first;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class AdminUserGUI1 extends JFrame implements ActionListener
{
	private JLabel choose;
	private JButton bAdmin, bUser;
	
	public AdminUserGUI1()
	{
		super("WELCOME");
		
		
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		
		Font f=new Font("Chiller",Font.BOLD,27);
		
		
		choose=new JLabel("Choose a type of login");
		choose.setFont(f);
		choose.setForeground(Color.BLUE);
		
		
		
		bAdmin = new JButton("Administrator");
		bAdmin.addActionListener(this);
		
		bUser = new JButton("User");
		bUser.addActionListener(this);
		
		JPanel bGroup = new JPanel();
		bGroup.add(bAdmin);
		bGroup.add(bUser);
		
		
		c.add(choose,BorderLayout.CENTER);
		c.add(bGroup,BorderLayout.SOUTH);
		
		
		setSize(315, 200);
		setLocation(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource() ==  bAdmin)
		{
			//JOptionPane.showMessageDialog(this, "ADMIN BUTTON");
			new AdminLoginGUI1();
			setVisible(false);
		}
		else if(arg0.getSource() == bUser)
		{
			//JOptionPane.showMessageDialog(this, "USER BUTTON");
			new UserLoginGUI1();
			setVisible(false);
		}
		
	}
	
}

public class AdminUserFrame1
{
	public static void main(String[] args)
	{
		new AdminUserGUI1();
	}

}
