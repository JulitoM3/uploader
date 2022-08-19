package modelos;

public enum OrdenesReposicion {
	clas_ptal_origen(0),
    nombre_ooad(1),
    id_ooad(2),
    fecha_actualizacion(3),
    clas_ptal_entrega(4),
    nombre_unidad_entrega(5),
    numero_contrato(6),
    numero_licitacion(7),
    numero_evento_compranet(8),
    tipo_evento(9),
    fecha_inicio_contrato(10),
    fecha_termino_contrato(11),
    monto_minimo_contrato_sin_iva(12),
    monto_maximo_contrato_sin_iva(13),
    cantidad_minima_piezas(14),
    cantidad_maxima_piezas(15),
    monto_minimo_clave_sin_iva(16),
    monto_maximo_clave_sin_iva(17),
    numero_de_solicitud(18),
    numero_de_orden_reposicion(19),
    origen(20),
    gpo(21),
    gen(22),
    esp(23),
    dif(24),
    var(25),
    descripcion_articulo(26),
    unidad_presentacion(27),
    cantidad_presentacion(28),
    tipo_presentacion(29),
    razon_social(30),
    rfc_proveedor(31),
    numero_proveedor(32),
    fecha_expedicion(33),
    fecha_www(34),
    fecha_confirmacion(35),
    fecha_entrega(36),
    fecha_atencion(37),
    fecha_sello_alta_qr(38),
    fecha_cancelacion(39),
    fecha_entrega_inicial(40),
    fecha_entrega_ampliada(41),
    matricula_usuario_amplio(42),
    estatus_orden(43),
    precio_compra(44),
    iva(45),
    cantidad_solicitada(46),
    cantidad_comprometida(47),
    cantidad_atendida(48),
    importe_solicitado_iva(49),
    importe_comprometido_iva(50),
    importe_atendido_iva(51),
    importe_solicitado_sin_iva(52),
    importe_comprometido_sin_iva(53),
    importe_atendido_sin_iva(54),
    saldo_contrato(55),
    saldo_contrato_porcentaje(56),
    fecha_firma_contrato(57),
    orden_resguardo(58),
    clas_ptal_operador_logistico(59),
    nombre_operador_logistico(60),
    zona_operador_logistico(61),

    cantidad_alta_imss(62),
    fecha_alta_imss(63),
    contrato_id(64),
    created_at(65);
	
	private int headerPosition = 0;
	  
    
	  private OrdenesReposicion(int headerPosition){
		  this.headerPosition = headerPosition;
    }
    
    public int getHeaderPosition(){
  	  return headerPosition;
    }
}
