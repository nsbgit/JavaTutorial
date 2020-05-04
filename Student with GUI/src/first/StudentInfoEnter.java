package first;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class StudentGUIPage1 extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	private JTextField tName,tMath,tPhy,tChem,tTotal,tAvg;
	private JButton bAdd,bDel, bSearch, bShowAll;
	private String sysdate,systime;
	private JRadioButton rmale,rfemale;
	//private JCheckBox cWbchse,cCbse,cIcse;
	
	ArrayList<StudentData> aliststudent = new ArrayList<StudentData>();
	
	public StudentGUIPage1(String title)
	{
		super(title);
		
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(11,2));
		
		
		tName = new JTextField();
		tMath = new JTextField();
		tPhy = new JTextField();
		tChem = new JTextField();
		tTotal = new JTextField();
		tAvg = new JTextField();
		
		
		Font f=new Font("Chiller",Font.BOLD,28);
		Font f1=new Font("comic sans ms",Font.BOLD,16);

		l1=new JLabel("REGISTRATION");
		l1.setFont(f);
		l1.setForeground(Color.RED);
		
		l2=new JLabel("Enter Student Name");
		l2.setFont(f1);
		l2.setForeground(Color.GRAY);
		
		l3=new JLabel("Sex");
		l3.setFont(f1);
		l3.setForeground(Color.GRAY);
		
		l4=new JLabel("Maths");
		l4.setFont(f1);
		l4.setForeground(Color.GRAY);
		
		l5=new JLabel("Physics");
		l5.setFont(f1);
		l5.setForeground(Color.GRAY);
		
		l6=new JLabel("Chemistry");
		l6.setFont(f1);
		l6.setForeground(Color.GRAY);
		
		l7=new JLabel("Current Date");
		l7.setFont(f1);
		l7.setForeground(Color.BLACK);
		
		l8=new JLabel("Current Time");
		l8.setFont(f1);
		l8.setForeground(Color.BLACK);
		
		l11=new JLabel("Total");
		l11.setFont(f1);
		l11.setForeground(Color.blue);
		
		l12=new JLabel("Average");
		l12.setFont(f1);
		l12.setForeground(Color.BLUE);
		
		
		rmale=new JRadioButton("Male");
		//rmale.setSelected(true);
		
		rfemale=new JRadioButton("Female");
		ButtonGroup rgroup=new ButtonGroup(); //multiple we radio button we should create ButtonGrouo , whenever one button selected other will be disabled
		
		rgroup.add(rmale);
		rgroup.add(rfemale);
		JPanel gpanel=new JPanel();
		
		gpanel.add(rmale);
		gpanel.add(rfemale);
		
		
		Calendar cal = Calendar.getInstance();
		
		String cday = "" + cal.get(Calendar.DATE);
		int x =cal.get(Calendar.MONTH);
		String cmonth = "" + (x+1);
		String cyear ="" + cal.get(Calendar.YEAR);
		sysdate = cday + "/" + cmonth + "/" + cyear;
		l9=new JLabel(sysdate);		
		
		
	    String chr = "" + cal.get(Calendar.HOUR_OF_DAY);
		String cmin = "" + cal.get(Calendar.MINUTE);
		String csec ="" + cal.get(Calendar.SECOND);
		systime = chr + ":" + cmin + ":" + csec;
		l10=new JLabel(systime);
		
		JPanel jDate=new JPanel();
		jDate.add(l7);
		jDate.add(l9);
		
		JPanel jTime=new JPanel();
		jTime.add(l8);
		jTime.add(l10);
		
		
		bAdd=new JButton("ADD");
		bAdd.addActionListener(this);
				
		bSearch=new JButton("SEARCH");
		bSearch.addActionListener(this);
				
		bDel=new JButton("DELETE");
		bDel.addActionListener(this);
				
		bShowAll=new JButton("SHOW ALL");
		bShowAll.addActionListener(this);
		
		
		c.add(l1);c.add(jDate);
		c.add(new JLabel(""));c.add(jTime);
		c.add(l2);c.add(tName);
		c.add(l3);c.add(gpanel);
		c.add(l4);c.add(tMath);
		c.add(l5);c.add(tPhy);
		c.add(l6);c.add(tChem);
		c.add(l11);c.add(tTotal);
		c.add(l12);c.add(tAvg);
		c.add(bAdd);c.add(bSearch);
		c.add(bDel);c.add(bShowAll);
		
		
		setSize(500, 350);
		setLocation(200,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		StudentData student;
		int p = -1;
		if(arg0.getSource() == bAdd)
		{
			//JOptionPane.showMessageDialog(this, "ADD BUTTON");
			student = new StudentData();
			student.setStudentName(tName.getText());
			student.setMath(tMath.getText());
			student.setPhy(tPhy.getText());
			student.setBio(tChem.getText());
			
			aliststudent.add(student);
			
			tName.setText("");//to make it blank again/refresh
			tMath.setText("");
			tPhy.setText("");
			tChem.setText("");
		}
		
		
		
		if(arg0.getSource() == bDel)
		{
			//.showMessageDialog(this, "DELETE");
			String sname = tName.getText().trim();
			
			for(int i=0;i<aliststudent.size();i++)
			{
				if(aliststudent.get(i).getStudentName().equals(sname))
				{
					p = i;
					break;
				}
			}
			
			if(p>=0)
			{
				aliststudent.remove(p);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "No Data Found");
			}
			
			
			tName.setText("");
			tMath.setText("");
			tPhy.setText("");
			tChem.setText("");
			
			JOptionPane.showMessageDialog(this, "Succesfully deleted");
		}
		
		
		
		if(arg0.getSource() == bSearch)
		{
			//JOptionPane.showMessageDialog(this, "Search BUTTON");
			String sname = tName.getText().trim();
			
			for(int i=0;i<aliststudent.size();i++)
			{
				if(aliststudent.get(i).getStudentName().equals(sname))
				{
					p = i;
					break;
				}
			}
			
			if(p>=0)
			{
			  tName.setText(aliststudent.get(p).getStudentName());
			  tMath.setText(aliststudent.get(p).getMath());
			  tPhy.setText(aliststudent.get(p).getPhy());
			  tChem.setText(aliststudent.get(p).getBio());
			}
			else
			{
				JOptionPane.showMessageDialog(this, "No Data Found");
			}
		}
		
		
		
		if(arg0.getSource() == bShowAll)
		{
			JOptionPane.showMessageDialog(this, "SHOW ALL");
		}
	}

}


public class StudentInfoEnter
{
	public static void main(String[] args)
	{
		 new StudentGUIPage1("WELCOME...");
	}

}
