package fundamentos;

//CONTA BANCARIA: EXEMPLO DE ABSTRAÇÃO E ENCAPSULAMENTO

public class ContaBancaria {
 // ATRIBUTOS PRIVADOS (ENCAPSULAMENTO)
 private String titular;
 private String numeroConta;
 private double saldo;

 // CONSTRUTOR PARA INICIALIZAR A CONTA
 public ContaBancaria(String titular, String numeroConta) {
     this.titular = titular;
     this.numeroConta = numeroConta;
     this.saldo = 0.0;
 }

 // METODO PARA DEPOSITAR (VALIDAÇÕES SIMPLES)
 public void depositar(double valor) {
     // SE O VALOR FOR POSITIVO, ADICIONA AO SALDO
     if (valor > 0) {
         this.saldo += valor;
         System.out.println("DEPÓSITO REALIZADO: " + valor);
     } else {
         System.out.println("VALOR INVÁLIDO PARA DEPÓSITO.");
     }
 }

 // METODO SACAR - PODE SER SOBRESCRITO PELO POLIMORFISMO
 public boolean sacar(double valor) {
     if (valor > 0 && valor <= this.saldo) {
         this.saldo -= valor;
         System.out.println("SAQUE REALIZADO: " + valor);
         return true;
     } else {
         System.out.println("SALDO INSUFICIENTE OU VALOR INVÁLIDO.");
         return false;
     }
 }

 // GETTERS (EXPOSIÇÃO CONTROLADA DOS DADOS)
 public String getTitular() {
     return titular;
 }

 public String getNumeroConta() {
     return numeroConta;
 }

 public double getSaldo() {
     return saldo;
 }

 // SETTER PROTEGIDO PARA USO POR SUBCLASSES (REUTILIZAÇÃO)
 protected void setSaldo(double novoSaldo) {
     this.saldo = novoSaldo;
 }
}

