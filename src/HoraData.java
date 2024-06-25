import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter
;

import javax.xml.crypto.Data;

public class HoraData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//intanciando temo AGORA LOCAL
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		
		//data hora GNT - DATA LONDRES
		Instant d03 = Instant.now();
		
		//Texto ISO 8601 e gera uma data-hora
		LocalDate d04 = LocalDate.parse("1998-04-06");
		LocalDateTime d05 = LocalDateTime.parse("1998-04-06T12:00:30");
		
		//data hora GNT - DATA LONDRES
		Instant d06 = Instant.parse("1998-04-06T12:00:30Z");
		
		
		//DATA BRASIL COM O FUSO HORARIO QUE TEMQUE TRANFORMAR 
		Instant d07 = Instant.parse("1998-04-06T12:00:30-03:00");
		
		
	   DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   LocalDate d08 = LocalDate.parse("06/04/1998", fmt1);  //como o texto vai ser interpretado
	   
	   
	   DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	   LocalDateTime d09 = LocalDateTime.parse("06/04/1998 13:00", fmt2);
	   
	   LocalDate d10 = LocalDate.of(1998, 04, 06); //dia mes e ano isolados


	   //conversoa para string , iso para string
	   LocalDate d11 = LocalDate.parse("1998-04-06");
	   DateTimeFormatter formData = DateTimeFormatter.ofPattern("dd/MM/yyyy");//estilo que quero que o d11 receba
	   System.out.println("formData " + d11.format(formData));
	
	   //IMPORTANTE!!! mostra hora equivalente do sistema do cliente
	   //data hora GNT - DATA LONDRES para formatar para String considerando o fuso horário do sistema local do pc
	   Instant d12 = Instant.parse("1998-04-06T12:00:30Z");
	   DateTimeFormatter formData2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
	   System.out.println("form data 2 = =" + formData2.format(d12));
	 		
		
		System.out.println("d01 = " + d01.toString());//pode ser usado e ja da o padrão ISO  tranformação data-hora em ISO
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);

}

}
