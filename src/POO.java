public class POO {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Porshe 911");
        Carro meuCarro2 = new Carro("Audi A3");

        String result = meuCarro.acelerar();

        System.out.println(result);
    }
}
class Carro {

    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String acelerar(){
        System.out.println("Acelerando o carro - " + this.modelo);
        return "O Fusca está ligado......";
    }
}