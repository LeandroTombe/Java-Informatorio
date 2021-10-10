
package ejercicio3;


public class recursion {
    
    public int incremento(int n){
        
        if (n ==0) {
            return(n);
            
        }else{
            return(incremento(n-1));
        }
    }
}
