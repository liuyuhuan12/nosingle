public class FactoryPattern {
    public static void main(String[] args){
        
        FactoryA mFactoryA = new FactoryA();
        mFactoryA.Manufacture().Show();

        
        FactoryB mFactoryB = new FactoryB();
        mFactoryB.Manufacture().Show();
    }
}
