##testing the tensor class and it's member methods

##still need to formalize some methods of this class.

class main {
    
    Tensor<5, 5, 3> test;                   ##test will be a tensor of null pointers (unique type).

    Int main{

        test.initialize(0.0);               ##test tensor filled with zeros.
        (Tensor<5, 5> A).initialize(1.0);   ##tensor 'A' initialized with all ones. **Is syntax fine??**
        ##A = A*10;                         --elementise tensor multiplication with constant 10. **Is this allowed (i.e broadcasting)??**

        ##Or do we have to do it like this:
        for(Int i = 0; i < 5; i++){
            for(Int j = 0; j < 5; j++){
                A[i][j] = A[i][j]*10.0;     ##Also, is multiplication of float with int valid? Can I write just '10'...?
            }
        }

        ##Or like this :
        A = A*((Tensor<5, 5> temp).initialize(10.0)); 


        #* need to decide on slice syntax.
        for(Int i = 0; i < 3; i++){        ##Prev 'Int i' in above for loop should have been destroyed, as defalut type is unique(..right?).
            (test.slice(0:5, 0:5, 0:1))@A  ##Doing matrix mult with slices of test wwith 'A'.
        }
        *#
}