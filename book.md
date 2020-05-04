## Chapter 1

### Is 5 an integer?
Yes

### Is this a number: - 23?
Yes but we only count positive integers

### Is this an integer: 5.32?
No

### That type of number is 5?
An integer, **int**

### Quick, think of another integer!
3

### What type of value is *true*?
**boolean**

### What type of value is false?
Also **boolean**

### Can you think of another *boolean*?
Not really

### What is **int**?
Java representation for integers, a type

### What is **boolean**?
Java representation for boolean values, also a type

### What is a type?
A type is a name for a collection of values.

### What is a type?
Sometimes we use it as if it were the collection.

### Can we make new types?
We don't know yet...

### Draw the picture that characterizes the essential relationships among the following classes.
```
abstract class SeasoningD {}
class Salt extends SeasoningD {}
class Pepper extends SeasoningD {}
```
### The `D` is a reminder that the class is a datatype.
  --------------
  | SeasoningD |
  --------------
     ^      ^
    /        \
   /          \
--------  ----------
| Salt |  | Pepper |
--------  ----------

### Yes. We say *SeasoningD* is a datatype, and *Salt* and *Pepper* are its variants.
Okay. But aren't all three classes introducing new types?

### Yes, in a way. Now, is `new Salt()` a *SeasoningD*?
Yes, it is, because `new Salt()` creates an instance of *Salt*, and every instance of *Salt* is also a *SeasoningD*.

### And `new Pepper()`?
The same

### What are abstract, class, and extends?
Easy:
- **abstract** class introduces a datatype,
- **class** introduces a variant, and
- **extends** connects a variant to a datatype.

### Is there any other *SeasoningD*?
Not for now, because only *Salt* and *Pepper* extend *SeasoningD*

### Correct, *Salt* and *Pepper* are the only variants of the datatype *SeasoningD*.
### Have we seen a datatype like *SeasoningD* before?
Nope, but **boolean** is a type that also has just two values

### Let's define more *SeasoningD*s.
`class Thyme extends SeasoningD {}`

### And then there were four.
`class Cinnamon extends SeasoningD {}`

### What is a Cartesian point?
Its a pair of two coordinates in a Cartesian plane, basically a pair of numbers

### What is a point in Manhattan?
An intersection where two city streets meet.

### How do *CartesianPt* and *ManhattanPt* differ from *Salt* and *Pepper*?
```
abstract class PointD {}

class CartesianPt extends PointD {
  int x;
  int y;

  CartesianPt(int _x, int_y) {
    x = y;
    y= _y
  }
  // ---------------------------
}

class ManhattanPt extends PointD {
  int x;
  int y;

  ManhattanPt(int _x, int _y) {
    x = _x;
    y = _y;
  }
  // ------------------------------
}
```
Each of them contains three things between { and }.
The `x` and the `y` are obviously the coordinates of the points. But what is the remaining thing above the bar?
This bar indicates the end of the constructor definition.
It is used as an eye-catching separator.
We recommend that you use `//------------------------------` when you enter it in a file.

### The underlined occurrences of *CartesianPt* and *ManhattanPt* introduce the constructors of the respective variants.
Yep and how do we use these constructors?

### A constructor is used, with **new** to create new instances of a **class**.
Ok!

### When we create a CartesianPt like this: `new CartesianPt(2,3)`,
### we use the constructor in the definition of *CartesianPt*.
So now we have created a *CartesianPt* whose `x` field is 2 and whose `y` field is 3.
And because *CartesianPt* extends *PointD*, it is also a *PointD*

### Correct. Is this a *ManhattanPt*: `new ManhattanPt(2,3)`?
Yes! And it's `x` field is 2 and it's `y` field is 3.

### Isn't all this obvious?
Mostly, but that means we have used constructors before without defining them. How does that work?

### When a class does not contain any fields, as in *Salt* and *Pepper*, a constructor is included by default.
And that's the constructor we used before, right?

### Yes, that's correct. Default constructors never consume values, and,
### when used with **new**, always create objects without fields.
Good. But what is `new PointD()`?

### An **abstract** class is by definition incomplete, so **new** cannot create an instance from it.
That makes sense. Let's move on.

