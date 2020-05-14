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

### Great guesses! What does
```java
if (expr1)
  return expr2;
else
  return expr3;
```
### mean?
It means that when `expr1` is true we return `expr2`, otherwise we return `expr3`

### And what does `new Anchovy().equals(t)` mean?
It checks if `t` is equal to `new Anchovy`

### Not yet. It depends on what `equals` means.
What?

### What is the value of `new Anchovy().equals(new Anchovy())`?
The "Not yet" implies that the value is **false**

### Yes! And what is the value of `new Anchovy().equals(new Tuna())`?
Also **false**

### The class *Object* contains a method called `equals`.
### This method compares one *Object* to another, and it ahways returns **false**.
### (Not always, we will see in chapter 10)
If we know that `equal`s answer is always **false**, why bother to use it?

### We must define it anew* for all classes whose instances we wish to compare.
#### (In Java, redefining a method is called "overriding")
Ok, how?

### For *FishD* and its variants it works like this.
```java
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
```
Assuming that `(o instanceof Tuna)`
is true when `o` is an instance of *Tuna*, these method definitions are obvious.

### Aren't they? Is every value constructed with new an instance of *Object*?
Yes, they are

### If class *A* **extends** *B*, is every value created by `new A(... )` an instance of class *B*?
Yes, every *A* is also a *B*

### Now, what is the value of `new Anchovy().equals(new AnchovyO)`?
It's **true**!

### Yet the value of `new Anchovy().equals(new Tuna())` is still **false**.
Yes, because `new Tuna` is not an instance of *Anchovy*

### Could we have written *RemAV* without using `equals`?
Yes, we could have used `instanceof`
```java
class RemAV {
  PieD forBot() {
    return new Bot();
  }

  PieD forTop(Object t, PieD r) {
    if (t instanceof Anchovy) {
      return r.remA();
    }

    else return new Top(t, r.remA());
  }
}
```
Why haven't we defined it this way?

### Easy, because we want to generalize *RemAV* so that it works for any kind of fish topping.
We can do that, but when we use the methods of the more general visitor,
we need to say which kind of fish we want to remove.

### What are good names for the more general methods and visitor?
*RemFishV* for visitor and `remFish` for method

### How do we use `remFish`?
Like we use `remA` but it needs to consume a *FishD*

### Add the protocol for *RemFishV*. We designed the abstract portion.
```java
// Bot
PieD remFish(FishD f) {
    return rfFn.forBot(f);
}

// Top
PieD remFish(FishD f) {
    return rfFn.forTop(f, t, r);
}
```

### Where do `(f)` and `(t, r, f)` come from?
`f` is the *FishD* we want to remove, `t` is the *Topping* and `r` is the rest of the pizza pie in *Top*

### Let's define *RemFishV* and its two methods.
```java
class RemFishV {
  PieD forBot(FishD f) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, FishD f) {
    if (f.equals(t)) {
      return r.remFish(f)
    }

    else
      return new Top(t, r.remFish(f))
  }
}
```

### If we add another kind of fish to our datatype, what would happen to the definition of *RemFishV*?
It would stay the same, we just need to add `equals` to the new variant

###  Let's try it out with a short example:
```java
new Top(new Anchovy(),new Bot()).remFish(new Anchovy())
```
The object is a topping, so we use `forTop` of *RemFishV*

### Yes. What values does `forTop` consume?
An *Object* `t` which is `new Anchovy()`, the rest of the pizza pie `r` which is `new Bot()`
and a *FishD* to be removed, in this case `new Anchovy()`.

### And now?
Now we compare if `t` is equal to `f`

### So?
`t` and `f` are equal, since both are instances of *Anchovy* so we return `r.remFish(f)`

### What is the value of `new Bot().remFish(new Anchovy())`?
Since this is a bottom we use `forBot` of *RemFishV*

### What does `forBot` in *RemFishV* produce?
It always produces a `new Bot()`

### All clear?
Yep

###  Does
```java
new Top(
  new Integer(2),
  new Top(
    new Integer(3),
    new Top(
      new Integer(2),
      new Bot())))
remInt(new Integer(3))
```
### look familiar?
Yes, it looks just like `remFish` but it consumes *Integer*s instead

### What does `remInt` do?
It removes from the pizza pie all the *Integer*s that are equal to the one it receives

### Who defined `equals` for *Integer*?
The Machine decided `new Integer(0).equas(new Integer(O)) to be true, and the rest was obvious.

### Define the visitor *RemIntV*.
```java
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
```

### Does it matter that this definition uses `i` and not `f`?
The name is not really importante, what is important is the type

### Where is the protocol?
It's so simple, let's save it for later

### Can we remove *Integers* from *PieD*s?
Sure with the *RemIntV* visitor

### Can we remove *FishD* from *PieD*s?
Yes, we just saw that

### Let's combine the two definitions.
If we use *Object* instead of Integer above, everything works out.

### Why?
Because every object is an instance of *Object* and thus has the `equals` method

### Just do it!
```java
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
```

### Should we do the protocol for all these visitors?
Now?

### You never know when it might be useful, even if it does not contain any interesting information.
Let's just consider *RemV*.

### Why not *RemFishV* and *RemAV* and *RemIntV*?
Because those are just variants of *RemV*

###  Here is the abstract portion of *PieD*.
```java
abstract class PieD {
  RemV remFn = new RemV());

  abstract PieD rem(Object o);
```
```java
// Bot
PieD rem(Object o) {
    return remFn.forBot(o);
}

// Top
PieD rem(Object o) {
    return remFn.forTop(t, r, o);
}
```

### Let's remove some things from pizza pies:
```java
new Top(
  new Integer(2),
  new Top(
    new Integer(3),
    new Top(
      new Integer(2),
      new Bot())))
.rem(new Integer(3))
```
It produces
```java
new Top(
  new Integer(2),
  new Top(
    new Integer(2),
    new Bot()))
```

### And how about
```java
new Top(
  new Anchovy(),
  new Bot())
.rem(new Anchovy())
```
It returns `new Bot()` just like before

### Next
```java
new Top(
  new Anchovy(),
  new Top(
    new Integer(3),
    new Top(
      new Zero(),
      new Bot())))
.rem(new Integer(3))
```
Returns
```java
new Top(
  new Anchovy(),
  new Top(
    new Zero(),
    new Bot()))
```

### What is the value of
```java
new Top(
  new Anchovy(),
  new Top(
    new Integer(3),
    new Top(
      new Zero(),
      new Bot())))
.rem(new Zero())
```
It returns the same pizza pie!

### What's wrong with that?
It should've removed the *Zero*

### And why didn't it?
Because we didn't redefine the `equals` of *Zero* so it uses the one of *Object* which always returns **false**

### Always?
Unless we redefine it for the classes we wish to compare

### Here is the version of *NumD* (including *OneMoreThan*) with its own `equals`. Define the new *Zero* variant.
```java
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
```
```java
class Zero extends NumD {
  public boolean equals(Object o) {
    return (o instanceof Zero);
  }
}
```
But what is `((OneMoreThan)o)` about? Wouldn't it have been sufficient to write `o.predecessor`?

### No. What is the type of `o`?
*Object*

### So what is `o.predecessor`?
It's nonsense

### Correct. What do we know after **if** has determined that `(o instanceof OneMoreThan)` is true?
We know that `o` is also an instance of *OneMoreThan*

### Precisely. So what does `((OneMoreThan) o) do`
It converts the type of `o` from *Object* to *OneMoreThan*

### What is `((OneMoreThan) o)` type?
It's *OneMoreThan*

### Are `o` and `((OneMoreThan) o)` interchangeable?
No, `o` is an *Object* and `((OneMoreThan) o)` is an *OneMoreThan*

### Is this complicated?
Someone has been drinking too much coffee

### Did you also notice the
```java
predecessor.equals(((OneMoreThan) o).predecessor);
```
### in `equals` for *OneMoreThan*?
How do the two uses of `predecessor` differ?

### The first one, `predecessor` refers to the `predecessor` field of the instance of *OneMoreThan* on
### which we are using `equals`.
### And that field might not be a *OneMoreThan*
So the second one, `((OneMoreThan) o).predecessor` refers to the `predecessor` field of the instance of *OneMoreThan*
consumed by `equals`

### Yes. Are these two objects equal?
Yes, if their `predecessor`s are equal

### Now what is the value of
```java
new Top(
  new Anchovy(),
  new Top(
    new Integer(3),
    new Top(
      new Zero(),
      new Bot())))
