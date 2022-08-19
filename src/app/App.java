package app;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

























import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
  
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;  

import vistas.Index;
import modelos.Altas;
import modelos.ArticulosContrato;
import modelos.Compranet;
import modelos.ClaveContrato;
import modelos.HeaderCompraNet;
import modelos.OrdenReposicion;
import modelos.OrdenesReposicion;
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
	
	private String compraNetPath = "";
	private String articulosContratoPath = "";
	private String ordenesReposicionPath = "";
	private String altasPath = "";
	private String altasSaiPreiPath = "";
	private String notasCreditoPath  = "";
	private String pagosPath = "";
	
	private File selectedCompranet = null;
	private File selectedArticulos = null;
	private File selectedOrdenesReposicion = null;
	private File selectedAltas = null;
	private File selectedAltasSaiPrei = null;
	private File selectedPagos = null;
	private File selectedNotasCredito = null;
	
	/*
	 * selectores de relacion
	 * **/
	
	private int selectedContrato = 0;
	private int selectedOrden = 0;
	private int selectedAlta = 0;
	private int selectedPago = 0;
	public App(/*
				 * Index index, Compranet compranet, ClaveContrato
				 * claveContrato, OrdenReposicion ordenReposicion, Procedimiento
				 * procedimiento
				 */) throws SQLException, IOException {
		
		
		this.index = new Index();
		this.compranet = new Compranet();
		this.ordenReposcion = new OrdenReposicion();
		
		
		/*
		 * Botones de compranet
		 * **/
		this.index.getBtnBuscarCompraNet().addActionListener(buscarCompraNet());
		this.index.getBtnUploadCompraNet().addActionListener(subirCompraNet());
		
		/*
		 * Botones Portal de abasto
		 * **/
		
		this.index.getBtnBuscarArticulos().addActionListener(buscarArticulos());
		this.index.getBtnUploadArticulos().addActionListener(subirArticulos());
		
		this.index.getBtnBuscarOrdenes().addActionListener(buscarOrdenes());
		this.index.getBtnUploadOrdenes().addActionListener(subirOrdenes());
		this.index.getBtnBuscarAltas().addActionListener(buscarAltas());
		this.index.getBtnUploadAltas().addActionListener(subirAltas());
		this.index.getBtnBuscarSaiPrei().addActionListener(buscarAltasPreiSai());
		//this.index.getBtnUploadSaiPrei().addActionListener(subirAltasPreiSai());
		
		/*
		 * Botones de PREI MILLENIUM
		 * **/
		
		this.index.getBtnBuscarPagos();
		this.index.getBtnUploadPagos();
		
		this.index.getBtnBuscarNotas();
		this.index.getBtnUploadNotas();
		
		
	}

	public void start() {
		this.index.setVisible(true);
	}

	/*
	 * ActionsListeners *
	 */

	private ActionListener buscarCompraNet() throws SQLException {
		ActionListener buscarCompraNet = ewt -> {
			JFileChooser path = new JFileChooser();
			path.setFileSelectionMode(JFileChooser.FILES_ONLY);
			path.setCurrentDirectory(new File("C:/windows/%UserProfile%/Escritorio"));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos xlsx", "xlsx");
			path.setFileFilter(filter);
			
			int respuesta = path.showOpenDialog(path);
			if(respuesta == JFileChooser.APPROVE_OPTION){
				this.selectedCompranet = path.getSelectedFile();
				this.compraNetPath = this.selectedCompranet.getPath();
				this.index.getTextPathCompraNet().setText(this.compraNetPath);
			}
			
		};
		return buscarCompraNet;
	}
	
	private ActionListener buscarArticulos() throws SQLException {
		ActionListener buscarArticulos = ewt -> {
			JFileChooser path = new JFileChooser();
			path.setFileSelectionMode(JFileChooser.FILES_ONLY);
			path.setCurrentDirectory(new File("C:/windows/%UserProfile%/Escritorio"));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos xlsx", "xlsx");
			path.setFileFilter(filter);
			
			int respuesta = path.showOpenDialog(path);
			if(respuesta == JFileChooser.APPROVE_OPTION){
				this.selectedArticulos = path.getSelectedFile();
				this.articulosContratoPath = this.selectedArticulos.getPath();
				this.index.getTextPathArticulos().setText(this.articulosContratoPath);
			}
			
		};
		return buscarArticulos;
	}
	
	private ActionListener buscarOrdenes() throws SQLException {
		
		ActionListener buscarOrdenes = ewt -> {
			JFileChooser path = new JFileChooser();
			path.setFileSelectionMode(JFileChooser.FILES_ONLY);
			path.setCurrentDirectory(new File("C:/windows/%UserProfile%/Desktop"));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos xlsx", "xlsx");
			path.setFileFilter(filter);
			
			int respuesta = path.showOpenDialog(path);
			if(respuesta == JFileChooser.APPROVE_OPTION){
				this.selectedOrdenesReposicion = path.getSelectedFile();
				this.ordenesReposicionPath = this.selectedOrdenesReposicion.getPath();
				this.index.getTextPathOrdenes().setText(this.ordenesReposicionPath);
			}
			
		};
		return buscarOrdenes;
	}
	
	private ActionListener buscarAltas() throws SQLException {
		ActionListener buscarAltas = ewt -> {
			JFileChooser path = new JFileChooser();
			path.setFileSelectionMode(JFileChooser.FILES_ONLY);
			path.setCurrentDirectory(new File("C:/windows/%UserProfile%/Escritorio"));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos xlsx", "xlsx");
			path.setFileFilter(filter);
			
			int respuesta = path.showOpenDialog(path);
			if(respuesta == JFileChooser.APPROVE_OPTION){
				this.selectedAltas = path.getSelectedFile();
				this.altasPath = this.selectedAltas.getPath();
				this.index.getTextPathAltas().setText(this.altasPath);
			}
			
		};
		return buscarAltas;
	}
	
	private ActionListener buscarAltasPreiSai() throws SQLException {
		ActionListener buscarAltasPreiSai = ewt -> {
			JFileChooser path = new JFileChooser();
			path.setFileSelectionMode(JFileChooser.FILES_ONLY);
			path.setCurrentDirectory(new File("C:/windows/%UserProfile%/Escritorio"));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos xlsx", "xlsx");
			path.setFileFilter(filter);
			
			int respuesta = path.showOpenDialog(path);
			if(respuesta == JFileChooser.APPROVE_OPTION){
				this.selectedAltasSaiPrei = path.getSelectedFile();
				this.altasSaiPreiPath = this.selectedAltasSaiPrei.getPath();
				this.index.getTextPathAltasPreiSai().setText(this.altasSaiPreiPath);
			}
			
		};
		return buscarAltasPreiSai;
	}

	
	private ActionListener subirArticulos() throws SQLException, IOException{
	
		ActionListener subirArticulos = ewt -> {
			
			
			try {
				FileInputStream files = new FileInputStream (new File(this.articulosContratoPath));
				XSSFWorkbook  workbook = new XSSFWorkbook(files);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				Iterator<Row> itr = sheet.iterator();
				
				String buscar = "select id from compranet where numero_control_contrato = ? limit 1";
				String insertSql = "INSERT INTO abastos"
					+ "("
					+ "clas_ptal_origen ,ooad,fecha_actualizacion, numero_contrato,numero_dictamen_definitivo, monto_maximo_contrato_con_iva,"
					+ "monto_minimo_contrato_con_iva,monto_maximo_clave_con_iva,monto_minimo_clave_con_iva,numero_licitacion,evento_compranet,"
					+ "porcentaje_sancion_contrato,dias_de_entrega_sancion,numero_proveedor,rfc_proveedor,razon_social,fecha_inicio,fecha_termino,"
					+ "tipo_contrato,estado_contrato,estatus_clave,gpo,gen,esp,dif,var,descripcion_articulo,unidad_presentacion,cantidad_presentacion,"
					+ "tipo_presentacion,partida_presupuestal,des_partida_presupuestal,cuadro_basico_sai,cuenta_contable,precio_neto_contrato,cantidad_maxima_clave,"
					+ "cantidad_contratacion_original,cantidad_minimo_clave,cantidad_ejercida_o_solicitada,cant_solic_vigente_en_transito,cantidad_disponible,cantidad_atendida,"
					+ "cantidad_de_piezas_topadas,porcentaje_ejercido,porcentaje_topado,porcen_atencion_sin_transito,fecha_dictamen,saldo_disponible_dictamen_prei,monto_ejercido_dictamen_sai,"
					+ "saldo_disponible_dictamen_sai,monto_pagado,iva"
					+ ",contrato_id"
					+ ", created_at)"
					+ "values"
					+ "("
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
					+ ",?"
					+ ")";

					
				while(itr.hasNext()){
					this.compranet = new Compranet();
					Row currentRow = itr.next();
					if(currentRow.getRowNum()== 0){ //saltamos el header
						continue;
					}
					
					try {
					PreparedStatement search = this.conn.prepareStatement(buscar);
						PreparedStatement ps = this.conn.prepareStatement(insertSql);
						for(ArticulosContrato header : ArticulosContrato.values()){
							
							System.out.println("posicion:" + header.getHeaderPosition());
							System.out.println("header: " + header.toString());
							System.out.println("vacio o nulo?: " + this.isEmptyOrNull(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
							
							String cellType = null;
							
							
							if(this.isEmptyOrNull(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition())){
								if(header.toString() == ArticulosContrato.created_at.toString()){
									cellType = "TIMESTAMP";
								}else if(header.toString() == ArticulosContrato.contrato_id.toString()){
									cellType = "RELATIONSHIP";
								}
								else{
									cellType = "BLANK";		
								}
							}
							else{
							cellType = this.returnCellType(workbook, sheet, currentRow.getRowNum(),header.getHeaderPosition());	
							}
							
							
							if(cellType == "STRING" ){
								if(header.toString() == ArticulosContrato.numero_contrato.toString()){
								search.setString(1, this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
								ResultSet result = search.executeQuery();
								if (result.next()){
									this.selectedContrato = result.getInt(1);
									System.out.println("id relacion en compranet: " + this.selectedContrato);	
								}
								
								}
									ps.setString(header.getHeaderPosition()+1,this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor:" + this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);
							}
				
							if(cellType == "NUMERIC"){
								
								if(header.toString() == ArticulosContrato.fecha_actualizacion.toString()
										 || header.toString() == ArticulosContrato.fecha_inicio.toString()
										 || header.toString() == ArticulosContrato.fecha_termino.toString()
										 || header.toString() == ArticulosContrato.fecha_dictamen.toString()
										 ){
											
											ps.setTimestamp(header.getHeaderPosition()+1, this.returnCellTimeStampAbastos(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
											System.out.println("valor: " + this.returnCellTimeStampAbastos(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
											System.out.println("tipo de celda: " + cellType);
	
								}
								else if(header.toString() == ArticulosContrato.dias_de_entrega_sancion.toString()
										|| header.toString() == ArticulosContrato.gpo.toString()
										|| header.toString() == ArticulosContrato.dif.toString()
										|| header.toString() == ArticulosContrato.var.toString()
										|| header.toString() == ArticulosContrato.gen.toString()
										|| header.toString() == ArticulosContrato.esp.toString()
										|| header.toString() == ArticulosContrato.partida_presupuestal.toString()
										|| header.toString() == ArticulosContrato.cuenta_contable.toString()
										|| header.toString() == ArticulosContrato.numero_proveedor.toString()){
									ps.setInt(header.getHeaderPosition()+1, this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor: " + this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);
								}
								else{
									ps.setDouble(header.getHeaderPosition()+1, this.returnCellDoubleValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor:" + this.returnCellDoubleAbastos(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);

								}	
							}
							
							if(cellType == "BLANK"){
								ps.setNull(header.getHeaderPosition()+1, 0);
								System.out.println("tipo de celda: " + cellType);

							}
							
							if(cellType == "TIMESTAMP"){
								ps.setTimestamp(header.getHeaderPosition()+1, this.getCurrentTimeStamp() );
								System.out.println("tipo de celda: " + cellType);

							}
							
							if(cellType == "RELATIONSHIP"){
								if(this.selectedContrato == 0){
									ps.setNull(header.getHeaderPosition()+1, 0);
								}else{
									ps.setInt(header.getHeaderPosition()+1, this.selectedContrato);
								}
							}
							
							System.out.println("---------------------------------------");
		
						}
						ps.execute();
						
						
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,
				                "Vaya algo salio mal: " + e.getMessage(),
				                "PopUp Dialog",
				                JOptionPane.INFORMATION_MESSAGE);
						
					e.printStackTrace();
					}	
					//;
				}
				
				try {
					this.conn.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}	
			
			JOptionPane.showMessageDialog(null,
	                "Se subió la información de manera correcta",
	                "Mensaje",
	                JOptionPane.INFORMATION_MESSAGE);
		};
		
		
		return subirArticulos;

	}
	
	private ActionListener subirCompraNet() throws SQLException, IOException{
		@SuppressWarnings("deprecation")
		ActionListener subirCompraNet = ewt -> {
			
			
			try {
				FileInputStream files = new FileInputStream (new File(this.compraNetPath));
				XSSFWorkbook  workbook = new XSSFWorkbook(files);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				Iterator<Row> itr = sheet.iterator();
			String insertSql = "INSERT INTO compranet"
					+ "("
					//+ "id,"
					+ "orden,siglas_institucion,institucion"
					+ ",clave_unidad_compradora,nombre_unidad_compradora,respo_unidad_compradora,"
					+ "codigo_expediente,referencia_expediente,clave_cucop,titulo_expediente,plantilla_expediente,fundamento_legal,numero_procedimiento,"
					+ "fecha_fallo,fecha_publicacion,fecha_apertura,caracter_procedimiento,tipo_de_contratacion,tipo_procedimiento,medio_utilizado_propuestas,"
					+ "codigo_contrato,numero_control_contrato,titulo_contrato,descripcion_contrato,fecha_inicio_contrato,fecha_fin_contrato,importe_contrato,moneda,"
					+"estatus_contrato,convenio_modificatorio,clave_programa_federal,fecha_firma_contrato,contrato_marco,compra_consolidada,contrato_plurianual,clave_cartera_shcp,"
					+ "folio_rupc,rfc,proveedor_contratista,estratificacion,clave_pais,rfc_verificado_sat,credito_externo,organismo_financiero,url_compranet, created_at)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

					
				while(itr.hasNext()){
					this.compranet = new Compranet();
					Row currentRow = itr.next();
					if(currentRow.getRowNum()== 0){ //saltamos el header
						continue;
					}
					
					try {
						PreparedStatement ps = this.conn.prepareStatement(insertSql);
						for(HeaderCompraNet header : HeaderCompraNet.values()){
							
							System.out.println("posicion:" + header.getHeaderPosition());
							System.out.println("header: " + header.toString());
							System.out.println("vacio o nulo?: " + this.isEmptyOrNull(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
							
							String cellType = null;
							
							
							if(this.isEmptyOrNull(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition())){
								if(header.toString() == HeaderCompraNet.created_at.toString()){
									cellType = "TIMESTAMP";
								}else{
									cellType = "BLANK";		
								}
							}
							else{
							cellType = this.returnCellType(workbook, sheet, currentRow.getRowNum(),header.getHeaderPosition());	
							}
							
							if(cellType == "STRING" ){
									ps.setString(header.getHeaderPosition()+1,this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor:" + this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
							}
				
							if(cellType == "NUMERIC"){
								
								if(header.toString() == HeaderCompraNet.codigo_expediente.toString()
										||
										header.toString() == HeaderCompraNet.clave_cucop.toString()
										||
										header.toString() == HeaderCompraNet.codigo_contrato.toString()
										||
										header.toString() == HeaderCompraNet.convenio_modificatorio.toString()
										||
										header.toString() == HeaderCompraNet.compra_consolidada.toString()
										||
										header.toString() == HeaderCompraNet.contrato_plurianual.toString()
										||
										header.toString() == HeaderCompraNet.folio_rupc.toString()
										||
										header.toString() == HeaderCompraNet.rfc_verificado_sat.toString()
										||
										header.toString() == HeaderCompraNet.credito_externo.toString()
										){
									ps.setInt(header.getHeaderPosition()+1, this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor entero:" + this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
								}
								else if(header.toString() == HeaderCompraNet.fecha_fallo.toString()
										 || header.toString() == HeaderCompraNet.fecha_publicacion.toString()
										 || header.toString() == HeaderCompraNet.fecha_apertura.toString()
										 || header.toString() == HeaderCompraNet.fecha_inicio_contrato.toString()
										 || header.toString() == HeaderCompraNet.fecha_fin_contrato.toString()
										 || header.toString() == HeaderCompraNet.fecha_inicio_contrato.toString()){
											
											ps.setString(header.getHeaderPosition()+1, this.returnDateCellType(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
											System.out.println("valor: " + this.returnDateCellType(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
											
											
								}
								else{
									ps.setDouble(header.getHeaderPosition()+1, this.returnCellDoubleValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor:" + this.returnCellDoubleValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));	
								}	
							}
							
							if(cellType == "BLANK"){
								ps.setNull(header.getHeaderPosition()+1, 0);
							}
							
							if(cellType == "TIMESTAMP"){
								ps.setTimestamp(header.getHeaderPosition()+1, this.getCurrentTimeStamp() );	
							}
							
							System.out.println("---------------------------------------");
		
						}
						ps.execute();
						
						
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,
				                "Vaya algo salio mal: " + e.getMessage(),
				                "PopUp Dialog",
				                JOptionPane.INFORMATION_MESSAGE);
						
					e.printStackTrace();
					}	
					//;
				}
				
				try {
					this.conn.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}	
			
			JOptionPane.showMessageDialog(null,
	                "Se subió la información de manera correcta",
	                "Mensaje",
	                JOptionPane.INFORMATION_MESSAGE);
		};
		
		
		return subirCompraNet;
	}

	private ActionListener subirOrdenes() throws SQLException, IOException{

		ActionListener subirOrdenes = ewt -> {
			
			
			try {
				FileInputStream files = new FileInputStream (new File(this.ordenesReposicionPath));
				XSSFWorkbook  workbook = new XSSFWorkbook(files);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				Iterator<Row> itr = sheet.iterator();
				
				String buscar = "select id from compranet where numero_control_contrato = ? limit 1";
				String insertSql = "INSERT INTO ordenes_reposicion"+
					 "(clas_ptal_origen,"+
			    "nombre_ooad,"+
			    "id_ooad,"+
			    "fecha_actualizacion,"+
			    "clas_ptal_entrega,"+
			    "nombre_unidad_entrega,"+
			    "numero_contrato,"+
			    "numero_licitacion,"+
			    "numero_evento_compranet,"+
			    "tipo_evento,"+
			    "fecha_inicio_contrato,"+
			    "fecha_termino_contrato,"+
			    "monto_minimo_contrato_sin_iva,"+
			    "monto_maximo_contrato_sin_iva,"+
			    "cantidad_minima_piezas,"+
			    "cantidad_maxima_piezas,"+
			    "monto_minimo_clave_sin_iva,"+
			    "monto_maximo_clave_sin_iva,"+
			    "numero_de_solicitud,"+
			    "numero_de_orden_reposicion,"+
			    "origen,"+
			    "gpo,"+
			    "gen,"+
			    "esp,"+
			    "dif,"+
			    "var,"+
			    "descripcion_articulo,"+
			    "unidad_presentacion,"+
			    "cantidad_presentacion,"+
			    "tipo_presentacion,"+
			    "razon_social,"+
			    "rfc_proveedor,"+
			    "numero_proveedor,"+
			    "fecha_expedicion,"+
			    "fecha_www,"+
			    "fecha_confirmacion,"+
			    "fecha_entrega,"+
			    "fecha_atencion,"+
			    "fecha_sello_alta_qr,"+
			    "fecha_cancelacion,"+
			    "fecha_entrega_inicial,"+
			    "fecha_entrega_ampliada,"+
			    "matricula_usuario_amplio,"+
			    "estatus_orden,"+
			    "precio_compra,"+
			    "iva,"+
			    "cantidad_solicitada,"+
			    "cantidad_comprometida,"+
			    "cantidad_atendida,"+
			    "importe_solicitado_iva,"+
			    "importe_comprometido_iva,"+
			    "importe_atendido_iva,"+
			    "importe_solicitado_sin_iva,"+
			    "importe_comprometido_sin_iva,"+
			    "importe_atendido_sin_iva,"+
			    "saldo_contrato,"+
			    "saldo_contrato_porcentaje,"+
			    "fecha_firma_contrato,"+
			    "orden_resguardo,"+
			    "clas_ptal_operador_logistico,"+
			    "nombre_operador_logistico,"+
			    "zona_operador_logistico,"+
			    "cantidad_alta_imss,"+
			    "fecha_alta_imss,"+
			    "contrato_id,"+
			    "created_at)"
			    + "values("
			    + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
			    + ")";

					
				while(itr.hasNext()){
				
					Row currentRow = itr.next();
					if(currentRow.getRowNum()== 0){ //saltamos el header
						continue;
					}
					
					try {
					PreparedStatement search = this.conn.prepareStatement(buscar);
						PreparedStatement ps = this.conn.prepareStatement(insertSql);
						for(OrdenesReposicion header : OrdenesReposicion.values()){
							
							System.out.println("posicion:" + header.getHeaderPosition());
							System.out.println("header: " + header.toString());
							System.out.println("vacio o nulo?: " + this.isEmptyOrNull(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
							
							String cellType = null;
							
							
							if(this.isEmptyOrNull(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition())){
								if(header.toString() == OrdenesReposicion.created_at.toString()){
									cellType = "TIMESTAMP";
								}else if(header.toString() == OrdenesReposicion.contrato_id.toString()){
									cellType = "RELATIONSHIP";
								}
								else{
									cellType = "BLANK";		
								}
							}
							else{
							cellType = this.returnCellType(workbook, sheet, currentRow.getRowNum(),header.getHeaderPosition());	
							}
							
							
							if(cellType == "STRING" ){
								if(header.toString() == OrdenesReposicion.numero_contrato.toString()){
								search.setString(1, this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
								ResultSet result = search.executeQuery();
								if (result.next()){
									this.selectedContrato = result.getInt(1);
									System.out.println("id relacion en compranet: " + this.selectedContrato);	
								}
								
								}
									ps.setString(header.getHeaderPosition()+1,this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor:" + this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);
							}
				
							if(cellType == "NUMERIC"){
								
								if(header.toString() == OrdenesReposicion.fecha_actualizacion.toString()
										 || header.toString() == OrdenesReposicion.fecha_inicio_contrato.toString()
										 || header.toString() == OrdenesReposicion.fecha_termino_contrato.toString()
										 || header.toString() == OrdenesReposicion.fecha_expedicion.toString()
										 || header.toString() == OrdenesReposicion.fecha_www.toString()
										 || header.toString() == OrdenesReposicion.fecha_confirmacion.toString()
										 || header.toString() == OrdenesReposicion.fecha_entrega.toString()
										 || header.toString() == OrdenesReposicion.fecha_atencion.toString()
										 || header.toString() == OrdenesReposicion.fecha_sello_alta_qr.toString()
										 || header.toString() == OrdenesReposicion.fecha_cancelacion.toString()
										 || header.toString() == OrdenesReposicion.fecha_firma_contrato.toString()
										 ){
											
											ps.setTimestamp(header.getHeaderPosition()+1, this.returnCellTimeStampAbastosOrdenes(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
											System.out.println("valor: " + this.returnCellTimeStampAbastosOrdenes(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
											System.out.println("tipo de celda: " + cellType);
	
								}
								else if(header.toString() == OrdenesReposicion.gpo.toString()
										|| header.toString() == OrdenesReposicion.dif.toString()
										|| header.toString() == OrdenesReposicion.var.toString()
										|| header.toString() == OrdenesReposicion.gen.toString()
										|| header.toString() == OrdenesReposicion.esp.toString()
										|| header.toString() == OrdenesReposicion.numero_proveedor.toString()){
									ps.setInt(header.getHeaderPosition()+1, this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor: " + this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);
								}
								else{
									ps.setDouble(header.getHeaderPosition()+1, this.returnCellDoubleValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor:" + this.returnCellDoubleAbastos(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);

								}	
							}
							
							if(cellType == "BLANK"){
								ps.setNull(header.getHeaderPosition()+1, 0);
								System.out.println("tipo de celda: " + cellType);

							}
							
							if(cellType == "TIMESTAMP"){
								ps.setTimestamp(header.getHeaderPosition()+1, this.getCurrentTimeStamp() );
								System.out.println("tipo de celda: " + cellType);

							}
							
							if(cellType == "RELATIONSHIP"){
								if(this.selectedContrato == 0){
									ps.setNull(header.getHeaderPosition()+1, 0);
								}else{
									ps.setInt(header.getHeaderPosition()+1, this.selectedContrato);
								}
							}
							
							System.out.println("---------------------------------------");
		
						}
						ps.execute();
						//TODO: ejecutar el procedimiento
						
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,
				                "Vaya algo salio mal: " + e.getMessage(),
				                "PopUp Dialog",
				                JOptionPane.INFORMATION_MESSAGE);
						
					e.printStackTrace();
					}	
					//;
				}
				
				try {
					this.conn.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}	
			
			JOptionPane.showMessageDialog(null,
	                "Se subió la información de manera correcta",
	                "Mensaje",
	                JOptionPane.INFORMATION_MESSAGE);
		};
		
		
		return subirOrdenes;

	}
	
	
	
	private ActionListener subirAltas() throws SQLException, IOException{

		ActionListener subirAltas = ewt -> {
			
			
			try {
				FileInputStream files = new FileInputStream (new File(this.altasPath));
				XSSFWorkbook  workbook = new XSSFWorkbook(files);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				Iterator<Row> itr = sheet.iterator();
				
				String buscarContrato = "select id from compranet where numero_control_contrato = ? limit 1";
				String buscarOrden = "select id from ordenes_reposicion where numero_de_orden_reposicion = ? limit 1";
				String insertSql = "INSERT INTO altas"+
					 "(clas_ptal_origen,"+
			    "nombre_ooad,"+
			    "estado_ooad,"+
			    "fecha_registro,"+
			    "clas_ptal_entrega,"+
			    "nombre_unidad_entrega,"+ 
			    "tipo_reporte,"+
			    " numero_alta_contable,"+
			    "numero_contrato,"+
			    "numero_orden_reposicion,"+
			    "cargo_a,"+
			    "credito_a,"+
			    "descripcion_movimiento,"+
			    "gpo,"+
			    "gen,"+
			    "esp,"+
			    "dif,"+
			    "var,"+
			    "descripcion_articulo,"+
			    "unidad_presentacion,"+
			    "cantidad_presentacion,"+
			    "tipo_presentacion,"+
			    "precio_catalogo_articulos,"+
			    "precio_compra,"+
			    "iva,"+
			    "cantidad_autorizada,"+
			    "cantidad_conteo,"+
			    "importe_articulo_sin_iva,"+
			    "importe_alta_iva,"+
			    "linea_articulo,"+
			    "rfc_proveedor,"+
			    "numero_proveedor,"+
			    "razon_social,"+
			    "numero_licitacion,"+
			    "fecha_hora_recepcion,"+
			    "fecha_hora_entrega,"+
			    "fecha_hora_alta,"+
			    "matricula_usuario_registro,"+
			    "partida_presupuestal,"+
			    "tipo_error,"+
			    "enviado,"+
			    "fecha_envio_prei,"+
			    "contrato_id,"+
			    "orden_id,"+
			    "created_at"+
			    ")"
			    + "values("
			    + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
			    + ")";

					
				while(itr.hasNext()){
				
					Row currentRow = itr.next();
					if(currentRow.getRowNum()== 0){ //saltamos el header
						continue;
					}
					
					try {
					PreparedStatement searchContrato = this.conn.prepareStatement(buscarContrato);
					PreparedStatement searchOrden = this.conn.prepareStatement(buscarOrden);
					PreparedStatement ps = this.conn.prepareStatement(insertSql);
						
						for(Altas header : Altas.values()){
							
							System.out.println("posicion:" + header.getHeaderPosition());
							System.out.println("header: " + header.toString());
							System.out.println("vacio o nulo?: " + this.isEmptyOrNull(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
						
							String cellType = null;
							
							
							if(this.isEmptyOrNull(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition())){
								if(header.toString() == OrdenesReposicion.created_at.toString()){
									cellType = "TIMESTAMP";
								}else if(header.toString() == Altas.contrato_id.toString() || 
										header.toString() == Altas.orden_id.toString()){
									cellType = "RELATIONSHIP";
								}
								else{
									cellType = "BLANK";		
								}
							}
							else{
							cellType = this.returnCellType(workbook, sheet, currentRow.getRowNum(),header.getHeaderPosition());	
							}
							
							
							if(cellType == "STRING" ){
								if(header.toString() == Altas.numero_contrato.toString()){
								searchContrato.setString(1, this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
								ResultSet result = searchContrato.executeQuery();
								if (result.next()){
									this.selectedContrato = result.getInt(1);
									System.out.println("id relacion en compranet: " + this.selectedContrato);	
								}
								}
								ps.setString(header.getHeaderPosition()+1, this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
								System.out.println("valor:" + this.returnCellValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
								
							}
				
							if(cellType == "NUMERIC"){
								
								if(header.toString() == Altas.numero_orden_reposicion.toString()){
									searchOrden.setInt(1, this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									ResultSet res = searchOrden.executeQuery();
									if (res.next()){
										this.selectedOrden = res.getInt(1);
										System.out.println("id relacion en OR: " + this.selectedOrden);	
										}
									System.out.println(this.selectedOrden);
									}
								
									ps.setInt(header.getHeaderPosition()+1,this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor:" + this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);
								
								if(header.toString() == Altas.fecha_registro.toString()
										 || header.toString() == Altas.fecha_hora_recepcion.toString()
										 || header.toString() == Altas.fecha_hora_entrega.toString()
										 || header.toString() == Altas.fecha_hora_alta.toString()
										 ){
											
											ps.setTimestamp(header.getHeaderPosition()+1, this.returnCellTimeStampAbastosOrdenes(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
											System.out.println("valor: " + this.returnCellTimeStampAbastosOrdenes(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
											System.out.println("tipo de celda: " + cellType);
	
								}
								else if(header.toString() == Altas.gpo.toString()
										|| header.toString() == Altas.dif.toString()
										|| header.toString() == Altas.var.toString()
										|| header.toString() == Altas.gen.toString()
										|| header.toString() == Altas.esp.toString()
										|| header.toString() == Altas.numero_proveedor.toString()
										|| header.toString() == Altas.numero_alta_contable.toString()
										|| header.toString() == Altas.partida_presupuestal.toString()
										|| header.toString() == Altas.enviado.toString()){
									ps.setInt(header.getHeaderPosition()+1, this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor: " + this.returnCellIntValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);
								}
								else{
									ps.setDouble(header.getHeaderPosition()+1, this.returnCellDoubleValue(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("valor:" + this.returnCellDoubleAbastos(workbook, sheet, currentRow.getRowNum(), header.getHeaderPosition()));
									System.out.println("tipo de celda: " + cellType);

								}	
							}
							
							if(cellType == "BLANK"){
								ps.setNull(header.getHeaderPosition()+1, 0);
								System.out.println("tipo de celda: " + cellType);

							}
							
							if(cellType == "TIMESTAMP"){
								ps.setTimestamp(header.getHeaderPosition()+1, this.getCurrentTimeStamp() );
								System.out.println("tipo de celda: " + cellType);

							}
							
							if(cellType == "RELATIONSHIP"){
								if(header.toString() == Altas.contrato_id.toString()){
									if(this.selectedContrato == 0){
										ps.setNull(header.getHeaderPosition()+1, 0);
									}else{
										ps.setInt(header.getHeaderPosition()+1, this.selectedContrato);
									}	
								}
								
								if(header.toString() == Altas.orden_id.toString()){
									if(this.selectedOrden == 0){
										ps.setNull(header.getHeaderPosition()+1, 0);
									}else{
										ps.setInt(header.getHeaderPosition()+1, this.selectedOrden);
									}	
								}
								
							}
							
							System.out.println("---------------------------------------");
		
						}
						ps.execute();
						
						
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,
				                "Vaya algo salio mal: " + e.getMessage(),
				                "PopUp Dialog",
				                JOptionPane.INFORMATION_MESSAGE);
						
					e.printStackTrace();
					}	
					//;
				}
				
				try {
					this.conn.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}	
			
			JOptionPane.showMessageDialog(null,
	                "Se subió la información de manera correcta",
	                "Mensaje",
	                JOptionPane.INFORMATION_MESSAGE);
		};
		
		
		return subirAltas;

	}
	
	
	private String returnCellValue(XSSFWorkbook wb,XSSFSheet sheet ,int row, int cell){
		String value = null;
		XSSFWorkbook workbook = wb;
		XSSFSheet sh = sheet;
		Row selectedRow = sh.getRow(row);
		Cell selectedCell = selectedRow.getCell(cell);
		value = selectedCell.getStringCellValue();
		return value;
		
	}
	
	private double returnCellDoubleValue(XSSFWorkbook wb,XSSFSheet sheet ,int row, int cell){
		double value = 0;
		XSSFWorkbook workbook = wb;
		XSSFSheet sh = sheet;
		Row selectedRow = sh.getRow(row);
		Cell selectedCell = selectedRow.getCell(cell);
		value = selectedCell.getNumericCellValue();
		return value;
		
	}
	
	private String returnCellDoubleAbastos(XSSFWorkbook wb, XSSFSheet sheet, int row, int cell){
		double value = 0;
		XSSFWorkbook workbook = wb;
		XSSFSheet sh = sheet;
		DecimalFormat df = new DecimalFormat("#,##");
		df.setMaximumIntegerDigits(15);
		df.setMaximumFractionDigits(2);
		Row selectedRow = sh.getRow(row);
		Cell selectedCell = selectedRow.getCell(cell);
		value = selectedCell.getNumericCellValue();
		
		return df.format(value).replace(".", "");
	}
	
	private Timestamp returnCellTimeStampAbastos(XSSFWorkbook wb,XSSFSheet sheet ,int row, int cell) throws ParseException{
		
		Date value = null;
		XSSFWorkbook workbook = wb;
		XSSFSheet sh = sheet;
		Row selectedRow = sh.getRow(row);
		Cell selectedCell = selectedRow.getCell(cell);
		value = selectedCell.getDateCellValue();
		System.out.println("Valor original: " + value.toString());
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY h:mm:ss");
		String s = df.format(value);
		Date parseDate = df.parse(s);
		Timestamp ts = new java.sql.Timestamp(parseDate.getTime());
		return ts;
	}
	
private Timestamp returnCellTimeStampAbastosOrdenes(XSSFWorkbook wb,XSSFSheet sheet ,int row, int cell) throws ParseException{
		
	Date value = null;
	XSSFWorkbook workbook = wb;
	XSSFSheet sh = sheet;
	Row selectedRow = sh.getRow(row);
	Cell selectedCell = selectedRow.getCell(cell);
	value = selectedCell.getDateCellValue();
	System.out.println("Valor de la celda: " + value.getTime());
	return new java.sql.Timestamp(value.getTime());
	
	}
	
	
	
	
	private int returnCellIntValue(XSSFWorkbook wb,XSSFSheet sheet ,int row, int cell){
		int value = 0;
		XSSFWorkbook workbook = wb;
		XSSFSheet sh = sheet;
		Row selectedRow = sh.getRow(row);
		Cell selectedCell = selectedRow.getCell(cell);
		value = (int) selectedCell.getNumericCellValue();
		return value;
	}
	
	private String returnCellType(XSSFWorkbook wb,XSSFSheet sheet ,int row, int cell){
		String value = null;
		XSSFWorkbook workbook = wb;
		XSSFSheet sh = sheet;
		Row selectedRow = sh.getRow(row);
		Cell selectedCell = selectedRow.getCell(cell);
		value = selectedCell.getCellTypeEnum().name();
		return value;
	}
	
	private String returnDateCellType(XSSFWorkbook wb, XSSFSheet sheet, int row, int cell){
		Date value = null;
		XSSFWorkbook workbook = wb;
		XSSFSheet sh = sheet;
		Row selectedRow = sh.getRow(row);
		Cell selectedCell = selectedRow.getCell(cell);
		value = selectedCell.getDateCellValue();
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY h:mm:ss");
		return df.format(value);
	}
	
	private boolean isEmptyOrNull(XSSFWorkbook wb,XSSFSheet sheet ,int row, int cell){
		
		XSSFWorkbook workbook = wb;
		XSSFSheet sh = sheet;
		Row selectedRow = sh.getRow(row);
		Cell selectedCell = selectedRow.getCell(cell);
		return (selectedCell == null) ? true : false;
	}
	
	private java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

}

