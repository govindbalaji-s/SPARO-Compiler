##testing inheritance

##--Doubt in constructor call during inheritance

class Base {

    void print() {
        "In the Base class!\n".put();
    }
};

class Derived extends Base {
  
    void print() {
        "In the Derived class!\n".put();;
    }
};
class Main {
    
    Int main{

        Derived obj1;
        Base obj2;
        Derived.print();    ##Uses the print function defined in Derived class, as it overrides the one defined in Base class.
        Base.print();       ##print function of base Class is called, right? 
    }
}
