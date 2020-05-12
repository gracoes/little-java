class RemAV {
  PieD forBot() {
    return new Bot();
  }

  PieD forTop(Object t, PieD r) {
    if (new Anchovy().equals(t)) {
      return r.remA();
    }

    else
      return new Top(t, r.remA());
  }
}

class RemFishV {
  PieD forBot(FishD f) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, FishD f) {
    if (f.equals(t)) {
      return r.remFish(f);
    }

    else
      return new Top(t, r.remFish(f));
  }
}

class RemIntV {
  PieD forBot(Integer i) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Integer i) {
    if (i.equals(t)) {
      return r.remInt(i);
    }

    else
      return new Top(t, r.remInt(i));
  }
}

class RemV {
  PieD forBot(Object i) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Object o) {
    if (o.equals(t)) {
      return r.rem(o);
    }

    else
      return new Top(t, r.rem(o));
  }
}

class SubstFishV {
  PieD forBot(FishD f) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, FishD n, FishD old) {
    if (old.equals(t)) {
      return new Top(n, r.substFish(n, old));
    }

    else
      return new Top(t, r.substFish(n, old));
  }
}

class SubstIntV {
  PieD forBot(Integer i) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Integer n, Integer old) {
    if (old.equals(t)) {
      return new Top(n, r.substInt(n, old));
    }

    else
      return new Top(t, r.substInt(n, old));
  }
}

class SubstV {
  PieD forBot(Object n, Object o) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Object n, Object old) {
    if (old.equals(t)) {
      return new Top(n, r.subst(n, old));
    }

    else
      return new Top(t, r.subst(n, old));
  }
}

// PizzaPieD
abstract class PieD {
  // RemAV raFn = new RemAV();
  // RemFishV rfFn = new RemFishV();
  RemV remFn = new RemV();
  SubstV substFn = new SubstV();

  // abstract PieD remA();
  // abstract PieD remFish(FishD f);
  abstract PieD rem(Object o);
  abstract PieD subst(Object n, Object o);
}

// Bottom
class Bot extends PieD {
  // PieD remA() {
  //   return raFn.forBot();
  // }

  // PieD remFish(FishD f) {
  //   return rfFn.forBot(f);
  // }

  PieD rem(Object o) {
    return remFn.forBot(o);
  }

  PieD subst(Object n, Object o) {
    return substFn.forBot(n, o);
  }
}

// Topping
class Top extends PieD {
  Object t;
  PieD r;

  Top(Object _t, PieD _r) {
    t = _t;
    r = _r;
  }
  // --------------------

  // PieD remA() {
  //   return raFn.forTop(t, r);
  // }

  // PieD remFish(FishD f) {
  //   return rfFn.forTop(t, r, f);
  // }

  PieD rem(Object o) {
    return remFn.forTop(t, r, o);
  }

  PieD subst(Object n, Object o) {
    return substFn.forTop(t, r, n, o);
  }
}
