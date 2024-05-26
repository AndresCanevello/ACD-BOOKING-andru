package classes;

public class Departamento extends Alojamiento {

    //atributos
    private int numeroPiso;
    private int tamañoDepartamento;
    private String servicioExtra;

    //constructores


    public Departamento(double precioXAlojar, String descripcion, String nombre, String direccion, String zona, String comentarios,  boolean disponibilidad, int cantReservas,int numeroPiso, int tamañoDepartamento, String servicioExtra)
    {
        super(precioXAlojar,descripcion, nombre, direccion,zona,comentarios,disponibilidad,cantReservas);
        this.numeroPiso = numeroPiso;
        this.tamañoDepartamento = tamañoDepartamento;
        this.servicioExtra = servicioExtra;
    }
    public Departamento()
    {
        super();
        this.numeroPiso = 0;
        this.tamañoDepartamento = 0;
        this.servicioExtra = "";
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public void setTamañoDepartamento(int tamañoDepartamento) {
        this.tamañoDepartamento = tamañoDepartamento;
    }

    public void setServicioExtra(String servicioExtra) {
        this.servicioExtra = servicioExtra;
    }

    //getters
    public String getServicioExtra() {
        return servicioExtra;
    }
    public int getTamañoDepartamento() {
        return tamañoDepartamento;
    }
    public int getNumeroPiso() {
        return numeroPiso;
    }

    //metodos

    @Override
    public String toString() {
        return super.toString()+"\n"+"Departamento{" +
                "numeroPiso=" + numeroPiso +
                ", tamañoDepartamento=" + tamañoDepartamento +
                ", servicioExtra='" + servicioExtra + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = super.equals(obj);
        if ( obj != null && obj instanceof Departamento)
        {
            Departamento aux = (Departamento) obj;
            if( aux.getNumeroPiso() != numeroPiso )
            {
                rta = false;
            }
        }
        return rta;
    }
}