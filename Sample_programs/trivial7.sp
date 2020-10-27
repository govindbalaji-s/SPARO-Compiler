#*testing Overloading *#


class Base {
    Int x; ## Member name starts with lower case letter 
    Int y;
    construct(Int a) after() {
      x = a;
    }
    construct(Int a, Int b) after() {
      x = a;
      y =b;
    }
    Int sum(Int x, Int y) { ## method name starts with lower case letter
      Int result = x +y;
      return result;
    }
    
    Int sum(Int x,Int y, Int z) {
      Int result = x +y +z;
      return result;
    }
    
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
