public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        AutomovilPrivate.setCapacidadEstanqueEstatico(45);
        AutomovilPrivate auto = new AutomovilPrivate(
                "Honda", "Corolla");
        auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        auto.setEstanque(new Estanque());
        auto.setColor(Color.BLANCO);
        auto.setTipo(TipoAutomovil.HATCHBACK);


        Motor motorAuto2 = new Motor(3.0, TipoMotor.DIESEL);
        AutomovilPrivate auto2 = new AutomovilPrivate(
                "Mazda", "BT-50",
                Color.ROJO, motorAuto2);
                auto2.setEstanque(new Estanque(45));
                auto2.setTipo(TipoAutomovil.PICKUP);
        System.out.println("auto2.leerFabricante() = " + auto2.getFabricante());

        TipoAutomovil tipo = auto.getTipo();
        System.out.println("Tipo auto: " + tipo.getNombre());
        System.out.println("Tipo desc. auto: " + tipo.getDescripcion());

        switch (tipo){
            case CONVERTIBLE ->
                System.out.println("El automóvil es deportivo y descapotable de dos puertas");
            case COUPE ->
                System.out.println("Es un automóvil pequeño de dos puertas y típicamnete deportivo");
            case FURGON ->
                System.out.println("Es un automóvil utilitario de transporte de empresas");
            case HATCHBACK ->
                System.out.println("Es un automóvil mediano compacto, aspecto deportivo");
            case PICKUP ->
                System.out.println("Es un automóvil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automóvil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automóvil más grande, con maleta grande...");
            case SUV ->
                    System.out.println("Es un automóvil todo terreno deportivo");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }


    }
}
