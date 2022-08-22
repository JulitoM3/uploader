package modelos;

public enum Notas {

	
	un_nc(0),
    nota_de_credito(1),
    secuencia(2),
    no_proveedor(3),
    origen(4),
    importe_aplicado(5),
    importe_original(6),
    fecha_emision(7),
    fecha_documento(8),
    fecha_emision_original(9),
    fecha_documento_original(10),
    contrato(11),
    pedido(12),
    motivo_nc(13),
    tipo(14),
    estado_nc(15),
    bit_usuario_emision(16),
    bit_fecha_emision(17),
    bit_usuario_ultima_actualiz(18),
    bit_fecha_ultima_actualiz(19),
    cr_un_cr(20),
    cr_comprobante(21),
    cr_tipo_cr(22),
    cr_fecha_emision(23),
    cr_fecha_prog_pago(24),
    cr_fecha_pago(25),
    cr_importe_mxn(26),
    cr_moneda(27),
    cr_cierre_manual(28),
    cr_estado_cierre(29),
    cr_estado_entrada(30),
    cr_estado_presupuesto(31),
    cr_estado_aprobacion(32),
    cr_estado_contabilizacion(33),
    cr_estado_pago(34),
    cr_hoja_de_pago(35),
    cr_importe_bruto_a_pagar(36),
    cr_descuento(37),
    cr_importe_pagado(38),
    pago_id(39),
    created_at(40);
	
	
private int headerPosition = 0;
	
	private Notas(int headerPosition){
		this.headerPosition = headerPosition;
	}
	
	public int getHeaderPosition(){
		return headerPosition;
	}

}
