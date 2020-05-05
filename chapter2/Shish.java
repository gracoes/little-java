abstract class ShishD {
  abstract boolean onlyOnions();
}

class Skewer extends ShishD {
  boolean onlyOnions() {
    return true;
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
}

class Lamb extends ShishD {
  ShishD s;

  Lamb(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
   return false;
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
}
