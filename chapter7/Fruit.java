abstract class FruitD {}

class Peach extends FruitD {
  public boolean equals(Object o) {
    return (o instanceof Peach);
  }
}

class Apple extends FruitD {
  public boolean equals (Object o) {
    return (o instanceof Apple);
  }
}

class Pear extends FruitD {
  public boolean equals(Object o) {
    return (o instanceof Pear);
  }
}

class Lemon extends FruitD {
  public boolean equals(Object o) {
    return (o instanceof Lemon);
  }
}

class Fig extends FruitD {
  public boolean equals(Object o) {
    return (o instanceof Fig);
  }
}
