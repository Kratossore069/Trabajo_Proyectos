package video18;

import java.util.*;
public class video21 {
    public static void main(String[] args){
        
        Scanner en = new Scanner(System.in);
        System.out.println("Introduzca un email.");
        boolean arroba=false;
        
        String email=en.next();
        
        for(int i=0; i<email.length(); i++){
            if (email.charAt(i)=='@'){
                arroba=true;
            }
        }
        
        if (arroba==true){
            System.out.println("Su email "+email+" es correcto.");
        }else{
            System.out.println("Su email "+email+" no es correcto.");
        }
        
        
        
    }
}