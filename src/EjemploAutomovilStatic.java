import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        AutomovilPrivate.setCapacidadEstanqueEstatico(45);
        Motor motorAuto = new Motor(2.0, TipoMotor.BENCINA);
        AutomovilPrivate auto = new AutomovilPrivate(
                "Honda", "Corolla");
        auto.setMotor(motorAuto);
        auto.setEstanque(new Estanque());
        auto.setColor(Color.BLANCO);
        auto.setTipo(TipoAutomovil.HATCHBACK);


        AutomovilPrivate auto2 = new AutomovilPrivate(
                "Mazda", "BT-50",
                Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
                auto2.setTipo(TipoAutomovil.PICKUP);
                //auto2.setEstanque(new Estanque());
        System.out.println("auto2.leerFabricante() = " + auto2.getFabricante());

        AutomovilPrivate nissan1 = new AutomovilPrivate("Nissan",
                "Navara", Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL), new Estanque(50));
        nissan1.setTipo(TipoAutomovil.PICKUP);
        AutomovilPrivate nissan2 = new AutomovilPrivate("Nissan",
                "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setColor(Color.AMARILLO);
        AutomovilPrivate.setColorPatente(Color.AZUL);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        AutomovilPrivate auto3= new AutomovilPrivate();

        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(nissan1.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("AutomovilPrivate.getColorPatente() = " + AutomovilPrivate.getColorPatente().getColor());
        System.out.println("Kilómetros por litros = " + AutomovilPrivate.calcularConsumoEstatico(
                300, 60));
        System.out.println("Kilómetros por litros = " + auto.calcularConsumoEstatico(
                300, 60));

        System.out.println("Velocidad máxima carretera: " + AutomovilPrivate.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + AutomovilPrivate.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoAuto = auto.getTipo();
        System.out.println("Tipo auto: " + tipoAuto.getNombre());
        System.out.println("Tipo desc. auto: " + tipoAuto.getDescripcion());

        System.out.println(auto2.calcularConsumo(300, 70));

    }
}
