package banco;

abstract public class Conta {

  protected String numero;
  protected double saldo;

  protected String getNumero() {
    return numero;
  }

  protected void setNumero(String value) {
    numero = value;
  }

  protected double getSaldo() {
    return saldo;
  }

  protected void setSaldo(double value) {
    saldo = value;
  }

  abstract void creditar(double valor);
  abstract void debitar(double valor);
}

// Classe abstrata: A classe Conta é abstrata, ou seja, não pode ser instanciada diretamente e serve como base para outras classes.
// Métodos abstratos: Os métodos creditar e debitar são definidos sem implementação, exigindo que as subclasses os implementem.
// Funcionalidade: O método creditar adiciona valor ao saldo, e o debitar subtrai, com detalhes de implementação definidos nas subclasses.

