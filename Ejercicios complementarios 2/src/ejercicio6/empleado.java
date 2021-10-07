
package ejercicio6;


public class empleado {
    
    private String nombre;
    private String apellido;
    private int DNI;
    private int horasTrabajadas;
    private double valorPorHora;

    public empleado(String nombre, String apellido, int DNI, int horasTrabajadas, double valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
    
    
}
