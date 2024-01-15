import java.util.List;
import java.util.Scanner;

public class Gobernacion {
    private List<Departamento> departamento;
    private List<Municipios> municipios;
    private Gobernador gobernador;

    public Gobernacion(List<Departamento> departamento, List<Municipios> municipios, Gobernador gobernador) {
        this.departamento = departamento;
        this.municipios = municipios;
        this.gobernador = gobernador;
    }

    public List<Departamento> getDepartamento() {
        return departamento;
    }


    public void setDepartamento(List<Departamento> departamento) {
        this.departamento = departamento;
    }
 
    public List<Municipios> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipios> municipios) {
        this.municipios = municipios;
    }

    public Gobernador getGobernador() {
        return gobernador;
    }

    public void setGobernador(Gobernador gobernador) {
        this.gobernador = gobernador;
    }

    public void agregarDepartamento(String nombreGobernador, int telefonoGobernador, String correoGobernador, String partidoPoliticoGobernador, String nombreDepartamento) {

        Scanner leer = new Scanner(System.in);

        System.out.println("---Ingrese Departamento y gobernador a cargo---");
        System.out.println("Nombre Departamento:");
        nombreDepartamento = leer.nextLine();
        Departamento departamento1 = new Departamento(nombreDepartamento);
        //Agregar departamento a la lista de departamentos
        departamento.add(departamento1);

        System.out.println("Nombre Gobernador: ");
        nombreGobernador = leer.nextLine();

        System.out.println("Telefono: ");
        telefonoGobernador = leer.nextInt();
        System.out.println("Correo: ");
        correoGobernador = leer.nextLine();
        System.out.println("Partido Politico: ");
        partidoPoliticoGobernador = leer.nextLine();

        Gobernador gobernador1 = new Gobernador(nombreGobernador, telefonoGobernador, correoGobernador, partidoPoliticoGobernador);

        System.out.println("El nuevo gobernador es "+ gobernador1.getNombre() + "del departamento "+ departamento1.getNombre());

    }

    public void agregarMunicipio(){
        Scanner leer = new Scanner(System.in);
        System.out.println("---Ingresar municipio---");
        System.out.println("Departamentos Disponibles:");
        for (int i = 0; i < departamento.size(); i++) {
            System.out.println((i + 1) + ". " + departamento.get(i).getNombre());
        }
        
    }


    
    
}
