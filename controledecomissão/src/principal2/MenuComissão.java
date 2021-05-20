package principal2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MenuComissão {
    private Vendedor1 vendedor;
    private int opcao;
    private ConversorNumeros1 conversor;
    private EntradaSaidaDados1 io;
    
    public MenuComissão(){
        this.vendedor = new Vendedor1();
        this.opcao = -1;
        this.conversor = new ConversorNumeros1();
        this.io = new EntradaSaidaDados1();
    }

    public void executarControleComissão(){
    do{
        this.executarMenuPrincipal();
        this.avaliarOpcaoEscolhida();
    }while (this.opcao != 0);
    }
    
    public void executarMenuPrincipal(){
    String mensagemMenu = "Selecione uma opção"
            +"\n 1 - Criar vendedor"
            +"\n 2 - Calcular Comissão do Vendedor"
            +"\n 3 - Exibir Vendedor"
            +"\n 0 - Sair";
            
    String entradaDados = io.entradaDados(mensagemMenu);
    this.opcao = conversor.StringToInt(entradaDados); 
    }
    
    public void avaliarOpcaoEscolhida(){
        DecimalFormat deci = new
        DecimalFormat("0.00"); 
    
    switch (this.opcao){
        case 0:
            vendedor.sair();
            break;
        case 1:
            String criarVend = "Nome do vendedor";
            String vend = io.entradaDados(criarVend);
            vendedor.setNome(vend);
            String salBase = "Salário base (R$)";
            String sal = io.entradaDados(salBase);
            vendedor.setSalarioBase(conversor.stringToDouble(sal));
            break;
        case 2:
            String entra = "Valor Vendido: R$";
            String valven = io.entradaDados(entra);
            double resultado = vendedor.calcularComissão(conversor.stringToDouble(valven));
            String mostra = "A comissão é de: R$ " + deci.format(resultado);
            io.saidaDados(mostra);
            break;
        case 3:
                   
            String saida = "Vendedor: " + vendedor.getNome()
                    + " \n Salário base: R$ " + deci.format(vendedor.getSalarioBase())
                    + " \n Comissão: R$ " + deci.format(vendedor.getResultado());
            io.saidaDados(saida);  
            break;
        default:
            io.saidaDados("Opção Inválida");
            break;
    }
    }
}

