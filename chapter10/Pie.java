interface PieVisitorI {
  Object forBot(Bot that);
  Object forTop(Top that);
}

class OccursV implements PieVisitorI {
  Object a;

  Occurs(Object _a) {
    a = _a;
  }

  public Object forBot(Bot that) {
    return Integer.valueOf(0);
  }

  public Object forTop(Top that) {
    if (that.t.equals(a)) {
      return Integer.valueOf(((Integer)that.r.accept(this)).intValue() + 1);
    }

    return that.r.accept(this);
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
      return new Top(n, (PieD)r.accept(this));
    }

    else
      return new Top(t, (PieD)r.accept(this));
  }
}

class RemV implements PieVisitorI {
  Object o;

  RemV(Object _o) {
    o = _o;
  }

  public Object forBot(Bot that) {
    return new Bot();
  }

  public Object forTop(Top that) {
    if (that.t.equals(o)) {
      return that.r.accept(this);
    }

    return new Top(that.t, (PieD)that.r.accept(this));
  }
}

abstract class PieD {
  abstract Object accept(PieVisitorI ask);
}

class Bot extends PieD {
  Object accept(PieVisitorI ask) {
    return ask.forBot(this);
  }
}

class Top extends PieD {
  Object t;
  PieD r;

  Top(Object _t, PieD _r) {
    t = _t;
    r = _r;
  }

  Object accept(PieVisitorI ask) {
    return ask.forTop(this);
  }
}
