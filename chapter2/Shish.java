abstract class ShishD {
  abstract boolean onlyOnions();
  abstract boolean isVegetarian();
}

class Skewer extends ShishD {
  boolean onlyOnions() {
    return true;
  }

  boolean isVegetarian() {
    return true;
  }

  public String toString() {
    return "new " + getClass().getName() + "()";
  }
}

class Onion extends ShishD {
  ShishD s;

  Onion(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return s.onlyOnions();
  }

  boolean isVegetarian() {
    return s.isVegetarian();
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + s + ")";
  }
}

class Lamb extends ShishD {
  ShishD s;

  Lamb(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
   return false;
  }

  boolean isVegetarian() {
    return false;
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + s + ")";
  }
}

class Tomato extends ShishD {
  ShishD s;

  Tomato(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return false;
  }

  boolean isVegetarian() {
    return s.isVegetarian();
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + s + ")";
  }
}
