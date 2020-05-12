abstract class NumD {}

class OneMoreThan extends NumD {
  NumD predecessor;

  OneMoreThan(NumD _p) {
    predecessor = _p;
  }

  public boolean equals(Object o) {
    if (o instanceof NumD) {
      return predecessor.equals(((OneMoreThan) o).predecessor);
    }

    else
      return false;
  }
}
