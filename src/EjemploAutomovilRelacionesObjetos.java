public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedasHonda = new Rueda[5];
        for(int i = 0; i < ruedasHonda.length; i++){
            ruedasHonda [i] = new Rueda("Yokohama", 16, 7.5);
        }
        /* En vez de esto se hae lo de arriba
        ruedasHonda [0] = new Rueda("Yokohama", 16, 7.5);
        ruedasHonda [1] = new Rueda("Yokohama", 16, 7.5);
        ruedasHonda [2] = new Rueda("Yokohama", 16, 7.5);
        ruedasHonda [3] = new Rueda("Yokohama", 16, 7.5);
        ruedasHonda [4] = new Rueda("Yokohama", 16, 7.5);
         */

        Persona conductorHonda = new Persona("Luci", "Martínez");
        AutomovilPrivate honda = new AutomovilPrivate(
                "Honda", "Corolla");
        honda.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        honda.setEstanque(new Estanque());
        honda.setColor(Color.BLANCO);
        honda.setTipo(TipoAutomovil.HATCHBACK);
        honda.setConductor(conductorHonda);
        //honda.setRuedas(ruedasHonda);


        Rueda[] ruedasMazda = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            ruedasMazda [i] = new Rueda("Michelin", 18, 10.5);
        }
        Persona pato = new Persona("Pato", "Rodríguez");
        AutomovilPrivate mazda = new AutomovilPrivate(
                "Mazda", "BT-50",
                Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
                mazda.setTipo(TipoAutomovil.PICKUP);
                mazda.setEstanque(new Estanque());
                mazda.setConductor(pato);
                mazda.setRuedas(ruedasMazda);

                Rueda[] ruedasNissan1 = {new Rueda("Pirelli", 20, 11.5),
                        new Rueda("Pirelli", 20, 11.5),
                        new Rueda("Pirelli", 20, 11.5),
                        new Rueda("Pirelli", 20, 11.5),
                        new Rueda("Pirelli", 20, 11.5),
                };
                Persona bea = new Persona("Bea", "González");
        AutomovilPrivate nissan1 = new AutomovilPrivate("Nissan",
                "Navara", Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL), new Estanque(50), bea, ruedasNissan1);
        nissan1.setTipo(TipoAutomovil.PICKUP);

        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
        };
        Persona lalo = new Persona("Lalo", "Salamanca");
        AutomovilPrivate nissan2 = new AutomovilPrivate("Nissan",
                "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50), lalo, ruedasNissan2);
        nissan2.setColor(Color.AMARILLO);
        AutomovilPrivate.setColorPatente(Color.AZUL);
        nissan2.setTipo(TipoAutomovil.PICKUP);


        AutomovilPrivate auto3= new AutomovilPrivate();

        System.out.println(honda.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan1.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*System.out.println("Conductor Honda: " + honda.getConductor());
        System.out.println("Ruedas honda: ");
        for (Rueda r: honda.getRuedas()){
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }*/

    }
}
