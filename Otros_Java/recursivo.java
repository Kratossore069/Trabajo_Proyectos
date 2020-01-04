package video18;

/**
 *
 * @author Víctor
 */
public class recursividad {
    
    public static int sumaRecursiva(int numero){
        
        int res;
        
        if(numero  == 1){
            return 1;
        }else{
            res = numero + sumaRecursiva(numero-1);
        }
        
        return res;
    }
    
    public static void main(String[] args){
        //Sumar los números naturales hasta N de forma recursiva.
        
        int num = 10;
        int res = sumaRecursiva(num);
        System.out.println(res);
    }
}