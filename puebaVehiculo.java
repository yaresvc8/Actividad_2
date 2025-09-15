class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("La bicicleta avanza pedaleando.");
    }
}

public class puebaVehiculo {
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo();
        v1.moverse();

        Vehiculo v2 = new Bicicleta(); 
        v2.moverse();
    }
}
