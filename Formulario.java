import javax.swing.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu m;
	JMenuItem mi;
	Formulario()
	{
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		m = new JMenu ("Opciones");
		mb.add(m);
		mi = new JMenuItem("Redimensionar Frame");
		mi.addActionListener(this);
		m.add(mi);
		
	}
	
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource()==mi)
		{
			int ancho =getSize().width;
			int alto = getSize().height;
			DialogoDimension dd = new DialogoDimension(ancho,alto);
			dd.setBounds(0,0,400,300);
			dd.setVisible(true);
			setSize(dd.retornarAncho(), dd.retornarAlto());
			
		}
	}
	public static void main (String[]arguments)
	{
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,800,640);
	    formulario1.setVisible(true);
	}

}
