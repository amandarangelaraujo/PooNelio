import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        //instanciar a hora de agora
        /*
         * texto no formato iso 8601 para data e hora
         * texto costumizado para data hora
         * dia, mês, ano e horario para data hora local
         * 
         * formatação
         * data-hora para texto iso 8601
         * data hora para texto em formato customizado
         */

         //data hora local, sem fuso

         //dara hora global com fuso

         //duração

        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        //2023-09-10

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        //2023-09-10T10:45:43.518670600
        
        Instant d03 = Instant.now(); //-> data hora global
        System.out.println(d03);
        //2023-09-10T13:46:48.478306500Z -> data hora de GMT ou seja horário de londres.
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);
        //2022-07-20, transformou um texto para uma variável do tipo LocalDateTime
        
        Instant d05 = Instant.parse("2022-07-20T01:30:26-03:00");
        System.out.println(d05);
        //2022-07-20T04:30:26Z ->transformou de horário local com fuso de -3 para a hora
        //do meridiano. GMT.
        

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        LocalDate d06 = LocalDate.parse("23/09/2001", fmt1);
        System.out.println(d06);
        // Criou um formato para ser inserido, tem uma documentação que fala sobre
        //passou esse formato como parâmetro
        Instant d08 = Instant.now();

        //convertendo data-hora para texto
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d06.format(fmt2));

        //calculos com data-hora
        LocalDate pastweek = d04.minusDays(7);
        LocalDate nextweek = d04.plusDays(7);
        System.out.println(pastweek);
        System.out.println(nextweek);

        Instant nextweekInstant = d08.minus(7, ChronoUnit.DAYS);
        System.out.println(nextweekInstant);
        
        //objetivo é saber a diferença entre duas horas a duração
        String horaInicial = "02";
        String minutoInicial = "30";
        String horaFinal = "03";
        String minutofinal = "30";

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("HH:mm");
        String inicio = horaInicial+":"+minutoInicial;
        String finall = horaFinal+":"+minutofinal;

        LocalDateTime inicial = LocalDateTime.parse(inicio, fmt3);
        LocalDateTime fim = LocalDateTime.parse(finall, fmt3);
        System.out.println(fim.toString());






    }
}
