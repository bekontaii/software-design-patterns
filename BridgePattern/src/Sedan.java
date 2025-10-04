public class Sedan extends  Body{
    public Sedan(Color color){
        super(color);
    }
    @Override
    public void create(){
        System.out.println("Sedan");
        color.fillColor();
    }
}
