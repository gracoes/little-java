1. When specifying a collection of data, use abstract classes for datatypes and extended classes for variants.

2. When writing a function over a datatype, place a method in each of the variants that make up the datatype.
If a field of a variant belongs to the same datatype, the method may call the corresponding method of the field in computing the function.

3. When writing a function that returns values of a datatype, use **new** to create these values.
