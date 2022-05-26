package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Index extends JFrame {
	private JPanel contentPane;
	private JTextField textPath;
	private JButton btnBuscarCarpeta;
	private JButton btnSubirArchivos;
	
	public Index() {
		setTitle("Uploader");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400,600, 190);
		getContentPane().setLayout(null);
		
		JLabel lblRutaDeLa = new JLabel("Ruta de la carpeta");
		lblRutaDeLa.setBounds(10, 35, 132, 14);
		getContentPane().add(lblRutaDeLa);
		
		textPath = new JTextField();
		textPath.setEditable(false);
		textPath.setBounds(134, 32, 233, 20);
		getContentPane().add(textPath);
		textPath.setColumns(10);
		
		btnBuscarCarpeta = new JButton("Buscar carpeta");
		btnBuscarCarpeta.setBounds(395, 31, 155, 23);
		getContentPane().add(btnBuscarCarpeta);
		
		btnSubirArchivos = new JButton("Subir archivos");
		btnSubirArchivos.setBounds(246, 90, 121, 23);
		getContentPane().add(btnSubirArchivos);
	}

	public JTextField getTextPath(){
		return this.textPath;
	}
	
	public JButton getBuscarButton(){
		return this.btnBuscarCarpeta;
	}
	
	public JButton getSubirButton(){
		return this.btnSubirArchivos;
	}
	
}


