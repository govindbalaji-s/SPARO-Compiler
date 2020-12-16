## testing method redeclaration

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

class Derived {

    Int y;
  
    construct(Int a, Int b) after(a) {
      y = b;
    }
  
    void print() {
        "In the Derived class!\n".put();;
    }
};

class X extends Derived {
};

class Y extends X {
};

class Main {
    
    Int main(){

        Derived obj1 = new_unique Derived(2, 3);
        Base obj2 = new_unique Derived(4, 5);
        obj2.print();    ##Uses the print function defined in Derived class, as it overrides the one defined in Base class.
        obj1.print();    ##print function of Derived Class is called
        
        
        return 0;
    }
    ## redeclare main()
    Int main() {
        return 0;
    }
};
