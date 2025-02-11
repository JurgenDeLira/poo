public class AutomovilPrivate {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada; //Retornara un null si tu objeto no usa este atributo
    private int capacidadEstanque = 40; //si tu objeto no tiene nada usara ese 40

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

    public AutomovilPrivate(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public AutomovilPrivate(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada); //esto es lo mismo que:
        /*this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;*/
        //O sea estamos llamando el método anterior con su construcción
        this.capacidadEstanque = capacidadEstanque;
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

    public double getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque(){
        return capacidadEstanque;
    }
    public void setCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
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

    // Métodos

    public String verDetalle(){
        return  "auto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.tipo = " + this.getTipo().getDescripcion() +
                "\nauto.color = " + this.color.getColor() +
                "\nauto.patenteColor = " + colorPatente.getColor() +
                "\nauto.cilindrada = " + this.cilindrada;
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
        return  km/(capacidadEstanque*porcentajeBencina);
    }
    //Este ya es otro metodo con el mismo nombre, pero usa int en el argumento
    public float calcularConsumo(int km, int porcentajeBencina){
        return  km/(capacidadEstanque*(porcentajeBencina/100f));
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
