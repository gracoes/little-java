abstract class KebabD {
  abstract boolean isVeggie();

  abstract Object whatHolder();
}

class Holder extends KebabD {
  Object o;

  Holder(Object _o) {
    o = _o;
  }
  // ------------------

  boolean isVeggie() {
    return true;
  }

  Object whatHolder() {
    return o;
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + o + ")";
  }
}

class Shallot extends KebabD {
  KebabD k;

  Shallot(KebabD _k) {
    k = _k;
  }
  //-------------------------

  boolean isVeggie() {
    return k.isVeggie();
  }

  Object whatHolder() {
    return k.whatHolder();
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + k + ")";
  }
}

class Shrimp extends KebabD {
  KebabD k;

  Shrimp(KebabD _k) {
    k = _k;
  }
  //-------------------------

  boolean isVeggie() {
    return false;
  }

  Object whatHolder() {
    return k.whatHolder();
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + k + ")";
  }
}

class Radish extends KebabD {
  KebabD k;

  Radish(KebabD _k) {
    k = _k;
  }
  //-------------------------

  boolean isVeggie() {
    return k.isVeggie();
  }

  Object whatHolder() {
    return k.whatHolder();
  }

  public String toString() {
    return "new " + getClass().getName() + "(" + k + ")";
  }
}
