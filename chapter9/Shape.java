interface ShapeVisitorI {
  boolean forCircle(int r);
  boolean forSquare(int s);
  boolean forTrans(PointD q, ShapeD s);
}

interface UnionVisitorI extends ShapeVisitorI {
  boolean forUnion(ShapeD s, ShapeD t);
}

class HasPtV implements ShapeVisitorI {
  PointD p;

  HasPtV(PointD _p) {
    p = _p;
  }

  ShapeVisitorI newHasPtV(PointD p) {
    return new HasPtV(p);
  }

  public boolean forCircle(int r) {
    return p.distanceToO() <= r;
  }

  public boolean forSquare(int s) {
    return (p.x <= s) && (p.y <= s);
  }

  public boolean forTrans(PointD q, ShapeD s) {
    return s.accept(newHasPtV(p.minus(q)));
  }
}

class UnionHasPtV extends HasPtV implements UnionVisitorI {
  UnionHasPtV(PointD _p) {
    super(_p);
  }

  ShapeVisitorI newHasPtV(PointD p) {
    return new UnionHasPtV(p);
  }

  public boolean forUnion(ShapeD s, ShapeD t) {
    return s.accept(this) || t.accept(this);
  }
}

abstract class ShapeD {
  abstract boolean accept(ShapeVisitorI ask);
}

class Circle extends ShapeD {
  int r;

  Circle(int _r) {
    r = _r;
  }

  boolean accept(ShapeVisitorI ask) {
    return ask.forCircle(r);
  }
}

class Square extends ShapeD {
  int s;

  Square(int _s) {
    s = _s;
  }

  boolean accept(ShapeVisitorI ask) {
    return ask.forSquare(s);
  }
}

// Translation
class Trans extends ShapeD {
  PointD q;
  ShapeD s;

  Trans(PointD _q, ShapeD _s) {
    q = _q;
    s = _s;
  }

  boolean accept(ShapeVisitorI ask) {
    return ask.forTrans(q, s);
  }
}

class Union extends ShapeD {
  ShapeD s;
  ShapeD t;

  Union(ShapeD _s, ShapeD _t) {
    s = _s;
    t = _t;
  }

  boolean accept(ShapeVisitorI ask) {
    return ((UnionVisitorI) ask).forUnion(s, t);
  }
}
