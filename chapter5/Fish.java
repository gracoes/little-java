abstract class FishD {}

class Anchovy extends FishD {
  public boolean equals(Object o) {
    return (o instanceof Anchovy);
  }
}

class Salmon extends FishD {
  public boolean equals(Object o) {
    return (o instanceof Salmon);
  }
}

class Tuna extends FishD {
  public boolean equals(Object o) {
    return (o instanceof Tuna);
  }
}
