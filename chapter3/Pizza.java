abstract class PizzaD {
  abstract PizzaD remA();

  abstract PizzaD topAwC();
}

class Crust extends PizzaD {
  PizzaD remA() {
    return new Crust();
  }
}

class Cheese extends PizzaD {
  PizzaD p;

  Cheese(PizzaD _p) {
    p = _p;
  }
  // -----------------------

  PizzaD remA() {
    return new Cheese(p.remA());
  }

  PizzaD topAwC() {
    return new Cheese(p.topAwC());
  }
}

class Olive extends PizzaD {
  PizzaD p;

  Olive(PizzaD _p) {
    p = _p;
  }
  // ------------------------

  PizzaD remA() {
    return new Olive(p.remA());
  }

  PizzaD topAwC() {
    return new Olive(p.topAwC());
  }
}

class Anchovy extends PizzaD {
  PizzaD p;

  Anchovy(PizzaD _p) {
    p = _p;
  }
  // -------------------------

  PizzaD remA() {
    return p.remA();
  }

  PizzaD topAwC() {
    return new Cheese(new Anchovy(p.topAwC()));
  }
}

class Sausage extends PizzaD {
  PizzaD p;

  Sausage(PizzaD _p) {
    p = _p;
  }
  // -----------------------

  PizzaD remA() {
    return new Sausage(p.remA());
  }

  PizzaD topAwC() {
    return new Sausage(p.topAwC());
  }
}
