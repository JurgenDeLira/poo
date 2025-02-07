public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.fabricante = "Honda";
        auto.modelo = "Corolla";
        auto.cilindrada = 2.0;
        auto.color = "Negro";

        Automovil auto2 = new Automovil();
        auto2.fabricante = "Mazda";
        auto2.modelo = "BT-50";
        auto2.cilindrada = 3.0;
        auto2.color = "Rojo";

        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());

        System.out.println(auto2.acelerarFrenar(4000));
        //Este busca el método con float
        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 0.6f));
        //Este busca el metodo con int
        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 60));

/*
        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);

        System.out.println("auto2.fabricante = " + auto2.fabricante);
        System.out.println("auto2.modelo = " + auto2.modelo);
        System.out.println("auto2.cilindrada = " + auto2.cilindrada);
        System.out.println("auto2.color = " + auto2.color);
*/

    }
}
