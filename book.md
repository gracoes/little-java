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
``` java
abstract class SeasoningD {}
class Salt extends SeasoningD {}
class Pepper extends SeasoningD {}
```
### The `D` is a reminder that the class is a datatype.
```
  --------------
  | SeasoningD |
  --------------
     ^      ^
    /        \
   /          \
--------  ----------
| Salt |  | Pepper |
--------  ----------
```

### Yes. We say *SeasoningD* is a datatype, and *Salt* and *Pepper* are its variants.
Okay. But aren't all three classes introducing new types?

### Yes, in a way. Now, is `new Salt()` a *SeasoningD*?
Yes, it is, because `new Salt()` creates an instance of *Salt*, and every instance of *Salt* is also a *SeasoningD*.

### And `new Pepper()`?
The same

### What are **abstract**, **class**, and **extends**?
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
``` java
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
Mostly, but that means we have used constructors before without defining them.
How does that work?

### When a class does not contain any fields, as in *Salt* and *Pepper*, a constructor is included by default.
And that's the constructor we used before, right?

### Yes, that's correct. Default constructors never consume values, and,
### when used with **new**, always create objects without fields.
Good. But what is `new PointD()`?

### An **abstract** class is by definition incomplete, so **new** cannot create an instance from it.
That makes sense. Let's move on.

###  Do the following classes define another datatype with variants?
``` java
abstract class NumD {}

class Zero extends NumD {}

class OneMoreThan extends NumD {
  NumD predecessor;

  OneMoreThan(NumD _p) {
    predecessor = _p;
  }
  //-----------------------------
}
```
### Draw the picture, too.
Yes, they define a datatype and two variants.
```
  --------------
  |    NumD    |
  --------------
     ^      ^
    /        \
   /          \
--------  ---------------
| Zero |  | OneMoreThan |
--------  ---------------
```

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
``` java
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
``` java
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
``` java
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
It's also a *LayerD* and an *Object*

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

## Chapter 2

### Remember points?
``` java
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
Sure, we just talked about them. But what are these labeled ovals about?

### We will find out soon. Did you notice the big white space on the right?
Yeah, it must be for drawing the picture of the classes.
```
              --------------
              |    PointD   |
              --------------
                ^         ^
               /           \
              /             \
----------------     ---------------
| CartesianPt |      | ManhattanPt |
---------------      ---------------
```

### How far is `new ManhattanPt(3,4)` from the Empire State Building?
If the Empire State Building is the origin, we have to walk seven blocks: 3 over, 4 up.

### And how far is `new CartesianPt(3,4)` from the origin?
Square root of 4^2 + 3^, that is 5

### Write the methods `distanceToO` using {, }, (, ). :. **return**. **int**, `+`, V\, and ^2, which
### determine how far a point is from the origin.
Of course, you can't write these methods. yet. Okay, you deserve something sweet for enduring this last question.

### What do the methods produce?
**int**s, which represent the distances to the origin

### Here they are.
``` java
// PointD
abstract int distanceToO();

// CartesianPt
int distanceToO() {
  return squareRoot(x^2 + y^2);
}

// ManhattanPt
int distanceToO() {
  return x + y;
}
```
### To what do *Point* *CartesianPt* and *ManhattanPt* in the comments refer?
1. The classes in which this methods exist.
1. They correspond to the unexplained labels in the definition of the datatype and its variants.

### The labels remind us that we nned to insert these methods into *PointD* *CartesianPt*, and *ManhattanPt*.
That's simple enough

### How many times have we defined the method `distanceToO`?
3 but the first one is different since it's preceded by **abstract**

### Do **abstract** methods belong to the **abstract** class?
Yes, they always do

### An **abstract** method in an **abstract** class introduces an obligation, which says that all concrete classes that
### extend this abstract class(!) must contain a matching method definition.
#### (!) Directly or indirectly. That is, the concrete class may extend an abstract class that extends the abstract
#### class with the obligation and so on.
Ok

### What is the value of `new ManhattanPt(3,4).distanceToO()`?
7

### How do we arrive at that value?
By adding the `x` field which is 3 to the `y` field which is 4

### What is the value of `new CartesianPt(3,4).distanceToO()`?
The result of `squareRoot(3 * 3 + 4 * 4)`, which is 5

### What does `squareRoot(x)` compute?
The largest **int** that does not exceed the square root of `x`

### Here is another datatype with its variants. What is different about them?
``` java
abstract class ShishD {}

class Skewer extends ShishD {}

class Onion extends ShishD {
  ShishD s;

  Onion(ShishD _s) {
    s = _s;
  }
}

class Lamb extends ShishD {
  ShishD s;

  Lamb(ShishD _s) {
    s = _s;
  }
}

class Tomato extends ShishD {
  ShishD s;

  Tomato(ShishD _s) {
    s = _s;
  }
}
```
It's like *NumD* but has more variants
```
     -------------------------------------------
     |                 ShishD                  |
     -------------------------------------------
        ^        ^         ^            ^
       /         |          \            \
      /          |           \            \
---------    ---------    --------    ----------
| Skewer |    | Onion |    | Lamb |    | Tomato |
---------    ---------    --------    ----------
```

### Construct a *ShishD*
`new Tomato(new Skewer())`

### How about another one?
`new Skewer()`

### And a third?
`new Lamb(new Onion())`

### Are there only *Onion*s on this *ShishD*: `new Skewer()`?
There are no *Onion*s

### Are there only *Onion*s on this *ShishD*: `new Onion(new Skewer())`?
*true*

### And how about: `new Lamb(new Skewer())`?
*false*, there is only *Lamb*

### Is it true that
``` java
new Onion(
  new Onion(
    new Onion(
      new Skewer())))
```
### contains only *Onion*s?
*true*

### And finally:
``` java
new Onion(
  new Lamb(
    new Onion(
      new Skewer())))
```
*false*

### Write the methods `onlyOnions` using {, }, (, ), .. ;, *true*, *false*, **return**, and **boolean**.
Of course you can't write these methods, yet.
Okay, you deserve a lollipop for enduring this kind of question again.

### And what do they produce?
**boolean**s

### Here are the methods.
``` java
// ShishD
abstract class boolean onlyOnions();

// Skewer
boolean onlyOnions() {
  return true;
}

// Onion
boolean onlyOnions() {
  return x.onlyOnions();
}

