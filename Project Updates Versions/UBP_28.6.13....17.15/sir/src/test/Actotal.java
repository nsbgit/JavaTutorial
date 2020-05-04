package test;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener; //to sense mouse click
import java.awt.event.ActionEvent; 
import java.io.Serializable;
import java.util.Calendar;

import javax.swing.*;
public class Actotal extends JFrame implements Serializable
{
	private int total;
	private int account;
	private int depo;
	private int withdraw1;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getDepo() {
		return depo;
	}
	public void setDepo(int depo) {
		this.depo = depo;
	}
	public int getWithdraw1() {
		return withdraw1;
	}
	public void setWithdraw1(int withdraw1) {
		this.withdraw1 = withdraw1;
	}
	
}