.rem(new Zero())
```
Now it's
```java
new Top(
  new Anchovy(),
  new Top(
    new Integer(3),
    new Bot()))
```

### And why?
Because `equals` now knows how to compara *NumD*s

### Do we always add `equals` to a class?
Only if we need it

### Do we need `equals` when we want to substitute one item for another on a pizza pie?
Yes, we do

### What is the value of
```java
new Top(
  new Anchovy(),
  new Top(
    new Tuna(),
    new Top(
      new Anchovy(),
      new Bot())))
.substFish(new Salmon(), new Anchovy())
```
It's
```java
new Top(
  new Salmon(),
  new Top(
    new Tuna(),
    new Top(
      new Salmon(),
      new Bot())))
```

### What kind of values does `substFish` consume?
Two *FishD* and produces a *PieD*

### And what does it produce?
A *PieD*

### What. is the value of
```java
new Top(
  new Integer(3),
  new Top(
    new Integer(2),
    new Top(
      new Integer(3),
      new Bot())))
.substInt(new Integer(5), new Integer(3))
```
The same pizza pie with the *Integer* 5 instead of the *Integer* 3
```java
new Top(
  new Integer(5),
  new Top(
    new Integer(2),
    new Top(
      new Integer(5),
      new Bot())))
```

### What kind of values does `substInt` consume?
Two *Integer*s

### And what does it produce?
A *PieD*

### We can define *SubstFishV*.
```java
class SubstFishV {
  PieD forBot(FishD f) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, FishD n, FishD o) {
    if (o.equals(t)) {
      return new Top(n, r.substFish(n, o));
    }

    else
      return new Top(t, r.substFish(n, o));
  }
}
```
### Define *SubstIntV*
```java
class SubstIntV {
  PieD forBot(Integer i) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Integer n, Integer o) {
    if (o.equals(t)) {
      return new Top(n, r.substInt(n, o));
    }

    else
      return new Top(t, r.substInt(n, o));
  }
}
```

### Did we forget the boring parts?
Yes, because there is obviously a more general version like *RemV*

### Yes, we call it *SubstV. Define it.
```java
class SubstV {
  PieD forBot(Object i) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Object n, Object o) {
    if (o.equals(t)) {
      return new Top(n, r.subst(n, o));
    }

    else
      return new Top(t, r.subst(n, o));
  }
}
```

### Now it is time to add the protocol for *SubstV* to *PieD*. Here are the variants.
```java
// Bot
PieD subst(Object n, Object o) {
  return substFn.forBot(n, o)
}

// Top
PieD subst(Object n, Object o) {
  return substFn.forTop(t, r, n, o);
}
```
Here is *PieD*
```java
// PieD
SubstV substFn = new SubstV();
abstract PieD subst(Object n, Object o);
```

### So?
That was some heavy lifting

## Chapter 6

### Are protocols truly boring?
We acted as if they were

### But, of course they are not. We just didn't want to spend much time on them.
### Let's take a closer look at the last one we defined in the previous chapter.
```java
abstract class PieD {
  RemV remFn = new RemV();
  SubstV substFn = new SubstV();

  abstract PieD rem(Object o);
  abstract PieD subst(Object n, Object o);
}
```
And here are the variants
```java
// Bot
PieD rem(Object o) {
  return remFn.forBot(o);
}

PieD subst(Object n, Object o) {
  return substFn.forBot(n, o);
}

// Top
PieD rem(Object o) {
  return remFn.forTop(t, r, o);
}

PieD subst(Object n, Object o) {
  return substFn.forTop(t, r, n, o);
}
```

### What is the difference between `rem` and `subst` in *PieD*?
The number of *Object*s they consume

### What is the difference between `rem` and `subst` in the *Bot* variant?
Simple: `rem` asks for the `forBot` service from `remFn` and hands over the *Object* it consumes;
`subst` asks for the `forBot` service from `substFn` and hands over the two *Object*s it consumes.

### What is the difference between `rem` and `subst` in the *Top* variant?
`rem` asks for the `forTop` service from `remFn` and hands over the three *Object*s it consumes;
`subst` asks for the `forTop` service from `substFn` and hands over the four *Object*s it consumes.

### And that is all there is to the methods in the variants of a protocol.
But `remFn` and `substFn` defined in the datatype are still a bit mysterious.

### Let's not create `remFn` and `substFn` in the datatype.
```java
abstract class PieD {
  abstract PieD rem(RemV remFn, Object o);
  abstract PieD subst(SusbtV substFn, Object n, Object o);
}
```
This looks like an obvious modification.
The new `rem` and `subst` now consume a `remFn` and a `substFn`, respcctively.
Can they still find `forBot` and `forTop`, their corresponding carousel partners?

### Yes, it is a straightforward trade-off.
### Instead of adding a `remFn` field and a `substFn` field to the datatype,
### we now have `rem` or `subst` consume such values.
### What kind of values are consumed by `rem` and `subst`?
`rem` and `subst` now consume *RemV* for `rem` and *SubstV* for `subst` in adition to *Object*

### Here is how it changes *Top*
```java
class Top extends PieD {
  Object t;
  PieD r;

  Top(Object _t, PieD _r) {
    t = _t;
    r = _r;
  }

  PieD rem(RemV remFn, Object o) {
    return remFn.forTop(t, r, o);
  }

  PieD subst(SubstV substFn, Object n, Object o) {
    return substFn.forTop(t, r, n, o);
  }
}
```
### How does it affect *Bot*?
It goes like this
```java
class Bot extends PieD {
  PieD rem(RemV remFn, Object o) {
    return remFn.forBot(o);
  }

  PieD subst(SubstV susbstFn, Object n, Object o) {
    return substFn.forBot(n, o);
  }
}
```

### That's right. Nothing else changes in the variants.
### Instead of relying on fields of the datatype, we use what is consumed.
We still have some work to do

### Like what?
Consuming an extra value here also affects how the methods `rem` and `subst` are used.

### Where are they used?
In *RemV* and *SubstV*

### Yes. Here is *RemV*.
```java
class RemV {
  PieD forBot(Object i) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Object o) {
    if (o.equals(t)) {
      return r.rem(this, o);
    }

    else
      return new Top(t, r.rem(this, o));
  }
}
```
### Modify *SubstV* accordingly
```java
class SubstV {
  PieD forBot(Object n, Object o) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Object n, Object old) {
    if (old.equals(t)) {
      return new Top(n, r.subst(this, n, old));
    }

    else
      return new Top(t, r.subst(this, n, old));
  }
}
```

### What is **this** all about?
Yes, what about it. Copying is easy.

### Understanding is more difficult. The word **this** refers to the object itself.
Which object?

### How did we get here?
By calling *SubstV* and *RemV* `forTop` and `forBot`

### How does that happen?
It happens with `remFn.forTop(...)`, `remFn.forBot(...)`, `substFn.forTop(...)` and `substFn.forBot(...)`

### Correct. And now `forBot` and `forTop` can refer to the object `remFn` as **this**.
Oh. so inside the methods of *RemV* **this** stands for precisely that instance of *RemV* that allowed us to use
those methods in the first place. And that must mean that when we use `r.rem(this,... )` in `forTop`, it tells
`rem` to use the same instance over again.

### That's it. Tricky?
Not really, just self-referential.

### Why?
Because **this** is a *RemV* and it is exactly what we need to complete the job.

### What is the value of
```java
new Top(
  new Anchovy(),
  new Top(
    new Integer(3),
    new Top(
      new Zero(),
      new Bot())))
.rem(new RemV(), new Zero());
```
It's the same pizza pie with the *Zero*s removed
```java
new Top(
  new Anchovy(),
  new Top(
    new Integer(3),
    new Bot()))
