package app;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import vistas.Index;
import modelos.Compranet;
import modelos.ClaveContrato;
import modelos.OrdenReposicion;
import modelos.Procedimiento;
import modelos.Conexion;

/**
 *
 * @author JULIO
 */

public class App {

	private Index index;
	private Compranet compranet;
	private ClaveContrato claveContrato;
	private OrdenReposicion ordenReposcion;
	private Procedimiento procedimiento;
	private Connection conn = new Conexion().getConnection();
	private String path = "";

	public App(/*
				 * Index index, Compranet compranet, ClaveContrato
				 * claveContrato, OrdenReposicion ordenReposicion, Procedimiento
				 * procedimiento
				 */) throws SQLException {
		this.index = new Index();
		this.compranet = new Compranet();
		this.claveContrato = new ClaveContrato();
		this.ordenReposcion = new OrdenReposicion();
		this.procedimiento = new Procedimiento();

		this.index.getBuscarButton().addActionListener(Buscar());

	}

	public void start() {
		this.index.setVisible(true);
	}

	/*
	 * ActionsListeners *
	 */

	private ActionListener Buscar() throws SQLException {
		ActionListener Buscar = ewt -> {
			JFileChooser path = new JFileChooser();
			path.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			path.setCurrentDirectory(new File("c:/windows/"));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos csv", "csv");
			path.setFileFilter(filter);
			
			int respuesta = path.showOpenDialog(path);
			if(respuesta == JFileChooser.APPROVE_OPTION){
				File selected = path.getSelectedFile();
				this.path = selected.getPath();
				this.index.getTextPath().setText(this.path);
			}
			
		};
		return Buscar;
	}
}
