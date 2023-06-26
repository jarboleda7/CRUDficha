package poo.MetodosEstaticos;
public class Persona {
    //Encapsular las variables
    private String nombre;
    private int edad;
    // Crear constructor para inicializar el nombre y la edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println(nombre + " " + edad);
    }

    //Método estático para definir el mayor
    public static Persona Persmayor(Persona per1, Persona per2) {
        if (per1.edad >= per2.edad)
            return per1;
        else
            return per2;
    }

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan tiene: ", 53);
        Persona persona2 = new Persona("Jairo tiene: ", 55);
        persona1.imprimir();
        persona2.imprimir();
        Persona personaMayor = Persona.Persmayor(persona1, persona2);
        System.out.println("La persona con mayor edad es: ");
        personaMayor.imprimir();

    }
}


