
package oraimunka02.pkg28;

public class OraiMunka0228 {
    public static void main(String[] args) {
        int szam1 = -3;
        int szam2 = -2;
        int szam3 =+3;
        int szam1abs = Math.abs(szam1);
        int szam2abs = Math.abs(szam2);
        int szam3abs = Math.abs(szam3);
        System.out.println("|"+szam1+"|"+"="+szam1abs);
        System.out.println("|"+szam2+"|"+"="+szam2abs);
        System.out.println("|"+szam3+"|"+"="+szam3abs);
        
        //másik megoldás
        for (int i = 3; i<-3;i--){
            int abs =i ;
            if (i<0){
                abs *=-1;
            }
            System.out.printf(" |%2d| = %d\n",i, Math.abs(i));
 
        }
        System.out.println("");
        //tömbös feladat
        
        final int M =10;
        int[] tomb = new int [M];
        for (int i = 0;i<M;i++){
            //int paratlan =(int) (Math.random()*20);//
            //int paratlan =(int) (Math.random()*(99-10+1)+10);//10..99
            //int paratlan =(int) (Math.random()*45);//0..44
            //int paratlan =(int) (Math.random()*45*2);//0..88
            int paratlan =(int) (Math.random()*45)*2+11;//11..99
            
        }
        
    }
    
}
