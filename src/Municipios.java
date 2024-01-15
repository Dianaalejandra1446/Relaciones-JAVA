public class Municipios {
    private String nombre;
    private double poblacionTotal;
    private double areaTotal;
    
    public Municipios(String nombre, double poblacionTotal, double areaTotal) {
        this.nombre = nombre;
        this.poblacionTotal = poblacionTotal;
        this.areaTotal = areaTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPoblacionTotal() {
        return poblacionTotal;
    }

    public void setPoblacionTotal(double poblacionTotal) {
        this.poblacionTotal = poblacionTotal;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    
}