// Lamb
boolean onlyOnions() {
  return false;
}

// Tomato
boolean onlyOnions() {
  return false;
}
```

### Good. How many methods have we defined?
Five

### Do abstract methods belong to the abstract class?
Yes, always.

### Does each variant of *ShishD* contain a method called `onlyOnions`?
Yes, because *ShishD* contains an **abstract** method called `onlyOnions` that obligates each variant to define a matching, concrete method.

### Is this always the case?
Always

### What do these concrete methods consume?
Nothing, just as the **abstract** method says.

### What do these concrete methods produce?
**boolean**s, just as the **abstract** method says

### What is the value of
``` java
new Onion(
  new Onion(
    new Skewer()))
.onlyOnions()
```
**true**

### And how do we determine the value of
``` java
new Onion(
  new Onion(
    new Skewer()))
.onlyOnions()
```
It's the value of `new Onion(new Skewer()).onlyOnions()` which is the the value of `new Skewer().onlyOnions()` which is **true**

### Which definition of onlyOnions must we use to determine the value of
``` java
new Onion(
  new Onion(
    new Skewer()))
.onlyOnions()?
```
This object is an instance of *Onion*, so we need to use the definition of `onlyOnions` that belongs to the *Onion* variant.

### What follows the word **return** in the `onlyOnions` method in *Onion*?
`s.onlyOnions()`

### What is the field `s` of the object
``` java
new Onion(
  new Onion(
  new Skewer()))
```
```java
new Onion(new Skewer())
```

### Does `s` always stand for an *Onion*?
No, it stands for *ShishD* and can be any type of its variant.

### Then what is `s.onlyOnions()`?
It should be
``` java
new Onion(new Skewer()).onlyOnions()
```

### Why do we need to know the meaning of
```java
new Onion(new Skewer()).onlyOnions()
```
Because it's the answer for
``` java
new Onion(
  new Onion(
    new Skewer()))
.onlyOnions()?
```

### How do we determine the answer for
```java
new Onion(
  new Skewer())
.onlyOnions()
```
Let's see

###  Which definition of onlyOnions must we use to determine the value of
```java
new Onion(
  new Skewer())
.onlyOnions()?
```
This object is an instance of *Onion*, so we need to use the definition of `onlyOnions` that belongs to the *Onion* variant

### What follows the word **return** in the `onlyOnions` method in *Onion*?
```java
s.onlyOnions();
```

### What is the field `s` of the object
```java
new Onion(
  new Skewer())
```
```java
new Skewer()
```

### Then what is `s.onlyOnions()`?
It's the value of
```java
new Skewer().onlyOnions()
```

### Why do we need to know the meaning of
```java
new Skewer().onlyOnions()
```
Because it's the value of
```java
new Onion(
  new Skewer())
.onlyOnions()
```
which is also the value of
```java
new Onion(
  new Onion(
    new Skewer()))
.onlyOnions()
```

### How do we determine the answer for
```java
new Skewer().onlyOnions()
```
We need to determine one more time which version of `onlyOnions` we must use.

### Is
``` java
new Skewer()
```
a *Skewer*?
Yes

### Then what is the answer?
**true**

### Why?
Because that's what the method `onlyOnions` of *Skewer* always returns

### Are we done?
Yep, becaus the answer for
```java
new Onion(
  new Onion(
    new Skewer()))
.onlyOnions()
```
is the same as the answer for
```java
new Onion(
  new Skewer())
.onlyOnions()
```
which is the same as the answer for
```java
new Skewer().onlyOnions()
```
which is **true**

### What is the value of
```java
new Onion(
  new Lamb(
    new Skewer()))
.onlyOnions()
```
**false**

### Which definition of `onlyOnions` must we use to determine the value of
```java
new Onion(
  new Lamb(
    new Skewer()))
.onlyOnions()
```
The definition of the *Onion* variant

### What follows the word **return** in the `onlyOnions` method in *Onion*?
```java
s.onlyOnions()
```

### What is the field `s` of the object
```java
new Onion(
  new Lamb(
    new Skewer()))
```
It's the object built from
```java
new Lamb(
  new Skewer())
```

### Then what is `s.onlyOnions()`?
It's the value of
```java
new Lamb(
  new Skewer())
.onlyOnions()
```

### Why do we need to know the meaning of
```java
new Lamb(
  new Skewer())
.onlyOnions()
```
Because it is the answer of
```java
new Onion(
  new Lamb(
    new Skewer()))
.onlyOnions()
```

### How do we determine the answer for
```java
new Lamb(
  new Skewer())
.onlyOnions()
```
We determine which version of `onlyOnions` we must use

### And?
It's the version that belongs to the *Lamb* variation

### And now what is the answer?
**false**

### Are we done?
Yes!
Because the answer to
```java
new Onion(
  new Lamb(
    new Skewer()))
.onlyOnions()
```
is equal to the answer of
```java
new Lamb(
  new Skewer())
.onlyOnions()
```
which is **false**

### Describe the methods (i.e., the function) `onlyOnions` in your own words.
The methods inform if a *ShishD* is composed only of onions

### Describe how the methods (i.e., the function) `onlyOnions` accomplish this.
For each layer of the *ShishD*, except for
*Onion*, the corresponding method knows whether it is good or bad. The method for *Onion* needs to determine whether the remaining layers are only *Onions* sitting on a *Skewer*

### Is
```java
new Tomato(
  new Skewer())
```
### a *ShishD*?
Yes because *Tomato* extends *ShishD*

### Is
```java
new Onion(
  new Tomato(
    new Skewer()))
```
### a *ShishD*?
Yes

### And how about another *Tomato*?
Sure

#### Is
```java
new Tomato(
  new Onion(
    new Tomato(
      new Skewer())))
```
### a vegetarian shish kebab?
Yep

### And
```java
new Onion(
  new Onion(
    new Onion(
      new Skewer())))
```
Sure

### Define the methods `isVegetarian`
### which return **true** if the given object does not contain *Lamb*.
#### Hint: The method for tomatoes is the same as the one for onions.
```java
// ShishD
abtract boolean isVegetarian();

// Skewer
boolean isVegetarian() {
  return true;
}

// Onion
boolean isVegetarian() {
  return s.isVegetarian();
}

// Tomato
boolean isVegetarian() {
  return s.isVegetarian();
}

