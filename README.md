# Design Patterns

Design Patterns with Java

###### There are several types of design patterns. In the following text we will look at each design patterns and their characteristics.

## 1. Singleton Pattern

### Definition

*Class has only one instance, and provide global access to it.*

Once you created instance of this clas, next time onward you use the existing object. This approach helps us to avoid creating unnecessary objects of a class in a centralized system and that will help
us to easily maintain and extend the system.

Ex: one file system for centralized resource management system
    caching systems
    logging systems to maintain common log files
    thread pools in multithreaded environment

### Illustration
    
In java, we can implement the singleton pattern in various ways.


#### The first way is called **lazy-initialization**. In this technique we delay the object creation process.
You should create an object only when it is required. We use following properties to implement in this way.

* declare the constructor as private to avoid use the new operator
* always check for the existing of the class instance to make sure that you only has one instance of the class by static variable
* provide thread-safety by using synchronized keyword - multiple threads cannot involve in instantiation process at the same time.
* make the class as final, so cannot inherit the class to misuse the concept of singleton

**in this technique we have additional performance overhead of using the synchronized keyword.**


#### The second approach is called **eager-initialization**. we use following modifications to fulfill this.

* declare final static instance of the class - at the start of the program, automatically the instance of the class will be created.

pros - thread-safe
    not used the synchronized keyword, so we didn't have additional overhead
    very straightforward
cons - the program takes longer to start because program have to load everything at first to create instance



#### The third approach is called *Big-Pugh's Solution*. We use following modification to the implementation.

* use the static nested helper class to store static final instance of the class
* inside the get method, we return the class instance of nested helper class

**In this technique, because we referenced to the helper class inside only the get method, the instance of the
class will create after we invoke the get method**


#### The last approach is called *Double-Checked Locking*. We use following modification to this approach.

*Use the ***synchronized*** keyword in ***if*** statement rather than for method head - this will make us
avoid overhead of ***synchronized*** keyword by use it only when the creation of the object.

## 2. Prototype Pattern

### Definition

*Specify the kinds of object to be created using prototypical instance, and create new objects by copying this 
prototypes*

In general, creating a new objects from scratch is a costly and time waste operations.
By using prototypes we can minimize the these cost through copying or cloning existing objects.

### Illustration

Here we implement the prototype pattern by using soldiers.

* Implement the Soldier basic prototype as abstract class
* Create Sniper and Ghost concrete prototype classes that have implemented the *clone()* method defined in the basic prototype
* Change their attributes based on their type


## 3. Builder Pattern

### Definition

Separate the construction of a complex object from its representation. In this way we can use the 
same construction process for different representations.

This pattern useful for creating complex objects that have multiple parts. creation process should be 
independent of these parts. The construction process does not care about how these parts are assembled.
By using this pattern, you can hide the internal complex construction process by promoting the encapsulation.

### Illustration

Here we use following steps to implement the Builder Pattern

* Create *Director* class for construction process-this class take care of the construction of different representation of objects, and this class does not care about how parts are assembled.
* Create *Builder* interface to specify the construction steps for object
* Create *Base Concrete* class for represent the complex object-that is the objet which we needed to build.
* Create *Representation* class which implement the *Builder* interface, to specify how each representation would be constructed.

