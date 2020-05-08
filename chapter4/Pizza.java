class RemAv {
  PizzaD forCrust() {
    return new Crust();
  }

  PizzaD forCheese(PizzaD p) {
    return new Cheese(p.topAwC());
  };

  PizzaD forOlive (PizzaD p) {
    return new Olive(p.topAwC());
  }

  PizzaD forAnchovy(PizzaD p) {
    return p.topAwC();
  }

  PizzaD forSausage(PizzaD p) {
    return new Sausage(p.topAwC());
  }
}

class TopAwCV {
  PizzaD forCrust() {
    return new Crust();
  }

  PizzaD forCheese(PizzaD p) {
    return new Cheese(p.topAwC());
  }

  PizzaD forOlive(PizzaD p) {
    return new Olive(p.topAwC());
  }

  PizzaD forAnchovy(PizzaD p) {
    return
      new Cheese(
        new Anchovy(p.topAwC()));
  }

  PizzaD forSausage(PizzaD p) {
    return new Sausage(p.topAwC());
  }
}

class SubAbCV {
  PizzaD forCrust() {
    return new Crust();
  }

  PizzaD forCheese(PizzaD p) {
    return new Cheese(p.subAbC());
  }

  PizzaD forOlive(PizzaD p) {
    return new Olive(p.subAbC());
  }

  PizzaD forAnchovy(PizzaD p) {
    return new Cheese(p.subAbC());
  }

  PizzaD forSausage(PizzaD p) {
    return new Sausage(p.subAbC());
  }
}

abstract class PizzaD {
  RemAV remFn = new RemAV();
  TopAwCV topAwCFn = new TopAwC();
  SubAbCV subAbC = new SubAbC();

  abstract PizzaD remA(); // remove anchovies
  abstract PizzaD topAwC(); // top anchovies with cheese
  abstract PizzaD subAbC(); // substitute anchovies by cheese
}

class Crust extends PizzaD {
  PizzaD remA() {
    return remFn.forCrust();
  }

  PizzaD topAwC() {
    return topAwCFn.forCrust();
  }

  PizzaD subAbC() {
    return subAbC.forCrust();
  }
}

class Cheese extends PizzaD {
  PizzaD p;

  Cheese(PizzaD _p) {
    p = _p;
  }
  // -----------------------

  PizzaD remA() {
    return remFn.forCheese(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forCheese(p);
  }

  PizzaD subAbC() {
    return subAbC.forCheese(p);
  }
}

class Olive extends PizzaD {
  PizzaD p;

  Olive(PizzaD _p) {
    p = _p;
  }
  // ------------------------

  PizzaD remA() {
    return remFn.forOlive(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forOlive(p);
  }

  PizzaD subAbC() {
    return subAbC.forOlive(p);
  }
}

class Anchovy extends PizzaD {
  PizzaD p;

  Anchovy(PizzaD _p) {
    p = _p;
  }
  // -------------------------

  PizzaD remA() {
    return remFn.forAnchovy(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forAnchovy(p);
  }

  PizzaD subAbC() {
    return subAbC.forAnchovy(p);
  }
}

class Sausage extends PizzaD {
  PizzaD p;

  Sausage(PizzaD _p) {
    p = _p;
  }
  // -----------------------

  PizzaD remA() {
    return remFn.forSausage(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forSausage(p);
  }

  PizzaD subAbC() {
    return subAbC.forSausage(p);
  }
}
