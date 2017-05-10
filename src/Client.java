
public class Client {
    public static void main(String[]args){
        Helper h=new Helper();
        DocumentInterface obj=h.getInstance("XSLX");
        obj.display();
    }
}
