import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class variables_01 {
    //1.0. Method or function with void keyword (which doesn't return a value)
    static void myMethod(String names, int count) {
        System.out.println(names+" "+count);
    };

    //2.0. Method with no Void keyword, so we need to use return keyword instead
    static int noVoid(int g, int r){
        System.out.println(g+r);
        return  g+r;
    };

    //3.0. Method with void and return keywords
    static void  voidYes (int f, int s){
        System.out.println(f+s+noVoid(4,44));
    }




    public static void main(String[] args) {
        //1.0
        myMethod("Allah", 99);
        myMethod("Rahim", 99);
        myMethod("Rahman",99);

        //2.0
        noVoid(5,4);

        //3.0. invoke method with Void and sout =system.our.print
        voidYes(3,2);
    }

    static void testTest (int d1, int d2){
        System.out.println(d1+d2);

    }


}

