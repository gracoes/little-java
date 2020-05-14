abstract class EvalD implements ExprVisitorI {
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

  abstract Object plus(Object l, Object r);
  abstract Object diff(Object l, Object r);
  abstract Object prod(Object l, Object r);
}

class IntEvalV extends EvalD {
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

class SetEval extends EvalD {
  Object plus (Object l, Object r) {
    return ((SetD) l).plus((SetD) r);
  }

  Object diff (Object l, Object r) {
    return ((SetD) l).diff((SetD) r);
  }

  Object prod (Object l, Object r) {
    return ((SetD) l).prod((SetD) r);
  }
}
