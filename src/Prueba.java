public class Prueba {

public static void main(String[] args) {
    Caja prueba1 = new Caja();
    prueba1.alto =4;
    prueba1.ancho = 6;
    prueba1.profundo = 6;
    prueba1.volumen();

    Caja prueba2= new Caja(2, 3, 6);
    prueba2.volumen();
}
}
