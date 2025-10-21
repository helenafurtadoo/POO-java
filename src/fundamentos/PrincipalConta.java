package fundamentos;

//CLASSE PRINCIPAL PARA DEMONSTRAR POLIMORFISMO E USO DAS CONTAS

public class PrincipalConta {
 public static void main(String[] args) {
     // CRIA UMA CONTA CORRENTE E UMA POUPANÇA
     ContaBancaria c1 = new ContaCorrente("ANA", "123-1", 500.0);
     ContaBancaria c2 = new ContaPoupanca("BRUNO", "456-2", 0.02);

     // DEPOSITOS
     c1.depositar(1000.0);
     c2.depositar(2000.0);

     // POLIMORFISMO: MESMO TIPO (ContaBancaria) COM COMPORTAMENTOS DIFERENTES
     c1.sacar(1200.0); // USA SOBREPOSIÇÃO DA CONTACORRENTE (POSSUI CHEQUE ESPECIAL)
     c2.sacar(500.0);  // USA IMPLEMENTAÇÃO DA SUPERCLASSE (CONTA BÁSICA)

     // CONVERTENDO PARA CONTA POUPANÇA PARA APLICAR RENDIMENTO
     if (c2 instanceof ContaPoupanca) {
         ((ContaPoupanca) c2).aplicarRendimento();
     }

     System.out.println("SALDO C1: " + c1.getSaldo());
     System.out.println("SALDO C2: " + c2.getSaldo());
 }
}
