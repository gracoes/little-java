class SetEval extends IntEvalV {
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

abstract class SetD {
  SetD add(Integer i) {
    if (mem(i)) {
      return this;
    }

    return new Add(i, this);
  }

  abstract boolean mem(Integer i);
  abstract SetD plus(SetD s);
  abstract SetD diff(SetD s);
  abstract SetD prod(SetD s);
}

class Empty extends SetD {
  boolean mem(Integer i) {
    return false;
  }

  SetD plus(SetD s) {
    return s;
  }

  SetD diff(SetD s) {
    return new Empty();
  }

  SetD prod(SetD s) {
    return new Empty();
  }
}

class Add extends SetD {
  Integer i;
  SetD s;

  SetD(Integer _i, SetD _s) {
    i = _i;
    s = _s;
  }

  boolean mem(Integer n) {
    return i.equals(n) || s.mem(n);
  }

  SetD plus(SetD t) {
    return s.plus(t.add(i));
  }

  SetD diff(SetD t) {
    if (t.mem(i)) {
      return s.diff(t);
    }

    return s.diff(t).add(i);
  }

  SetD prod(SetD t) {
    if (t.mem(i)) {
      return s.prod(t).add(i);
    }

    return s.prod(t);
  }
}
