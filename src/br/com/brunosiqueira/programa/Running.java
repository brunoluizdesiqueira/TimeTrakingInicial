package br.com.brunosiqueira.programa;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import br.com.brunosiqueira.modelo.Cliente;
import br.com.brunosiqueira.modelo.Colaborador;
import br.com.brunosiqueira.modelo.Projeto;
import br.com.brunosiqueira.modelo.StatusPessoa;
import br.com.brunosiqueira.modelo.Tarefa;
import br.com.brunosiqueira.modelo.TimeTracking;
import br.com.brunosiqueira.modelo.TipoTransicao;

public class Running {

	public static void main(String[] args) throws InterruptedException {
		
		// Cadastrando colaboradores
		Colaborador bruno = new Colaborador("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
		Colaborador amanda = new Colaborador("Amanda", StatusPessoa.Ativo, "amanda.manso@icloud.com", "654321", "amanda");		   
		
		// Criando um projeto
		Projeto erp = new Projeto("Bimer Project");

		// Criando um cliente-projeto
		Cliente alterdata = new Cliente("Altedata", erp);
		
		// Seta o cliente do projeto
		erp.setCliente(alterdata);	
		
		// Criando tarefas
		Tarefa t1 = new Tarefa("Tarefa de criacao do Emissor MDF-e",bruno, amanda);
		Tarefa t2 = new Tarefa("Tarefa de criacao do Emissor CT-e", amanda, bruno);	
		Tarefa t3 = new Tarefa("Tarefa de criacao do Emissor NF-e", bruno, bruno);
		
		// Acessa um projeto associado ao cliente e inclui uma lista de tarefas	
		alterdata.getProjeto(erp).setTarefas(Arrays.asList(t1, t2, t3));
		
		// Imprimindo no console o nome do projeto associado ao cliente e as tarefas ligadas a este projeto
		System.out.println(alterdata.getProjeto(erp).getNome().toString() + " " + alterdata.getProjeto(erp).getAllDescricaoTarefas());
		
		// Retorna o TimeTracking da tarefa index 0
		TimeTracking timeTracking = alterdata.getProjeto(erp).getTarefas().get(0).getTimeTracking();
		
		// Iniciar a tarefa index 0 associada ao cliente por meio do metodo registrar da classe timeTracking  
		timeTracking.registrar(TipoTransicao.INICIADO, "Iniciando analise", bruno);
		
		// Espera 30 segundos
		TimeUnit.SECONDS.sleep(2);
		
		// Pausa a tarefa 
		timeTracking.registrar(TipoTransicao.PAUSADO, "Parando para almoço", bruno);
		
		// Espera 10 segundos
		TimeUnit.SECONDS.sleep(8);
		
		// Reiniciando a tarefa
		timeTracking.registrar(TipoTransicao.REINICIADO, "Retornando do almoço", bruno);
		
		// Espera 10 segundos
		TimeUnit.SECONDS.sleep(10);
		
		// Finaliza a tarefa
		timeTracking.registrar(TipoTransicao.FINALIZADO, "Tarefa concluída", bruno);			
		
		// Imprimindo todas os tempos
		timeTracking.getTimeLine().forEach(t -> System.out.println(t.getTransicao() + " " + t.getInstante()));
		
		// Retorna o tempo total decorrido da tarefa index 0
		Duration d = timeTracking.getTempoTotal();
		
		// Imprimindo o total do tempo gasto na tarefa index 0
		System.out.printf("%s hora(s), %s minuto(s) e %s segundo(s)", d.toHours(), d.toMinutes(), d.getSeconds());
			
	}

}
