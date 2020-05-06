abstract class PointD {
  int x;
  int y;

  PointD(int _x, int _y) {
    x = _x;
    y = _y;
  }
  // --------------------------

  boolean closerTo(PointD p) {
    return distanceToO() <= p.distanceToO();
  }

  abstract int distanceToO();
}

class CartesianPt extends PointD {
  CartesianPt(int _x, int _y) {
   super(_x, _y);
  }

  int distanceToO() {
    return (int)(Math.sqrt(x*x + y*y));
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + x + ", " + y + ")";
  }
}

class ManhattanPt extends PointD {
  ManhattanPt(int _x, int _y) {
    super(_x, _y);
  }

  int distanceToO() {
    return x + y;
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + x + ", " + y + ")";
  }
}