// Lamb
boolean isVegetarian() {
  return false;
}
```

### How many methods have we defined?
5, one is **abstract** the others are concrete.

### Do **abstract** methods belong to the **abstract** class?
Always!

### Does each variant of *ShishD* contain method called `isVegetarian`?
Yep

### Is this always the case?
It must be

### What do these concrete methods consume?
Nothing

### What do these concrete methods produces?
**boolean**s

### Collect all the pieces of *ShishD*. Here is the datatype
```java
abstract class ShishD {
  abstract boolean onlyOnions();
  abstract boolean isVegetarian();
}
```
```java
class Skewer extends ShishD {
  boolean onlyOnions() {
    return true;
  }

  boolean isVegetarian() {
    return false;
  }
}

class Onion extends ShishD {
  ShishD s;

  Onion(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return s.onlyOnions();
  }

  boolean isVegetarian() {
    return s.isVegetarian();
  }
}

class Lamb extends ShishD {
  ShishD s;

  Lamb(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
   return false;
  }

  boolean isVegetarian() {
    return false;
  }
}

class Tomato extends ShishD {
  ShishD s;

  Tomato(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return false;
  }

  boolean isVegetarian() {
    return s.isVegetarian();
  }
}
```

### What do the following define?
```java
abstract class KebabD {}

class Holder extends KebabD {
  Object o;

  Holder(Object _o) {
    o = _o;
  }
  // ------------------
}

class Shallot extends KebabD {
  KebabD k;

  Shallot(KebabD _k) {
    k = _k;
  }
  //-------------------------
}

class Shrimp extends KebabD {
  KebabD k;

  Shrimp(KebabD _k) {
    k = _k;
  }
  //-------------------------
}

class Radish extends KebabD {
  KebabD k;

  Radish(KebabD _k) {
    k = _k;
  }
  //-------------------------
}
```
### Don't forget the picture
It defines a datatype *KebabD* and its variants: *Holder*, *Shallot*, *Shrimp* and *Radish*
```
     -------------------------------------------
     |                 KebabD                  |
     -------------------------------------------
        ^        ^           ^            ^
       /         |            \            \
      /          |             \            \
---------    -----------    ----------    ----------
| Holder |   | Shallot |    | Shrimp |    | Radish |
---------    -----------    ----------    ----------
```

###  What is different about them?
They are placed onto different *Holder*s

### Here are some holders.
```java
abstract class RodD {}

class Dagger extends RodD {}

class Sabre extends RodD {}

class Sword extends RodD {}
```
### Are they good ones?
Sure and since every *RodD* is an *Object* they can be the `o` in *Holder*

### Think of another kind of holder. Are you tired of drawing pictures, yet?
We could move all of the food to various forms of plates.
```java
abstract class PlateD {}

class Gold extends PlateD {}

class Silver extends PlateD {}

class Brass extends PlateD {}

class Copper extends PlateD {}

class Wood extends PlateD {}
```

### What is
```java
new Shallot(
  new Radish(
    new Holder(
      new Dagger())))
```
A *KebabD*

### Is
```java
new Shallot(
  new Radish(
    new Holder(
      new Dagger())))
```
### a vegetarian *KebabD*?
Yep

### Is
```java
new Shallot(
  new Radish(
    new Holder(
      new Gold())))
```
### a *KebabD*?
Yep

### Is
```java
new Shallot(
  new Radish(
    new Holder(
      new Gold())))
```
### a vegetarian kebab?
Yes

### Lets define the method `isVeggie` which checks whether a kebab contains only vegetarian foods,
### regardless of what *Holder* it is on
```java
// KebabD
abstract boolean isVeggie();

// Holder
abstract boolean isVeggie() {
  return true;
}

// Shallot
boolean isVeggie() {
  return k.isVeggie();
}

// Shrimp
boolean isVeggie() {
  return false;
}

// Radish
boolean isVeggie() {
  return k.isVeggie();
}
```

### What is the value of
```java
new Shallot(
  new Radish(
    new Holder(
      new Dagger())))
.isVeggie()
```
**true**

### What is
```java
new Shallot(
  new Radish(
    new Holder(
      new Dagger())))
```
It's an instance of *KebabD* of the *Shallot* variant

### What is the value of
```java
new Shallot(
  new Radish(
    new Holder(
      new Gold())))
.isVeggie()
```
Also **true**

### And what is
```java
new Shallot(
  new Radish(
    new Holder(
      new Gold())))
```
It's also an instance of *KebabD* of the *Shallot* variant except it is on a gold plate

### What type of value is
```java
new Shallot(
  new Radish(
    new Holder(
      new Integer(52))))
.isVeggie()
```
**bolean**

### What type of value is
```java
new Shallot(
  new Radish(
    new Holder(
      new OneMoreThan(
        new Zero()))))
.isVeggie()
```
Also **boolean**

### What type of value is
```java
new Shallot(
  new Radish(
    new Holder(
      new Boolean(false))))
.isVeggie()
```
**boolean**

### Does that mean `isVeggie` works for all five kinds of *Holder*s?
Yes and all kind of *Object*s

### What is the holder of
```java
new Shallot(
  new Radish(
    new Holder(
      new Dagger())))
```
```java
new Dagger()
```

### What is the holder of
```java
new Shallot(
  new Radish(
    new Holder(
      new Gold())))
```
```java
new Gold()
```

### What is the holder of
```java
new Shallot(
  new Radish(
    new Holder(
      new Integer(52))))
```
All the food is now on the *Integer* 52

### What is the value of
```java
new Shallot(
  new Radish(
    new Holder(
      new Dagger())))
.whatHolder()
```
A dagger

### What is the value of
```java
new Shallot(
  new Radish(
    new Holder(
      new Gold())))
.whatHolder()
```
A gold plate

### What is the value of
```java
new Shallot(
  new Radish(
    new Holder(
      new Integer(52))))
.whatHolder()
```
An *Integer*, whose underlying **int** is 52

### What type of values do the methods (i. e., the function) of `whatHolder` produce?
*Object*s

### Here is the abstract method `whatHolder`.
```java
// KebabD
abstract Object whatHolder()
```
If we add this method to *KebabD* , then we must add a method definition to each of the four variants.

### What is the value of
```java
new Holder(
  new Integer(52))
