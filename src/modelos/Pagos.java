package modelos;

public enum Pagos {

	un(0),
    comprobante(1),
    origen(2),
    usuario(3),
    tipo_cbte(4),
    subtipo_cbte(5),
    no_proveedor(6),
    nombre_proveedor(7),
    contrato(8),
    factura(9),
    plantilla_contable(10),
    fecha_emision(11),
    fecha_contable(12),
    fecha_factura(13),
    fecha_prog_pago(14),
    fecha_pago(15),
    importe_capturado(16),
    importe_mxn(17),
    moneda(18),
    cierre_man(19),
    estado_cierre(20),
    estado_entrada(21),
    estado_ppto(22),
    estado_paridad(23),
    estado_aprobacion(24),
    estado_contabilizacion(25),
    estado_pago(26),
    pagos(27),
    porcent_hp(28),
    metodo(29),
    negociado_nafin(30),
    banco(31),
    cuenta_corta_bancaria(32),
    referencia_pago(33),
    importe_pagado(34),
    importe_bruto_pago(35),
    descuento(36),
    no_prov_env_pago(37),
    nombre_prov_env_pago(38),
    asiento_ac(39),
    fecha_asiento_ac(40),
    asiento_py(41),
    fecha_asiento_py(42),
    contrato_id(43),
    alta_id(44),
    created_at(45);
	
	
private int headerPosition = 0;
	


	private Pagos(int headerPosition){
		this.headerPosition = headerPosition;
	}
	
	public int getHeaderPosition(){
		return headerPosition;
	}
}
