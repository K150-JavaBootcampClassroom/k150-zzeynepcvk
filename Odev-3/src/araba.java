public abstract class araba {
    
    private int model ; 
    private String renk ; 
    private int musteriTipi; 

    public araba (int model, String renk, int musteriTipi){
        this.model = model;
        this.renk = renk;
        this.musteriTipi = musteriTipi;
    }

    public int getModel(){
        return model;
    }

    public String getRenk(){
        return renk;
    }

    public int getMusteriTipi(){
        return musteriTipi;
    }


}
