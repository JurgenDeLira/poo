public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        AutomovilPrivate.setCapacidadEstanqueEstatico(45);

        AutomovilPrivate auto = new AutomovilPrivate(
                "Honda", "Corolla");
        auto.setCilindrada(2.0);
        auto.setColor(Color.BLANCO);
        auto.setTipo(TipoAutomovil.HATCHBACK);


        AutomovilPrivate auto2 = new AutomovilPrivate(
                "Mazda", "BT-50",
                Color.ROJO, 3.0);
                auto2.setTipo(TipoAutomovil.PICKUP);
        System.out.println("auto2.leerFabricante() = " + auto2.getFabricante());

        TipoAutomovil tipoAuto = auto.getTipo();
        System.out.println("Tipo auto: " + tipoAuto.getNombre());
        System.out.println("Tipo desc. auto: " + tipoAuto.getDescripcion());

    }
}
