## Testing user defined class name redeclaration errors

class Base {
    Int x;
    ## Note that use of 'after' is necessary, as even Base class inherits from 'Object' class.
    construct(Int a) after() {
      x = a;
    }
    void print() {
        "In the Base class!\n".put();
    }
};

class Derived extends Base {

    Int y;
  
    construct(Int a, Int b) after(a) {
      y = b;
    }
  
    void print() {
        "In the Derived class!\n".put();;
    }
};

class Object { ## Hackerman
};

class Main {
    
    Int main(){

        Derived obj1 = new_unique Derived(2, 3);
        Base obj2 = new_unique Derived(4, 5);
        obj2.print();    ##Uses the print function defined in Derived class, as it overrides the one defined in Base class.
        obj1.print();    ##print function of Derived Class is called
        
        
        return 0;
    }
};

class Main {
};
