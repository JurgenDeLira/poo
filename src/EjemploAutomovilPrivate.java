import java.util.Date;

public class EjemploAutomovilPrivate {
    public static void main(String[] args) {

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

        AutomovilPrivate auto3= new AutomovilPrivate();
        Date fecha = new Date();
        System.out.println("¿Son iguales? " + (nissan1 == nissan2));
        System.out.println("¿Son iguales con equals? " + (nissan1.equals(nissan2))); //Es lo mismo que arriba
        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(nissan1.verDetalle());

        System.out.println(auto3.equals(fecha));
        System.out.println(nissan1);
        System.out.println(nissan1.toString());

        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());

        System.out.println(auto2.acelerarFrenar(4000));
        //Este busca el método con float
        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 0.6f));
        //Este busca el metodo con int
        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 60));

        System.out.println("Kilómetros por litro: " + nissan1.calcularConsumo(300, 60));



    }
}
