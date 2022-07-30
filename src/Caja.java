public class Caja {

    int ancho;
    int alto;
    int profundo;

public Caja(){ 
    System.out.println("ejecutando constructor");
}

public Caja(int alto, int ancho, int profundo){
    this.alto = alto;
    this.ancho = ancho;
    this.profundo = profundo;
    System.out.println("ejecutando con argumentos ");
}

public void volumen(){
    int vol = alto*ancho*profundo;
    System.out.println("el volumen es =" + vol);
}
}