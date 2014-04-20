package entidades;

import java.util.Date;

/**
 *@author Leo-PC:U83U06
 *Transporte_Abreu
 *Hecho por : Enriquillo, Erick Abreu, Chang I-hua
 *Fecha : 2013-Primer semestre
 */
public class DetalleFactura {

    private int codigo;
    private int cod_factura;
    private Date fecha;
    private String tipo_carga;
    private Ubicacion cod_origen;
    private Ubicacion cod_destino;
    private String num_conduce;
    private String num_contenedor;
    private Double valor;
    private int cod_transporte;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(int cod_factura) {
        this.cod_factura = cod_factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo_carga() {
        return tipo_carga;
    }

    public void setTipo_carga(String tipo_carga) {
        this.tipo_carga = tipo_carga;
    }

    public Ubicacion getCod_origen() {
        return cod_origen;
    }

    public void setCod_origen(Ubicacion cod_origen) {
        this.cod_origen = cod_origen;
    }

    public Ubicacion getCod_destino() {
        return cod_destino;
    }

    public void setCod_destino(Ubicacion cod_destino) {
        this.cod_destino = cod_destino;
    }

    public String getNum_conduce() {
        return num_conduce;
    }

    public void setNum_conduce(String num_conduce) {
        this.num_conduce = num_conduce;
    }

    public String getNum_contenedor() {
        return num_contenedor;
    }

    public void setNum_contenedor(String num_contenedor) {
        this.num_contenedor = num_contenedor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getCod_transporte() {
        return cod_transporte;
    }

    public void setCod_transporte(int cod_transporte) {
        this.cod_transporte = cod_transporte;
    }
}
