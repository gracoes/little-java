abstract class SubstD implements PieVisitorI {
  Object n;
  Object o;

  SubstD(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  abstract PieD forTop(Object t, PieD r);
}

class SubstV extends SubstD {
  SubstV(Object _n, Object _o) {
    super(_n, _o);
  }

  PieD forTop(Object t, PieD r) {
    if (t.equals(o)) {
      return new Top(n, r.accept(this));
    }

    return new Top(t, r.accept(this));
  }
}

class LtdSubstV extends SubstD {
  int c;

  LtdSubstV(int _c, Object _n, Object _o) {
    super(_n, _o);
    c = _c;
  }

  PieD forTop(Object t, PieD r) {
    if (c == 0) {
      return new Top(t, r);
    }

    if (t.equals(o)) {
      return new Top(n, r.accept(new LtdSubstV(c - 1, _n, _o)));
    }

    return new Top(t, r.accept(this));
  }
}
