public class Vendedor {
    public String nombre;
    public String area;
    private double montoVendido;
    private int porcentajeComision;
    private int meta;


    public Vendedor(String nombre,String area,double montoVendido,int porcentajeComision,int meta){
        this.nombre = nombre;
        this.area = area;
        this.montoVendido = montoVendido;
        this.porcentajeComision = porcentajeComision;
        this.meta = meta;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int vendido) {
        this.meta = meta;
    }

    public double calcularComision(){
       return (porcentajeComision*0.01)*montoVendido;

    }
    public double calcularIngresoTotal(){

        return montoVendido+calcularComision();
    }

    public String estadoCuplimiento(){

        if(meta>=90){
            return "el vendedor "+nombre+"es sobresaliente";
        }
        else if(meta>=70 && meta<=89){
            return " el vendedor "+nombre+" es aceptable";

        }
        else{
            return " el vendedor "+nombre+" requiere segumiento comcercial";
        }

    }
    public void mensajeDesempeno(){
        System.out.println("***********DATOS VENDEDOR********* ");
        System.out.println("El vendedor: "+nombre);
        System.out.println("de el area de: "+area);
        System.out.println("vendio un monto de:"+getMontoVendido());
        System.out.println("von un porcentaje de comision de:"+getPorcentajeComision());
        System.out.println("cumpliendo una meta de de:"+getMeta());
        System.out.println("su comision fue de :"+calcularComision());
        System.out.println("su venta total aumentada la comision fue:"+calcularIngresoTotal());
        System.out.println("su rendimiento finalmente fue:"+estadoCuplimiento());



    }


}
