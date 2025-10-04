public class CUV extends Body{
    public CUV (Color color){
        super(color);
    }
    @Override
    public void create(){
        System.out.println("CUV");
        color.fillColor();
    }
}
