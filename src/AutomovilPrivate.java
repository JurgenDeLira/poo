public class AutomovilPrivate {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;//si tu objeto no tiene nada usara ese GRIS
    private Motor motor; //Retornara un null si tu objeto no usa este atributo
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    //private static String colorPatente = "Naranja"
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    //Constructor para no colocar parametros
    public AutomovilPrivate() {
        this.id = ++ ultimoId;
    }

    /*Constructor, es para definir algún
    proceso de inicialización, solo usaremos fabricante
    y modelo, lo demas lo obtendra de getters y setters*/
    public AutomovilPrivate(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public AutomovilPrivate(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public AutomovilPrivate(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor ;
    }

    public AutomovilPrivate(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor); //esto es lo mismo que:
        /*this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;*/
        //O sea estamos llamando el método anterior con su construcción
        this.estanque = estanque;
    }

    public AutomovilPrivate(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    // getters setters o leer asignar
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
        AutomovilPrivate.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }
    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        AutomovilPrivate.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }
    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }
    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }
    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    // Métodos

    public String verDetalle(){
        String detalle = "auto.id = " + this.id +
                "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo();

        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }
        detalle += "\nauto.color = " + this.color +
                "\nauto.patenteColor = " + colorPatente;
        if(this.motor != null) {
            detalle += "\nauto.cilindrada = " + this.motor.getCilindrada();
        }

        if (conductor != null) {
            detalle += "\nConductor Honda: " + this.getConductor();
        }
        if (getRuedas() != null) {
            detalle += "\nRuedas del automóvil: ";
        for (Rueda r: this.getRuedas()){
            detalle += "\n" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
            }
        }

        return detalle;
    }

    public String acelerar (int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    //Método con float
    public float calcularConsumo(int km, float porcentajeBencina){
        return  km/(this.getEstanque().getCapacidad()*porcentajeBencina);
    }
    //Este ya es otro metodo con el mismo nombre, pero usa int en el argumento
    public float calcularConsumo(int km, int porcentajeBencina){
        return  km/(this.getEstanque().getCapacidad()*(porcentajeBencina/100f));
    }
    // ¿que pasaria si este método fuera static?
    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return  km/(AutomovilPrivate.capacidadEstanqueEstatico*(porcentajeBencina/100f));
    }


    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        AutomovilPrivate a = (AutomovilPrivate) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo;
                /*o puedes llamar los atributos de esta forma:
                "AutomovilPrivate{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';*/
    }

}
