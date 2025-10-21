package fundamentos;

//CONTA CORRENTE: HERDA DE CONTABANCARIA E SOBRESCREVE SACAR PARA CONSIDERAR CHEQUE ESPECIAL

public class ContaCorrente extends ContaBancaria {

 private double limiteChequeEspecial;

 public ContaCorrente(String titular, String numeroConta, double limiteChequeEspecial) {
     super(titular, numeroConta); // CHAMA CONTRUTOR DA SUPERCLASSE
     this.limiteChequeEspecial = limiteChequeEspecial;
 }

 @Override
 public boolean sacar(double valor) {
     // PERMITE SAQUE ATÉ SALDO + LIMITE
     double disponivel = getSaldo() + limiteChequeEspecial;
     if (valor > 0 && valor <= disponivel) {
         setSaldo(getSaldo() - valor); // ATUALIZA SALDO USANDO MÉTODO PROTECTED
         System.out.println("SAQUE CONTA CORRENTE: " + valor);
         return true;
     } else {
         System.out.println("SALDO INSUFICIENTE (INCLUINDO CHEQUE ESPECIAL).");
         return false;
     }
 }

 public double getLimiteChequeEspecial() {
     return limiteChequeEspecial;
 }

 public double getSaldoDisponivel() {
     return getSaldo() + limiteChequeEspecial;
 }
}
