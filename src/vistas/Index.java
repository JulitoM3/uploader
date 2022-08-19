package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Label;
import javax.swing.JSeparator;

public class Index extends JFrame {
	private JPanel contentPane;
	
	/**
	 * CompraNet
	 * *********/
	private JTextField textPathCompraNet;
	private JButton btnUploadCompraNet;
	private JButton btnBuscarCompraNet;
	
	/*
	 * Portal de Control de Abasto
	 * ****************************/
		
		/*
		 * Articulos del contrato
		 * **/
		private JTextField textPathArticulos;
		private JButton btnUploadArticulos;
		private JButton btnBuscarArticulos;
		
		/*
		 * Ordenes de Reposicion
		 * *********************/
		private JTextField textPathOrdenes;
		private JButton btnUploadOrdenes;
		private JButton buttonBuscarOrdenes;
		
		/*
		 * Altas (Entregas)
		 * *****************/
		private JTextField textPathAltas;
		private JButton btnUploadAltas;
		private JButton buttonBuscarAltas;
		
		/*
		 * Altas SAI - PREI (Entregas con comprobante pago)
		 * *************************************************/
		
		private JTextField textPathSaiPrei;
		private JButton btnUploadSaiPrei;
		private JButton buttonBuscarSaiPrei;
		
	/*
	 * Portal de Control de Abasto
	 * ****************************/
	
		/*
		 * Pagos
		 * *****/
		
		private JTextField textPathPagos;
		private JButton btnUploadPagos;
		private JButton buttonBuscarPagos;
		
		/*
		 * Notas de crédito
		 * *****************/
		private JTextField textPathNotas;
		private JButton btnUploadNotas;
		private JButton buttonBuscarNotas;
		
		
	public Index() {
		setResizable(false);
		setTitle("Enlace de Sistemas Institucionales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400,604, 436);
		getContentPane().setLayout(null);
		
		JLabel lblRutaDeLa = new JLabel("CompraNet:");
		lblRutaDeLa.setBounds(21, 62, 132, 20);
		getContentPane().add(lblRutaDeLa);
		
		textPathCompraNet = new JTextField();
		textPathCompraNet.setEditable(false);
		textPathCompraNet.setBounds(192, 62, 193, 20);
		getContentPane().add(textPathCompraNet);
		textPathCompraNet.setColumns(10);
		
		btnUploadCompraNet = new JButton("Subir");
		btnUploadCompraNet.setBounds(490, 62, 78, 21);
		getContentPane().add(btnUploadCompraNet);
		
		JLabel labelArticulos = new JLabel("Articulos del Contrato");
		labelArticulos.setBounds(21, 143, 161, 20);
		getContentPane().add(labelArticulos);
		
		textPathArticulos = new JTextField();
		textPathArticulos.setEditable(false);
		textPathArticulos.setBounds(192, 143, 193, 20);
		getContentPane().add(textPathArticulos);
		textPathArticulos.setColumns(10);
		
		btnUploadArticulos = new JButton("Subir");
		btnUploadArticulos.setBounds(490, 142, 78, 23);
		getContentPane().add(btnUploadArticulos);
		
		JLabel lblOrdenesReposicion = new JLabel("Ordenes de Reposici\u00F3n");
		lblOrdenesReposicion.setBounds(21, 174, 161, 23);
		getContentPane().add(lblOrdenesReposicion);
		
		btnUploadOrdenes = new JButton("Subir");
		btnUploadOrdenes.setBounds(490, 174, 78, 23);
		getContentPane().add(btnUploadOrdenes);
		
		textPathOrdenes = new JTextField();
		textPathOrdenes.setEditable(false);
		textPathOrdenes.setBounds(192, 175, 193, 22);
		getContentPane().add(textPathOrdenes);
		textPathOrdenes.setColumns(10);
		
		JLabel lblArchivoAltas = new JLabel("Altas");
		lblArchivoAltas.setBounds(21, 208, 104, 23);
		getContentPane().add(lblArchivoAltas);
		
		textPathAltas = new JTextField();
		textPathAltas.setEditable(false);
		textPathAltas.setBounds(192, 208, 193, 20);
		getContentPane().add(textPathAltas);
		textPathAltas.setColumns(10);
		
		btnUploadAltas = new JButton("Subir");
		btnUploadAltas.setBounds(490, 208, 78, 23);
		getContentPane().add(btnUploadAltas);
		
		JLabel lblArchivoAltasSai = new JLabel("Altas SAI - PREI");
		lblArchivoAltasSai.setBounds(21, 242, 161, 20);
		getContentPane().add(lblArchivoAltasSai);
		
		textPathSaiPrei = new JTextField();
		textPathSaiPrei.setEditable(false);
		textPathSaiPrei.setBounds(192, 242, 193, 20);
		getContentPane().add(textPathSaiPrei);
		textPathSaiPrei.setColumns(10);
		
		btnUploadSaiPrei = new JButton("Subir");
		btnUploadSaiPrei.setBounds(490, 241, 78, 23);
		getContentPane().add(btnUploadSaiPrei);
		
		textPathPagos = new JTextField();
		textPathPagos.setEditable(false);
		textPathPagos.setBounds(192, 319, 193, 20);
		getContentPane().add(textPathPagos);
		textPathPagos.setColumns(10);
		
		btnUploadPagos = new JButton("Subir");
		btnUploadPagos.setBounds(490, 318, 78, 23);
		getContentPane().add(btnUploadPagos);
		
		textPathNotas = new JTextField();
		textPathNotas.setEditable(false);
		textPathNotas.setBounds(192, 363, 193, 20);
		getContentPane().add(textPathNotas);
		textPathNotas.setColumns(10);
		
		btnUploadNotas = new JButton("Subir");
		btnUploadNotas.setBounds(490, 362, 78, 23);
		getContentPane().add(btnUploadNotas);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 117, 155, 20);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(374, 117, 204, 20);
		getContentPane().add(separator_1);
		
		Label label = new Label("Archivos Portal de Control de Abasto");
		label.setAlignment(Label.CENTER);
		label.setBounds(171, 100, 204, 22);
		getContentPane().add(label);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 27, 155, 20);
		getContentPane().add(separator_2);
		
