// ==========================
// EJERCICIO 1: Cambiar la firma al sobrescribir
// ==========================

class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    
    @Override
    public void hacerSonido() {  
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

// ==========================
// EJERCICIO 2: Sobrescribir sin @Override
// ==========================

class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se mueve.");
    }
}

class Bicicleta extends Vehiculo {
    public void moverse() {
        System.out.println("La bicicleta avanza pedaleando.");
    }
}

// ==========================
// CLASE DE PRUEBA
// ==========================

public class pruebaMain{
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        Animal a = new Animal();
        a.hacerSonido();

        Perro p = new Perro();
        p.hacerSonido();

        System.out.println("Ejercicio 2");
        Vehiculo v1 = new Vehiculo();
        v1.moverse();

        Vehiculo v2 = new Bicicleta();
        v2.moverse();
    }
}

