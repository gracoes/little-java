interface TreeVisitorI {
  Object forBud();
  Object forFlat(FruitD f, TreeD t);
  Object forSplit(TreeD t, TreeD r);
}

class IsFlatV implements TreeVisitorI {
  public Object forBud() {
    return Boolean.TRUE;
  }

  public Object forFlat(FruitD f, TreeD t) {
    return t.accept(this);
  }

  public Object forSplit(TreeD t, TreeD r) {
    return Boolean.FALSE;
  }
}

class IsSplitV implements TreeVisitorI {
  public Object forBud() {
    return Boolean.TRUE;
  }

  public Object forFlat(FruitD f, TreeD t) {
    return Boolean.FALSE;
  }

  public Object forSplit(TreeD t, TreeD r) {
    return ((Boolean) t.accept(this)).booleanValue() && ((Boolean) r.accept(this)).booleanValue();
  }
}

class OccursV implements TreeVisitorI {
  FruitD a;

  OccursV(FruitD _a) {
    a = _a;
  }

  public Object forBud() {
    return Integer.valueOf(0);
  }

  public Object forFlat(FruitD f, TreeD t) {
    if (f.equals(a)) {
      return Integer.valueOf(
        ((Integer)t.accept(this)).intValue()
        + 1);
    }

    else
      return t.accept(this);
  }

  public Object forSplit(TreeD l, TreeD r) {
    return Integer.valueOf(
      ((Integer) l.accept(this)).intValue()
      + ((Integer) r.accept(this)).intValue()
    );
  }
}

abstract class TreeD {
  abstract Object accept(TreeVisitorI ask);
}

class Bud extends TreeD {
  Object accept(TreeVisitorI ask) {
    return ask.forBud();
  }
}

class Split extends TreeD {
  TreeD l;
  TreeD r;

  Split(TreeD _l, TreeD _r) {
    l = _l;
    r = _r;
  }

  Object accept(TreeVisitorI ask) {
    return ask.forSplit(l, r);
  }
}

class Flat extends TreeD {
  FruitD f;
  TreeD t;

  Flat(FruitD _f, TreeD _t) {
    f = _f;
    t = _t;
  }

  Object accept(TreeVisitorI ask) {
    return ask.forFlat(f, t);
  }
}
