package fundamentos;

//CONTA POUPANÇA: HERDA DE CONTABANCARIA E TEM MÉTODO PARA APLICAR RENDIMENTO
public class ContaPoupanca extends ContaBancaria {

 private double taxaRendimento; // EX: 0.01 = 1%

 public ContaPoupanca(String titular, String numeroConta, double taxaRendimento) {
     super(titular, numeroConta);
     this.taxaRendimento = taxaRendimento;
 }

 // APLICA RENDIMENTO SOBRE O SALDO ATUAL
 public void aplicarRendimento() {
     double novoSaldo = getSaldo() * (1 + taxaRendimento);
     setSaldo(novoSaldo);
     System.out.println("RENDIMENTO APLICADO. NOVO SALDO: " + getSaldo());
 }

 public double getTaxaRendimento() {
     return taxaRendimento;
 }
}
