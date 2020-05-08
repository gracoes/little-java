class OnlyOnionsV {
  boolean forSkewer() {
    return true;
  }

  boolean forOnion(ShishD s) {
    return s.onlyOnions();
  }

  boolean forLamb(ShishD s) {
    return false;
  }

  boolean forTomato(ShishD s) {
    return false;
  }
}

class IsVegetarianV {
  boolean forSkewer() {
    return true;
  }

  boolean forOnion(ShishD s) {
    return s.isVegetarian();
  }

  boolean forLamb(ShishD s) {
    return false;
  }

  boolean forTomato(ShishD s) {
    return s.isVegetarian();
  }
}

abstract class ShishD {
  OnlyOnionsV ooFn = new OnlyOnionsV();
  IsVegetarian ivFn = new IsVegetarian();

  abstract boolean onlyOnions();
  abstract boolean isVegetarian();
}

class Skewer extends ShishD {
  boolean onlyOnions() {
    return ooFn.forSkewer();
  }

  boolean isVegetarian() {
    return ivFn.forSkewer();
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
    return ooFn.forOnion(s);
  }

  boolean isVegetarian() {
    return ivFn.forOnion(s);
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
   return ooFn.forLamb(s);
  }

  boolean isVegetarian() {
    return ivFn.forLamb(s);
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
    return ooFn.forTomato(s);
  }

  boolean isVegetarian() {
    return ivFn.forTomato(s);
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + s + ")";
  }
}
