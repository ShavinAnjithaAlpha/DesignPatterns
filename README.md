# Design Patterns

Design Patterns with Java

###### There are several types of design patterns. In the following text we will look at each design patterns and their characteristics.

## Singleton Pattern

### Definition

Class has only one instance, and provide global access to it.

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