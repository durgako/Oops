import java.util.Collections;

public class ridingbikes extends  riding{

    @Override
    public void fast() {
        super.fast();
        System.out.println("hyderabad");
    }

    static void slow()
    {
        System.out.println("pomegranate");
    }

    @Override
    void faster(String s) {
        super.faster(s);
        System.out.println("vizag");
    }

    @Override
    protected void july() {
        super.july();
        System.out.println("radheshyam");
    }

    public static void main(String[] args) {
        riding r=new ridingbikes();
        r.fast();
        r.july();
        r.faster("hyderbad");
        ridingbikes ro=new ridingbikes();
        ridingbikes.slow(43);

    }
}
