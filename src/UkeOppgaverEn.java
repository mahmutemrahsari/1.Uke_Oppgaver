/*
* Oppgaver til Avsnitt 1.1.2
1.	Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell. Hva ville metodekallet min(a) returnere med hvis a er tabellen i Figur 1.1.2?
2.	Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell.
3.	Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem. Hva må endres for at den skal returnere posisjonen til den siste?

* Avsnitt 1.1.3
5.	Lag en metode public static int[] minmaks(int[]a). Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene til minste og største verdi i tabellen a.
* Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du returnere tabellen b definert ved:   int[] b = {m1, m2};
* Hvor mange sammenligninger bruker metoden din?
6.	Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
long fak(int n) som regner ut n!. Hvor mange multiplikasjoner utføres i metoden?

*
* * */

public class UkeOppgaverEn {
    public static void main(String[] args) {
    int a[] = {8, 4, 17, 10, 6, 20, 1, 11, 20, 3, 18, 9, 2, 20, 19};
        System.out.println("Min Index: "+min(a));
        System.out.println("Max Index: "+maks(a));
        for(int i=0; i<minmaks(a).length;i++){
            System.out.println("MinMax: "+minmaks(a)[i]);
        }
        System.out.println("Faktorial of n : " + fak(5));
    }

    //Oppgave1-2
    public static int min(int[] a){
        if(a.length<1)
            throw new java.util.NoSuchElementException("Tabellen er tom!");

        int m = 0; //index til foreloepig stoerste verdi

        for(int i =1; i<a.length; i++){
            if(a[i]<a[m])
                m=i;
        }
        return m;
    }

    //Oppgave3
    public static int maks(int[] a){
        if(a.length<1)
            throw new java.util.NoSuchElementException("Tabellen er tom!");

        int m = 0; //index til foreloepig stoerste verdi

        for(int i =1; i<a.length; i++){
            //if(a[i]>a[m]) gir den foerste stoeste verdien i arrayen
            if(a[i]>=a[m]) //Gir den siste stoerste verdien i arrayen
                m=i;
        }
        return m;
    }

    //Oppgave 5
    public static int[] minmaks(int[]a){
        if(a.length<1)
            throw new java.util.NoSuchElementException("Tabellen er tom!");

        int m1=0;
        int m2 = 0;
        for(int i =1; i<a.length; i++){
            //if(a[i]>a[m]) gir den foerste stoeste verdien i arrayen
            if(a[i]>=a[m1]) //Gir den siste stoerste verdien i arrayen
                m1=i;
        }

        for(int j =1; j<a.length; j++){
            if(a[j]<a[m2])
                m2=j;
        }

        int[] b = {m1, m2};

        return b;
    }

    //Oppgave6 Recursive loesning
    public static long fak(int n){
        //n! = n · (n-1) ·  ·  · 2 · 1
        if(n!=0)
            return n*fak(n-1);
        else
            return 1;
    }
    //Seksjon 1.1.4: deloppgave i og deloppgave ii
    //Oppgave
    
}
