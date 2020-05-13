interface PieVisitorI {
  PieD forBot();
  PieD forTop(Object t, PieD r);
}

class RemV implements PieVisitorI {
  Object o;

  RemV(Object _o) {
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (o.equals(t)) {
      return r.accept(this);
    }

    else
      return new Top(t, r.accept(this));
  }
}

class SubstV implements PieVisitorI {
  Object n;
  Object o;

  SubstV(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (o.equals(t)) {
      return new Top(n, r.accept(this));
    }

    else
      return new Top(t, r.accept(this));
  }
}

class LtdSubstV implements PieVisitorI {
  int c;
  Object n;
  Object o;

  LtdSubstV(int _c, Object _n, Object _o) {
    c = _c;
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (c == 0) {
      return new Top(t, r);
    }

    if (o.equals(t)) {
      return new Top(n, r.accept(new SubstV(c - 1, n, o)));
    }

    else
      return new Top(t, r.accept(this));
  }
}

// PizzaPieD
abstract class PieD {
  abstract PieD accept(PieVisitorI ask);
}

// Bottom
class Bot extends PieD {
  PieD accept(PieVisitorI ask) {
    return ask.forBot();
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

  PieD accept(PieVisitorI ask) {
    return ask.forTop(t, r);
  }
}
