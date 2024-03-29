#* Printing array of 0,1,2 in sorted order *#


class Main {
    
    void print_array(Int zerocnt, Int onecnt, Int twocnt){
      
      for(Int i =0; i<zerocnt; i=i+1){
        ## Scope of 'i' would be within these braces.
        ("0 ").put();
      }
      
      ##Previously declared 'i' doesn't exist here
      
      for(Int i =0; i<onecnt; i=i+1){
        ("1 ").put();
      }
      for(Int i =0; i<twocnt; i=i+1){
        ("2 ").put();
      }
      "\n".put();
    
    }

    Int main(){

        shared Array<Int, 10> array; 
        Int cnt0 =0;
        Int cnt1 =0;
        Int cnt2 =0;
        
        ("Input 10 integers :\n").put();

        for(Int i = 0; i < 10; i = i+1){
           
            array[i] = new_unique Int();    ##Elements of 'array' are initialized as 'Int' objects
            array[i].get();
        }
        
        for(Int i = 0; i < 10; i = i+1){
            
            if(array[i] == 0){
              cnt0 = cnt0 + 1;
            }
            ##Nested 'else -if' has to be written as below
            else{
                if(array[i] == 1){
                    cnt1 = cnt1 + 1;
                }
                else{
                    cnt2 = cnt2 +1;
                }
           }
        }

        print_array(cnt0, cnt1, cnt2); ## calling 'print_array' function
        return 0;
    } 
    

};
