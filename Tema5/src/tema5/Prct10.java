/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct10 {

    /*
    Práctica 10: Obtener una expresión regular que de coincidencia ( mediante find() ) de las
cadenas ( y no de las otras) a), b), c), d), h), i)
a)abcc
    
b)aBbcaR
    
c)abbbcPrr
    
d)abbbbcCC
    
e)aabbbbcCC
    
f)aBbrc
    
g)aabcc
    
h)abBbc
    
i)abbBBc
    
     */

    public static void main(String[] args) {

        Pattern a = Pattern.compile("([a-z]{4})");
        
        Pattern b = Pattern.compile("([a-z]+[A-Z]+[a-z]{3}[A-Z]+)");
        
        Pattern c = Pattern.compile("([a-z]{5}[A-Z]+[a-z]{2})");
        
        Pattern d = Pattern.compile("(^[a-z]{6}[A-Z]+)");
        
        Pattern e = Pattern.compile("([a-z]{7}[A-Z]+)");
        
        Pattern f = Pattern.compile("([a-z][A-Z][a-z]{3})");
        
        Pattern g = Pattern.compile("([a-z]{5})");
        
        Pattern h = Pattern.compile("([a-z]{2}[A-Z][a-z]{2})");
        
        Pattern i = Pattern.compile("([a-z]{3}[A-Z]{2}[c])");
        
        
        Matcher aa = a.matcher("abcc");
        
        Matcher bb = b.matcher("aBbcaR");
        
        Matcher cc = c.matcher("abbbcPrr");
        
        Matcher dd = d.matcher("abbbbcCC");
        
        Matcher ee = e.matcher("aabbbbcCC");
        
        Matcher ff = f.matcher("aBbrc");
        
        Matcher gg = g.matcher("aabcc");
        
        Matcher hh = h.matcher("abBbc");
        
        Matcher ii = i.matcher("abbBBc");
        
        
        while (aa.find()) {
            System.out.println("Letra inicial (opcional):" + a.group(1));
            System.out.println("Número:" + m.group(2));
            System.out.println("Letra NIF:" + m.group(3));
        }

    }
}
