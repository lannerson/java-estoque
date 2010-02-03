package utilitarios;
import java.util.Date;
import java.text.SimpleDateFormat;
public class data
{
    public String dia, mes, ano, dia_semana;
    public String hora;
    public SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
    
    
    public void le_hora()
    {
       Date horaAtual = new Date();
       hora = horaFormatada.format(horaAtual);
    }  
    public void le_data()
    {
        Date data = new Date();
 
        dia =""+ data.getDate();
        ano =""+(1900+data.getYear());
       
        
        switch (data.getDay())
        {
            case 0: dia_semana= "domingo"; break;
            case 1: dia_semana= "segunda-feira"; break;
            case 2: dia_semana= "terca-feira"; break;
            case 3: dia_semana= "quarta-feira"; break;
            case 4: dia_semana= "quinta-feira"; break;
            case 5: dia_semana= "sexta-feira"; break;
            case 6: dia_semana= "sabado-feira"; break;
            
        }
        
        switch (data.getMonth())
        {
            case 0: mes = "janeiro"; break;
            case 1: mes = "fevereiro"; break;
            case 2: mes = "marco"; break;
            case 3: mes = "abril"; break;
            case 4: mes = "maio"; break;
            case 5: mes = "junho"; break;
            case 6: mes = "julho"; break;
            case 7: mes = "agosto"; break;
            case 8: mes = "setembo"; break;
            case 9: mes = "outubro"; break;
            case 10: mes = "novembro"; break;
            case 11: mes = "dezembro"; break;
        }
    }
    
}




