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
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;










import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  

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
	private File selected = null;
	

	public App(/*
				 * Index index, Compranet compranet, ClaveContrato
				 * claveContrato, OrdenReposicion ordenReposicion, Procedimiento
				 * procedimiento
				 */) throws SQLException, IOException {
		this.index = new Index();
		this.compranet = new Compranet();
		this.claveContrato = new ClaveContrato();
		this.ordenReposcion = new OrdenReposicion();
		this.procedimiento = new Procedimiento();

		this.index.getBuscarButton().addActionListener(Buscar());
		this.index.getSubirButton().addActionListener(Subir());
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
			path.setFileSelectionMode(JFileChooser.FILES_ONLY);
			path.setCurrentDirectory(new File("c:/windows/%UserProfile%/Escritorio"));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos csv", "xlsx");
			path.setFileFilter(filter);
			
			int respuesta = path.showOpenDialog(path);
			if(respuesta == JFileChooser.APPROVE_OPTION){
				this.selected = path.getSelectedFile();
				this.path = this.selected.getPath();
				this.index.getTextPath().setText(this.path);
			}
			
		};
		return Buscar;
	}
	
	private ActionListener Subir() throws SQLException, IOException{
		@SuppressWarnings("deprecation")
		ActionListener Subir = ewt -> {
			try {
				FileInputStream files = new FileInputStream (new File(this.path));
				XSSFWorkbook  workbook = new XSSFWorkbook(files);
				
				XSSFSheet sheet = workbook.getSheetAt(0);
				FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();  
				Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
				while (itr.hasNext())                 
				{  
					Row row = itr.next();  
					Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
					while (cellIterator.hasNext()){  
						Cell cell = cellIterator.next();  
						switch (cell.getCellType()){  
						case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
							System.out.print(cell.getStringCellValue() + "\t\t\t");  
						break;  
						case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type  
							System.out.print(cell.getNumericCellValue() + "\t\t\t");  
						break;  
						default:  
						}  
					}  
					System.out.println("");  
				}  

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}	
		};
		return Subir;
	}

}

