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
| Skwer |    | Onion |    | Lamb |    | Tomato |
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
