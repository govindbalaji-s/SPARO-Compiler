#*Testing comments *#

class Main {
    
    Int main(){

        Float a = 5.4;
        Int b = 40;
        
        
        ##("This will not be printed").put();
        
        #*
        ("This also will not be printed").put();
        *#
        
        ("This will be printed").put();
        return 0;
    }
};
