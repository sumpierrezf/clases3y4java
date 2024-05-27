package clase3_4;

public class Main {
    public static void main(String[] args) {
        // CREACION DE LOS OBJETOS
        Auto auto1 = new Auto("Corolla", "sedan", 1.6, 2022, 50);
        Auto auto2 = new Auto("208", "Hatchback");

        // EJECUCION DE LOS METODOS
        System.out.println(auto1.arrancar());
        System.out.println(auto1.acelerar(2000));
        System.out.println("Consumo de gasolina: " + auto1.consumoGasolina(500));

        System.out.println(auto2.arrancar());
        System.out.println(auto2.acelerar(2000));
        // SETEAR VALOR A UN ATRIBUTO DEL OBJETO NUMERO 2, QUE NO FUE DECLARADO EN SU MOMENTO PARA PODER EJECUTAR EL METODO
        auto2.setCapacidadTanque(45);
        System.out.println("Consumo de gasolina: " + auto2.consumoGasolina(500));

        // SETEAR ATRIBUTO STATIC DE LA CLASE AUTO CON UN NUEVO VALOR
        System.out.println("Cantidad de llantas " + Auto.getCantidadLlantas());
        Auto.setCantidadLlantas(6);
        System.out.println("Cantidad de llantas " + Auto.getCantidadLlantas());

        Auto.setPrecioGasolina(1.2);
        System.out.println("El precio de la gasolina es : " + Auto.getPrecioGasolina() + " dolares.");
    }
}
