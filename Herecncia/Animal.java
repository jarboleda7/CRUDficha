package poo.Herecncia;

class Animal {
    protected String nombre, color;

    public Animal(String nombre,String color) {
        this.nombre = nombre;
        this.color=color;
    }

    public void comer() {
        System.out.println("El animal : "+" " + nombre +" "+"Color :"+color+ " está comiendo.");
    }
}
