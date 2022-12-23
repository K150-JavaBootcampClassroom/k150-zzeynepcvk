import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        
        System.out.println("kullanıcı adınızı giriniz : ");
        String username ; 
        username = scan1.nextLine();

        System.out.println("şifreyi giriniz :");
        int password ;
        password = scan1.nextInt();

        int entry = 3 ; 
        while(entry > 0 ){
        if(username.equals("zeynep") && password==2121){
            System.out.println("hoşgeldinizz \n"+" lütfen yapmak istediğiniz işlemi seçin : ");
            System.out.println("1- para yatırma \n"+"2- para çekme\n"+"3-bakiye sorgulama\n"+"4-çıkış ");
        
        
    
        double total = 100;
        int process ; 
        process = scan1.nextInt();
        switch(process){
            case 1 : 
            System.out.println("ne kadar yatırcaksın hocam? ");
            int amount = scan1.nextInt();
            total += amount ;

            System.out.println("işlem başarılı ... bakiyeniz :  " + total );
            
            break;
            case 2 : 

            System.out.println("ne kadar lazım kardes? ");
            int wAmount = scan1.nextInt();
            total -=wAmount ; 

            System.out.println("işlem başarılı ... bakiyeniz : "+total);
            break; 

            case 3 : 

            System.out.println("bakiyeniz : "+ total);

            break; 

           
            default:
            if (process == 4) {
                continue;
            }
            System.out.println("1 2 3 4 dedik ya kardeşim derdin ne ");
  
        }

        

}
else {
    System.out.println("siz kendinizi unutmuşsunuz efendim ");
}


System.out.println("beynim durdu hocam *-* ");
        }
    
    }
}