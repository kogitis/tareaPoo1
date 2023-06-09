import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class RegistoPersonas {


    private List<Cliente> clientes = new ArrayList<>();
    private List<Empleado> empleados = new ArrayList<>();
    private List<Repartidor> repartidores = new ArrayList<>();
    private List<Gerente> gerentes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Repartidor> getRepartidores() {
        return repartidores;
    }

    public List<Gerente> getGerentes() {
        return gerentes;
    }

    public void registrarClientes(String nombre, LocalDateTime fechaNacimiento, String email, int telefono, String domicilio){
        Cliente cliente = new Cliente(nombre, fechaNacimiento, email, telefono, domicilio);
        clientes.add(cliente);
    }
    /*public Repartidor buscarRepartidores(int codigo){
        return
    }*/
    public Cliente buscarClientes(String email){
        Iterator<Cliente> iteradorClientes = clientes.iterator();
        Cliente c = null;
        while (iteradorClientes.hasNext()) {
            Cliente cliente = iteradorClientes.next();
            if (cliente.getEmail().equals(email)){
                return cliente;
            }
        }
        return c;
    }
}
