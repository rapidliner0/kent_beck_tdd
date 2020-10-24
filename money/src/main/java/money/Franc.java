package money;

public class Franc extends Money{
  Franc(int amount) {
    this.amount = amount;
  }
  Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }
  public boolean equals(Object object) {
<<<<<<< HEAD
    Franc franc = (Franc) object;
    return amount == franc.amount;
=======
    Money money = (Money) object;
    return amount == money.amount;
>>>>>>> 90b81c8... Improve: variable 'dollar' -> 'money'
  }
}
