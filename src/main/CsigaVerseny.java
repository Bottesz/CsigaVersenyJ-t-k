
package main;

import java.util.Random;
import java.util.Scanner;


public class CsigaVerseny {
    
    private static final Random RND=new Random();
    public static final Scanner SC =new Scanner(System.in);
    private static int MIN=0;
    private static int MAX=3;
    private Csiga[] csigak;
    private int[] AktPozTomb;
    private final int KOROK_SZAMA = 10;
  

    

    
    public CsigaVerseny(){
    int sebesseg=RND.nextInt(MIN, MAX);
    Csiga cs1=new Csiga("piros","\u001B[31m Piros", "🐌\u001B[0m",sebesseg,false);
    Csiga cs2=new Csiga("zöld","\u001B[32m Zöld", "🐌\u001B[0m",sebesseg,true);
    Csiga cs3=new Csiga("Kék","\u001B[34m Kék", "🐌\u001B[0m",sebesseg,false);
    
    csigak = new Csiga[3];
    csigak[0] = cs1;
    csigak[1] = cs2;
    csigak[2] = cs3;
        
    }

    void Start() {
        
        
        AktPozTomb = new int[csigak.length];
        System.out.println("Szerinted melyik szinu csiga fog nyerni?");
        String tipp = SC.nextLine();
        System.out.print("Majd kiderul :D");
        int legtav = 0, nyertesi = 0;
        for (int i = 0; i < KOROK_SZAMA; i++) {
            System.out.printf("%d kör:\n", i + 1);
            for (int j = 0; j < csigak.length; j++) {
            AktPozTomb[j] += csigak[j].Gyorsito();
            System.out.println(csigak[j].getSzkod() +  " csiga aktuális pozíciója" + AktPozTomb[j] );
                if (AktPozTomb[j] > legtav) {
                    legtav = AktPozTomb[j];
                    nyertesi = j;
                }
            }
        }
        System.out.println(csigak[nyertesi].getSzkod() +  " csiga nyert!");
    }
    
    
}
