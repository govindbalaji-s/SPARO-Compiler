##first SPARO program!!

class Main {
    
    Int main(){
    
        ("Hello world!!").put();
        Int x = 0;         ##same as 'Int x = new_unique Int();'
        Int y = 9;         ##same as 'Int y = new_unique Int(9);'
        Int z = x+y;
        "Is this the correct way writing to stdout??".put();
        ("The sum is = ").put();
        (x+y).put();       ##This will work, it's the same as z.put().
        "\n".put();
        
        return 0;          ##Should return 0, as main has 'Int' return type.
    }
};
