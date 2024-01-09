
package meusegundoexemplojava;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class IdadeAtual {
    public static void main(String[] args) {
        //trecho de código que fornecerá o ano atual
        Calendar cal = GregorianCalendar.getInstance();

        //o objeto “cal” fornecerá o ano atual por meio do método get(Calendar.YEAR)
        int anoAtual = cal.get(Calendar.YEAR);
       
        //imagine que o usuário nasceu em 1991
        int anoNasc= 1991;
        
        int idade = anoAtual - anoNasc;
        
        System.out.println("Você tem: " + idade);
    }

}
