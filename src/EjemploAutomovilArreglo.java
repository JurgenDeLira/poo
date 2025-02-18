import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorHonda = new Persona("Luci", "Martínez");
        AutomovilPrivate honda = new AutomovilPrivate(
                "Honda", "Corolla");
        honda.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        honda.setEstanque(new Estanque());
        honda.setColor(Color.BLANCO);
        honda.setTipo(TipoAutomovil.HATCHBACK);
        honda.setConductor(conductorHonda);

        Persona pato = new Persona("Pato", "Rodríguez");
        AutomovilPrivate mazda = new AutomovilPrivate(
                "Mazda", "BT-50",
                Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
                mazda.setTipo(TipoAutomovil.PICKUP);
                mazda.setEstanque(new Estanque());
                mazda.setConductor(pato);

                Persona bea = new Persona("Bea", "González");
        AutomovilPrivate nissan1 = new AutomovilPrivate("Nissan",
                "Navara", Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL), new Estanque(50));
        nissan1.setConductor(bea);
        nissan1.setTipo(TipoAutomovil.PICKUP);


        Persona lalo = new Persona("Lalo", "Salamanca");
        AutomovilPrivate suzuki = new AutomovilPrivate("Suzuki",
                "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        AutomovilPrivate.setColorPatente(Color.AZUL);
        suzuki.setTipo(TipoAutomovil.SUV);


        AutomovilPrivate audi= new AutomovilPrivate("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Pérez"));

        AutomovilPrivate[] autos = new AutomovilPrivate[5];
        autos [0] = honda;
        autos [1] = mazda;
        autos [2] = nissan1;
        autos [3] = suzuki;
        autos [4] = audi;

        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }
        /* o puede ser
        for (Automovil auto : autos) {
            System.out.println(auto);
            } */
    }
}
