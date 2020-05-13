interface bTreeVisitorI {
  boolean forBud();
  boolean forFlat(FruitD f, TreeD t);
  boolean forSplit(TreeD l, TreeD r);
}

class blsFlatV implements bTreeVisitorI {
  public boolean forBud() {
    return true;
  }

  public boolean forFlat(FruitD f, TreeD t) {
    return t.accept(this);
  }

  public boolean forSplit(TreeD l, TreeD r) {
    return false;
  }
}

class blsSplitV implements bTreeVisitorI {
  public boolean forBud() {
    return true;
  }

  public boolean forFlat(FruitD f, TreeD t) {
    return false;
  }

  public boolean forSplit(TreeD l, TreeD r) {
    return l.accept(this) && r.accept(this);
  }
}

class bHasFruitV implements bTreeVisitorI {
  public boolean forBud() {
    return false;
  }

  public boolean forFlat(FruitD f, TreeD t) {
    return true;
  }

  public boolean forSplit(TreeD l, TreeD r) {
    return l.accept(this) || l.accept(this);
  }
}

interface iTreeVisitorI {
  int forBud();
  int forFlat(FruitD f, TreeD t);
  int forSplit(TreeD l, TreeD r);
}

class iHeightV implements iTreeVisitorI {
  public int forBud() {
    return 0;
  }

  public int forFlat(FruitD f, TreeD t) {
    return 1 + t.accept(this);
  }

  public int forSplit(TreeD l, TreeD r) {
    return 1 + Math.max(l.accept(this), r.accept(this));
  }
}

class iOccursV implements iTreeVisitorI {
  FruitD a;

  iOccursV(FruitD _a) {
    a = _a;
  }

  public int forBud() {
    return 0;
  }

  public int forFlat(FruitD f, TreeD t) {
    if (f.equals(a)) {
      return 1 + t.accept(this);
    }

    else
      return t.accept(this);
  }

  public int forSplit(TreeD l, TreeD r) {
    return t.accept(this) + r.accept(this);
  }
}

interface tTreeVisitorI {
  TreeD forBud();
  TreeD forFlat(FruitD f, TreeD t);
  TreeD forSplit(TreeD l, TreeD r);
}

class tSubstV implements tTreeVisitorI {
  FruitD n;
  FruitD o;

  tSubstV(FruitD _n, FruitD _o) {
    n = _n;
    o = _o;
  }

  public TreeD forBud() {
    return new Bud();
  }

  public TreeD forFlat(FruitD f, TreeD t) {
    if (o.equals(f)) {
      return new Flat(n, t.accept(this));
    }

    else
      return new Flat(f, t.accept(this));
  }

  public TreeD forSplit(TreeD l, TreeD r) {
    return new Split(t.accept(this), r.accept(this));
  }
}

interface TreeVisitorI {
  Object forBud();
  Object forFlat(FruitD f, TreeD t);
  Object forSplit(TreeD t, TreeD r);
}

abstract class TreeD {
  abstract boolean accept(bTreeVisitorI ask);
  abstract int accept(iTreeVisitorI ask);
  abstract TreeD accept(tTreeVisitorI ask);
}

class Bud extends TreeD {
  boolean accept(bTreeVisitorI ask) {
    return ask.forBud();
  }

  int accept(iTreeVisitorI ask) {
    return ask.forBud();
  }

  TreeD accept(tTreeVisitorI ask) {
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

  boolean accept(bTreeVisitorI ask) {
    return ask.forSplit(l, r);
  }

  int accept(iTreeVisitorI ask) {
    return ask.forSplit(l, r);
  }

  TreeD accept(tTreeVisitorI ask) {
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

  boolean accept(bTreeVisitorI ask) {
    return ask.forFlat(f, t);
  }

  int accept(iTreeVisitorI ask) {
    return ask.forFlat(f, t);
  }

  TreeD accept(tTreeVisitorI ask) {
    return ask.forFlat(f, t);
  }
}