###  Do the following classes define another datatype with variants?
```
abstract class NumD {}

class Zero extends NumD {}

class OneMoreThan extends NumD {
  NumD predecessor;

  OneMoreThan(NumD _p) {
    predecessor = _p;
  }
  //-----------------------------å
}
```
### Draw the picture, too.
Yes, they define a datatype and two variants.
  --------------
  |    NumD    |
  --------------
     ^      ^
    /        \
   /          \
--------  ---------------
| Zero |  | OneMoreThan |
--------  ---------------

### Is this a *NumD*: `new Zero()`?
Yes since *Zero* extends *NumD*

### Is this a *NumD*: `new OneMoreThan(new Zero())`?
Yes since *OneMoreThan* constructs a *NumD* from a *NumD* and also extends *NumD*

### How does OneMoreThan do that?
By taking a *NumD* as an argument of its constructor and constructing a new *NumD*

### And what does it mean to construct this new instance?
This new instance of *OneMoreThan* is a value with a single field, which is called `predecessor`.
In our example, the field is `new Zero()`

### Does predecessor always stand for an instance of *Zero*?
No it can be any instance of a *NumD*

###  What is
```
new OneMoreThan(
  new OneMoreThan(
    new Zero()))
```
A *OneMoreThan* instance where its `predecessor` field is another *OneMoreThan* instance and its `predecessor`
field is a *Zero* instance.
It's also a *NumD*

### What is `new OneMoreThan(O)`?
That is nonsense, since `0` is not a *NumD*
(We use "nonsense" to refer to expressions for Java cannot determine a type)

### Is `new Zero()` the same as O?
Only in concept

### Is `new OneMoreThan(new Zero())` like 1?
It's similar but not the same

### And what is
```
new OneMoreThan(
  new OneMoreThan(
    new OneMoreThan(
      new OneMoreThan(
        new Zero()))))
```
### similar to?
4

### Are there more *Num'D*s than **boolean**s?
Yep

### Are there more *Num'D*s than **int**s?
No

### What is the difference between `new Zero()` and O?
*Zero* is a *NumD*, 0 is an **int**

### Correct. In general, if two things are instances of two different basic types, they cannot be the same.
So are types just names for different collections with no common instances?

### The primitive types (**int** and **boolean**) are distinct: others may overlap.
What are non-basic types?

### Class definitions do not introduce primitive types.
### For example, a value like `new Zero()` is not only an instance of Zero,
### but is also a *NumD*, which is extended by *Zero*.
### Indeed, it is of any type that *NumD* extends, too.
And what type is that?

### Every class that does not explicitly extend another class implicitly extends the class *Object*.
This must mean that everything is an *Object*.

### Almost. We will soon see what that means.
Ok.

### What do the following define?
```
abstract class LayerD {}

class Base extends LayerD {
  Object o;

  Base(Object _o) {
    o = _o;
  }
  //-----------------------
}

class Slice extends LayerD {
  Layer l;

  Slice(LayerD _l) {
    l = _l;
  }
  //------------------------
}
```
It defines a datatype *LayerD* and its two variants, *Base* and *Slice*

### What is `new Base(new Zero())`?
A new instance of *Base* with a new instace of *Zero* as his `o` field.
Its also a *LayerD* and an *Object*

### And what is `new Base(new Salt())`?
The same but with an instance of *Salt* as the `o` field.
But how come both are instances of the same variant?

### They are, because everything created with new is an *Object*, the class of all objects.
Hence we can use both `new Zero()` and `new Salt()`
for the construction of a *Base* which requires an *Object*.

### Is anything else an Object?
We said that only things created with **new** are *Object*s

### Correct. Is this a *LayerD*: `new Base(5)`?
5 is not created with **new**, so this must be nonsense.

### Is this a *LayerD*: `new Base(false)`?
Also nonsense

### Correct again! How about this *LayerD*: `new Base(new Integer(5))`?
This must mean that *Integer* creates an object from **int**

### Guess how we create a *LayerD* from **false**?
`new Base(new Boolean(false))`

### Is it confusing that we need to connect **int** with *Integer* and **boolean** with *Boolean*?
A little bit, too much coffee does that.

### Ready for more?
You bet
