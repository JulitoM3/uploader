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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;















import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
  
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;  

import vistas.Index;
import modelos.Compranet;
import modelos.ClaveContrato;
import modelos.HeaderCompraNet;
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
	
	public App(/*
				 * Index index, Compranet compranet, ClaveContrato
				 * claveContrato, OrdenReposicion ordenReposicion, Procedimiento
				 * procedimiento
				 */) throws SQLException, IOException {
		
		
		this.index = new Index();
		this.compranet = new Compranet();
		this.ordenReposcion = new OrdenReposicion();
		

		//this.index.getBuscarButton().addActionListener(Buscar());
		//this.index.getSubirButton().addActionListener(Subir());
		
		/*
		 * Botones de compranet
		 * **/
		this.index.getBtnBuscarCompraNet().addActionListener(buscarCompraNet());
		this.index.getBtnUploadCompraNet().addActionListener(subirCompraNet());;
		
		/*
		 * Botones Portal de abasto
		 * **/
		
		//this.index.getBtnBuscarArticulos();
		//this.index.getBtnUploadArticulos();
		//this.index.getBtnBuscarOrdenes();
		//this.index.getBtnUploadOrdenes();
		//this.index.getBtnBuscarAltas();
		//this.index.getBtnUploadAltas();
		//this.index.getBtnBuscarSaiPrei();
		//this.index.getBtnUploadSaiPrei();
		
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
						// TODO Auto-generated catch block
						
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
		};
		return subirCompraNet;
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

