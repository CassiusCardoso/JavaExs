package ExercicioDay2;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligar(){
        System.out.println("Ligando");
    }

    public void desligar(){
        System.out.println("Desligando");
    }

    public void apresentar(){
        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano);
    }
}
