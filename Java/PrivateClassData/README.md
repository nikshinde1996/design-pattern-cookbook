### Private Class Data Design Pattern - STRUCTURAL DESIGN PATTERN
* Control write access to class attributes
* Separate data from methods that use it
* Encapsulate class data initialization
* Providing new type of final - final after constructor
* The private class data design pattern seeks to reduce exposure of attributes by limiting their visibility.
    * It reduces the number of class attributes by encapsulating them in single Data object. It allows the class designer to remove write privilege of attributes that are intended to be set only during construction, even from methods of the target class.