		Label label_1 = new Label("Archivos Portal de CompraNet");
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(171, 10, 204, 22);
		getContentPane().add(label_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(374, 27, 204, 20);
		getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 302, 155, 20);
		getContentPane().add(separator_4);
		
		Label label_2 = new Label("Archivos PREI MILLENIUM");
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(171, 285, 204, 22);
		getContentPane().add(label_2);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(374, 302, 204, 20);
		getContentPane().add(separator_5);
		
		JLabel lblArchivoPagos = new JLabel("Pagos");
		lblArchivoPagos.setBounds(21, 319, 145, 20);
		getContentPane().add(lblArchivoPagos);
		
		JLabel lblArchivoNotasDe = new JLabel("Notas de cr\u00E9dito");
		lblArchivoNotasDe.setBounds(21, 363, 155, 20);
		getContentPane().add(lblArchivoNotasDe);
		
		btnBuscarCompraNet = new JButton("Buscar");
		btnBuscarCompraNet.setBounds(395, 61, 78, 23);
		getContentPane().add(btnBuscarCompraNet);
		
		btnBuscarArticulos = new JButton("Buscar");
		btnBuscarArticulos.setBounds(395, 142, 78, 23);
		getContentPane().add(btnBuscarArticulos);
		
		buttonBuscarOrdenes = new JButton("Buscar");
		buttonBuscarOrdenes.setBounds(395, 174, 78, 23);
		getContentPane().add(buttonBuscarOrdenes);
		
		buttonBuscarAltas = new JButton("Buscar");
		buttonBuscarAltas.setBounds(395, 208, 78, 23);
		getContentPane().add(buttonBuscarAltas);
		
		buttonBuscarSaiPrei = new JButton("Buscar");
		buttonBuscarSaiPrei.setBounds(395, 241, 78, 23);
		getContentPane().add(buttonBuscarSaiPrei);
		
		buttonBuscarPagos = new JButton("Buscar");
		buttonBuscarPagos.setBounds(395, 318, 78, 23);
		getContentPane().add(buttonBuscarPagos);
		
