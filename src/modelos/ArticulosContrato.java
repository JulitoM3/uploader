package modelos;

public enum ArticulosContrato {

	clas_ptal_origen(0),
    ooad (1),
    fecha_actualizacion(2),
    numero_contrato(3),
    numero_dictamen_definitivo(4),
    monto_maximo_contrato_con_iva(5),
    monto_minimo_contrato_con_iva(6),
    monto_maximo_clave_con_iva(7),
    monto_minimo_clave_con_iva(8),
    numero_licitacion(9),
    evento_compranet(10),
    porcentaje_sancion_contrato(11),
    dias_de_entrega_sancion(12),
    numero_proveedor(13),
    rfc_proveedor(14),
    razon_social(15),
    fecha_inicio(16),
    fecha_termino(17),
    tipo_contrato(18),
    estado_contrato(19),
    estatus_clave(20),
    gpo(21),
    gen(22),
    esp(23),
    dif(24),
    var(25),
    descripcion_articulo(26),
    unidad_presentacion(27),
    cantidad_presentacion(28),
    tipo_presentacion(29),
    partida_presupuestal(30),
    des_partida_presupuestal(31),
    cuadro_basico_sai(32),
    cuenta_contable(33),
    precio_neto_contrato(34),
    cantidad_maxima_clave(35),
    cantidad_contratacion_original(36),
    cantidad_minimo_clave(37),
    cantidad_ejercida_o_solicitada(38),
    cant_solic_vigente_en_transito(39),
    cantidad_disponible(40),
    cantidad_atendida(41),
    cantidad_de_piezas_topadas(42),
    porcentaje_ejercido(43),
    porcentaje_topado(44),
    porcen_atencion_sin_transito(45),
    fecha_dictamen(46),
    saldo_disponible_dictamen_prei(47),
    monto_ejercido_dictamen_sai(48),
    saldo_disponible_dictamen_sai(49),
    monto_pagado(50),
    iva(51),
    contrato_id(52),
    created_at(53);
	
	
	private int headerPosition = 0;
	
	private ArticulosContrato(int headerPosition){
		this.headerPosition = headerPosition;
	}
	
	public int getHeaderPosition(){
		return headerPosition;
	}
	
}