```

### And how does the `new Rem()` part relate to what we did there?
`new Rem()` creates the *RemV* service that `rem` needs to consume

### What is the value of
```java
new Top(
  new Integer(3),
  new Top(
    new Integer(2),
    new Top(
      new Integer(3),
      new Bot())))
.subst(new SubstV(), new Integer(5), new Integer(3))
```
It's the same result of the previous chapter

### And how does the `new SubstV()` part relate to what we did there?
`new SubstV()` creates the *SubstV* service that `subst` needs to consume

### Take a look at `subst` in *Top* and at `forTop` in *SubstV*. What happens to the values that they consume?
The `subst` on *Top* just passes the values to `forTop` in *SubstV* and `forTop` calls `subst` again after
comparing `o` and `t`

### Is the handing back and forth necessary?
We don't know a better way yet

### Here is a way to define *SubstV* that avoids the handing back and forth of these extra values.
```java
class SubstV {
  Object n;
  Object o;

  SubstV(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  PieD forBot(Object n, Object o) {
    return new Bot();
  }

  PieD forTop(Object t, PieD r, Object n, Object old) {
    if (old.equals(t)) {
      return new Top(n, r.subst(this));
    }

    else
      return new Top(t, r.subst(this));
  }
}
```
Wow. This visitor has two fields.
(In functional programming, a visitor with fields is called a closure (or a higher-order function), which would
be the result of applying a curried version of `subst`.)

### How do we create a *SubstV*?
By passing to `new SubstV(...)` two *Object*s, `n` and `o`

### What does that do?
It creates a *SubstV* whose methods know how to substitute `n` for all occurrences of `o` in *PieD*.

### How do the methods know that without consuming more values"?
The values are now fields of *SubstV* that the methods can access

### Okay, so how would we substitute all `new Integer(3)` with `new Integer(5)` in
```java
new Top(
  new Integer(3),
  new Top(
    new Integer(2),
    new Top(
      new Integer(3),
      new Bot())))
```
By calling the `subst` method of this object and passing it an instance of *SubstV* constructed with
the values `new Integer(5)` and `new Integer(3)` like
```java
new Top(
  new Integer(3),
  new Top(
    new Integer(2),
    new Top(
      new Integer(3),
      new Bot())))
.subst(
  new SubstV(
    new Integer(5),
    new Integer(3)))
```

### And if we want to substitute all `new Integer(2)` with `new Integer(7)` in the same pie?
We do the same thing except creating *SubstV* like `new SubstV(new Integer(7), new Integer(2))`

### Does all that mean we have to change the protocol, too?
Yes we need to change `subst` in *PieD*

### That's right. Here are the datatype and its *Bot* variant. Define the *Top* variant.
```java
abstract class PieD {
  abstract PieD rem(RemV remFn);
  abstract PieD subst(SubstV substFn);
}

class Bot extends PieD {
  PieD rem(RemV remFn) {
    return remFn.forBot());
  }

  PieD subst(SubstV susbstFn) {
    return substFn.forBot();
  }
}
```
Easy
```java
class Top extends PieD {
  Object t;
  PieD r;

  Top(Object _t, PieD _r) {
    t = _t;
    r = _r;
  }

  PieD rem(RemV remFn) {
    return remFn.forTop(t, r);
  }

  PieD subst(SubstV substFn) {
    return substFn.forTop(t, r);
  }
}
```

### Is there anything else missing?
We need to also change *RemV*

### What is the difference between `rem` and `subst` in *Bot*?
Only the type of the value they consume

### What is the difference between `rem` and `subst` in *Top*?
Only the type of the value they consume

### Can we eliminate the differences?
Only if we can use a value of the same type for both

### But how can we make the types the same?
Both *RemV* and *SubstV* are visitors that contain the same method names and those methods consume and produce
the same types of values. We can think of them as extensions of a common **abstract** class

### Yes! Do it!
```java
abstract class PieVisitorD {
  abstract PieD forBot();
  abstract PieD forTop(Object t, PieD r);
}
```

### Great job, except that we will use **interface** for specifying visitors like these.
```java
interface PieVisitorI {
  PieD forBot();
  PieD forTop(Object t, PieD r);
}
```

Okay, that doesn't seem to be a great difference.
Can a class extend an **interface** the way it **extends** an **abstract** class?

### No. A class **implements** an interface; it does not extend it
Fine

### Now that we have an interface that describes the type of the values consumed by `rem` and `subst`,
### can we make their definitions even more similar'?
Yes we can say they both consume a *PieVisitorI* like this
```java
PieD rem(PieVisitorI pvFn) {
    return pvFn.forTop(t, r);
}

PieD subst(PieVisitorI pvFn) {
  return pvFn.forTop(t, r);
}
```
in the case of *Top*

### Correct. What is the difference between `rem` and `subst`, now?
Only the name, so we can join them if we find a good name for both

### What is a good name for this method?
The method accepts a visitor and asks for its services, so we call it `accept`.

### And what is a better name for pvFn?
Easy: `ask`, because we ask for services

### Now we can simplify the protocol. Here is the new *RemV*.
```java
class RemV implements PieVisitorI {
  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (o.equals(t)) {
      return r.accept(this, o);
    }

    else
      return new Top(t, r.accept(this, o));
  }
}
```
### Supply the protocol
```java
abstract class PieD {
  abstract PieD accept(PieVisitorI ask);
}

class Bot extends PieD {
  PieD accept(PieVisitorI ask) {
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

  PieD accept(PieVisitorI ask) {
    return ask.forTop(t, r);
  }
}
```

### Did you notice the two occurrences of **public**?
Yes, what about them?

### When we define a **class** that **implements** an **interface**,
### we need to add the word **public** to the left of the method definitions
Why?

### It's a way to say that these are the methods that stafisfy the obligations imposed by the **interface**
Looks weird, but let's move on

### Correct. They are just icing
Okay, we still won't forget them

### Now define the new *SubstV*.
```java
class SubstV implements PieVisitorI {
  Object n;
  Object o;

  SubstV(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (o.equals(t)) {
      return new Top(n, r.accept(this));
    }

    else
      return new Top(t, r.accept(this));
  }
}
```

### Draw a picture of the interface *PieVisitorI* and all the classes: *PieD*, *Bot*, *Top*, *RemV*, and *SubstV*
```
     ---------------                                      ----------------
     |     PieD    | ----------------accept---------------|  PieVisitorI |
     ---------------                                      ----------------
        ^        ^                                            /         \
       /         |                                           /           \
      /          |                                          /             \
  ---------    -------                                    ---------      ----------
   | Bot  |    | Top |                                    |  RemV |      | SubstV |
  ---------    -------                                    ---------      ----------
```

### Why is there a line, not an arrow, from *SubstV* to *PieVisitorI*
The *SubstV* visitor **implements** *PieVisitorI*, it doesn't extend it.
Arrows mean "extends," lines mean "implements."

### And the line from *PieD* to *PieVisitorI*
It tells us the name of the method that connects the datatype to the visitors.

### What is the value of
```java
new Top(
  new Anchovy(),
  new Top(
      new Tuna(),
      new Top(
        new Anchovy(),
        new Top(
          new Tuna(),
          new Top(
            new Anchovy(),
            new Bot()))))))
.accept(
  new LtdSubstV(2, new Salmon(), new Anchovy()))
```
It's
```java
new Top(
  new Salmon(),
  new Top(
      new Tuna(),
      new Top(
        new Salmon(),
        new Top(
          new Tuna(),
          new Top(
            new Anchovy(),
            new Bot()))))))
```

### Explain what *LtdSubstV* produces
#### *LtdSubstV* means LimitedSubstitutionV
*LtdSubstV* produces a new pizza pie by substituting a topping for another topping the amount of times specified
in the construction of *LtdSubstV*

### Good. Define *LtdSubstV*
```java
class LtdSubstV implements PieVisitorI {
  int c;
  Object n;
  Object o;

  LtdSubstV(int _c, Object _n, Object _o) {
    c = _c;
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (c == 0) {
      return new Top(t, r);
    }

    if (o.equals(t)) {
      return new Top(n, r.accept(this));
    }

    else
      return new Top(t, r.accept(this));
  }
}
```

### What is the value of
```java
new Top(
  new Anchovy(),
  new Top(
      new Tuna(),
      new Top(
        new Anchovy(),
        new Top(
          new Tuna(),
          new Top(
            new Anchovy(),
            new Bot()))))))
