package modelos;

import java.sql.Timestamp;

public class OrdenReposicion {

	private String clas_ptal_origen;
    private String nombre_ooad;
    private String id_ooad;
    private String fecha_actualizacion;
    private String clas_ptal_entrega;
    private Timestamp nombre_unidad_entrega;
    private String numero_contrato;
    private String numero_licitacion;
    private String numero_evento_compranet;
    private String tipo_evento;
    private Timestamp fecha_inicio_contrato;
    private Timestamp fecha_termino_contrato;
    private double monto_minimo_contrato_sin_iva;
    private double monto_maximo_contrato_sin_iva;
    private double cantidad_minima_piezas;
    private double cantidad_maxima_piezas;
    private double monto_minimo_clave_sin_iva;
    private double monto_maximo_clave_sin_iva;
    private String numero_de_solicitud;
    private String numero_de_orden_reposicion;
    private String origen;
    private String gpo;
    private String gen;
    private String esp;
    private String dif;
    private String var;
    private String descripcion_articulo;
    private String unidad_presentacion;
    private String cantidad_presentacion;
    private String tipo_presentacion;
    private String razon_social;
    private String rfc_proveedor;
    private String numero_proveedor;
    private Timestamp fecha_expedicion;
    private Timestamp fecha_www;
    private Timestamp fecha_confirmacion;
    private Timestamp fecha_entrega;
    private Timestamp fecha_atencion;
    private Timestamp fecha_sello_alta_qr;
    private Timestamp fecha_cancelacion;
    private String fecha_entrega_inicial;
    private String fecha_entrega_ampliada;
    private String matricula_usuario_amplio;
    private String estatus_orden;
    private double precio_compra;
    private String iva;
    private String cantidad_solicitada;
    private double cantidad_comprometida;
    private double cantidad_atendida;
    private double importe_solicitado_iva;
    private double importe_comprometido_iva;
    private double importe_atendido_iva;
    private double importe_solicitado_sin_iva;
    private double importe_comprometido_sin_iva;
    private double importe_atendido_sin_iva;
    private double saldo_contrato;
    private double saldo_contrato_porcentaje;
    private Timestamp fecha_firma_contrato;
    private String orden_resguardo;
    private String clas_ptal_operador_logistico;
    private String nombre_operador_logistico;
    private String zona_operador_logistico;
    private double cantidad_alta_imss;
    private String fecha_alta_imss;
    private int contrato_id;
	/**
	 * @return the clas_ptal_origen
	 */
	public String getClas_ptal_origen() {
		return clas_ptal_origen;
	}
	/**
	 * @param clas_ptal_origen the clas_ptal_origen to set
	 */
	public void setClas_ptal_origen(String clas_ptal_origen) {
		this.clas_ptal_origen = clas_ptal_origen;
	}
	/**
	 * @return the nombre_ooad
	 */
	public String getNombre_ooad() {
		return nombre_ooad;
	}
	/**
	 * @param nombre_ooad the nombre_ooad to set
	 */
	public void setNombre_ooad(String nombre_ooad) {
		this.nombre_ooad = nombre_ooad;
	}
	/**
	 * @return the id_ooad
	 */
	public String getId_ooad() {
		return id_ooad;
	}
	/**
	 * @param id_ooad the id_ooad to set
	 */
	public void setId_ooad(String id_ooad) {
		this.id_ooad = id_ooad;
	}
	/**
	 * @return the fecha_actualizacion
	 */
	public String getFecha_actualizacion() {
		return fecha_actualizacion;
	}
	/**
	 * @param fecha_actualizacion the fecha_actualizacion to set
	 */
	public void setFecha_actualizacion(String fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}
	/**
	 * @return the clas_ptal_entrega
	 */
	public String getClas_ptal_entrega() {
		return clas_ptal_entrega;
	}
	/**
	 * @param clas_ptal_entrega the clas_ptal_entrega to set
	 */
	public void setClas_ptal_entrega(String clas_ptal_entrega) {
		this.clas_ptal_entrega = clas_ptal_entrega;
	}
	/**
	 * @return the nombre_unidad_entrega
	 */
	public Timestamp getNombre_unidad_entrega() {
		return nombre_unidad_entrega;
	}
	/**
	 * @param nombre_unidad_entrega the nombre_unidad_entrega to set
	 */
	public void setNombre_unidad_entrega(Timestamp nombre_unidad_entrega) {
		this.nombre_unidad_entrega = nombre_unidad_entrega;
	}
	/**
	 * @return the numero_contrato
	 */
	public String getNumero_contrato() {
		return numero_contrato;
	}
	/**
	 * @param numero_contrato the numero_contrato to set
	 */
	public void setNumero_contrato(String numero_contrato) {
		this.numero_contrato = numero_contrato;
	}
	/**
	 * @return the numero_licitacion
	 */
	public String getNumero_licitacion() {
		return numero_licitacion;
	}
	/**
	 * @param numero_licitacion the numero_licitacion to set
	 */
	public void setNumero_licitacion(String numero_licitacion) {
		this.numero_licitacion = numero_licitacion;
	}
	/**
	 * @return the numero_evento_compranet
	 */
	public String getNumero_evento_compranet() {
		return numero_evento_compranet;
	}
	/**
	 * @param numero_evento_compranet the numero_evento_compranet to set
	 */
	public void setNumero_evento_compranet(String numero_evento_compranet) {
		this.numero_evento_compranet = numero_evento_compranet;
	}
	/**
	 * @return the tipo_evento
	 */
	public String getTipo_evento() {
		return tipo_evento;
	}
	/**
	 * @param tipo_evento the tipo_evento to set
	 */
	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}
	/**
	 * @return the fecha_inicio_contrato
	 */
	public Timestamp getFecha_inicio_contrato() {
		return fecha_inicio_contrato;
	}
	/**
	 * @param fecha_inicio_contrato the fecha_inicio_contrato to set
	 */
	public void setFecha_inicio_contrato(Timestamp fecha_inicio_contrato) {
		this.fecha_inicio_contrato = fecha_inicio_contrato;
	}
	/**
	 * @return the fecha_termino_contrato
	 */
	public Timestamp getFecha_termino_contrato() {
		return fecha_termino_contrato;
	}
	/**
	 * @param fecha_termino_contrato the fecha_termino_contrato to set
	 */
	public void setFecha_termino_contrato(Timestamp fecha_termino_contrato) {
		this.fecha_termino_contrato = fecha_termino_contrato;
	}
	/**
	 * @return the monto_minimo_contrato_sin_iva
	 */
	public double getMonto_minimo_contrato_sin_iva() {
		return monto_minimo_contrato_sin_iva;
	}
	/**
	 * @param monto_minimo_contrato_sin_iva the monto_minimo_contrato_sin_iva to set
	 */
	public void setMonto_minimo_contrato_sin_iva(
			double monto_minimo_contrato_sin_iva) {
		this.monto_minimo_contrato_sin_iva = monto_minimo_contrato_sin_iva;
	}
	/**
	 * @return the monto_maximo_contrato_sin_iva
	 */
	public double getMonto_maximo_contrato_sin_iva() {
		return monto_maximo_contrato_sin_iva;
	}
	/**
	 * @param monto_maximo_contrato_sin_iva the monto_maximo_contrato_sin_iva to set
	 */
	public void setMonto_maximo_contrato_sin_iva(
			double monto_maximo_contrato_sin_iva) {
		this.monto_maximo_contrato_sin_iva = monto_maximo_contrato_sin_iva;
	}
	/**
	 * @return the cantidad_minima_piezas
	 */
	public double getCantidad_minima_piezas() {
		return cantidad_minima_piezas;
	}
	/**
	 * @param cantidad_minima_piezas the cantidad_minima_piezas to set
	 */
	public void setCantidad_minima_piezas(double cantidad_minima_piezas) {
		this.cantidad_minima_piezas = cantidad_minima_piezas;
	}
	/**
	 * @return the cantidad_maxima_piezas
	 */
	public double getCantidad_maxima_piezas() {
		return cantidad_maxima_piezas;
	}
	/**
	 * @param cantidad_maxima_piezas the cantidad_maxima_piezas to set
	 */
	public void setCantidad_maxima_piezas(double cantidad_maxima_piezas) {
		this.cantidad_maxima_piezas = cantidad_maxima_piezas;
	}
	/**
	 * @return the monto_minimo_clave_sin_iva
	 */
	public double getMonto_minimo_clave_sin_iva() {
		return monto_minimo_clave_sin_iva;
	}
	/**
	 * @param monto_minimo_clave_sin_iva the monto_minimo_clave_sin_iva to set
	 */
	public void setMonto_minimo_clave_sin_iva(double monto_minimo_clave_sin_iva) {
		this.monto_minimo_clave_sin_iva = monto_minimo_clave_sin_iva;
	}
	/**
	 * @return the monto_maximo_clave_sin_iva
	 */
	public double getMonto_maximo_clave_sin_iva() {
		return monto_maximo_clave_sin_iva;
	}
	/**
	 * @param monto_maximo_clave_sin_iva the monto_maximo_clave_sin_iva to set
	 */
	public void setMonto_maximo_clave_sin_iva(double monto_maximo_clave_sin_iva) {
		this.monto_maximo_clave_sin_iva = monto_maximo_clave_sin_iva;
	}
	/**
	 * @return the numero_de_solicitud
	 */
	public String getNumero_de_solicitud() {
		return numero_de_solicitud;
	}
	/**
	 * @param numero_de_solicitud the numero_de_solicitud to set
	 */
	public void setNumero_de_solicitud(String numero_de_solicitud) {
		this.numero_de_solicitud = numero_de_solicitud;
	}
	/**
	 * @return the numero_de_orden_reposicion
	 */
	public String getNumero_de_orden_reposicion() {
		return numero_de_orden_reposicion;
	}
	/**
	 * @param numero_de_orden_reposicion the numero_de_orden_reposicion to set
	 */
	public void setNumero_de_orden_reposicion(String numero_de_orden_reposicion) {
		this.numero_de_orden_reposicion = numero_de_orden_reposicion;
	}
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	/**
	 * @return the gpo
	 */
	public String getGpo() {
		return gpo;
	}
	/**
	 * @param gpo the gpo to set
	 */
	public void setGpo(String gpo) {
		this.gpo = gpo;
	}
	/**
	 * @return the gen
	 */
	public String getGen() {
		return gen;
	}
	/**
	 * @param gen the gen to set
	 */
	public void setGen(String gen) {
		this.gen = gen;
	}
	/**
	 * @return the esp
	 */
	public String getEsp() {
		return esp;
	}
	/**
	 * @param esp the esp to set
	 */
	public void setEsp(String esp) {
		this.esp = esp;
	}
	/**
	 * @return the dif
	 */
	public String getDif() {
		return dif;
	}
	/**
	 * @param dif the dif to set
	 */
	public void setDif(String dif) {
		this.dif = dif;
	}
	/**
	 * @return the var
	 */
	public String getVar() {
		return var;
	}
	/**
	 * @param var the var to set
	 */
	public void setVar(String var) {
		this.var = var;
	}
	/**
	 * @return the descripcion_articulo
	 */
	public String getDescripcion_articulo() {
		return descripcion_articulo;
	}
	/**
	 * @param descripcion_articulo the descripcion_articulo to set
	 */
	public void setDescripcion_articulo(String descripcion_articulo) {
		this.descripcion_articulo = descripcion_articulo;
	}
	/**
	 * @return the unidad_presentacion
	 */
	public String getUnidad_presentacion() {
		return unidad_presentacion;
	}
	/**
	 * @param unidad_presentacion the unidad_presentacion to set
	 */
	public void setUnidad_presentacion(String unidad_presentacion) {
		this.unidad_presentacion = unidad_presentacion;
	}
	/**
	 * @return the cantidad_presentacion
	 */
	public String getCantidad_presentacion() {
		return cantidad_presentacion;
	}
	/**
	 * @param cantidad_presentacion the cantidad_presentacion to set
	 */
	public void setCantidad_presentacion(String cantidad_presentacion) {
		this.cantidad_presentacion = cantidad_presentacion;
	}
	/**
	 * @return the tipo_presentacion
	 */
	public String getTipo_presentacion() {
		return tipo_presentacion;
	}
	/**
	 * @param tipo_presentacion the tipo_presentacion to set
	 */
	public void setTipo_presentacion(String tipo_presentacion) {
		this.tipo_presentacion = tipo_presentacion;
	}
	/**
	 * @return the razon_social
	 */
	public String getRazon_social() {
		return razon_social;
	}
	/**
	 * @param razon_social the razon_social to set
	 */
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	/**
	 * @return the rfc_proveedor
	 */
	public String getRfc_proveedor() {
		return rfc_proveedor;
	}
	/**
	 * @param rfc_proveedor the rfc_proveedor to set
	 */
	public void setRfc_proveedor(String rfc_proveedor) {
		this.rfc_proveedor = rfc_proveedor;
	}
	/**
	 * @return the numero_proveedor
	 */
	public String getNumero_proveedor() {
		return numero_proveedor;
	}
	/**
	 * @param numero_proveedor the numero_proveedor to set
	 */
	public void setNumero_proveedor(String numero_proveedor) {
		this.numero_proveedor = numero_proveedor;
	}
	/**
	 * @return the fecha_expedicion
	 */
	public Timestamp getFecha_expedicion() {
		return fecha_expedicion;
	}
	/**
	 * @param fecha_expedicion the fecha_expedicion to set
	 */
	public void setFecha_expedicion(Timestamp fecha_expedicion) {
		this.fecha_expedicion = fecha_expedicion;
	}
	/**
	 * @return the fecha_www
	 */
	public Timestamp getFecha_www() {
		return fecha_www;
	}
	/**
	 * @param fecha_www the fecha_www to set
	 */
	public void setFecha_www(Timestamp fecha_www) {
		this.fecha_www = fecha_www;
	}
	/**
	 * @return the fecha_confirmacion
	 */
	public Timestamp getFecha_confirmacion() {
		return fecha_confirmacion;
	}
	/**
	 * @param fecha_confirmacion the fecha_confirmacion to set
	 */
	public void setFecha_confirmacion(Timestamp fecha_confirmacion) {
		this.fecha_confirmacion = fecha_confirmacion;
	}
	/**
	 * @return the fecha_entrega
	 */
	public Timestamp getFecha_entrega() {
		return fecha_entrega;
	}
	/**
	 * @param fecha_entrega the fecha_entrega to set
	 */
	public void setFecha_entrega(Timestamp fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	/**
	 * @return the fecha_atencion
	 */
	public Timestamp getFecha_atencion() {
		return fecha_atencion;
	}
	/**
	 * @param fecha_atencion the fecha_atencion to set
	 */
	public void setFecha_atencion(Timestamp fecha_atencion) {
		this.fecha_atencion = fecha_atencion;
	}
	/**
	 * @return the fecha_sello_alta_qr
	 */
	public Timestamp getFecha_sello_alta_qr() {
		return fecha_sello_alta_qr;
	}
	/**
	 * @param fecha_sello_alta_qr the fecha_sello_alta_qr to set
	 */
	public void setFecha_sello_alta_qr(Timestamp fecha_sello_alta_qr) {
		this.fecha_sello_alta_qr = fecha_sello_alta_qr;
	}
	/**
	 * @return the fecha_cancelacion
	 */
	public Timestamp getFecha_cancelacion() {
		return fecha_cancelacion;
	}
	/**
	 * @param fecha_cancelacion the fecha_cancelacion to set
	 */
	public void setFecha_cancelacion(Timestamp fecha_cancelacion) {
		this.fecha_cancelacion = fecha_cancelacion;
	}
	/**
	 * @return the fecha_entrega_inicial
	 */
	public String getFecha_entrega_inicial() {
		return fecha_entrega_inicial;
	}
	/**
	 * @param fecha_entrega_inicial the fecha_entrega_inicial to set
	 */
	public void setFecha_entrega_inicial(String fecha_entrega_inicial) {
		this.fecha_entrega_inicial = fecha_entrega_inicial;
	}
	/**
	 * @return the fecha_entrega_ampliada
	 */
	public String getFecha_entrega_ampliada() {
		return fecha_entrega_ampliada;
	}
	/**
	 * @param fecha_entrega_ampliada the fecha_entrega_ampliada to set
	 */
	public void setFecha_entrega_ampliada(String fecha_entrega_ampliada) {
		this.fecha_entrega_ampliada = fecha_entrega_ampliada;
	}
	/**
	 * @return the matricula_usuario_amplio
	 */
	public String getMatricula_usuario_amplio() {
		return matricula_usuario_amplio;
	}
	/**
	 * @param matricula_usuario_amplio the matricula_usuario_amplio to set
	 */
	public void setMatricula_usuario_amplio(String matricula_usuario_amplio) {
		this.matricula_usuario_amplio = matricula_usuario_amplio;
	}
	/**
	 * @return the estatus_orden
	 */
	public String getEstatus_orden() {
		return estatus_orden;
	}
	/**
	 * @param estatus_orden the estatus_orden to set
	 */
	public void setEstatus_orden(String estatus_orden) {
		this.estatus_orden = estatus_orden;
	}
	/**
	 * @return the precio_compra
	 */
	public double getPrecio_compra() {
		return precio_compra;
	}
	/**
	 * @param precio_compra the precio_compra to set
	 */
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	/**
	 * @return the iva
	 */
	public String getIva() {
		return iva;
	}
	/**
	 * @param iva the iva to set
	 */
	public void setIva(String iva) {
		this.iva = iva;
	}
	/**
	 * @return the cantidad_solicitada
	 */
	public String getCantidad_solicitada() {
		return cantidad_solicitada;
	}
	/**
	 * @param cantidad_solicitada the cantidad_solicitada to set
	 */
	public void setCantidad_solicitada(String cantidad_solicitada) {
		this.cantidad_solicitada = cantidad_solicitada;
	}
	/**
	 * @return the cantidad_comprometida
	 */
	public double getCantidad_comprometida() {
		return cantidad_comprometida;
	}
	/**
	 * @param cantidad_comprometida the cantidad_comprometida to set
	 */
	public void setCantidad_comprometida(double cantidad_comprometida) {
		this.cantidad_comprometida = cantidad_comprometida;
	}
	/**
	 * @return the cantidad_atendida
	 */
	public double getCantidad_atendida() {
		return cantidad_atendida;
	}
	/**
	 * @param cantidad_atendida the cantidad_atendida to set
	 */
	public void setCantidad_atendida(double cantidad_atendida) {
		this.cantidad_atendida = cantidad_atendida;
	}
	/**
	 * @return the saldo_contrato_porcentaje
	 */
	public double getSaldo_contrato_porcentaje() {
		return saldo_contrato_porcentaje;
	}
	/**
	 * @param saldo_contrato_porcentaje the saldo_contrato_porcentaje to set
	 */
	public void setSaldo_contrato_porcentaje(double saldo_contrato_porcentaje) {
		this.saldo_contrato_porcentaje = saldo_contrato_porcentaje;
	}
	/**
	 * @return the importe_comprometido_iva
	 */
	public double getImporte_comprometido_iva() {
		return importe_comprometido_iva;
	}
	/**
	 * @param importe_comprometido_iva the importe_comprometido_iva to set
	 */
	public void setImporte_comprometido_iva(double importe_comprometido_iva) {
		this.importe_comprometido_iva = importe_comprometido_iva;
	}
	/**
	 * @return the importe_atendido_iva
	 */
	public double getImporte_atendido_iva() {
		return importe_atendido_iva;
	}
	/**
	 * @param importe_atendido_iva the importe_atendido_iva to set
	 */
	public void setImporte_atendido_iva(double importe_atendido_iva) {
		this.importe_atendido_iva = importe_atendido_iva;
	}
	/**
	 * @return the importe_solicitado_sin_iva
	 */
	public double getImporte_solicitado_sin_iva() {
		return importe_solicitado_sin_iva;
	}
	/**
	 * @param importe_solicitado_sin_iva the importe_solicitado_sin_iva to set
	 */
	public void setImporte_solicitado_sin_iva(double importe_solicitado_sin_iva) {
		this.importe_solicitado_sin_iva = importe_solicitado_sin_iva;
	}
	/**
	 * @return the importe_solicitado_iva
	 */
	public double getImporte_solicitado_iva() {
		return importe_solicitado_iva;
	}
	/**
	 * @param importe_solicitado_iva the importe_solicitado_iva to set
	 */
	public void setImporte_solicitado_iva(double importe_solicitado_iva) {
		this.importe_solicitado_iva = importe_solicitado_iva;
	}
	/**
	 * @return the importe_comprometido_sin_iva
	 */
	public double getImporte_comprometido_sin_iva() {
		return importe_comprometido_sin_iva;
	}
	/**
	 * @param importe_comprometido_sin_iva the importe_comprometido_sin_iva to set
	 */
	public void setImporte_comprometido_sin_iva(double importe_comprometido_sin_iva) {
		this.importe_comprometido_sin_iva = importe_comprometido_sin_iva;
	}
	/**
	 * @return the importe_atendido_sin_iva
	 */
	public double getImporte_atendido_sin_iva() {
		return importe_atendido_sin_iva;
	}
	/**
	 * @param importe_atendido_sin_iva the importe_atendido_sin_iva to set
	 */
	public void setImporte_atendido_sin_iva(double importe_atendido_sin_iva) {
		this.importe_atendido_sin_iva = importe_atendido_sin_iva;
	}
	/**
	 * @return the saldo_contrato
	 */
	public double getSaldo_contrato() {
		return saldo_contrato;
	}
	/**
	 * @param saldo_contrato the saldo_contrato to set
	 */
	public void setSaldo_contrato(double saldo_contrato) {
		this.saldo_contrato = saldo_contrato;
	}
	/**
	 * @return the fecha_firma_contrato
	 */
	public Timestamp getFecha_firma_contrato() {
		return fecha_firma_contrato;
	}
	/**
	 * @param fecha_firma_contrato the fecha_firma_contrato to set
	 */
	public void setFecha_firma_contrato(Timestamp fecha_firma_contrato) {
		this.fecha_firma_contrato = fecha_firma_contrato;
	}
	/**
	 * @return the orden_resguardo
	 */
	public String getOrden_resguardo() {
		return orden_resguardo;
	}
	/**
	 * @param orden_resguardo the orden_resguardo to set
	 */
	public void setOrden_resguardo(String orden_resguardo) {
		this.orden_resguardo = orden_resguardo;
	}
	/**
	 * @return the clas_ptal_operador_logistico
	 */
	public String getClas_ptal_operador_logistico() {
		return clas_ptal_operador_logistico;
	}
	/**
	 * @param clas_ptal_operador_logistico the clas_ptal_operador_logistico to set
	 */
	public void setClas_ptal_operador_logistico(
			String clas_ptal_operador_logistico) {
		this.clas_ptal_operador_logistico = clas_ptal_operador_logistico;
	}
	/**
	 * @return the nombre_operador_logistico
	 */
	public String getNombre_operador_logistico() {
		return nombre_operador_logistico;
	}
	/**
	 * @param nombre_operador_logistico the nombre_operador_logistico to set
	 */
	public void setNombre_operador_logistico(String nombre_operador_logistico) {
		this.nombre_operador_logistico = nombre_operador_logistico;
	}
	/**
	 * @return the zona_operador_logistico
	 */
	public String getZona_operador_logistico() {
		return zona_operador_logistico;
	}
	/**
	 * @param zona_operador_logistico the zona_operador_logistico to set
	 */
	public void setZona_operador_logistico(String zona_operador_logistico) {
		this.zona_operador_logistico = zona_operador_logistico;
	}
	/**
	 * @return the cantidad_alta_imss
	 */
	public double getCantidad_alta_imss() {
		return cantidad_alta_imss;
	}
	/**
	 * @param cantidad_alta_imss the cantidad_alta_imss to set
	 */
	public void setCantidad_alta_imss(double cantidad_alta_imss) {
		this.cantidad_alta_imss = cantidad_alta_imss;
	}
	/**
	 * @return the fecha_alta_imss
	 */
	public String getFecha_alta_imss() {
		return fecha_alta_imss;
	}
	/**
	 * @param fecha_alta_imss the fecha_alta_imss to set
	 */
	public void setFecha_alta_imss(String fecha_alta_imss) {
		this.fecha_alta_imss = fecha_alta_imss;
	}
	/**
	 * @return the contrato_id
	 */
	public int getContrato_id() {
		return contrato_id;
	}
	/**
	 * @param contrato_id the contrato_id to set
	 */
	public void setContrato_id(int contrato_id) {
		this.contrato_id = contrato_id;
	}
}
