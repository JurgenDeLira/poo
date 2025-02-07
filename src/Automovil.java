public class Automovil {

    String fabricante;
    String modelo;
    String color = "Blanco";
    double cilindrada;
    int capacidadEstanque = 40;


    public String verDetalle(){
        /*
        StringBuilder sb = new StringBuilder();
        //String modelo = "otro";
        sb.append("auto.fabricante = " + this.fabricante);
        //System.out.println("modelo = " + modelo); // hara referencia a this pero de este metodo
        sb.append("\nauto.modelo = " + this.modelo); // el this referencia la clase
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();*/

        /*
        //sb antes era StringBuilder, como arriba, pero lo converti en String, más limpio
        String sb = "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
        return sb;*/

        // inclusive lo puedo hacer más simple, haciendo el return desde el principio
        return  "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
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

}