		buttonBuscarNotas = new JButton("Buscar");
		buttonBuscarNotas.setBounds(395, 362, 78, 23);
		getContentPane().add(buttonBuscarNotas);
	}

	public JTextField getTextPathCompraNet(){
		return this.textPathCompraNet;
	}

	public JTextField getTextPathArticulos(){
		return this.textPathArticulos;
	}
	
	public JTextField getTextPathOrdenes(){
		return this.textPathOrdenes;
	}
	
	public JTextField getTextPathAltas(){
		return this.textPathAltas;
	}
	
	public JTextField getTextPathAltasPreiSai(){
		return this.textPathSaiPrei;
	}
	
	public JTextField getTextPathPagos(){
		return this.textPathPagos;
	}
	
	public JTextField getTextPathNotas(){
		return this.textPathPagos;
	}

	/**
	 * @return the btnBuscarCompraNet
	 */
	public JButton getBtnBuscarCompraNet() {
		return this.btnBuscarCompraNet;
	}

	/**
	 * @param btnBuscarCompraNet the btnBuscarCompraNet to set
	 */
	public void setBtnBuscarCompraNet(JButton btnBuscarCompraNet) {
		this.btnBuscarCompraNet = btnBuscarCompraNet;
	}
	
	/**
	 * @return the btnUploadCompraNet
	 */
	public JButton getBtnUploadCompraNet() {
		return btnUploadCompraNet;
	}

	/**
	 * @param btnUploadCompraNet the btnUploadCompraNet to set
	 */
	public void setBtnUploadCompraNet(JButton btnBuscarCompraNet) {
		this.btnBuscarCompraNet = btnUploadCompraNet;
	}

	/**
	 * @return the btnUploadArticulos
	 */
	public JButton getBtnUploadArticulos() {
		return btnUploadArticulos;
	}

	/**
	 * @param btnUploadArticulos the btnUploadArticulos to set
	 */
	public void setBtnUploadArticulos(JButton btnUploadArticulos) {
		this.btnUploadArticulos = btnUploadArticulos;
	}

	/**
	 * @return the btnBuscarArticulos
	 */
	public JButton getBtnBuscarArticulos() {
		return btnBuscarArticulos;
	}

	/**
	 * @param btnBuscarArticulos the btnBuscarArticulos to set
	 */
	public void setBtnBuscarArticulos(JButton btnBuscarArticulos) {
		this.btnBuscarArticulos = btnBuscarArticulos;
	}

	/**
	 * @return the btnUploadOrdenes
	 */
	public JButton getBtnUploadOrdenes() {
		return btnUploadOrdenes;
	}

	/**
	 * @param btnUploadOrdenes the btnUploadOrdenes to set
	 */
	public void setBtnUploadOrdenes(JButton btnUploadOrdenes) {
		this.btnUploadOrdenes = btnUploadOrdenes;
	}

	/**
	 * @return the btnBuscarOrdenes
	 */
	public JButton getBtnBuscarOrdenes() {
		return buttonBuscarOrdenes;
	}

	/**
	 * @param btnBuscarOrdenes the btnBuscarOrdenes to set
	 */
	public void setBtnBuscarOrdenes(JButton btnBuscarOrdenes) {
		this.buttonBuscarOrdenes = btnBuscarOrdenes;
	}

	/**
	 * @return the btnUploadAltas
	 */
	public JButton getBtnUploadAltas() {
		return btnUploadAltas;
	}

	/**
	 * @param btnUploadAltas the btnUploadAltas to set
	 */
	public void setBtnUploadAltas(JButton btnUploadAltas) {
		this.btnUploadAltas = btnUploadAltas;
	}

	/**
	 * @return the btnBuscarAltas
	 */
	public JButton getBtnBuscarAltas() {
		return buttonBuscarAltas;
	}

	/**
	 * @param btnBuscarAltas the btnBuscarAltas to set
	 */
	public void setBtnBuscarAltas(JButton btnBuscarAltas) {
		this.buttonBuscarAltas = btnBuscarAltas;
	}

	/**
	 * @return the btnUploadSaiPrei
	 */
	public JButton getBtnUploadSaiPrei() {
		return btnUploadSaiPrei;
	}

	/**
	 * @param btnUploadSaiPrei the btnUploadSaiPrei to set
	 */
	public void setBtnUploadSaiPrei(JButton btnUploadSaiPrei) {
		this.btnUploadSaiPrei = btnUploadSaiPrei;
	}

	/**
	 * @return the btnBuscarSaiPrei
	 */
	public JButton getBtnBuscarSaiPrei() {
		return buttonBuscarSaiPrei;
	}

	/**
	 * @param btnBuscarSaiPrei the btnBuscarSaiPrei to set
	 */
	public void setBtnBuscarSaiPrei(JButton btnBuscarSaiPrei) {
		this.buttonBuscarSaiPrei = btnBuscarSaiPrei;
	}

	/**
	 * @return the btnUploadPagos
	 */
	public JButton getBtnUploadPagos() {
		return btnUploadPagos;
	}

	/**
	 * @param btnUploadPagos the btnUploadPagos to set
	 */
	public void setBtnUploadPagos(JButton btnUploadPagos) {
		this.btnUploadPagos = btnUploadPagos;
	}

	/**
	 * @return the btnBuscarPagos
	 */
	public JButton getBtnBuscarPagos() {
		return buttonBuscarPagos;
	}

	/**
	 * @param btnBuscarPagos the btnBuscarPagos to set
	 */
	public void setBtnBuscarPagos(JButton btnBuscarPagos) {
		this.buttonBuscarPagos = btnBuscarPagos;
	}

	/**
	 * @return the btnUploadNotas
	 */
	public JButton getBtnUploadNotas() {
		return btnUploadNotas;
	}

	/**
	 * @param btnUploadNotas the btnUploadNotas to set
	 */
	public void setBtnUploadNotas(JButton btnUploadNotas) {
		this.btnUploadNotas = btnUploadNotas;
	}

	/**
	 * @return the btnBuscarNotas
	 */
	public JButton getBtnBuscarNotas() {
		return buttonBuscarNotas;
	}

	/**
	 * @param btnBuscarNotas the btnBuscarNotas to set
	 */
	public void setBtnBuscarNotas(JButton btnBuscarNotas) {
		this.buttonBuscarNotas = btnBuscarNotas;
	}
	

}