.accept(
  new LtdSubstV(2, new Salmon(), new Anchovy())
```
Oh, oh, something went wrong the result is
```java
new Top(
  new Salmon(),
  new Top(
      new Tuna(),
      new Top(
        new Salmon(),
        new Top(
          new Tuna(),
          new Top(
            new Salmon(),
            new Bot()))))))
```

### How come?
We are not decreasing `c` in *LtdSubstV*

### Why doesn't `c` ever change?
Because we are always using the same **this**, the same *LtdSubstV*

### Can we fix **this**?
Sure, we can create a new *LtdSubstV*

### If `c` stands for the current count, how do we create a *LtdSubstV* that shows
### that we have just substituted one fish by another.
Like this `new LtdSubstV(c - 1, n, o)`

### Define the new and improved version of *LtdSubstV*.
```java
class LtdSubstV implements PieVisitorI {
  int c;
  Object n;
  Object o;

  LtdSubstV(int _c, Object _n, Object _o) {
    c = _c;
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (c == 0) {
      return new Top(t, r);
    }

    if (o.equals(t)) {
      return new Top(n, r.accept(new SubstV(c - 1, n, o)));
    }

    else
      return new Top(t, r.accept(this));
  }
}
```

### How does **this** differ from `new LtdSubstV(c - 1,n,o)`?
**this** referers to the current instance of *LtdSubstV* and `new LtdSubstV(c - 1,n,o)` is a new instance of
*LtdSubstV* with the same `n` and `o` but one less `c`

### How do you feel about protocols now?
Less boring

## Chapter 7

### Is
```java
new Flat(
  new Apple(),
  new Flat(
    new Peach(),
    new Bud()))
```
### a flat *TreeD*?
Sure

### Is
```java
new Flat(
  new Pear(),
  new Bud())
```
### a flat *TreeD*?
Yes

### And how about
```java
new Split(
  new Bud(),
  new Flat(
    new Fig(),
    new Split(
      new Bud(),
      new Bud())))
```
Don't think so, it is split so it can't be flat

### Here is one more example
```java
new Split(
  new Split(
    new Bud(),
    new Flat(
      new Lemon(),
      new Bud())),
  new Flat(
    new Fig(),
    new Split(
      new Bud(),
      new Bud())))
```
### Is it flat?
No, it is split

### Is the difference between flat trees and split trees obvious now?
Unless there is anything else to *TreeD*, it's totally clear.

### Good. Then let's move on
Ok.

### Here are some fruits.
```java
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
    return (0 instanceof Lemon);
  }
}

class Fig extends FruitD {
  public boolean equals(Object o) {
    return (o instanceof Fig);
  }
}
```
### Lets say all *TreeD* are either flat, split or bud. Formulate a rigourous description for *TreeD*s
```java
abstract class TreeD {}

class Bud extends TreeD {}

class Split extends TreeD {
  TreeD l;
  TreeD r;

  Split(TreeD _l, TreeD _r) {
    l = _l;
    r = _r;
  }
}

class Flat extends TreeD {
  FruitD f;
  TreeD t;

  Flat(FruitD _f, TreeD _t) {
    f = _f;
    t = _t;
  }
}
```

### Did you notice that we have redefined the method `equals` in the variants of *FruitD*?
That probably means we will need to compare them

### Do *TreeD*'s variants contain `equals`?
No, so we'll probably won't need to compare them

### How does the datatype *TreeD* differ from all the other datatypes we have seen before?
The name of the new datatype occurs twice in its *Split* variant.

### Let's add a visitor interface whose methods produce **booleans**.
```java
interface bTreeVisitorI {
  boolean forBud();
  boolean forFlat(FruitD f, TreeD t);
  boolean forSplit(TreeD l, TreeD r);
}
```
### Here is the new datatype definition
```java
abstract class TreeD {
  abstract boolean accept(bTreeVisitorI ask);
}
```
### Revise the variants
Here we go
```java
// Bud
boolean accept(bTreeVisitorI ask) {
  return ask.forBud();
}

// Split
boolean accept(bTreeVisitorI ask) {
  return ask.forSplit(l, r);
}

// Flat
boolean accept(bTreeVisitorI ask) {
  return ask.forFlat(f, t);
}
```
But isn't *bTreeVisitorI* a pretty unusual name?

### Yes, it is. Hang in there, we need unusual names for unusual interfaces.
### Here *b* reminds us that the visitor's methods produce **boolean**s.
Ah, ok

### How many methods does the definition of *blsFlatV* contain, assuming it implements *bTreeVisitorI*?
Three methods

### Vhat type of values do the methods of *blsFlatV* produce?
Since it implements *bTreeVisitorI* it produces **boolean**s

### What visitor does *blsFlatV* remind us of?
*OnlyOnionsV*

### Here is a skeleton for *blsFlatV*.
```java
class blsFlatV implements bTreeVisitorI {
  public boolean forBud() {
    return //...
  }

  public boolean forFlat(FruitD f, TreeD t) {
    return //...
  }

  public boolean forSplit(TreeD l, TreeD r) {
    return //...
  }
}
```
### Fill in the blanks
```java
class blsFlatV implements bTreeVisitorI {
  public boolean forBud() {
    return true;
  }

  public boolean forFlat(FruitD f, TreeD t) {
    return t.accept(this);
  }

  public boolean forSplit(TreeD l, TreeD r) {
    return false;
  }
}
```

### Define the *blsSplitV* visitor, whose methods check whether a *TreeD* is constructed with *Split* and *Bud* only.
```java
class blsSplitV implements bTreeVisitorI {
  public boolean forBud() {
    return true;
  }

  public boolean forFlat(FruitD f, TreeD t) {
    return false;
  }

  public boolean forSplit(TreeD l, TreeD r) {
    return l.accept(this) && r.accept(this);
  }
}
```

### Give an example of a *TreeD* for which the methods of *blsSplitV* respond with **true**.
Something like
```java
new Split(
  new Bud(),
  new Bud())
```

### How about one with five uses of *Split*?
```java
new Split(
  new Split(
    new Split(
      new Bud(),
      new Bud()),
    new Split(
      new Split(
        new Bud(),
        new Bud()))),
  new Bud())
```

### Does this *TreeD* have any fruit?
Nope

### Define the *bHasFruitV* visitor.
```java
class bHasFruitV implements bTreeVisitorI {
  public boolean forBud() {
    return false;
  }

  public boolean forFlat(FruitD f, TreeD t) {
    return true;
  }

  public boolean forSplit(TreeD l, TreeD r) {
    return l.accept(this) || l.accept(this);
  }
}
```

###  What is the height of
```java
new Split(
  new Split(
    new Bud(),
    new Flat(
      new Lemon(),
      new Bud())),
  new Flat(
    new Fig(),
    new Split(
      new Bud(),
      new Bud())))
```
It's 3

###  What is the height of
```java
new Split(
  new Bud(),
  new Flat(
    new Lemon(),
    new Bud()))
```
It's 2

###  What is the height of
```java
new Flat(
  new Lemon(),
  new Bud())
```
It's 1

###  What is the height of
```java
new Bud()
```
It's 0

### So what is the height of a *TreeD*?
Just as in nature, the height of a tree is the distance from the beginning to the highest bud in the tree.

### Do the methods of *iHeightV* work on a *TreeD*?
Yes and they produce an **int**

### Is that what the *i* in front of *Height* is all about*
You bet

### What is the value of
```java
new Split(
  new Split(
    new Bud(),
    new Bud()),
  new Flat(
    new Fig(),
    new Flat(
      new Lemon(),
      new Flat(
        new Apple(),
        new Bud()))))
.accept(new iHeightV())
```
It's 4

### Why is the height *4*?
Because the value of
```java
new Split(
    new Bud(),
    new Bud())
.accept(new iHeigthV())
```
is 1
and the value of
```java
new Flat(
    new Fig(),
    new Flat(
      new Lemon(),
      new Flat(
        new Apple(),
        new Bud())))
