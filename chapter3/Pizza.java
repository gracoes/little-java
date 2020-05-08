abstract class PizzaD {
  abstract PizzaD remA(); // remove anchovies

  abstract PizzaD topAwC(); // top anchovies with cheese

  abstract PizzaD subAbC(); // substitute anchovies by cheese
}

class Crust extends PizzaD {
  PizzaD remA() {
    return new Crust();
  }

  PizzaD topAwC() {
    return new Crust();
  }

  PizzaD subAbC() {
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

  PizzaD subAbC() {
    return new Cheese(p.subAbC());
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

  PizzaD subAbC() {
    return new Olive(p.subAbC());
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

  PizzaD subAbC() {
    return new Cheese(p.subAbC());
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

  PizzaD subAbC() {
    return new Sausage(p.subAbC());
  }
}

class Spinach extends PizzaD {
  PizzaD p;

  Spinach(PizzaD _p) {
    p = _p;
  }
  // ----------------------------

  PizzaD remA() {
    return new Spinach(p.remA());
  }

  PizzaD topAwC() {
    return new Spinach(p.topAwC());
  }

  PizzaD subAbC() {
    return new Spinach(p.subAbC());
  }
}
