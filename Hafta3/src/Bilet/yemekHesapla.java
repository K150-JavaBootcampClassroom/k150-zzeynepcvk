package Bilet;

public class yemekHesapla extends Bilet{
    public boolean yemekVarMi(){
        if(yurtIciMi){
            if(ucusFirmasÄ±.equals("Pegasus")){
                System.out.println("Yemek yok!");
            }else {
                System.out.println("Yemek var ");
            }
        }
        else{
            System.out.println("Yemek var");
        }
        return false;
    }
}
