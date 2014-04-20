package entidades;
/**
 * @author Leo-PC:U83U06 Transporte_Abreu Hecho por : Enriquillo, Erick Abreu,
 * Chang I-hua Fecha : 2013-Primer semestre
 */
public class Ncf {

    private int codigo;
    private String descripcion;
    private String prefijo;
    private int tipo_ncf;
    private int sec_inicio;
    private int sec_final;
    private int actual;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public Integer getTipo_ncf() {
        return tipo_ncf;
    }

    public void setTipo_ncf(int tipo_ncf) {
        this.tipo_ncf = tipo_ncf;
    }

    public int getSec_inicio() {
        return sec_inicio;
    }

    public void setSec_inicio(int sec_inicio) {
        this.sec_inicio = sec_inicio;
    }

    public int getSec_final() {
        return sec_final;
    }

    public void setSec_final(int sec_final) {
        this.sec_final = sec_final;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    @Override
    public String toString(){
        return descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ncf other = (Ncf) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
}
