package herancapessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HerancaPessoa {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        Date d1 = sdf.parse("01/2000");
       
        Professor p1 = new Professor("André", "99999999", d1, 1500.0,"História");
        System.out.println(p1.toString());
        
    }
    
}
