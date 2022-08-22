package modelos;

public enum AltaPreiSai {

	 clas_ptal_origen(0),
     ooad_umae(1),
     clas_ptal(2),
     nombre_unidad(3),
     year(4),
     alta_prei(5),
     alta_contable_sai(6),
     fecha_alta(7),
     numero_documento(8),
     numero_proveedor(9),
     razon_social(10),
     cargo_sai(11),
     credito_sai(12),
     importe_sai(13),
     importe_prei(14),
     importe_conciliado(15),
     tipo_alta(16),
     descripcion_tipo_alta(17),
     tipo_error(18),
     enviado(19),
     fecha_envio(20),
     numero_reposicion(21),
     fecha_informacion_prei(22),
     ui_abono(23),
     un_ap(24),
     cc_abono(25),
     cuenta_abono(26),
     ui_cargo(27),
     cc_cargo(28),
     cuenta_cargo(29),
     fecha_carga(30),
     asiento(31),
     comprobante_prei(32),
     fecha_introd_cr(33),
     estatus_alta_calculado(34),
     comprobante_pago(35),
     fecha_programada_pago(36),
     estatus_pago_calculado(37),
     contrato_id(38),
     orden_id(39),
     created_at(40);
	
	
	
private int headerPosition = 0;
	
	private AltaPreiSai(int headerPosition){
		this.headerPosition = headerPosition;
	}
	
	public int getHeaderPosition(){
		return headerPosition;
	}
}
