package PROJETO;

import java.util.Scanner;

public class SistemaDeGestão {

	public static void main(String[] args) {
		
		 
	       int cod;
	       boolean bcod;
	       int op1;
	       int op2;
	       int op3;
	       int op4;
	       int op5;
	       int op6;
	       int op7;
	       int op8;
	       int op9;
	       String op10;
	       boolean vcod = true;
	       String segue;
	       int j;
	       int x;
	       int jinx = 0;
	       int jinx2 = 0;
	       int w;
	       int segue2;
	       int a;
	      
	       
	       
	       
	       
	       String nome;
	       int duracao;
	       String tema;
	       String data;
	       String horario;
	       String formacao;
	       String atuacao;
	       String nomepessoa;
	       int idade;
	       String sexo;
	       int semestre;
	       int num_palestra = -1;
	       String turma;
	       String matricula;
	       String palestra;
	       

	       
	       
	       Evento [] evento = new Evento[4]; 
	       Aluno [] aluno1 = new Aluno[120];
	       Aluno [] aluno2 = new Aluno[120];
	       Aluno [] aluno3 = new Aluno[120];
	       Aluno [] aluno4 = new Aluno[120];
	       Aluno [] aluno5 = new Aluno[120];
	     
	      
	      
	    
	       Scanner scan = new Scanner(System.in);
	       
	       
	       do {
	       System.out.println("------------Gestão de Palestras em Campos Educacional------------------------------------"
	                +"\n-----Interface destinada ao gerenciamento de palestras e afins em capos educacional.-----"                
	                + "\n-----Digite o código de acesso dos funcionarios.-----------------------------------------");
	
	           cod=scan.nextInt();
	           for(int i = 0; i < 100; i++) {
					System.out.println("");
				}
	           
	           if(cod==2){
	           bcod=true;
	           vcod=false;
	           }
	           else{
	               System.out.println("Código incorreto");
	               System.out.println("Digite qualquer tecla para tentar novamente.");
	               segue=scan.next();
	               for(int i = 0; i < 100; i++) {
						System.out.println("");
					}
	               bcod=false;
	           }
	           
	       }while(vcod == true);
	           while(bcod){
	        	   for(int i = 0; i < 40; i++) {
						System.out.println("");
				   }
	           System.out.println("------------Gestão de Palestras em Campos Educacional--------------"
	            +"\n-----Digite o numero correspondente para acessar cada função-----"
	                + "\n1- Agendar uma nova palestra."
	                + "\n2- Listar palestras agendadas."
	                + "\n3- Editar palestras agendadas."
	                + "\n4- Excluir palastra agendada."
	                + "\n5- Cadastrar alunos em palestras agendadas."
	                + "\n6- Listar alunos cadastrados de palestras agendadas.");           
	           op1=scan.nextInt();
	           scan.nextLine();
	           
	           switch(op1) {
	          
	               case 1:
	            	   for(int i = 0; i < 100; i++) {
	   					System.out.println("");
	   				   }
	                   for (int i = 0; i < evento.length; i++) {
	                       if (evento[i] == null) {
	                         System.out.println("AVISO:Podem haver apenas 10 palestras agendadas ao mesmo tempo! "
	                           + "\nCertifique-se que há disponibilidade de uma nova palestra.");
	                   System.out.println("Preencha os dados referentes a sua nova palestra");
	                   System.out.println("Nome da palestra:");
	                   nome=scan.nextLine();
	                   System.out.println("Duração da palestra(horas):");
	                   duracao=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Tema da palestra:");
	                   tema=scan.nextLine();
	                   System.out.println("Data da palestra (xx/xx/xxxx):");
	                   data=scan.nextLine();
	                   System.out.println("Horario da palestra(xx horas):");
	                   horario=scan.nextLine();
	                   System.out.println("Agora os dados referentes ao palestrante que irá ministrar o evento");
	                   System.out.println("Nome do palestrante:");
	                   nomepessoa=scan.nextLine();
	                   System.out.println("Idade do palestrante:");
	                   idade=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Sexo do palestrante:");
	                   sexo=scan.nextLine();
	                   System.out.println("Area de atuação do palestrante no mercado:");
	                   atuacao=scan.nextLine();
	                   System.out.println("Formação acadêmica do palestrante");
	                   formacao=scan.nextLine();
	                           
	                   evento[i]= new Evento(nome,duracao,tema,data,horario, new Palestrante(formacao,atuacao, nomepessoa,idade,sexo));
	                   System.out.println("Dados da palestra armazenados com sucesso.");
	                   break;
	                   }
	                   else if(evento[3] != null){
	                        System.out.println("Quantidade maxima de palestras já alcançada!!!!");
	                        System.out.println("Digite qualquer número para retornar as opções.");
	                        op4=scan.nextInt();
	                        if(op4 != 0) {
	                        break;
	                        }
	                       }
	                       
	                       
	                   }
	                   break;
	               case 2:
	            	   j = 0;
	            	   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
	            	   
	            	   System.out.println("------------Lista de Palestras Atualmente Agendadas--------------");
	            	   System.out.println("-----Digite o número correspondente para ver os dados de cada Palestra, ou digite 11 para voltar as opções.-----");
	            	    
	            	   if(evento[0] != null) {
	            	   for(int i = 0; i < evento.length; i++) {
	            		   if(evento[i] != null) {
	            		   System.out.println(j+"---"+evento[i].getNome());
	            		   j++;
	            		   }	   
	            	   }
	            	   op2 = scan.nextInt();
	            	   if(op2 == 11) {
	            		   break;
	            	   }
	            	   for(int i = 0; i < 11; i++) {
	            		   System.out.println("Nome da palestra:"+evento[op2].getNome());
	            		   System.out.println("Duração da palestra:"+evento[op2].getDuracao());
	            		   System.out.println("Tema da palestra:"+evento[op2].getTema());
	            		   System.out.println("Data da palestra:"+evento[op2].getData());
	            		   System.out.println("Horário da palestra:"+evento[op2].getHorario());
	            		   System.out.println("Nome do palestrante:"+evento[op2].getPalestrante().getNomepessoa());
	            		   System.out.println("Idade do palestrante:"+evento[op2].getPalestrante().getIdade());
	            		   System.out.println("Sexo do palestrante:"+evento[op2].getPalestrante().getSexo());
	            		   System.out.println("Área de atuação no mercado do palestrante:"+evento[op2].getPalestrante().getAtuacao());
	            		   System.out.println("Formação acadêmica do palestrante:"+evento[op2].getPalestrante().getFormacao());
	            		   i = 11;
	            	   }  
	            	   
	            	   System.out.println("Digite 11 para voltar as opções.");
	            	   op2 = scan.nextInt();
	            	   if(op2 == 11) {
	            		   break;
	            	   }
	            	   }
	            	   else {
	            		   System.out.println("Nenhuma palestra foi agendada ainda, adicione uma nova para observar seus detalhes.");
	            		   op2 = scan.nextInt();
	            	   }
	            	   if(op2 == 11) {
	            		   break;
	            	   }
	           
	            	   
	               case 3:
	            	   j = 0;
	            	   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
	            	   
	            	   System.out.println("------------Lista de Palestras Atualmente Agendadas--------------");
	            	   System.out.println("-----Digite o número correspondente para editar os dados da Palestra, ou digite 11 para voltar as opções.-----");
	            	   if(evento[0] != null) {
	            	   for(int i = 0; i < evento.length; i++) {
	            		   if(evento[i] != null) {
	            		   System.out.println(j+"---"+evento[i].getNome());
	            		   j++;
	            		   }	   
	            	   }
	            	   
	            	   op3 = scan.nextInt();
	            	   if(op3 == 11) {
	            		   break;
	            	   }
	            	   
	            	   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
	            	   
	            	   System.out.println("Informe a nova opção de cada campo, ou apenas digite 0 para seguir ao próximo campo.");
	            	   
	            	   System.out.println("Nome da palestra atual:"+evento[op3].getNome());
	            	   System.out.println("Atualizar nome:");
	            	   scan.nextLine();
	            	   nome=scan.nextLine();
	            	   if(nome != "0") {
	            		   evento[op3].setNome(nome);
	            	   }
	            	   else if(nome == "0"){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   System.out.println("Duração da palestra atual:"+evento[op3].getDuracao());
            		   System.out.println("Atualizar duração:");
            		   duracao=scan.nextInt();
            		   if(duracao != 0) {
	            		   evento[op3].setDuracao(duracao);
	            	   }
	            	   else if(duracao == 0){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   System.out.println("Tema da palestra atual:"+evento[op3].getTema());
            		   System.out.println("Atualizar tema:");
            		   scan.nextLine();
            		   tema=scan.nextLine();
            		   if(tema != "0") {
	            		   evento[op3].setTema(tema);
	            	   }
	            	   else if(tema == "0"){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   
            		   System.out.println("Data da palestra atual:"+evento[op3].getData());
            		   System.out.println("Atualizar data:");
            		   data=scan.nextLine();
            		   if(data != "0") {
	            		   evento[op3].setData(data);
	            	   }
	            	   else if(data == "0"){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   System.out.println("Horário da palestra atual:"+evento[op3].getHorario());
            		   System.out.println("Atualizar horário:");
            		   horario=scan.nextLine();
            		   if(horario != "0") {
	            		   evento[op3].setHorario(horario);
	            	   }
	            	   else if(horario == "0"){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   System.out.println("Nome do palestrante atual:"+evento[op3].getPalestrante().getNomepessoa());
            		   System.out.println("Atualizar nome de palestrante:");
            		   nomepessoa=scan.nextLine();
            		   if(nomepessoa != "0") {
	            		   evento[op3].getPalestrante().setNomepessoa(nomepessoa);
	            	   }
	            	   else if(nomepessoa == "0"){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   System.out.println("Idade do palestrante atual:"+evento[op3].getPalestrante().getIdade());
            		   System.out.println("Atualizar idade do palestrante:");
            		   idade=scan.nextInt();
            		   if(idade != 0) {
	            		   evento[op3].getPalestrante().setIdade(idade);
	            	   }
	            	   else if(idade == 0){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   System.out.println("Sexo do palestrante atual:"+evento[op3].getPalestrante().getSexo());
            		   System.out.println("Atualizar sexo do palestrante:");
            		   scan.nextLine();
            		   sexo=scan.nextLine();
            		   if(sexo != "0") {
	            		   evento[op3].getPalestrante().setSexo(sexo);
	            	   }
	            	   else if(sexo == "0"){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   System.out.println("Área de atuação no mercado do palestrante atual:"+evento[op3].getPalestrante().getAtuacao());
            		   System.out.println("Atualizar área de atuação:");
            		   atuacao=scan.nextLine();
            		   if(atuacao != "0") {
	            		   evento[op3].getPalestrante().setAtuacao(atuacao);
	            	   }
	            	   else if(atuacao == "0"){
	            		   System.out.println("Dado mantido.");
	            	   }
            		   System.out.println("Formação acadêmica do palestrante atual:"+evento[op3].getPalestrante().getFormacao());
            		   System.out.println("Atualizar formação do palestrante:");
            		   formacao=scan.nextLine();
            		   if(formacao != "0") {
	            		   evento[op3].getPalestrante().setFormacao(formacao);
	            	   }
	            	   else if(formacao == "0"){
	            		   System.out.println("Dado mantido.");
	            	   }
	            	   }
	            	   else {
	            		   System.out.println("Nenhuma palestra foi agendada ainda, adicione uma nova para editar seus detalhes.");
	            		   op3 = scan.nextInt();
	            	   }
	            	   if(op3 == 11) {
	            		   break;
	            	   }
	            	   
	               case 4:
	            	   
	            	   j = 0;
	            	
	            	   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
	            	   
	            	      System.out.println("Digite o número correspondente a palestra que deseja excluir.");
	            	   
	            	   for(int i = 0; i < evento.length; i++) {
	            		   if(evento[i] != null) {
	            		   System.out.println(j+"---"+evento[i].getNome());
	            		   j++;
	            		   }	   
	            	   }
	            	   
	            	   op5=scan.nextInt();
	            	   
	            	   evento[op5] = null;
	            	   
	            	   System.out.println("Digite 11 para voltar as opções.");
	            	   op6 = scan.nextInt();
	            	   if(op6 == 11) {
	            		   break;
	            	   }
	            	   
	               case 5:
	            	   j = 0;
	            	  
	            	   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
	            	   
	            	   System.out.println("Digite o número correspondente a palestra em que deseja cadastrar o aluno.");
	            	   
	            	   for(int i = 0; i < evento.length; i++) {
	            		   
	            		   if(evento[i] != null) {
	            		   System.out.println(j+"---"+evento[i].getNome());
	            		   j++;
	            		   }	   
	            	   }
	            	   
	            	   op7=scan.nextInt();
	            	   scan.nextLine();
	            	   
	            	   if(evento[op7] == evento[0]) {
	            		  
	            		   if(aluno1[119] == null) {
	            	   
	            	   
	            	   System.out.println("Preencha os dados do aluno.");
	                   System.out.println("Nome do aluno:");
	                   nomepessoa=scan.nextLine();
	                   System.out.println("Idade do aluno:");
	                   idade=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Sexo do aluno:");
	                   sexo=scan.nextLine();
	                   System.out.println("Semestre que o aluno esta cursando:");
	                   semestre=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Turma do aluno:");
	                   turma=scan.nextLine();
	                   System.out.println("Número de matricula do aluno:");
	                   matricula=scan.nextLine();
	            	   
	                   for(int i = 0; i < aluno1.length; i++) {
	                	   if(aluno1[i] == null) {
	                		    aluno1[i]= new Aluno(nomepessoa, idade, sexo, matricula, turma, semestre);
	                		    i = aluno1.length;
	                	   }
	                  
	                   }
	            	
	            	       }
	            		   else {
	            			   System.out.println("A quantidade máxima de alunos por palestra (120) já foi alcançada.");
	            		   }
	            	   
	            	   }
	            	   else if(evento[op7] == evento[1]) {
		            		  
	            		   if(aluno2[119] == null) {
	            	  
	            	   
	            	   System.out.println("Preencha os dados do aluno.");
	                   System.out.println("Nome do aluno:");
	                   nomepessoa=scan.nextLine();
	                   System.out.println("Idade do aluno:");
	                   idade=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Sexo do aluno:");
	                   sexo=scan.nextLine();
	                   System.out.println("Semestre que o aluno esta cursando:");
	                   semestre=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Turma do aluno:");
	                   turma=scan.nextLine();
	                   System.out.println("Número de matricula do aluno:");
	                   matricula=scan.nextLine();
	            	   
	                   for(int i = 0; i < aluno2.length; i++) {
	                	   if(aluno2[i] == null) {
	                		    aluno2[i]= new Aluno(nomepessoa, idade, sexo, matricula, turma, semestre);
	                		    i = aluno2.length;
	                	   }
	                  
	                   }
	            	
	            	       }
	            		   else {
	            			   System.out.println("A quantidade máxima de alunos por palestra (120) já foi alcançada.");
	            		   }
	            	   
	            	   }
	            	   else if(evento[op7] == evento[2]) {
		            		  
	            		   if(aluno3[119] == null) {
	            	  
	            	   
	            	   System.out.println("Preencha os dados do aluno.");
	                   System.out.println("Nome do aluno:");
	                   nomepessoa=scan.nextLine();
	                   System.out.println("Idade do aluno:");
	                   idade=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Sexo do aluno:");
	                   sexo=scan.nextLine();
	                   System.out.println("Semestre que o aluno esta cursando:");
	                   semestre=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Turma do aluno:");
	                   turma=scan.nextLine();
	                   System.out.println("Número de matricula do aluno:");
	                   matricula=scan.nextLine();
	            	   
	                   for(int i = 0; i < aluno3.length; i++) {
	                	   if(aluno3[i] == null) {
	                		    aluno3[i]= new Aluno(nomepessoa, idade, sexo, matricula, turma, semestre);
	                		    i = aluno3.length;
	                	   }
	                  
	                   }
	            	
	            	       }
	            		   else {
	            			   System.out.println("A quantidade máxima de alunos por palestra (120) já foi alcançada.");
	            		   }
	            	   
	            	   }
	            	   else if(evento[op7] == evento[3]) {
		            		  
	            		   if(aluno4[119] == null) {
	            	   
	            	   
	            	   System.out.println("Preencha os dados do aluno.");
	                   System.out.println("Nome do aluno:");
	                   nomepessoa=scan.nextLine();
	                   System.out.println("Idade do aluno:");
	                   idade=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Sexo do aluno:");
	                   sexo=scan.nextLine();
	                   System.out.println("Semestre que o aluno esta cursando:");
	                   semestre=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Turma do aluno:");
	                   turma=scan.nextLine();
	                   System.out.println("Número de matricula do aluno:");
	                   matricula=scan.nextLine();
	            	   
	                   for(int i = 0; i < aluno4.length; i++) {
	                	   if(aluno4[i] == null) {
	                		    aluno4[i]= new Aluno(nomepessoa, idade, sexo, matricula, turma, semestre);
	                		    i = aluno4.length;
	                	   }
	                  
	                   }
	            	
	            	       }
	            		   else {
	            			   System.out.println("A quantidade máxima de alunos por palestra (120) já foi alcançada.");
	            		   }
	            	   
	            	   }
	            	   else if(evento[op7] == evento[4]) {
		            		  
	            		   if(aluno5[119] == null) {
	            	  
	            	   
	            	   System.out.println("Preencha os dados do aluno.");
	                   System.out.println("Nome do aluno:");
	                   nomepessoa=scan.nextLine();
	                   System.out.println("Idade do aluno:");
	                   idade=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Sexo do aluno:");
	                   sexo=scan.nextLine();
	                   System.out.println("Semestre que o aluno esta cursando:");
	                   semestre=scan.nextInt();
	                   scan.nextLine();
	                   System.out.println("Turma do aluno:");
	                   turma=scan.nextLine();
	                   System.out.println("Número de matricula do aluno:");
	                   matricula=scan.nextLine();
	            	   
	                   for(int i = 0; i < aluno5.length; i++) {
	                	   if(aluno5[i] == null) {
	                		    aluno5[i]= new Aluno(nomepessoa, idade, sexo, matricula, turma, semestre);
	                		    i = aluno5.length;
	                	   }
	                  
	                   }
	            	
	            	       }
	            		   else {
	            			   System.out.println("A quantidade máxima de alunos por palestra (120) já foi alcançada.");
	            		   }
	            	   
	            	   }
	            		  	            	  
	            	  
	    
	            	   
	            	   break;
	               case 6:
	            	   
	            	   j = 0;
	            	   w = 0;
		            	  
	            	   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
	            	   
	            	   System.out.println("Digite o número correspondente a palestra que você deseja ver os alunos cadastrados.");
	            	   
	            	   for(int i = 0; i < evento.length; i++) {
	            		   
	            		   if(evento[i] != null) {
	            		   System.out.println(j+"---"+evento[i].getNome());
	            		   j++;
	            		   }	   
	            	   }
	            	   
	            	   op8=scan.nextInt();
	            	   
	            	   if(evento[op8] == evento[0]) {
	            		  
	            		   if(aluno1[1] != null) {
	            			   for(int i = 0; i < aluno1.length; i++) {
	            				   if(aluno1[i] != null) {
	            				   System.out.println(w+"---"+aluno1[i].getNomepessoa());
	            				   w++;
	            				   }
	            			   }
	            			   
	                   
	            	
	            	       }
	            		   else {
	            			   System.out.println("Nenhum aluno foi listado para essa palestra ainda. Digite qualquer número para voltar as opções.");
	            			   segue2 = scan.nextInt();
	            			   break;
	            	   
	            	       }
	            	   }
	            	   else if(evento[op8] == evento[1]) {
		            		  
	            		   if(aluno2[1] != null) {
	            			   for(int i = 0; i < aluno2.length; i++) {
	            				   if(aluno2[i] != null) {
	            				   System.out.println(w+"---"+aluno2[i].getNomepessoa());
	            				   w++;
	            				   }
	            			   }
	            			   
	                   
	            	
	            	       }
	            		   else {
	            			   System.out.println("Nenhum aluno foi listado para essa palestra ainda. Digite qualquer número para voltar as opções.");
	            			   segue2 = scan.nextInt();
	            			   break;
	            	   
	            	       }
	            	   }
	            	   else if(evento[op8] == evento[2]) {
		            		  
	            		   if(aluno3[1] != null) {
	            			   for(int i = 0; i < aluno3.length; i++) {
	            				   if(aluno3[i] != null) {
	            				   System.out.println(w+"---"+aluno3[i].getNomepessoa());
	            				   w++;
	            				   }
	            			   }
	            			   
	                   
	            	
	            	       }
	            		   else {
	            			   System.out.println("Nenhum aluno foi listado para essa palestra ainda. Digite qualquer número para voltar as opções.");
	            			   segue2 = scan.nextInt();
	            			   break;
	            	   
	            	       }
	            	   }
	            	   else if(evento[op8] == evento[3]) {
		            		  
	            		   if(aluno4[1] != null) {
	            			   for(int i = 0; i < aluno4.length; i++) {
	            				   if(aluno4[i] != null) {
	            				   System.out.println(w+"---"+aluno4[i].getNomepessoa());
	            				   w++;
	            				   }
	            			   }
	            			   
	                   
	            	
	            	       }
	            		   else {
	            			   System.out.println("Nenhum aluno foi listado para essa palestra ainda. Digite qualquer número para voltar as opções.");
	            			   segue2 = scan.nextInt();
	            			   break;
	            	   
	            	       }
	            	   }
	            	   else if(evento[op8] == evento[4]) {
		            		  
	            		   if(aluno5[1] != null) {
	            			   for(int i = 0; i < aluno5.length; i++) {
	            				   if(aluno5[i] != null) {
	            				   System.out.println(w+"---"+aluno5[i].getNomepessoa());
	            				   w++;
	            				   }
	            			   }
	            			   
	                   
	            	
	            	       }
	            		   else {
	            			   System.out.println("Nenhum aluno foi listado para essa palestra ainda. Digite qualquer número para voltar as opções.");
	            			   segue2 = scan.nextInt();
	            			   break;
	            	   
	            	       }
	            	   }
	            	   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
	            	   System.out.println("Digite o número correspondente ao aluno para ver seus dados. Ou digite -1 para voltar as opções.");
	            	   op9 = scan.nextInt();
	            	  	            	   	            	   	            	
	            	   
	            	   if(op9 == -1){
            			   break;
            		   }
            	  
            		   System.out.println("Nome do Aluno:"+aluno1[op9].getNomepessoa());
            		   System.out.println("Idade do aluno:"+aluno1[op9].getIdade());
            		   System.out.println("Sexo do aluno:"+aluno1[op9].getSexo());
            		   System.out.println("Semestre que o aluno esta cursando:"+aluno1[op9].getSemestre());
            		   System.out.println("Turma do Aluno:"+aluno1[op9].getTurma());
            		   System.out.println("Número de matrícula do aluno:"+aluno1[op9].getMatricula());
            		   
            		   System.out.println("Digite qualquer número para voltar as opções.");
	            	   segue2 = scan.nextInt();
	            	   a=segue2;
	            	   if(a==segue2) {
	            		   
	            		  break;
	            	   }
	            		   
	            	  
	            	   
	            	   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
            		   System.out.println("Digite o número correspondente ao aluno, para ver os seus dados detalhadamente. Ou digite -1 para voltar as opções.");
            		   op9=scan.nextInt();
            		   if(op9 == -1) {
            			   break;
            		   }
            	  
            		   System.out.println("Nome do Aluno:"+aluno2[op9].getNomepessoa());
            		   System.out.println("Idade do aluno:"+aluno2[op9].getIdade());
            		   System.out.println("Sexo do aluno:"+aluno2[op9].getSexo());
            		   System.out.println("Semestre que o aluno esta cursando:"+aluno2[op9].getSemestre());
            		   System.out.println("Turma do Aluno:"+aluno2[op9].getTurma());
            		   System.out.println("Número de matrícula do aluno:"+aluno2[op9].getMatricula());
            		   
            		   System.out.println("Digite qualquer número para voltar as opções.");
	            	   segue2 = scan.nextInt();
	            	   a=segue2;
	            	   if(a==segue2) {
	            		   
	            		  break;
	            	   }
	            	   
            		   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}       
                               System.out.println("Digite o número correspondente ao aluno, para ver os seus dados detalhadamente. Ou digite -1 para voltar as opções.");
            		   op9=scan.nextInt();
            		   if(op9 == -1) {
            			   break;
            		   }
            	  
            		   System.out.println("Nome do Aluno:"+aluno3[op9].getNomepessoa());
            		   System.out.println("Idade do aluno:"+aluno3[op9].getIdade());
            		   System.out.println("Sexo do aluno:"+aluno3[op9].getSexo());
            		   System.out.println("Semestre que o aluno esta cursando:"+aluno3[op9].getSemestre());
            		   System.out.println("Turma do Aluno:"+aluno3[op9].getTurma());
            		   System.out.println("Número de matrícula do aluno:"+aluno3[op9].getMatricula());
            		   
            		   System.out.println("Digite qualquer número para voltar as opções.");
	            	   segue2 = scan.nextInt();
	            	   a=segue2;
	            	   if(a==segue2) {
	            		   
	            		  break;
	            	   }
                               
            		   for(int i = 0; i < 100; i++) {
		   					System.out.println("");
		   				}
                               System.out.println("Digite o número correspondente ao aluno, para ver os seus dados detalhadamente. Ou digite -1 para voltar as opções.");
            		   op9=scan.nextInt();
            		   if(op9 == -1) {
            			   break;
            		   }
            	  
            		   System.out.println("Nome do Aluno:"+aluno4[op9].getNomepessoa());
            		   System.out.println("Idade do aluno:"+aluno4[op9].getIdade());
            		   System.out.println("Sexo do aluno:"+aluno4[op9].getSexo());
            		   System.out.println("Semestre que o aluno esta cursando:"+aluno4[op9].getSemestre());
            		   System.out.println("Turma do Aluno:"+aluno4[op9].getTurma());
            		   System.out.println("Número de matrícula do aluno:"+aluno4[op9].getMatricula());
            		   
            		   System.out.println("Digite qualquer número para voltar as opções.");
	            	   segue2 = scan.nextInt();
	            	   a=segue2;
	            	   if(a==segue2) {
	            		   
	            		  break;
	            	   }

                               System.out.println("Digite o número correspondente ao aluno, para ver os seus dados detalhadamente. Ou digite -1 para voltar as opções.");
            		   op9=scan.nextInt();
            		   if(op9 == -1) {
            			   break;
            		   }
            	  
            		   System.out.println("Nome do Aluno:"+aluno5[op9].getNomepessoa());
            		   System.out.println("Idade do aluno:"+aluno5[op9].getIdade());
            		   System.out.println("Sexo do aluno:"+aluno5[op9].getSexo());
            		   System.out.println("Semestre que o aluno esta cursando:"+aluno5[op9].getSemestre());
            		   System.out.println("Turma do Aluno:"+aluno5[op9].getTurma());
            		   System.out.println("Número de matrícula do aluno:"+aluno5[op9].getMatricula());
            		   
            		   System.out.println("Digite qualquer número para voltar as opções.");
	            	   segue2 = scan.nextInt();
	            	   a=segue2;
	            	   if(a==segue2) {
	            		   
	            		  break;
	            	   }
	           
	           
	           
	            	   
	            	   
	            	   
	            	   
	            	   }//switch
	            	   
	            	   
	               
	               
	           
	           
	           
	           
	           
	           
	           }//while do bcod
	
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	   }//main
	}//classe da main