public class Interfaces {

   /**
    * An interface is a reference type in Java. It is similar to class.
    * It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

    Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types.
    Method bodies exist only for default methods and static methods.

    Writing an interface is similar to writing a class. But a class describes the attributes and behaviors of an object.
    And an interface contains behaviors that a class implements.

    Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.

    An interface is similar to a class in the following ways −

    An interface can contain any number of methods.

    An interface is written in a file with a .java extension, with the name of the interface matching the name of the file.

    The byte code of an interface appears in a .class file.

    Interfaces appear in packages, and their corresponding bytecode file must be in a directory structure that matches the package name.

    However, an interface is different from a class in several ways, including −

    You cannot instantiate an interface.

    An interface does not contain any constructors.

    All of the methods in an interface are abstract.

    An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.

    An interface is not extended by a class; it is implemented by a class.

    An interface can extend multiple interfaces.

    When a class implements an interface, you can think of the class as signing a contract,
    agreeing to perform the specific behaviors of the interface.
    If a class does not perform all the behaviors of the interface, the class must declare itself as abstract.

    A class uses the implements keyword to implement an interface.
    The implements keyword appears in the class declaration following the extends portion of the declaration.

    you can implement as many interfaces as you want in a class.
    */
}
