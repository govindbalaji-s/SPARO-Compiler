#*testing Overloading *#


class Base {
    Int x; ## Member name starts with lower case letter 
    construct(Int a) after() {
      x = a;
    }
    Int sum(Int x, Int y) { ## method name starts with lower case letter
      Int result = x +y;
      return result;
    }
    
    Int sum(Int x,Int y, Int z) {
      Int result = x +y +z;
      return result;
    }
    
    #*This also can be called as overloading as compiler is able to distinguish which sum to call. Can we think on this ?*#
    Float sum(Float x, Float y) {
      Float result = x + y;
      return result;
    }
    ##Float x; This would be wrong
};


class Main {
    
    Int main(){

   
       return 0;
    }
};
