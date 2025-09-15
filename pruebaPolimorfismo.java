class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}

class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }
}

public class pruebaPolimorfismo {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.presentarse();

        Persona p2 = new Estudiante();
        p2.presentarse();

        Persona p3 = new Profesor(); 
        p3.presentarse();
    }
}

