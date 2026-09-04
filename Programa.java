import model.Conta;
import model.Despesa;

public class Programa {
    public static void main(String args[]) {
        
        Conta conta_1 = new Conta();
        
        conta_1.numero = 123456789;
        conta_1.cliente = "Ryan";
        conta_1.saldo = 1000.0;
        conta_1.limite = 800.0;
        
        Despesa despesa_1 = new Despesa();
        
        despesa_1.nome = "Aluguel";
        despesa_1.valor = 500.0;
        
        System.out.println("RELATÓRIO");
        System.out.println("Cliente: " + conta_1.cliente);
        System.out.println("Despesa: " + despesa_1.valor);
        
        if(conta_1.saldo + conta_1.limite >= despesa_1.valor) {
            conta_1.saldo = conta_1.saldo - despesa_1.valor; 
            
            System.out.println("Conta paga com sucesso!");
            System.out.println("Valor pago: " + despesa_1.valor);
        
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: " + conta_1.saldo);
        }
    }
}