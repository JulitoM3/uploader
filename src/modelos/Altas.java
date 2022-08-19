package modelos;

public enum Altas {

	
	clas_ptal_origen(0),
    nombre_ooad(1),
    estado_ooad(2),
    fecha_registro(3),
    clas_ptal_entrega(4),
    nombre_unidad_entrega(5),
    tipo_reporte(6),
    numero_alta_contable(7),
    numero_contrato(8),
    numero_orden_reposicion(9),
    cargo_a(10),
    credito_a(11),
    descripcion_movimiento(12),
    gpo(13),
    gen(14),
    esp(15),
    dif(16),
    var(17),
    descripcion_articulo(18),
    unidad_presentacion(19),
    cantidad_presentacion(20),
    tipo_presentacion(21),
    precio_catalogo_articulos(22),
    precio_compra(23),
    iva(24),
    cantidad_autorizada(25),
    cantidad_conteo(26),
    importe_articulo_sin_iva(27),
    importe_alta_iva(28),
    linea_articulo(29),
    rfc_proveedor(30),
    numero_proveedor(31),
    razon_social(32),
    numero_licitacion(33),
    fecha_hora_recepcion(34),
    fecha_hora_entrega(35),
    fecha_hora_alta(36),
    matricula_usuario_registro(37),
    partida_presupuestal(38),
    tipo_error(39),
    enviado(40),
    fecha_envio_prei(41),

    contrato_id(42),
    orden_id(43),
    created_at(44);
	
private int headerPosition = 0;
	
	private Altas(int headerPosition){
		this.headerPosition = headerPosition;
	}
	
	public int getHeaderPosition(){
		return headerPosition;
	}
}
