package abstracao;

//DEMONSTRA ABSTRAÇÃO (VEICULO), HERANÇA E INTERFACE (LAVAVEL)

public class PrincipalVeiculo {
 public static void main(String[] args) {
     Veiculo v = new Carro("VW", "AZUL", 4);
     v.mostrarInfo();
     v.mover();

     // DOWNCAST PARA USAR MÉTODO DA INTERFACE
     if (v instanceof Carro) {
         Carro c = (Carro) v;
         c.lavar();
     }
 }
}