.whatHolder()
```
```java
new Integer(52)
```


### What is the value of
```java
new Holder(
  new Sword())
.whatHolder()
```
```java
new Sword()
```

### What is the value of
```java
new Holder(b).whatHolder()
```
### if `b` is some object?
It is `b`

### Define the concrete method that goes into *Holder*
```java
Object whatHolder() {
  return o;
}
```

### What is the value of
```java
new Radish(
  new Shallot(
    new Shrimp(
      new Holder(
        new Integer(52)))))
.whatHolder()
```
```java
new Integer(52)
```

### What is the value of
```java
new Shallot(
  new Shrimp(
    new Holder(
      new Integer(52))))
.whatHolder()
```
```java
new Integer(52)
```

### What is the value of
```java
new Shrimp(
  new Holder(
    new Integer(52)))
.whatHolder()
```
```java
new Integer(52)
```

### Does this mean that the value of
```java
new Radish(
  new Shallot(
    new Shrimp(
      new Holder(
        new Integer(52)))))
.whatHolder()
```
### is the same as
```java
new Shallot(
  new Shrimp(
    new Holder(
      new Integer(52))))
.whatHolder()
```
### which is the same as
```java
new Shrimp(
  new Holder(
    new Integer(52)))
.whatHolder()
```
### which is the same as
```java
new Holder(
  new Integer(52))
.whatHolder()
```
Yep

### Here is the datatype and one of its variants.
```java
abstract class Kebabv {
  abstract boolean isVeggie();
  abstract Object whatHolder();
}

class Holder extends Kebabv {
  Object o;
  Holder(Object _0) {
    o = _0;
  }
  // ------------------

  boolean isVeggie() {
    return true;
  }

  Object whatHolder() {
    return o;
  }
}
```
### Collect the remaining variants
```java
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
}
```

### Are there any other *KebabD* foods besides *Shallot*, *Shrimp*, and *Radish*?
Well, *Holder* is also a *KebabD* but not a food

### Can we add more foods?
Sure

### Let's define another *KebabD*
```java
class Pepper extends KebabD {
  KebabD k;

