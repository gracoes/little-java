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

  PointD minus(PointD p) {
    return new CartesianPt(x - p.x, y - p.y);
  }

  abstract int distanceToO();
}

class CartesianPt extends PointD {
  CartesianPt(int _x, int _y) {
   super(_x, _y);
  }

  int distanceToO() {
    return (int)(Math.sqrt(x * x + y * y));
  }
}

class ManhattanPt extends PointD {
  ManhattanPt(int _x, int _y) {
    super(_x, _y);
  }

  int distanceToO() {
    return x + y;
  }
}

class ShadowedManhattanPt extends ManhattanPt {
  int deltaX;
  int deltaY;

  ShadowedManhattanPt(int _x, int _y, int _deltaX, int _deltaY) {
    super(_x, _y);
    deltaX = _deltaX;
    deltaY = _deltaY;
  }

  int distanceToO() {
    return super.distanceToO() + deltaY + deltaY;
  }
}
