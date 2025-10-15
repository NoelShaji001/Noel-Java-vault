import javax.swing.*;
import java.awt.*;
public class SwingDemo {
	public static void main(String args[]) {
	JFrame frame=new JFrame("HelloDude");
	frame.setSize(300,150);
	JPanel panel=new JPanel();
 
	panel.setLayout(new GridLayout(3,2,10,10));
	JLabel user= new JLabel("USERNAME");
	JTextField usertxt = new JTextField();
	JLabel psd= new JLabel("PASSWWORD");
	JPasswordField psdtxt= new JPasswordField();
	JButton login= new JButton("LOGIN");
	panel.add(user);
	panel.add(usertxt);
	panel.add(psd);
	panel.add(psdtxt);
	panel.add(login);
	frame.add(panel);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	

}
}
