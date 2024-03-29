##testing the tensor class and it's member methods

##still need to formalize some methods of this class.

class Main {
    
    Tensor<5, 5, 3> test;                   ##test will be a tensor of null pointers (unique type).

    Int main(){

        test.initialize(0.0);               ##test tensor filled with zeros.
        Tensor<5, 5> a;
        a = new_shared Tensor<5, 5>();
        a.initialize(1.0);
        ## a = a*10;                        ## Type mismatch 

        ## Or do we have to do it like this:
        for(Int i = 0; i < 5; i = i+1){
            for(Int j = 0; j < 5; j = j+1) {
                a[i, j] = a[i, j]*10.0;     ##multiplication of float with int is invalid. Cant be 10
            }
        }

        ##Or like this :
        a = a * (new_unique Tensor<5, 5>(10.0)); 


        #* need to decide on slice syntax. *#
        for(Int i = 0; i < 3; i = i+1){        ##Prev 'Int i' in above for loop should have been destroyed, as defalut type is unique(..right?).
            (test.slice(0:5, 0:5, 0:1)) @ a;   ##Doing matrix mult with slices of test with 'a'.
        }
        #* just comments *#
  }
};
