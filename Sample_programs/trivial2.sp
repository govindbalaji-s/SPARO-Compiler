##calculating max element in array
##testing method dispatch

class Main {
    
    Int max;                    ##'max' declared,  will be null_ptr

    Int findMax(Array<Int, > Local_arr) { ##Do we need to specify Array length in the parameter?

        max = Local_arr[0];
        for(Int i = 0; i < 10; i = i+1){

            if(Local_arr[0] > max){
                max = Local_arr[0];
            }
        }
        return max;       ##As variable 'max' has class scope, it already contains the answer right?
    }

    Int main{

        shared Array<Int, 10> arr;  ## 'arr' is of shared pointer type. The elements in 'arr' are all unique poniters (null_ptrs).  
        ("Enter 10 integers :\n").put();

        for(Int i = 0; i < 10; i = i+1){

            # NOTE : arr[i].get() would raise an error, as 'arr[i]' is a NULL ptr.

            arr[i] = new_unique Int();    ##now elements of 'arr' are initialized as 'Int' objects
            arr[i].get();
        }
        findMax(arr).put()

        return 0;
    } 
    

};