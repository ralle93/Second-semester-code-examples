public class Singleton {


   /**
    *
    * bliver brugt når man kun skal have 1 instans af en klasse.
    *
    *    Ensure that only one instance of a class is created
          Provide a global point of access to the object
         Allow multiple instances in the future without affecting a singleton class's clients
    *
    *    fx:
    *    en klasse med lister
    *    forbindelse til database
    *
    *    Når man opretter et object af singleton klassen initialiseres objektet hvis den er null
    *    hvis den er sker der ikke noget.
    *
    *    public class ClassicSingleton {
            private static ClassicSingleton instance = null;
            protected ClassicSingleton() {
            // Exists only to defeat instantiation.
            }
            public static ClassicSingleton getInstance() {
               if(instance == null) {
                  instance = new ClassicSingleton();
               }
            return instance;
             }
            }
    *
    *
    *
    *
    */
}
