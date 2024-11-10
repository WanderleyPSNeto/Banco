package banco;

public class Banco {
  public static void main(String args[]) {
    // Variáveis e os tipos
    Conta c1;
    ContaDebEspecial c2, c3;

    // Conta Normal
    c1 = new ContaNormal();

    // Definição
    c1.setNumero(new String("1020-5"));
    c1.setSaldo(300);

    // Conta Deb Especial
    c2 = new ContaDebEspecial();
    c3 = new ContaDebEspecial(new String("3515-5"), 2500, 5050);

    // Definir
    c2.setNumero(new String("3515-5"));
    c2.setSaldo(1500);
    c2.setLimite(2000.50);

    System.out.println("A conta de número " + c1.getNumero() + " possui saldo de " + c1.getSaldo());

    // Creditar
    c1.creditar(350);

    System.out.println("Após creditar R$ 350,00 a conta de número " + c1.getNumero() + " possui o saldo de " + c1.getSaldo());

    // Debitar
    c1.debitar(200);

    System.out.println("Após debitar R$ 200,00 a conta de número " + c1.getNumero() + " passui o saldo de " + c1.getSaldo());

    System.out.println("");

    System.out.println("A conta de número " + c2.getNumero() + " possui saldo de " + c2.getSaldo());

    // Debitar
    c2.debitar(150);

    System.out.println("A conta de número " + c2.getNumero() + " possui saldo de " + c2.getSaldo() + " após débito de R$ 150,00");

    System.out.println("A conta de número " + c2.getNumero() + " possui saldo de " + c2.getSaldo() + " e limite de " + c2.getLimite());

    // Definir
    c2.setLimite(20000);

    System.out.println("A conta de número " + c2.getNumero() + " possui saldo de " + c2.getSaldo() + " e novo Limite de " + c2.getLimite());
  }
}