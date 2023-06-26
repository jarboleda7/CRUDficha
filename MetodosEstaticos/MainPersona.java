package poo.MetodosEstaticos;

public class MainPersona {

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
