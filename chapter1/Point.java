abstract class PointD {}

class CartesianPt extends PointD {
  int x;
  int y;

  CartesianPt(int _x, int _y) {
    x = _x;
    y = _y;
  }
}

class ManhattanPt extends PointD {
  int x;
  int y;

  ManhattanPt(int _x, int _y) {
    x = _x;
    y = _y;
  }
}

class Main {
  public static void main(String args[]) {

  }
}
