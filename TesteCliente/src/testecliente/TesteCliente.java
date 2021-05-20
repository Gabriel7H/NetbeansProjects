/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecliente;

/**
 *
 * @author ghaam
 */
public class TesteCliente {

    public static void main(String[] args) {
    //Criação do objeto
    Cliente02 clienteprincipal = new Cliente02();
    //Chamada dos atributos e os valores
    System.out.println("CPf: " + clienteprincipal.cpf);
    System.out.println("nome: " + clienteprincipal.nome);
    System.out.println("endereço: " + clienteprincipal.endereço);
    //chamada do método
    clienteprincipal.consultar();
    }
    
}
