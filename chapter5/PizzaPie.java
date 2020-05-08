class RemAV {
  PieD forBot() {
    return new Bot();
  }

  PieD forTop(Object t, PieD r) {
    if (new Anchovy().equals(t)) {
      return r.remA();
    }

    else return new Top(t, r.remA());
  }
}

// PizzaPieD
abstract class PieD {
  RemAV raFn = new RemAV();

  abstract PieD remA();
}

// Bottom
class Bot extends PieD {
  PieD remA() {
    return raFn.forBot();
  }
}

// Topping
class Top extends PieD {
  Object t;
  PieD r;

  Top(Object _t, PieD _r) {
    t = _t;
    r = _r;
  }
  // --------------------

  PieD remA() {
    return raFn.forTop(t, r);
  }
}
