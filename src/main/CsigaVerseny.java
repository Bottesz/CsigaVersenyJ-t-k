
package main;

import java.util.Random;


public class CsigaVerseny {
    private static final Random RND=new Random();
    private static int MIN=0;
    private static int MAX=3;
    private Csiga cs1,cs2,cs3;
    private int[] tmbTomb = new int[3];
    private final int KOROK_SZAMA = 10;
  

    private Csiga[] csTomb;

    
    public CsigaVerseny(){
    cs1=new Csiga("piros","\u001B[31m Piros 🐌\u001B[0m",3);
    cs2=new Csiga("zöld","\u001B[32m Zöld 🐌\u001B[0m");
    cs3=new Csiga("Kék","\u001B[34m Line 4\u001B[0m");
    sebesseg=RND.nextInt(MIN, MAX);
    }
    
    
}
