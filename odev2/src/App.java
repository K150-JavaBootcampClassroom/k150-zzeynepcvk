import java.util.Random;

public class App {
    public static void main(String[] args)  {
        int sayac =0;
        int sayi ; 
        boolean find = true; 
       Random rnd = new Random(500); 
       sayi = rnd.nextInt();
       while(find){
        if(sayi>50 && sayi<100){
            sayac++ ; 
            
            if (sayac == 1){
                System.out.println("tekte bulundu");
                find = false;
            }else {
                System.out.println(sayac+". tekrarda bulundu ");
                find = false;
            }
        }else {
            
            sayac++;
        }
        }
       
    }
    }