  Pepper(KebabV _k) {
    k = _k;
  }
  // ---------------------

boolean isVeggie() { return k.isVeggieO; }

Object whatHolder() { return k.whatHolderO; }
```
### Why does it incluede `isVeggie` and `whatHolder` methods
Because it **extends** from *KebabD* and since these methods are **abstract** all of the variants must have them

### Is it obvious how the new methods work?
Yep

### Vhich of these points is closer to the origin: `new ManhattanPt(3,4)` or new ManhattanPt(1,5)`?
The second one because its distance to origin is 6 while the first one is 7

### Good. Which of the following points is closer to the origin: `new CartesianPt(3,4)` or `new CartesianPt(12,5)`?
The first one since its distance to origin is 5 while the second one is 13

###  We added the method closerToO to CartesianPt. It consumes another CartesianPt and determines whether the constructed or the consumed point is closer to the origin.
```java
// CartesianPt
boolean closerToO(CartesianPt p) {
  return distanceToO() <= p.distanceToO();
}
```
### Add the corresponding method to ManhatthanPt
```java
// ManhattanPt
boolean closerToO(ManhatthanPt p) {
  return distanceToO() <= p.distanceToO();
}
```

### What is the value of
```java
new ManhattanPt(3,4)
.closerToO(new ManhattanPt(1,5))
```
**false**

### What is the value of
```java
new CartesianPt(12,5)
.closerToO(new CartesianPt(3,4))
```
**false**

### What is the value of
```java
new ManhattanPt(1,5)
.closerToO(new ManhattanPt(3,4))
```
**true**

### So finally what is the value of
```java
new CartesianPt(3,4)
.closerToO(new ManhattanPt(1,5))
```
Nonsense

### Why?
Because the `closerToO` method of *CartesianPt* consumes another *CartesianPt*

### How can we fix that?
By changing the definition of `closerToO` to consume *PointD*

### If we do that, can we still determine the value of `p.distanceToO()`?`
Yep, because the definition of *PointD* obligates every variant to have a method `distanceToO`

### Why does it help to replace (CartesianPt p) by (PointD p)?
Because every *CartesianPt* is a *PointD* and every *ManhattanPt* is also a *PointD*


### Here is the improved *CartesianPt*
```java
// CartesianPt
boolean closerToO(PointD p) {
  return distanceToO() <= p.distanceToO();
}
```

### Improve the definition of *ManhattanPt*.
```java
// ManhattanPt
boolean closerToO(PointD p) {
  return distanceToO() <= p.distanceToO();
}
```

### Is the definition of `closerToO` in *CartesianPt* the same as the one in *ManhattanPt*?
Yes

###  Correct, and therefore we can add a copy to the abstract class *PointD and delete the definitions from the variants.
```java
// PointD
boolean closerToO(PointD p) {
  return distanceToO() <= p.distanceToO();
}
```
Looks good

### What else do the two point variants have in common?
The fields `x` and `y`.
Shouldn't we lift them too?

### Yes. It's tricky, but here is a start.
```java
abstract class PointD {
  int x;
  int y;

  boolean closerTo(PointD p) {
    return distanceToO() <= p.distanceToO();
  }
  abstract int distanceToO();
}
```
This not only lifts `x` and `y`, it also introduces a new constructor.

### Absolutely. And we need to change how a *CartesianPt* is built. Define *ManhattanPt*.
```java
class CartesianPt extends PointD {
  CartesianPt(int _x, int _y) {
   super(_x, _y);
  }

  int distanceToO() {
    return (int)(Math.sqrt(x*x + y*y));
  }
}
```
```java
class ManhattanPt extends PointD {
  ManhattanPt(int _x, int _y) {
    super(_x, _y);
  }

  int distanceToO() {
    return x + y;
  }
}
```
But what does `super(_x, _y)` means?

### The expressions `super(_x,_y)` in the constructors *CartesianPt* and *ManhattanPt* create a *PointD* with the appropriate fields, and the respective constructor guarantees that the point becomes a *CartesianPt* or a *ManhattanPt*.
"That's simple"

## Do we now have everything that characterizes *PointD*s in the datatype?
Yes and the things that distinguish the two variants from each other exist in the corresponding variants.

## Chapter 3

### Do you like to eat pizza?
```java
abstract class PizzaD {}

class Crust extends PizzaD {}

class Cheese extends PizzaD {
  PizzaD p;

  Cheese(PizzaD _p) {
    p = _p;
  }
  // -----------------------
}

class Olive extends PizzaD {
  PizzaD p;

  Olive(PizzaD _p) {
    p = _p;
  }
  // ------------------------
}

class Anchovy extends PizzaD {
  PizzaD p;

  Anchovy(PizzaD _p) {
    p = _p;
  }
  // -------------------------
}
```
Looks like good toppings. Let's add *Sausage*
```java
class Sausage extends PizzaD {
  PizzaD p;

  Sausage(Pizza _p) {
    p = _p;
  }
  // -----------------------
}
```

### Here is our favorite pizza
```java
new Anchovy(
  new Olive(
    new Anchovy(
      new Anchovy(
        new Cheese(
          new Crust())))))
```
Yuck!

### How about removing the anchovies?
That would be better

### Let's remove them. What is the value of
```java
new Anchovy(
  new Olive(
    new Anchovy(
      new Anchovy(
        new Cheese(
          new Crust())))))
.remA()
```
```java
new Olive(
  new Cheese(
    new Crust()))
```

### What is the value of
```java
new Sausage(
  new Olive(
    new Anchovy(
      new Sausage(
        new Cheese(
          new Crust())))))
.remA()
```
It should be a sausage, olive and cheese piza like:
```java
new Sausage(
  new Olive(
    new Sausage(
      new Cheese(
        new Crust()))))
```

### Does `remA` belongs to the datatype *PizzaD* and its variants?
Yes and it produces them too

### Define the methods that belong to the five variants. Here is a start.
```java
// Pizza
abstract PizzaD remA();

// Crust
PizzaD remA() {
  return new Crust();
}

// Cheese
PizzaD remA() {
  return new Cheese(p.remA());
}

// Olive
PizzaD remA() {
  return new Olive(p.remA());
}

// Sausage
PizzaD remA() {
  return new Sausage(p.remA());
}

// Anchovy
PizzaD remA() {
  return p.remA();
}
```

### Explain why we use `new Cheese` ... , `new Olive` ... , and `new Sausage´ ... when we define these methods.
Because we need to produce a new *PizzaD* to be on the top of the pizza that `p.remA()` produces.

### The methods remA must produce a *PizzaD*, so let's use new *Crust*, the simplest *PizzaD* , for the method in Anchovy.
```java
// Anchovy
abstract PizzaD remA() {
  return new Crust();
}
```
Yes, and now the methods of `remA` produce pizzas without any anchovies on them

###  Let's try it out on a small pizza:
```java
new Anchovy(
  new Crust())
.remA().
```
Since the object is an *Anchovy* the answer is `new Crust()`

### Is
```java
new Crust()
```
### like
```java
new Anchovy(
  new Crust())
.remA().
```
### without anchovy?
Yes, but what if we had more anchovies

### No problem. Here is an example:
```java
new Anchovy(
  new Anchovy(
    new Crust()))
.remA().
```
The answer is also `new Crust()`

### Okay, so what if we had an olive and cheese on top:
```java
new Olive(
  new Cheese(
    new Anchovy(
      new Anchovy(
        new Crust()))))
.remA()
```
Since this is an *Olive* and its `p` field is
```java
new Cheese(
    new Anchovy(
      new Anchovy(
        new Crust())))
```
the answer is
```java
new Cheese(
  new Anchovy(
    new Anchovy(
      new Crust())))
.remA()
```

### Then, what is the value of
```java
new Olive(p.remA())
```
### where `p` stands for
```java
new Cheese(
  new Anchovy(
    new Anchovy(
      new Crust())))
```
It's the value of
```java
new Cheese(
  new Anchovy(
    new Anchovy(
      new Crust())))
.remA()
```

### What is the value of
```java
new Cheese(
  new Anchovy(
    new Anchovy(
      new Crust())))
.remA()
```
Since this is a *Chesse* it's the value of
```java
new Cheese(p.remA())
```

### And what is the value of
```java
new Cheese(
  new Anchovy(
    new Anchovy(
      new Crust())))
.remA()
```
It is the pizza that
```java
new Anchovy(
  new Anchovy(
    new Crust())))
.remA()
```
produces, with cheese added on top.

### Do we know the value of
```java
new Anchovy(
  new Anchovy(
    new Crust())))
.remA()
```
Yes, it produces `new Crust()`

### Does that mean that `new Crust()` is the answer?
No, its still missing the cheese and olive

### Does it matter in which order we add those two toppings?
Yes, first is cheese than the olive

### So what is the final answer?
```java
new Olive(
  new Cheese(
    new Crust()))
```

### Let's try one more example
```java
new Cheese(
  new Anchovy(
    new Cheese(
      new Crust())))
.remA()
```
### What kind of pizza should this make
A double-cheese one

### Check it out!
The object is an instance of *Cheese* so the value is
```java
new Cheese(p.remA())
```
where `p` is
```java
new Anchovy(
  new Cheese(
    new Crust()))
```

### Doens't that mean the result is
```java
new Cheese(
  new Anchovy(
    new Cheese(
      new Crust())).remA())
```
Yes

### What about
```java
new Anchovy(
  new Cheese(
    new Crust()))
.remA()
```
Since this an *Anchovy* it produces `new Crust()`

### And the answer is `new Crust()`?
Yep

### Does that mean the final answer is
```java
new Cheese(
  new Crust())
```
Yes! But that's not the answer we want

### What do we want?
A double-cheese pizza like
```java
new Cheese(
  new Cheese(
    new Crust()))
```

### Which `remA` method do we need to change to get the cheese back?
The `remA` of *Anchovy*, it should be
```java
// Anchovy
PizzaD remA() {
  return p.remA();
}
```

### Does this `remA` still belong to *PizzaD*?
Yes because `remA` always return a *PizzaD*

### We could add cheese on top of the anchovies.
Yes, that would hide their taste, too.

### What kind of pizza is
```java
new Olive(
  new Anchovy(
    new Cheese(
      new Anchovy(
        new Crust()))))
.topAwC() // topAnchovyWithCheese
```
A pizza like
```java
new Olive(
  new Cheese(
    new Anchovy(
      new Cheese(
        new Cheese(
          new Anchovy(
            new Crust()))))))
```

### And what is
```java
new Olive(
    new Cheese(
      new Sausage(
        new Crust())))
.topAwC()
```
The same pizza

### DefiIle the remaiIling methods.
```java
// PizzaD
abstract PizzaD topAwC();

// Crust
PizzaD topAwC() {
  return new Crust();
}

// Cheese
PizzaD topAwC() {
  return new Cheese(p.topAwC());
}

// Olive
PizzaD topAwC() {
  return new Olive(p.topAwC());
}

// Anchovy
PizzaD topAwC() {
  return new Cheese(new Anchovy(p.topAwC()));
}

// Sausage
PizzaD topAwC() {
  return new Sausage(p.topAwC());
}
```

### Take a look at this method.
```java
// Anchovy
PizzaD topAwc() {
  return p.topAwC()
}
```
It's missing the cheese and the anchovies

### How many layers of cheese are in the result of
```java
(
  new Olive(
    new Anchovy(
      new Cheese(
        new Anchovy(
          new Crust()))))
.remA())
  .topAwC()
```
One layer because `remA` removes all the anchovies so no extra layer of cheese is added with `topAwC`

### How many layers of cheese are in the result of
```java
(
  new Olive(
    new Anchovy(
      new Cheese(
        new Anchovy(
          new Crust()))))
.topAwC())
  .remA()
```
Three layers since `topAwC` adds two extra layers

### Perhaps we should replace every anchovy with cheese.
We just did something like that.

### Is it true that for each anchovy in `x` `x.topAwc().remA()` adds some cheese?
Yes and also removes all the anchovies

### So `x.topAwc().remA()` is a way to substitute all anchovies with cheese by looking at each topping of a pizza and adding cheese on top of each anchovy and then looking at each topping again, including all the new cheese, and removing the anchovies.
Nicely put

###  Here is a different description: "The methods look at each topping of a pizza and replace each anchovy with cheese'
### Define the methods that match this description. Call them `subAbC`. Here is the abstract method.
```java
// PizzaD
abstract PizaD subAbC();

// Crust
PizzaD subAbc() {
  return new Crust();
}

// Cheese
PizzaD subAbC() {
  return new Cheese(p.subAbC());
}

// Olive
PizzaD subAbC() {
  return new Olive(p.subAbc());
}

// Anchovy
PizzaD subAbc() {
  return new Cheese(p.subAbC());
}

// Sausage
PizzaD subAbC() {
  return new Sausage(p.subAbC());
}
```

### Does this skeleton look familiar?
Yes, it's similar to `remA` and `topAwC`

###  Collection time.
```java
abstract class PizzaD {
  abstract PizzaD remA();
  abstract PizzaD topAwC();
  abstract PizzaD subAbC();
}

class Crust extends PizzaD {
  PizzaD remA() {
    return new Crust();
  }

  PizzaD topAwC() {
    return new Crust();
  }

  PizzaD subAbC() {
    return new Crust();
  }
}

class Cheese extends PizzaD {
  PizzaD p;

  Cheese(PizzaD _p) {
    p = _p;
  }
  // -----------------------

  PizzaD remA() {
    return new Cheese(p.remA());
  }

  PizzaD topAwC() {
    return new Cheese(p.topAwC());
  }

  PizzaD subAbC() {
    return new Cheese(p.subAbC());
  }
}

class Olive extends PizzaD {
  PizzaD p;

  Olive(PizzaD _p) {
    p = _p;
  }
  // ------------------------

  PizzaD remA() {
    return new Olive(p.remA());
  }

  PizzaD topAwC() {
    return new Olive(p.topAwC());
  }

  PizzaD subAbC() {
    return new Olive(p.subAbC());
  }
}

class Anchovy extends PizzaD {
  PizzaD p;

  Anchovy(PizzaD _p) {
    p = _p;
  }
  // -------------------------

  PizzaD remA() {
    return p.remA();
  }

  PizzaD topAwC() {
    return new Cheese(new Anchovy(p.topAwC()));
  }

  PizzaD subAbC() {
    return new Cheese(p.subAbC());
  }
}

class Sausage extends PizzaD {
  PizzaD p;

  Sausage(PizzaD _p) {
    p = _p;
  }
  // -----------------------

  PizzaD remA() {
    return new Sausage(p.remA());
  }

  PizzaD topAwC() {
    return new Sausage(p.topAwC());
  }

  PizzaD subAbC() {
    return new Sausage(p.subAbC());
  }
}

```

### Let's add more *PizzaD* foods.
Good idea

### Here is one addition: *Spinach*.
```java
class Spinach extends PizzaD {
  PizzaD p;

  Spinach(PizzaD _p) {
    p = _p;
  }
  // ----------------------------

  PizzaD remA() {
    return new Spinach(p.remA());
  }

  PizzaD topAwC() {
    return new Spinach(p.topAwC());
  }

  PizzaD subAbC() {
    return new Spinach(p.subAbC());
  }
}
```

### Do we need to change *PizzaD*, *Crust*, *Cheese*, *Olive*, *Anchovy*, or *Sausage*?
Nope

### Isn't that neat?
Yep. Unfortunately, the more things we want to do with *PizzaD*, the more methods we must add.

### True enough. And that means cluttered classes. Is there a better way to express all this?
Hope so. However we don't know of a better way to organize these definitions yet.

### Don't worry. We are about to discover how to make more sense out of such things.
That's great

### And now you can replace anchovy with whatever pizza topping you want.
Even better

## Chapter 4

###  Wasn't this last collection overwhelming?
A little bit, seven classes and each had three methods

### Could it get worse?
You bet, for every new thing in *PizzaD* it needed to be added to each concrete class.

### Why does that become overwhelming?
That's too much man!
Because it becomes more and more difficult to understand the rationale for each of the methods in a variant and what the relationship is between methods of the same name in the different variants.

### Correct. Let's do something about it. Take a close look at this visitor class.
```java
class OnlyOnionsV {
  boolean forSkewer() {
    return true;
  }

  boolean forOnions(ShishD s) {
    return s.onlyOnions();
  }

  boolean forLamb(ShishD s) {
    return false;
  }

  boolean forTomato(ShishD s) {
    return false;
  }
}
```
These methods look familiar. Have we seen them before?

### Almost. Each of them corresponds to an `onlyOnions` method in one of the variants of *ShishD*.
Ahh I see. The only difference is that they are all in one class, a visitor, whose name is *onlyOnionsV*

### Is `onlyOnions` different from *OnlyOnionsV*?
Absolutely, `onlyOnions` is a method and *OnlyOnionsV* is a class

### And that's the whole point.
What point?

### We want all the methods in one class
What methods?

### Those methods that would have the same name if we placed them into the variants of a datatype in one class.
If we could do that, it would be much easier to understand what action these methods perform.

### That's what we are about to do. We are going to separate the action from the datatype
Let's do it

### What is the difference between the method `onlyOnions` in the *Onion* variant and
### the `forOnions` in the visitor *OnlyOnionsV*?
`forOnions` takes a *ShishD* as the single argument

### Yes, that is the difference.
### Are the other `for` methods in *OnlyOnionsV* related to their counterparts in the sameway?
Yes

### It is time to discuss the boring part.
What boring part?

### The boring part tells us how to make all of this work
True. we still don't know how to make *ShishD* and its variants work with this visitor class,
which contains all the action.

### Now take a look at this.
```java
abstract class ShishD {
  OnlyOnionsV ooFn = new OnlyOnionsV();

  abstract boolean onlyOnions();
}

class Skewer extends ShishD {
  boolean onlyOnions() {
    return ooFn.forSkewer();
  }
}

class Onion extends ShishD {
  ShishD s;

  Onion(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return ooFn.forOnions(s);
  }
}

class Lamb extends ShishD {
  ShishD s;

  Lamb(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
   return ooFn.forLamb(s);
  }
}

class Tomato extends ShishD {
  ShishD s;

  Tomato(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return ooFn.forTomato(s);
  }
}
```
This is a strange set of definitions. All the `onlyOnions` methods in the variants look alike.
Each of them uses an instance of *OnlyOnionsV* , which is created in the datatype,
to invoke a `for` method with a matching name.

### What does the `forOnion` method in *Onion* consume?
If "consume" refers to what follows the name between parentheses,
the method consumes `s`, which is the rest of the shish.

### That's what "consumption" is all about. And what does the `forSkewer` method in Skewer consume?
Nothing

### So what does the `(ShishD s)` mean in the definition of `forOnion`?
It means that `forOnion` needs to consume a *ShishD*, which is the rest of the shish, to produce an answer

### Very good. The notation `(ShishD s)` means that `forOnion` consumes a *ShishD*
### and that between `{` and `}`, `s` stands for that shish
That makes sense and explains `s.onlyOnions()`.

### Explain `s.onlyOnions()`
`s.onlyOnions` is asking the rest of the shish if there is only onions below the current layer

### Explain `ooFn.forOnion(s)`.
`ooFn.forOnion(s)` takes the rest of the shish, `s` and checks if there are only onions below as if
the current layer was an onion

### So what is the value of
```java
new Onion(
  new Onion(
    new Skewer()))
.onlyOnions()
```
**true**

### And how do we determine that value with these new definitions?
We start with the onlyOnions method in *Onion*, but it immediately uses the `forOnion` method on the rest of the shish.

### And what does the `forOnion` method do?
It uses the `onlyOnions` method of `s`

### Isn't that where we started from?
Yes, we're going round and round.

### Welcome to the carousel.
Fortunately, the shish shrinks as it goes around, and when we get to the skewer we stop.

### And then the ride is over and we know that for this example the answer is **true**.
That's exactly it.

### Do we need to remember that we are on a carousel?
No! Now that we understand how the separation of data and action works, we only need to look at the action part to understand how things work.

### Is one example enough?
No, let's look at some of the other actions on shishes and pizzas.

### Let's look at `isVegetarian` next. Here is the beginning of the protocol.
#### (For us protocol is an agreement on how classes that specify a datatype and its variants interact with classes
#### that realize functions on that datatype)
```java
abstract class ShishD {
  OnlyOnionsV ooFn = new OnlyOnionsV();
  IsVegetarian ivFn = new IsVegetarian();

  abstract boolean onlyOnions();
  abstract boolean isVegetarian();
}
```
What about it?

### Write the rest!
```java
class Skewer extends ShishD {
  boolean onlyOnions() {
    return ooFn.forSkewer();
  }

  boolean isVegetarian() {
    return ivFn.forSkewer();
  }
}

class Onion extends ShishD {
  ShishD s;

  Onion(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return ooFn.forOnion(s);
  }

  boolean isVegetarian() {
    return ivFn.forOnion(s);
  }
}

class Lamb extends ShishD {
  ShishD s;

  Lamb(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
   return ooFn.forLamb(s);
  }

  boolean isVegetarian() {
    return ivFn.forLamb(s);
  }
}

class Tomato extends ShishD {
  ShishD s;

  Tomato(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return ooFn.forTomato(s);
  }

  boolean isVegetarian() {
    return ivFn.forTomato(s);
  }
}

```

### That's why we call this part boring.
True, there's very little to think about. It could be done automatically.

### How do we define the visitor?
Does that refer to the class that contains the actions?

### Yes. that one. Define the visitor.
```java
class IsVegetarianV {
  boolean forSkewer() {
    return true;
  }

  boolean forOnion(ShishD s) {
    return s.isVegetarian();
  }

  boolean forLamb(ShishD s) {
    return false;
  }

  boolean forTomato(ShishD s) {
    return s.isVegetarian();
  }
}
```

### Are we moving fast?
Yes, but there are only a few interesting parts.
The protocol is always the same and boring; the visitor is always closely related to what we saw in chapter 2

### Is
```java
new Anchovy(
  new Olive(
    new Anchovy(
      new Cheese(
        new Crust()))))
```
### a shish kebab?
Not even close, it's a pizza

### So what do we do next?
We define the protocol for the methods of *PizzaD*: `remA`, `topAwC` and `subAwC`

### Great! Here is the abstract portion of the protocol.
```java
abstract class PizzaD {
  RemAV remFn = new RemAV();
  TopAwC topAwCFn = new TopAwC();
  SubAbC subAbC = new SubAbC();

  abstract PizzaD remA(); // remove anchovies
  abstract PizzaD topAwC(); // top anchovies with cheese
  abstract PizzaD subAbC(); // substitute anchovies by cheese
}

class Crust extends PizzaD {
  PizzaD remA() {
    return remFn.forCrust();
  }

  PizzaD topAwC() {
    return topAwCFn.forCrust();
  }

  PizzaD subAbC() {
    return subAbC.forCrust();
  }
}

class Cheese extends PizzaD {
  PizzaD p;

  Cheese(PizzaD _p) {
    p = _p;
  }
  // -----------------------

  PizzaD remA() {
    return remFn.forCheese(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forCheese(p);
  }

  PizzaD subAbC() {
    return subAbC.forCheese(p);
  }
}
```
The variants are totally mindless, now
```java
class Olive extends PizzaD {
  PizzaD p;

  Olive(PizzaD _p) {
    p = _p;
  }
  // ------------------------

  PizzaD remA() {
    return remFn.forOlive(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forOlive(p);
  }

  PizzaD subAbC() {
    return subAbC.forOlive(p);
  }
}

class Anchovy extends PizzaD {
  PizzaD p;

  Anchovy(PizzaD _p) {
    p = _p;
  }
  // -------------------------

  PizzaD remA() {
    return remFn.forAnchovy(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forAnchovy(p);
  }

  PizzaD subAbC() {
    return subAbC.forAnchovy(p);
  }
}

class Sausage extends PizzaD {
  PizzaD p;

  Sausage(PizzaD _p) {
    p = _p;
  }
  // -----------------------

  PizzaD remA() {
    return remFn.forSausage(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forSausage(p);
  }

  PizzaD subAbC() {
    return subAbC.forSausage(p);
  }
}

class Spinach extends PizzaD {
  PizzaD p;

  Spinach(PizzaD _p) {
    p = _p;
  }
  // ----------------------------

  PizzaD remA() {
    return remFn.forSpinach(p);
  }

  PizzaD topAwC() {
    return topAwCFn.forSpinach(p);
  }

  PizzaD subAbC() {
    return subAbC.forSpinach(p);
  }
}
```

### We are all set
What about the visitors?

### Okay, here is *RemAV*.
```java
class RemAv {
  PizzaD forCrust() {
    return new Crust();
  }

  PizzaD forCheese(PizzaD p) {
    return new Cheese(p.topAwC())
  };

  PizzaD forOlive (Pizza D p) {
    return new Olive(p.topAwC());
  }

  PizzaD forAnchovy(PizzaD p) {
    return p.topAwC();
  }

  Pizza D forSausage(Pizza D p) {
    return new Sausage(p.topAwC());
  }
}
```
### Define *TopAwCV*
Easy!
```java
class TopAwCV {
  PizzaD forCrust() {
    return new Crust();
  }

  PizzaD forCheese(PizzaD p) {
    return new Cheese(p.topAwC());
  }

  PizzaD forOlive(PizzaD p) {
    return new Olive(p.topAwC());
  }

  PizzaD forAnchovy(PizzaD p) {
    return new Cheese(new Anchovy(p.topAwC()));
  }

  PizzaD forSausage(PizzaD p) {
    return new Sausage(p.topAwC());
  }
}
```

### This last one, *SubAbCV* is a piece of cake.
Yep
```java
class SubAbCV {
  PizzaD forCrust() {
    return new Crust();
  }

  PizzaD forCheese(PizzaD p) {
    return new Cheese(p.subAbC());
  }

  PizzaD forOlive(PizzaD p) {
    return new Olive(p.subAbC());
  }

  PizzaD forAnchovy(PizzaD p) {
    return new Cheese(p.subAbC());
  }

  PizzaD forSausage(PizzaD p) {
    return new Sausage(p.subAbC());
  }
}
```

## Chapter 5

### Have we seen this kind of definition before?
```java
// PizzaPieD
abstract class PieD {}

// Bottom
class Bot extends PieD {}

// Topping
class Top extends PieD {
  Object t;
  PieD r;

  Top(Object _t, PieD _r) {
    t = _t;
    r = _r;
  }
  // --------------------
}
```
Yep

### Yes, still more pizza, but this one is different
Yes, it includes only one variant for adding toppings to a pizza, and toppings are *Object*s

### What kind of toppings can we put on these kinds of pizza?
Any kind we want because *Object* is the class of all objects. Here are some fish toppings
```java
abstract class FishD {}
class Anchovy extends FishD {}
class Salmon extends FishD {}
class Tuna extends FishD {}
```

### Nice datatype. Is
```java
new Top(
  new Anchovy(),
  new Top(
    new Tuna(),
    new Top(
      new Anchovy(),
      new Bot())))
```
### a pizza pie?
Yes

### What is the value of
```java
new Top(
  new Salmon(),
  new Top(
    new Anchovy(),
    new Top(
      new Tuna(),
      new Top(
        new Anchovy(),
        new Bot()))))
.remA()
```
It's this fishy pizza pie
```java
new Top(
  new Salmon(),
  new Top(
    new Tuna(),
    new Bot()))
```

### Is it true that the value of
```java
new Top(
  new Salmon(),
  new Top(
    new Tuna(),
    new Bot()))
.remA()
```
### is
```java
new Top(
  new Salmon(),
    new Top(
      new Tuna(),
        new Bot()))
```
Yes because this pizza pie has no anchovies to remove

### Does `remA` belong to *PieD*?
Yes and it produces pizza pies.

### Define the protocol for *RemAV*. We provide the abstract part
```java
// PieD
RemAV raFn = new RemAV();

abstract PieD remA();
```
It's easy by now
```java
// Bot
PieD remA() {
  return raFn.forBot();
}

// Top
PieD remA() {
  return raFn.forTop(t, r);
}
```

### Great. Isn't that easy?
Sure is

### What part of this exercise differs from datatype to datatype?
Determining how many fields a variant contains. In our case, we had zero and two.

### Anything else?
No, from that we know that `raFn.forBot` is followed by `()` and `raFn.forTop` by `(t,r)`.

### Why `(t, r)`?
Because those are the fields of *Top*

### Let's define the visitor *RemAV*.
```java
class RemAV {
  PieD forBot() {
    return //____________
  }

  PieD forTop(Object t, PieD r) {
    if (new Anchovy().equals(t)) {
      return //___________
    }
    else return //____________
  }
}
```
```java
class RemAV {
  PieD forBot() {
    return new Bot();
  }

  PieD forTop(Object t, PieD r) {
    if (new Anchovy().equals(t)) {
      return r.remA();
    }
    else return new Top(t, r.remA())
  }
}
```
