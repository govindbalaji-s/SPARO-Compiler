#*example of break*#

class Main{

    Int main(){

        Int i;
        
        for( i=0; i<10; i++) {
          if(i == 5){
          break;
          }
          
          #*if(i==3){
          continue;
          }*#
          
          "Printed".put();
          
        }
        

        return 0; 
    }
};
