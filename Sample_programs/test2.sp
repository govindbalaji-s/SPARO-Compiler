#*Testing comments *#

class Main {
    
    Int main(){

        ##("This will not be printed").put();
        
        #*
        ("This will also not be printed").put();
        *#
        
        ("This will be printed").put();
        return 0;
    }
};
