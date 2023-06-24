import java.util.*;

public class power {
  private String pName;
  private int baseDamage;
  private boolean heavy;
  private int stock;
  private int maxStock;

  public power(String n, int d, boolean h, int s) {
    pName = n;
    baseDamage = d;
    heavy = h;
    stock = s;
    maxStock = s;
  }

  // accessor methods
  public String getpName() {
    return pName;
  }

  public int getDamage() {
    return baseDamage;
  }

  public boolean getHeavy() {
    return heavy;
  }

  public int getStock() {
    return stock;
  }

  public int getMaxStock() {
    return maxStock;
  }

  // mutator methods
  public void useStock() {
    stock--;
  }

  public void resetStock() {
    stock = maxStock;
  }
}
