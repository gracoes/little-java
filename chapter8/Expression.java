interface ExprVisitorI {
  Object forPlus(ExprD l, ExprD r);
  Object forDiff(ExprD l, ExprD r);
  Object forProd(ExprD l, ExprD r);
  Object forConst(Object c);
}

class IntEvalV implements ExprVisitorI {
  public Object forPlus(ExprD l, ExprD r) {
    return plus(l.accept(this), r.accept(this));
  }

  public Object forDiff(ExprD l, ExprD r) {
    return diff(l.accept(this), r.accept(this));
  }

  public Object forProd(ExprD l, ExprD r) {
    return prod(l.accept(this), r.accept(this));
  }

  public Object forConst(Object c) {
    return c;
  }

  Object plus(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n + m);
  }

  Object diff(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n - m);
  }

  Object prod(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n * m);
  }
}

abstract class ExprD {
  abstract Object accept(ExprVisitorI ask);
}

class Plus extends ExprD {
  ExprD l;
  ExprD r;

  Plus(ExprD _l, ExprD _r) {
    l = _l;
    r = _r;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forPlus(l, r);
  }
}

class Diff extends ExprD {
  ExprD l;
  ExprD r;

  Diff(ExprD _l, ExprD _r) {
    l = _l;
    r = _r;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forDiff(l, r);
  }
}

class Prod extends ExprD {
  ExprD l;
  ExprD r;

  Prod(ExprD _l, ExprD _r) {
    l = _l;
    r = _r;
  }
  Object accept(ExprVisitorI ask) {
    return ask.forProd(l, r);
  }
}

class Const extends ExprD {
  Object c;

  Const(Object _c) {
    c = _c;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forConst(c);
  }
}
