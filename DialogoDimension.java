import javax.swing.*;
import java.awt.event.*;
public class DialogoDimension extends JDialog implements ActionListener {
	JLabel label1, label2;
	JTextField tf1, tf2;
	JButton boton1;

	DialogoDimension(int ancho,int alto)
	{
		setResizable(false);
		setModal(true);
		setLayout(null);
		
		label1 = new JLabel("Ancho");
		label1.setBounds(24,40,91,20);
		label2 = new JLabel ("Alto");
		label2.setBounds(24,80,91,20);
		tf1= new JTextField(String.valueOf(ancho));
		tf1.setBounds(136,40,90,25);
		tf2 = new JTextField(String.valueOf(alto));
		tf2.setBounds(136,80,90,25);
		boton1 = new JButton("Confirmar");
		boton1.setBounds(136,120,88,24);
		boton1.addActionListener(this);
		add(label1);
		add(label2);
		add(tf1);
		add(tf2);
		add(boton1);	
				
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == boton1)
		
			dispose();
		}
	
		int retornarAncho()
		{
			int ancho = Integer.parseInt(tf1.getText());
			return ancho;
		}
		
		int retornarAlto()
		{
			int alto = Integer.parseInt(tf2.getText());
			return alto;
		}
	}