.accept(new iHeightv())
```
is 3, so we chose the largest number which is 3

### And how do we get from 3 to 4?
Because we still need to count the distance to the first *Split*

### `Math.max(x, y)` picks the larger of two numbers, `x` and `y`.
That's nice. What kind of methods does *iHeightV* define?

### *iHeightV*s methods measure the heights of the *TreeD*s to which they correspond
Now, that's a problem

### Why?
We defined only **interface**s that produce **boolean**s in this chapter.

### So what?
The methods of *iHeightV* produce **int**s, which are not **boolean**s

### Okay, so let's define a visitor interface that produces *int*s
```java
interface iTreeVisitorI {
  int forBud();
  int forFlat(FruitD f, TreeD t);
  int forSplit(TreeD l, TreeD r);
}
```

### Yes, and once we have that we can add another `accept` method to *TreeD*.
```java
abstract class TreeD {
  abstract boolean accept(bTreeVisitorI ask);
  abstract int accept(iTreeVisitorI ask);
}
```
Does that mean we can have two methods with the same name in one class?
(This is called "overloading")

### We can have two methods with the same name in the same class as long as the types of the things they consume differ.
*bTreeVisitorI* is indeed different from *iTreeVisitorI* , so we can have two versions of `accept` in *TreeD*.

### Add the new `accept` methods to *TreeD*s variants. Start with the easy one
Easy
```java
class Bud extends TreeD {
  boolean accept(bTreeVisitorI ask) {
    return ask.forBud();
  }

  int accept(iTreeVisitorI ask) {
    return ask.forBud();
  }
}
```

###  The others are easy, too. We duplicate `accept`.
```java
class Flat extends TreeD {
  FruitD f;
  TreeD t;

  Flat(FruitD _f, TreeD _t) {
    f = _f;
    t = _t;
  }

  boolean accept(bTreeVisitorI ask) {
    return ask.forFlat(f, t);
  }

  int accept(iTreeVisitorI ask) {
    return ask.forFlat(f, t);
  }
}
```
Yeah, this is easy
```java
class Split extends TreeD {
  TreeD l;
  TreeD r;

  Split(TreeD _l, TreeD _r) {
    l = _l;
    r = _r;
  }

  boolean accept(bTreeVisitorI ask) {
    return ask.forSplit(l, r);
  }

  int accept(iTreeVisitorI ask) {
    return ask.forSplit(l, r);
  }
}
```

### Here is *iHeightV*
```java
class iHeightV implements iTreeVisitorI {
  public int forBud() {
    return //...
  }

  public int forFlat(FruitD f, TreeD t) {
    return //...
  }

  public int forSplit(TreeD l, TreeD r) {
    return //...
  }
}
```
### Complete these methods
```java
class iHeightV implements iTreeVisitorI {
  public int forBud() {
    return 0;
  }

  public int forFlat(FruitD f, TreeD t) {
    return 1 + t.accept(this);
  }

  public int forSplit(TreeD l, TreeD r) {
    return 1 + Math.max(l.accept(this), r.accept(this));
  }
}
```

### What is the value of
```java
new Split(
  new Bud(),
  new Bud())
.accept(new iHeightv())
```
It's 1

### And why is it 1?
Because `new Bud().accept(new iHeigthV())` is 0 and then we add the 1 from `new Split(...).accept(iHeightV())`

###  vVhat is the value of
```java
new Split(
  new Split(
    new Flat(
      new Fig(),
      new Bud()),
    new Flat(
      new Fig(),
      new Bud())),
  new Flat(
    new Fig(),
    new Flat(
      new Lemon(),
      new Flat(
        new Apple(),
        new Bud()))))
.accept (
  new tSubstV(new Apple(), new Fig()))
```
Since *tSubstV* substitutes figs for apples, it is
```java
new Split(
  new Split(
    new Flat(
      new Apple(),
      new Bud()),
    new Flat(
      new Apple(),
      new Bud())),
  new Flat(
    new Apple(),
    new Flat(
      new Lemon(),
      new Flat(
        new Apple(),
        new Bud()))))
```

### Correct. Define *tSubstV*
It's like *SubstFishV* and *SubstIntV* from the end of chapter 5, but we can't do it just yet.

### What's the problem?
It's methods produce *TreeD*s, which means we need to add another interface
```java
interface tTreeVisitorI {
  TreeD forBud();
  TreeD forFlat(FruitD f, TreeD t);
  TreeD forSplit(TreeD l, TreeD r);
}
```

### Good job. How about the datatype *TreeD*.
We need to add another method to the protocol
```java
abstract class TreeD {
  abstract boolean accept(bTreeVisitorI ask);
  abstract int accept(iTreeVisitorI ask);
  abstract TreeD accept(tTreeVisitorI ask);
}
```

### Define the variants of *TreeD*
```java
class Bud extends TreeD {
  boolean accept(bTreeVisitorI ask) {
    return ask.forBud();
  }

  int accept(iTreeVisitorI ask) {
    return ask.forBud();
  }

  TreeD accept(tTreeVisitorI ask) {
    return ask.forBud();
  }
}

class Split extends TreeD {
  TreeD l;
  TreeD r;

  Split(TreeD _l, TreeD _r) {
    l = _l;
    r = _r;
  }

  boolean accept(bTreeVisitorI ask) {
    return ask.forSplit(l, r);
  }

  int accept(iTreeVisitorI ask) {
    return ask.forSplit(l, r);
  }

  TreeD accept(tTreeVisitorI ask) {
    return ask.forSplit(l, r);
  }
}

class Flat extends TreeD {
  FruitD f;
  TreeD t;

  Flat(FruitD _f, TreeD _t) {
    f = _f;
    t = _t;
  }

  boolean accept(bTreeVisitorI ask) {
    return ask.forFlat(f, t);
  }

  int accept(iTreeVisitorI ask) {
    return ask.forFlat(f, t);
  }

  TreeD accept(tTreeVisitorI ask) {
    return ask.forFlat(f, t);
  }
}
```

### Then define *tSubstV*
```java
class tSubstV implements tTreeVisitorI {
  FruitD n;
  FruitD o;

  tSubstV(FruitD _n, FruitD _o) {
    n = _n;
    o = _o;
  }

  public TreeD forBud() {
    return new Bud();
  }

  public TreeD forFlat(FruitD f, TreeD t) {
    if (o.equals(f)) {
      return new Flat(n, t.accept(this));
    }

    else
      return new Flat(f, t.accept(this));
  }

  public TreeD forSplit(TreeD l, TreeD r) {
    return new Split(t.accept(this), r.accept(this));
  }
}
```

### Here is a *TreeD* that has three Figs:
```java
new Split(
  new Split(
    new Flat(
      new Fig(),
      new Bud()),
    new Flat(
      new Fig(),
      new Bud())),
  new Flat(
    new Fig(),
    new Flat(
      new Lemon(),
      new Flat(
        new Apple(),
        new Bud()))))
```
### Now define *iOccursV*, whose methods count how often some *FruitD* occur in a tree
```java
class iOccursV implements iTreeVisitorI {
  FruitD a;

  iOccursV(FruitD _a) {
    a = _a;
  }

  public int forBud() {
    return 0;
  }

  public int forFlat(FruitD f, TreeD t) {
    if (f.equals(a)) {
      return 1 + t.accept(this);
    }

    else
      return t.accept(this);
  }

  public int forSplit(TreeD l, TreeD r) {
    return t.accept(this) + r.accept(this);
  }
}
```

### Do you like fruits with yogurt?
Yes, that is nice

### Is it disturbing that we have three nearly identical versions of `accept` in *TreeD*s and its variants?
Copying definitions is always bad.
If we make a mistake and copy a definition. we copy mistakes.
If we modify one, it's likely that we might forget to modify the other.

### Can we avoid it?
If **boolean** and **int** were classes, we could use *Object* for **boolean**, **int** and *TreeD*.
Unfortunately they are not

### Remember *Integer* and *Boolean*? They make it possible
Yes, *Boolean* is the class that corresponds to **boolean**, and *Integer* corresponds to **int**

### Here is the **interface** for a protocol that produces *Object* in place of **boolean**, **int** and **TreeD**
```java
interface TreeVisitorI {
  Object forBud();
  Object forFlat(FruitD f, TreeD t);
  Object forSplit(TreeD t, TreeD r),
}
```
### Here is the datatype and the *Bud* variant
```java
abstract class TreeD {
  abstract Object accept(TreeVisitorI ask);
}

