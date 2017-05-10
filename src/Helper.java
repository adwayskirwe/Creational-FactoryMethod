
public class Helper {
    public DocumentInterface getInstance(String s){
        if(s.equals("PDF")){
            return new PDFDocument();
        }
        else{
            return new XSLXDocument();
        }
    }
}
