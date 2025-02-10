import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        AutomovilPrivate.setCapacidadEstanqueEstatico(45);

        AutomovilPrivate auto = new AutomovilPrivate(
                "Honda", "Corolla");
        auto.setCilindrada(2.0);
        auto.setColor(AutomovilPrivate.COLOR_BLANCO);


        AutomovilPrivate auto2 = new AutomovilPrivate(
                "Mazda", "BT-50",
                AutomovilPrivate.COLOR_GRIS, 3.0);

        System.out.println("auto2.leerFabricante() = " + auto2.getFabricante());

        AutomovilPrivate nissan1 = new AutomovilPrivate("Nissan",
                "Navara", AutomovilPrivate.COLOR_ROJO, 3.5, 50);
        AutomovilPrivate nissan2 = new AutomovilPrivate("Nissan",
                "Navara", AutomovilPrivate.COLOR_ROJO, 3.5, 50);
        nissan2.setColor(AutomovilPrivate.COLOR_AMARILLO);
        AutomovilPrivate.setColorPatente(AutomovilPrivate.COLOR_AZUL);

        AutomovilPrivate auto3= new AutomovilPrivate();

        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(nissan1.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("AutomovilPrivate.getColorPatente() = " + AutomovilPrivate.getColorPatente());
        System.out.println("Kilómetros por litros = " + AutomovilPrivate.calcularConsumoEstatico(
                300, 60));
        System.out.println("Kilómetros por litros = " + auto.calcularConsumoEstatico(
                300, 60));

        System.out.println("Velocidad máxima carretera: " + AutomovilPrivate.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + AutomovilPrivate.VELOCIDAD_MAX_CIUDAD);

    }
}
