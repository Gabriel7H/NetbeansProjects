

public class Carro02 {//declarando a classe carro
   //cria os atributos da classe carro 
    private int ano;
    private String modelo;
    private String marca;
    private int chassi;

    //construtuor com parâmetro - o objeto recebe o valor de atributo individualmente
    public Carro02(int ano, String modelo, String marca, int chassi) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.chassi = chassi;
    }
    // construtor sem parâmetro - por padrão o objeto recebe estes valores de atributos
    public Carro02() {
        this.ano = 2021;
        this.modelo = "HB20";
        this.marca = "Hyndai";
        this.chassi = 9876789;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }
    
    public void status () {
        System.out.println("ESTE CARRO: ");
        System.out.println("Ano: " + this.ano);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Chassi: " + this.chassi);
        
        System.out.println("Ligando o carro");
        System.out.println("Mudar a marcha");
        System.out.println("Acelerando o carro");
        System.out.println("Desligando o carro");
    }
    
}
/*
 pucbli int ano = 2021;
    public String modelo = "HB20";
    public String marca = "Hyundai";
    public int chassi = 9876789; */