class Bud extends TreeD {
  Object accept(TreeVisitorI ask) {
    return ask.forBud();
  }
}
```
### Define the remaining variants of *TreeD*
```java
class Split extends TreeD {
  TreeD l;
  TreeD r;

  Split(TreeD _l, TreeD _r) {
    l = _l;
    r = _r;
  }

  Object accept(TreeVisitorI ask) {
    return ask.forSplit(t, r);
  }
}

class Flat extends TreeD {
  FruitD f;
  TreeD t;

  Flat(FruitD _f, TreeD _t) {
    f = _f;
    t = _t;
  }

  Object accept(TreeVisitorI ask) {
    return ask.forFlat(f, t);
  }
}
```

### Good. Now define *IsFlatV*, an *Object* producing version of *blsFlatV*
```java
class IsFlatV implements TreeVisitorI {
  public Object forBud() {
    return Boolean.TRUE;
  }

  public  forFlat(FruitD f, TreeD t) {
    return t.accept(this);
  }

  public Object forSplit(TreeD t, TreeD r) {
    return Boolean.FALSE;
  }
}
```

### And how about *IsSplitV*?
Now that's different.
Here we need a way to determine the underlying **boolean** of the *Boolean*
that is produced by `l.accept(this)` in the original definition.

### Okay. Here it is
```java
class IsSplitV implements TreeVisitorI {
  public Object forBud() {
    return Boolean.TRUE;
  }

  public Object forFlat(FruitD f, TreeD t) {
    return Boolean.FALSE;
  }

  public Object forSplit(TreeD t, TreeD r) {
    return ((Boolean) t.accept(this)).booleanValue() && ((Boolean) r.accept(this)).booleanValue();
  }
}
```
Oh, because `l.accept(this)` produces an *Object*, we must first convert it to a *Boolean*.
Then we can determine the underlying **boolean** with the `booleanValue` method.
We have seen this in chapter 5 when we converted an *Object* to a *OneMoreThan*.

### Will the conversion always work?
In this case yes, because the *IsSplitV* visitor methods always return *Boolean*

### Did you think that was bad? Then study this definition during your next break.
```java
class OccursV implements TreeVisitorI {
  FruitD a;

  OccursV(FruitD _a) {
    a = _a;
  }

  public Object forBud() {
    return Integer.valueOf(0);
  }

  public Object forFlat(FruitD f, TreeD t) {
    if (f.equals(a)) {
      return Integer.valueOf(
        ((Integer)t.accept(this)).intValue()
        + 1);
    }

    else
      return t.accept(this);
  }

  public Object forSplit(TreeD l, TreeD r) {
    return Integer.valueOf(
      ((Integer) l.accept(this)).intValue()
      + ((Integer) r.accept(this)).intValue()
    );
  }
}
```
Oh baby!

## Chapter 8

### What is the value of (7 + ((4 - 3) * 5))?
12

### What is the value of (+ 7 (* (- 4 3) 5))?
Also 12

### What is the value of
```java
  new Plus(
    new Const(new Integer(7)),
    new Prod(
      new Diff(
        new Const(new Integer(4)),
        new Const(new Integer(3))),
      new Const(new Integer(5))))
```
`new Integer(12)`, we have just rewritten the previous expression using *Integer* and constructors

### Where do the constructors come from?
A datatype and its variants that represent arithmetic expressions

### Did you like that?
So far so good

### Vhat is the value of ({7,5} U (({4} \ {3}) ⋂ {5}))?
{7, 5}

### What is the value of (U {7,5} (⋂ (\ {4} {3}) {5}))?
Also {7, 5}

### What is the value of (+ {7,5} (x (- {4} {3}) {5}))?
{7, 5}, we just renamed the operators

### What is the value of
```java
new Plus(
  new Const(
    new Empty()
      .add(new Integer(7))
      .add(new Integer(5))),
  new Prod(
    new Diff(
      new Const(
        new Empty().add(new Integer(4))),
      new Const(
        new Empty().add(new Integer(3)))),
    new Const(
      new Empty().add(new Integer(5)))))
```
```java
new Empty()
  .add(new Integer(7))
  .add(new Integer(5))
```
because we have just rewritten the previous expression using the constructors.

### Where do the constructors come from?
A datatype and its variants that represent set expressions

### Do you still like it?
Not so much

### Does the arithmetic expression look like the set expression?
Yep, except for the constants

### Let's say that an expression is either a `Plus(exprl,expr2)`, a `Diff(exprl,expr2)`,
### a `Prod(exprl,expr2)`, or a constant, where `expr1` and `expr2` stand for arbitrary expressions.
### What should be the visitor interface?
It should consume expressions or constants and produce expressions or constants.
```java
interface ExprVisitorI {
  Object forPlus(ExprD l, ExprD r);
  Object forDiff(ExprD l, ExprD r);
  Object forProd(ExprD l, ExprD r);
  Object forConst(Object c);
}
```

###  Good answer. Here is the datatype now.
```java
abstract class ExprD {
  abstract Object accept(ExprVisitorI ask);
}
```
### Define the variants of the datatype and equip them with an accept method that produces *Object*s
```java
class Plus extends ExprD {
  ExprD l;
  ExprD r;

  Plus(ExprD _l, ExprD _r) {
    l = _l;
    r = _r;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forPlus(l, r);
  }
}

class Diff extends ExprD {
  ExprD l;
  ExprD r;

  Diff(ExprD _l, ExprD _r) {
    l = _l;
    r = _r;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forDiff(l, r);
  }
}

class Prod extends ExprD {
  ExprD l;
  ExprD r;

  Prod(ExprD _l, ExprD _r) {
    l = _l;
    r = _r;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forProd(l, r);
  }
}

class Const extends ExprD {
  Object c;

  Const(Object _c) {
    c = _c;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forConst(c);
  }
}
```

### Can we now define a visitor whose methods determine the value of an arithmetic expression?
Yes, we can. It must have four methods, one per variant.

### How de we add `new Integer(3)` and `new Integer(2)`
We have done this before. We use the method `intValeu` to determine the **int**s
that correspond to the *Integer*s and then add them together

### But what is the result of `new Integer(3).intValue() + new Integer(2).intValue()`?
It's the **int** 5

### How do we turn that into an *Integer*?
We use the *Integer* constructor

### Okay, so here is a skeleton of *IntEvalV*.
```java
class IntEvalV implements ExprVisitorI {
  public Object forPlus(ExprD l, ExprD r) {
    return plus(l.accept(this), r.accept(this));
  }

  public Object forDiff(ExprD l, ExprD r) {
    return diff(l.accept(this), r.accept(this));
  }

  public Object forProd(ExprD l, ExprD r) {
    return prod(l.accept(this), r.accept(this));
  }

  public Object forConst(Object c) {
    return c;
  }

  Object plus(/*...*/ l, /*...*/ r) {
    return //...
  }

  Object diff(/*...*/ l, /*...*/ r) {
    return //...
  }

  Object prod(/*...*/ l, /*...*/ r) {
    return //...
  }
}
```
That's an interesting skeleton.
It contains five different kinds of blanks and two of them occur three times each.
But we can see the bones only. Where is the beef?

### How does forPlus work?
It consumes two *ExprD*, determines their value by calling `accept` on them and uses `plus` to produce an *Object*

### How are the values represented?
They are instances of *Object*

### So what kind of values must `plus` consume?
*Object*s, since that's what `l.accept(this)` and `r.accept(this)` produce

### What must we put in the first and second blanks?
*Object*

### Can we add *Object*s?
No, we can only add **int**s so we must convert them to *Integer* first

### Can we convert all *Object*s to *Integer*s?
No, but all *Object*s that *IntEvalV* produces will be constructed with `new Integer(...)` so it is safe in this case.

### Is that true? What is the value of
```java
new Plus(
  new Const(new Empty()),
  new Const(new Integer(5)))
