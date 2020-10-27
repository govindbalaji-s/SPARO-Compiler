## testing operators, boolean expressions and their precedence

class Main{

    Int main(){

        Int a = 20;
        Int b = 10;
        Int c = 15;
        Int d = 5;
        Int e;
 
        e = a - c + b * c / a % d;     
        d = c = e;
        "Value of e = ".put();
        e.put();
        "\n".put();

        if(not a > b and c <= d or c > b){
            "True".put();
        }
        else{
            "False".put();
        }

        ##What all types does '>' allow to compare? Does it return a bool type? Is the below comparison valid?
        ## Below comparison is not vlaid, Type mismatch between 'Bool' and 'Int'
        #*
        if (d > c > b > a){    
            "TRUE".put(); 
        }
        else{
            "FALSE".put(); 
        }
        *#

        return 0; 
    }
};
