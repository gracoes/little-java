interface PieVisitorI {
  Object forBot();
  Object forTop(Object t, PieD r);
}

abstract class PieD {
  abstract Object accept(PieVisitorI ask);
}

class Bot extends PieD {
  Object accept(PieVisitorI ask) {
    return ask.forBot();
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
    return ask.forTop(t, r);
  }
}
