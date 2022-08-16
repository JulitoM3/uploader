package modelos;

public enum HeaderCompraNet {


	  orden (0),
      siglas_institucion(1),
      institucion(2),
      clave_unidad_compradora(3),
      nombre_unidad_compradora(4),
      respo_unidad_compradora(5),
      codigo_expediente(6),
      referencia_expediente(7),
      clave_cucop(8),
      titulo_expediente(9),
      plantilla_expediente(10),
      fundamento_legal(11),
      numero_procedimiento(12) ,
      fecha_fallo (13),
      fecha_publicacion (14),
      fecha_apertura (15),
      caracter_procedimiento (16),
      tipo_de_contratacion (17),
      tipo_procedimiento (18),
      medio_utilizado_propuestas (19),
      codigo_contrato (20),
      numero_control_contrato (21),
      titulo_contrato (22),
      descripcion_contrato (23),
      fecha_inicio_contrato (24),
      fecha_fin_contrato (25),
      importe_contrato(26),
      moneda (27),
      estatus_contrato(28),
      convenio_modificatorio (29),
      clave_programa_federal (30),
      fecha_firma_contrato (31),
      contrato_marco (32),
      compra_consolidada (33),
      contrato_plurianual (34),
      clave_cartera_shcp (35),
      folio_rupc (36),
      rfc (37),
      proveedor_contratista (38),
      estratificacion (39),
      clave_pais (40),
      rfc_verificado_sat (41),
      credito_externo (42),
      organismo_financiero (43),
      url_compranet (44);
      
	  private int headerPosition = 0;
	  
      
	  private HeaderCompraNet(int headerPosition){
		  this.headerPosition = headerPosition;
      }
      
      public int getHeaderPosition(){
    	  return headerPosition;
      }
      
}
