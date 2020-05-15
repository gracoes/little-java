interface PiemanI {
  int addTop(Object t);
  int remTop(Object t);
  int substTop(Object n, Object o);
  int accTop(Object o);
}

class PiemanM implements PiemanI {
  PieD p = new Bot();

  public int addTop(Object t) {
    p = new Top();

    return accTop(t);
  }

  public int remTop(Object t) {
    p = (PieD)p.accept(new RemV(t));

    return accTop(t);
  }

  public int substTop(Object n, Object o) {
    p = (PieD)p.accept(new SubstV(n, o));

    return accTop(n);
  }

  public int accTop(Object o) {
    return ((Integer) p.accept(new Occurs(o))).intValue();
  }
}
