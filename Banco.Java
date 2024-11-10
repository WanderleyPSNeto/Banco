package banco;

public class Banco {
  public static void main(String[] args) {
    // Variáveis e os tipos
    Conta c1;
    ContaDebEspecial c2, c3;

    // Conta Normal
    c1 = new ContaNormal();
    c1.setNumero("1020-5");
    c1.setSaldo(300);

    // Conta Deb Especial
    c2 = new ContaDebEspecial();
    c3 = new ContaDebEspecial("3515-5", 2500, 5050);

    // Definir dados da conta c2
    c2.setNumero("3515-5");
    c2.setSaldo(1500);
    c2.setLimite(2000.50);

    // Exibir dados da conta c1 (Conta Normal)
    exibirDadosConta(c1);

    // Creditar na conta c1
    c1.creditar(350);
    exibirDadosConta(c1, "Após creditar R$ 350,00");

    // Debitar da conta c1
    c1.debitar(200);
    exibirDadosConta(c1, "Após debitar R$ 200,00");

    // Linha em branco para separar as saídas
    System.out.println();

    // Exibir dados da conta c2 (Conta Deb Especial)
    exibirDadosConta(c2);

    // Debitar da conta c2
    c2.debitar(150);
    exibirDadosConta(c2, "Após débito de R$ 150,00");

    // Exibir limite de conta c2
    System.out.println("A conta de número " + c2.getNumero() + " possui saldo de R$ "
        + c2.getSaldo() + " e limite de R$ " + c2.getLimite());

    // Atualizar limite da conta c2
    c2.setLimite(20000);
    System.out.println("A conta de número " + c2.getNumero() + " possui saldo de R$ "
        + c2.getSaldo() + " e novo limite de R$ " + c2.getLimite());
  }

  // Método auxiliar para exibir dados de uma conta
  private static void exibirDadosConta(Conta conta) {
    System.out.println("A conta de número " + conta.getNumero() + " possui saldo de R$ " + conta.getSaldo());
  }

  // Método auxiliar para exibir dados de uma conta com uma mensagem personalizada
  private static void exibirDadosConta(Conta conta, String mensagem) {
    System.out
        .println(mensagem + " a conta de número " + conta.getNumero() + " possui o saldo de R$ " + conta.getSaldo());
  }
}
