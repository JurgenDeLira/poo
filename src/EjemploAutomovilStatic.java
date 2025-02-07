import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        AutomovilPrivate.setCapacidadEstanqueEstatico(45);

        AutomovilPrivate auto = new AutomovilPrivate(
                "Honda", "Corolla");
        auto.setCilindrada(2.0);
        auto.setColor("Negro");

        AutomovilPrivate auto2 = new AutomovilPrivate(
                "Mazda", "BT-50",
                "Rojo", 3.0);

        System.out.println("auto2.leerFabricante() = " + auto2.getFabricante());

        AutomovilPrivate nissan1 = new AutomovilPrivate("Nissan",
                "Navara", "Gris oscuro", 3.5, 50);
        AutomovilPrivate nissan2 = new AutomovilPrivate("Nissan",
                "Navara", "Gris oscuro", 3.5, 50);
        nissan2.setColor("Amarillo");
        AutomovilPrivate.setColorPatente("Azul");

        AutomovilPrivate auto3= new AutomovilPrivate();

        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(nissan1.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("AutomovilPrivate.getColorPatente() = " + AutomovilPrivate.getColorPatente());
        System.out.println("Kilómentros por litros = " + AutomovilPrivate.calcularConsumoEstatico(
                300, 60));
        System.out.println("Kilómentros por litros = " + auto.calcularConsumoEstatico(
                300, 60));
        System.out.println("Kilómentros por litros = " + auto2.calcularConsumoEstatico(
                300, 60));
        System.out.println("Kilómentros por litros = " + nissan1.calcularConsumoEstatico(
                300, 60));

    }
}
