package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		// Pegando a minha data de nascimento e comparando se é MAIOR ou MENOR que 15/05/2010
		// Usando Classe DATE
		SimpleDateFormat dateFormatnasc = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat dateFormatverifiq = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Date dataNasc = dateFormatnasc.parse("02/03/1982 06:55");
		Date dataVerifiq = dateFormatverifiq.parse("15/05/2010 00:00");
		
		System.out.println("É antes de 02/03/1982: " + dataNasc.after(dataVerifiq));
		System.out.println("É depois de 02/03/1982: " + dataNasc.before(dataVerifiq));
		
		/******************************************************************* */
		//Usando Calendar
		Calendar agora = Calendar.getInstance();
		
		// Retornando um "date" do Calendar
		System.out.println(agora.getTime());
		
		//Pegando 15 dias atrás
		agora.add(Calendar.DATE, -15);
		System.out.println(agora.getTime());
		
		//Pulando quatro meses à frente
		agora.add(Calendar.MONTH, 4);
		System.out.println(agora.getTime());
		
		//Pulando dois anos à frente
		agora.add(Calendar.YEAR, 2);
		System.out.println(agora.getTime());
		
		// EXERCÍCIO
		
		/* Um cliente tem 10 dias para pagar uma fatura após o vencimento sem pagar juros.
		 * Caso essa data caia num sábado ou domingo, pode pagar na próxima segunda-feira
		 * Crie uma estrutura que receba uma data e calcule quantos dias ele tem para pagar
		 */
		System.out.println("**************************************************");
		System.out.println("**                EXERCÍCIO                     **");
		System.out.println("**************************************************");
		
		Calendar dataVencimento = Calendar.getInstance();
		dataVencimento.set(2021,2,24);
		System.out.println("Data no Calendar: " + dataVencimento.getTime());
		SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
		Date dataVencimentoDate = dataVencimento.getTime();
		System.out.println("Data atual: " + formata.format(dataVencimentoDate));
		
		dataVencimento.add(Calendar.DATE,10);	// adiconando 10 dias
		System.out.println("Data no Calendar: " + dataVencimento.getTime());
		dataVencimentoDate = dataVencimento.getTime();
		System.out.println("Data do próximo vencimento: " + formata.format(dataVencimentoDate));
		
		
		int diaDaSemana = dataVencimento.get(dataVencimento.DAY_OF_WEEK); // Pega o "int" relacionado ao dia da semana
		
		System.out.println(diaDaSemana);

		
		
		if(diaDaSemana == 7) {
			dataVencimento.add(Calendar.DAY_OF_MONTH, 2);
		} else if (diaDaSemana == 1) {
			dataVencimento.add(Calendar.DAY_OF_MONTH, 1);
		}
		dataVencimentoDate = dataVencimento.getTime();
		System.out.println("Dia FINAL para pagamento: " + dataVencimento.getTime());
		System.out.println("Dia FINAL para pagamento: " + formata.format(dataVencimentoDate));
		
		System.out.println("******************************************************");
		
		Date vamula = new Date();
		SimpleDateFormat formataVamula = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");
		
		
		System.out.println("Vamulá formatado: " + formataVamula.format(vamula));
		
		System.out.println("\n\n********** ESTUDOS COM LOCALDATE *********************");
		
		LocalDate hoje = LocalDate.now(); // dia atual
		
		System.out.println(hoje);
		
		LocalDate ontem = hoje.minusDays(1); // subtrai um dia 
		
		System.out.println(ontem);
		
		System.out.println("\n\n********** ESTUDOS COM LOCALTIME *********************");
		
		LocalTime horaAtual = LocalTime.now(); // hora atual
		
		System.out.println(horaAtual);
		
		LocalTime daquiAUmaHora = horaAtual.plusHours(1);
		
		System.out.println(daquiAUmaHora);
		
		System.out.println("\n\n********** ESTUDOS COM LOCALDATETIME *********************");
		
		LocalDateTime maisUmAgora = LocalDateTime.now();
		
		System.out.println(maisUmAgora);
		
		LocalDateTime amanhaNoFuturo = maisUmAgora.plusHours(10).plusDays(1).plusSeconds(30);
		
		System.out.println(amanhaNoFuturo);
		
		
		
		
	}

}