.accept(new IntEvalV())
```
Wow. At some level, this is nonsense

### Correct, so sometimes the conversion may fail
### because we use an instance of *IntEvalV* on nonsensical arithmetic expressions.
What should we do?

### We agree to avoid such arithmetic expressions
#### (In other words. we have unsafe evaluators for our expressions. One way to make them safe is to add a method that checks whether constants are instances of the proper class and that raises an exception. An alternative is to define a visitor that type checks the arithmetic expressions we wish to evaluate)
And their set expressions, too

### If we want to add `l` and `r´, we write
```java
new Integer(
  ((Integer) l).intValue()
  +
  ((Integer)l).intValue())
```
### Complete the definition now
```java
class IntEvalV implements ExprVisitorI {
  public Object forPlus(ExprD l, ExprD r) {
    return plus(l.accept(this), r.accept(this));
  }

  public Object forDiff(ExprD l, ExprD r) {
    return diff(l.accept(this), r.accept(this));
  }

  public Object forProd(ExprD l, ExprD r) {
    return prod(l.accept(this), r.accept(this));
  }

  public Object forConst(Object c) {
    return c;
  }

  Object plus(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n + m);
  }

  Object diff(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n - m);
  }

  Object prod(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n * m);
  }
}
```

### That one was pretty easy, wasn't it?
Yeah. Let's implement ExprVisitorI for sets

### What do we need to implement one for sets?
We need methods for `plus`ing, `diff`ing and `prod`ing sets

### That's correct, and here is everything
```java
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
```
Wow

### Explain the method `add` in your own words.
`add` consumes an *Integer* and uses `mem` to see if the *Integer* `i` is already in the *SetD*.
If it is it returns the current *SetD*, otherwise it returns a new *SetD*

### Why is this so tricky?
Constructors always construct, and `add` does not always construct.

### Do we need to understand that?
Not now, but feel free to absorb it when you have the time.

### Define the various *Empty* and *Add* for *SetD*
```java
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
```

### Do we need to understand these definitions?
I would say so.
We haven't even used visitors to define operations for union, set-difference, and intersection,
but we trust you can.

### What do we have to change in *IntEvalV* to obtain *SetEvalV* , an evaluator for set expressions?
We would need to change what the methods, `plus`, `diff` and `prod`

### How should we do that?
We could just copy the definition of *IntEvalV* and replace its `plus`, `diff`, and `prod` methods.

### That's the worst way of doing that
What?

### Why should we throw away more than half of what we have?
That's true. If we copied the definition and changed it, we would have identical copies of `forPlus`, `forDiff`,
`forProd`, and `forConst`. We should reuse this definition.

### Yes, and we are about to show you better ways. How do we have to change `plus`, `diff`, and `prod`?
Now we are not working with *Integer* we need to adapt those methods to work with *SetD* like
```java
Object plus (Object l, Object r) {
  return ((SetD) l).plus((SetD) r));
}
```
etc...

### Very good, and if we define *SetEvalV* as an extension of *IntEvalV*, tahtss all we have to put inside of *SetEvalV*
```java
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
```
Now that's much easier than copying and modifying

### Is it like `equals`?
Yes it is like `equals` in the sense we are overriding the methods defined in *IntEvalV*

### How many methods from *IntEvalV are overridden in *SetEvalV*?
3, `plus`, `diff` and `prod`

### How many methods from IntEvalv are not overridde~in SetEvalv?
4, `forPlus`, `forDiff`,`forProd` and `forConst`

### Does *SetEvalV* implements *ExprVisitorV*?
Yes, since it **extends** from *InvEvalV* that implements *ExprVisitorV* so, *SetEvalV* implements *ExprVisitorV*
implicitely

### That's correct. What is the value of
```java
new Prod(
  new Const(
    new Empty().add(new Integer(7))),
  new Const(
    new Empty().add(new Integer(3))))
.accept(new SetEvalV())
```
Intersting. How does this work now?

### What type of value is
```java
new Prod(
  new Const(
    new Empty().add(new Integer(7))),
  new Const(
    new Empty().add(new Integer(3))))
```
It's a *Prod*, which is a *ExprD*

### And what does `accept` consume?
An *ExprVisitorI*, in this case a *SetEvalV*

### What is
```java
new SetEvalv().forProd(
  new Prod(
    new Const(
      new Empty().add(new Integer(7))),
    new Const(
      new Empty().add(new Integer(3)))))
```
It's value of `accept`

### Where is the definition of *SetEvalV* method `forProd`?
In *IntEvalV*

### Suppose we had the values of
```java
new Const(
  new Empty().add(new Integer(7)))
.accept(this)
```
### and
```java
new Const(
  new Empty().add(new Integer(3)))
.accept(this)
```
### What would we have to evaluate next?
If their values were `A` and `B`, we would have to determine the value of `prod(A,B)`

### Isn't that strange?
Why?

### So far, we have always used a method on a particular object
That's true. What is the object with which we use `prod(A,B)`?

### It is **this** object
So, that means we should evaluate `new SetEvalV().prod(A, B)`

### Absolutely. If the use of a method omits the object, we take the one that we were working with before
That clarifies things

### Good. And now what?
We still nedd to determine tha values of
```java
new Const(
  new Empty().add(new Integer(7)))
.accept(this)
```
and
```java
new Const(
  new Empty().add(new Integer(3)))
.accept(this)
```

### The values are obviously
```java
new Empty().add(new Integer(7))
```
### and
```java
new Empty().add(new Integer(3))
```
### Where is the definition of `forConst` that determines these values?
In *IntEvalV*

### Here is the next expression in our sequence:
```java
new SetEvalV().prod(
  new Empty().add(new Integer(7)),
  new Empty().add(new Integer(3)))
```
### Where does `prod` come from?
It comes from *SetEvalV*

### What next?
Next we need to determine the value of
```java
new Empty()
  .add(new Integer(7))
  .prod(
    new Empty()
    .add(new Integer(3)))
```

### Is `new Empty().add(new Integer(7))` an instance of *SetD*?
Yes it is, since `add` always return a *SetD*

### And how about `new Empty().add(new Integer(3))`?
It's also a *SetD*

### And that is why the method must contain a conversion from *Object* to *SetD*s
Because although `prod` receives *Object*s, we know they are actually *SetD*s

### Time for the last question. Where does this `prod` come from now?
Now it comes from *SetD*

### And what does `prod` do?
It determines the intersection between two *SetD*s

### Is it natural that *SetEvalV* extends *IntEvalV*?
No, not at all

### Why did we do that?
So we could reuse the work done in *IntEvalV*, more specifically the `for...` methods since those would always be needed

### But just because something works, it doesn't mean it's rational.
Yes, let's do better. We have defined all these classes ourselves, so we are free to rearrange them any way we want.

### What distinguishes *IntEvalV* from *SetEvalV*?
Its `plus`, `diff` and `prod` methods

### What are the pieces that they have in common?
The `for...` methods

### Good. Here is how we express that.
```java
abstract class EvalD implements ExprVisitorI {
  public Object forPlus(ExprD l, ExprD r) {
    return plus(l.accept(this), r.accept(this));
  }

  public Object forDiff(ExprD l, ExprD r) {
    return diff(l.accept(this), r.accept(this));
  }

  public Object forProd(ExprD l, ExprD r) {
    return prod(l.accept(this), r.accept(this));
  }

  public Object forConst(Object c) {
    return c;
  }

  abstract Object plus(Object l, Object r);
  abstract Object diff(Object l, Object r);
  abstract Object prod(Object l, Object r);
}
```
And here are it's variants
```java
class IntEvalV extends EvalD {
  Object plus(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n + m);
  }

  Object diff(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n - m);
  }

  Object prod(Object l, Object r) {
    int n = ((Integer) l).intValue();
    int m = ((Integer) r).intValue();

    return Integer.valueOf(n * m);
  }
}

class SetEval extends EvalD {
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
```
Isn't this abstrac class like *PointD*?

### Yes, we can think of it as a datatype for *EvalD* visitors that collects all the common elements as concrete methods
### The pieces that differ from one variant to another are specified as abstract methods.
Ah, makes sense

### Is it natural for two evaluators to be on the same footing?
Yes it make perfect sense

