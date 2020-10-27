##calculating max element in array
##testing method dispatch

class Main {
    
    Int max;                    ##'max' declared,  will be null_ptr

    Int findMax(Array<Int, 10> local_arr) { ##Do we need to specify Array length in the parameter?

        max = local_arr[0].copy();
        for(Int i = 0; i < 10; i = i+1){

            if(local_arr[i] > max){
                max = local_arr[i].copy();
            }
        }
        return max.copy();       ##As variable 'max' has class scope, it already contains the answer right?
    }

    Int main(){

        shared Array<Int, 10> arr;  ## 'arr' is of shared pointer type. The elements in 'arr' are all unique pointers (null_ptrs).  
        ("Enter 10 integers :\n").put();

        for(Int i = 0; i < 10; i = i+1){

            ## NOTE : arr[i].get() would raise an error, as 'arr[i]' is a NULL ptr.

            arr[i] = new_unique Int();    ##now elements of 'arr' are initialized as 'Int' objects
            arr[i].get();
        }
        findMax(arr).put();

        return 0;
    } 
    

};
