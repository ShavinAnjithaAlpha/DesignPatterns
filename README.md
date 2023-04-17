# DesignPatterns

Design Patterns with Java

###### There are several types of design patterns. In the following text we will look at each design patterns and their characteristics.

## Singleton Pattern

### Definition

Class has only one instance, and provide global access to it.

Once you created instance of this clas, next time onward you use the existing object. This approach helps us to avoid creating unnecessary objects of a class in a centralized system and that will help
us to easily maintain and extend the system.

Ex: one file system for centralized resource management system
    caching systems

### Illustration
    
In java, we implement the singleton pattern with following properties in the class
* declare the constructor as private to avoid use the new operator
* always check for the existing of the class instance to make sure that you only has one instance of the class by static variable
* provide thread-safety by using synchronized keyword - multiple threads cannot involve in instantiation process at the same time.
* make the class as final, so cannot inherit the class to misuse the concept of singleton