### Rembemr *SubstV* from chapter 6?
```java
class SubstV implements PieVisitorI {
  Object n;
  Object o;

  SubstV(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (o.equals(t)) {
      return new Top(n, r.accept(this));
    }

    else
      return new Top(t, r.accept(this));
  }
}
```
Yes, and *LtdSubstV* too
```java
class LtdSubstV implements PieVisitorI {
  int c;
  Object n;
  Object o;

  LtdSubstV(int _c, Object _n, Object _o) {
    c = _c;
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (c == 0) {
      return new Top(t, r);
    }

    if (o.equals(t)) {
      return new Top(n, r.accept(new SubstV(c - 1, n, o)));
    }

    else
      return new Top(t, r.accept(this));
  }
}
```

### What do the two visitors have in common?
Many things, `n`, `o` and `forBot`

### Where do they differ?
In the implementation of `forTop` and *LtdSubstV* has an extra field, `c`

### And where do we put the pieces that two classes have in common?
In a **abstract** datatype class

### What else does the abstract class contain?
It contains all that is common between the two visitors and specifies the parts that are different between them

### Define the **abstract class** *SubstD*, which contains all the common pieces and specifies what
### a concrete pie substituter must contain
```java
abstract class SubstD implements PieVisitorI {
  Object n;
  Object o;

  public PieD forBot() {
    return new Bot();
  }

  abstract PieD forTop(Object t, PieD r);
}
```

### We can define *SubstV* by extending *SubstD*
```java
class SubstV extends SubstD {
  SubstV(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  PieD forTop(Object t, PieD r) {
    if (t.equals(o)) {
      return new Top(n, r.accept(this));
    }

    return new Top(t, r.accept(this));
  }
}
```
### Define *LtdSubstV*
```java
class LtdSubstV extends SubstD {
  int c;

  LtdSubstV(int _c, Object _n, Object _o) {
    c = _c;
    n = _n;
    o = _o;
  }

  PieD forTop(Object t, PieD r) {
    if (c == 0) {
      return new Top(t, r);
    }

    if (t.equals(o)) {
      return new Top(n, r.accept(new LtdSubstV(c - 1, _n, _o)));
    }

    return new Top(t, r.accept(this));
  }
}
```

### Do the two remaining classes still have things in common?
No, but the constructors are similar.
Shouldn't we life the *SubstV* constructor into *SubstD*, because it holds the common `n` and `o` fields?

### Great idea. Here is the new version of *SubstV*
```java
abstract class SubstD implements PieVisitorI {
  Object n;
  Object o;

  SubstD(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  abstract PieD forTop(Object t, PieD r);
}
```
### Revise *SubstV* and *LtdSubstV*
Here it is
```java
class SubstV extends SubstD {
  SubstV(Object _n, Object _o) {
    super(_n, _o);
  }

  PieD forTop(Object t, PieD r) {
    if (t.equals(o)) {
      return new Top(n, r.accept(this));
    }

    return new Top(t, r.accept(this));
  }
}

class LtdSubstV extends SubstD {
  int c;

  LtdSubstV(int _c, Object _n, Object _o) {
    super(_n, _o);
    c = _c;
  }

  PieD forTop(Object t, PieD r) {
    if (c == 0) {
      return new Top(t, r);
    }

    if (t.equals(o)) {
      return new Top(n, r.accept(new LtdSubstV(c - 1, _n, _o)));
    }

    return new Top(t, r.accept(this));
  }
}
```

### Was that first part easy?
Yeah

### That's neat. How about some art work?
```
     ---------------                                      ----------------
     |     PieD    | ----------------accept---------------|  PieVisitorI |
     ---------------                                      ----------------
        ^        ^                                                |
       /         |                                                |
      /          |                                                |
  ---------    -------                                     ---------------
   | Bot  |    | Top |                                     |   SubstD    |
  ---------    -------                                     ---------------
                                                               ^       ^
                                                              /         \
                                                             /           \
                                                       ----------    -------------
                                                       | SubstV |    | LtdSubstV |
                                                       ----------    -------------
```
Is this called a pie chart?

### No, but the picture captures the important relationships.
Fine

### Is it also possible to define *LtdSubstV* as an extension of *SubstV*?
Yes, it may be even better. In some sense *LtdSubstV* just adds a service to *SubstV*: It counts as it substitutes

### If *LtdSubstV* is defined as an extension of *SubstV*, what has to be added and what has to be changed?
As we just said, `c` is an addition and `forTop` is different.

### Here is the good old definition of *SubstV* from chapter 6 one more time.
```java
class SubstV implements PieVisitorI {
  Object n;
  Object o;

  SubstV(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  public PieD forBot() {
    return new Bot();
  }

  public PieD forTop(Object t, PieD r) {
    if (o.equals(t)) {
      return new Top(n, r.accept(this));
    }

    else
      return new Top(t, r.accept(this));
  }
}
```
### Define *LtdSubstV* as an extension of *SubstV*
```java
class LtdSubstV extends SubstV {
  int c;

  LtdSubstV(int _c, Object _n, Object _o) {
    super(_n, _o);
    c = _c;
  }

  PieD forTop(Object t, PieD r) {
    if (c == 0) {
      return new Top(t, r);
    }

    if (t.equals(o)) {
      return new Top(n, r.accept(new LtdSubstV(c - 1, _n, _o)));
    }

    return new Top(t, r.accept(this));
  }
}
```

### Let's draw a picture.
```
     ---------------                                      ----------------
     |     PieD    | ----------------accept---------------|  PieVisitorI |
     ---------------                                      ----------------
        ^        ^                                               ^
       /         |                                               |
      /          |                                               |
  ---------    -------                                      ------------
   | Bot  |    | Top |                                      |  SubstV  |
  ---------    -------                                      ------------
                                                                  ^
                                                                  |
                                                                  |
                                                            -------------
                                                            | LtdSubstV |
                                                            -------------
```

## Chapter 9

### Remember *PointD*? If not, here it is the datatype with one additional method, `minus`
### We will talk about `minus` when we need it, but for now, just recall *PointD*'s variants
```java
class CartesianPt extends PointD {
  CartesianPt(int _x, int _y) {
   super(_x, _y);
  }

  int distanceToO() {
    return (int)(Math.sqrt(x * x + y * y));
  }
}

class ManhattanPt extends PointD {
  ManhattanPt(int _x, int _y) {
    super(_x, _y);
  }

  int distanceToO() {
    return x + y;
  }
}
```

### Good. Take a look at this extension of *ManhattanPt*
```java
class ShadowedManhattanPt extends ManhattanPt {
  int deltaX;
  int deltaY;

  ShadowedManhattanPt(int _x, int _y, int _deltaX, int _deltaY) {
    super(_x, _y);
    deltaX = _deltaX;
    deltaY = _deltaY;
  }

  int distanceToO() {
    return super.distanceToO() + deltaY + deltaY;
  }
}
```
### What is unusual about the constructor?
It uses the fields `deltaX` and `deltaY` in addition to `super(...)`

### And what does that mean?
It means it uses the *ManhattanPt* constructor to set `x` and `y` fields
but is own constructor to set `deltaX` and `deltaY`

### Okay. So what is a *ShadowedManhattanPt*?
It is a *ManhattanPt* with two additional fields: `deltaX` and `deltaY`.
These two represent the information that determines how far the shadow is from the point described by `x` and `y`.

### Is this a *ShadowedManhattanPt*: `new ShadowedManhattanPt(2,3,1,O)`?
Yes

### What is unusual about `distanceToO`?
It adds the result of `super.distanceToO` with the sum of `deltaX` and `deltaY`

### Here, `super.distanceToO` refers to the method definition of `distanceToO`
### that is relevant in the class that *ShadowedManhattanPt* extends.
Ah, so it refers to the `distanceToO` in *ManhattanPt*

### Correct. But what would we have done if *ManhattanPt* had not defined `distanceToO`?
Then we would refer to the definition in the class that *ManhattanPt* extends, right?

### Yes, and so on. What is the value of `new ShadowedManhattanPt(2, 3, 1, 0).distanceToO()`
It's 2 + 3 + 1 + 0, which is 6

