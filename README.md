<p align="center">
  <a href="https://ant.design">
    <img width="200" src="https://loja.anhembionline.com.br/media/logo/stores/7/ANHEMBI.png">
  </a>
  <h1 align="center">A3 - Jogo da Velha </h1>
</p>

<p align="center"> Documentação Projeto Jogo da Velha A3
  
  <p align="center">
  <a href="#introdução">Introdução</a> •
  <a href="#desenvolvimento">Desenvolvimento</a> •
  <a href="#conclusão">Conclusão</a> •
  <a href="#ilustrações">Ilustrações</a> •
  <a href="#rodar-o-projeto">Rodar o Projeto</a> •
  <a href="#autores">Autores</a>
</p>

### Introdução

O jogo da velha consiste em um jogo onde você precisa colocar três símbolos iguais em uma linha reta. o tabuleiro é consiste em uma cerquilha onde cada jogador escolhe se quer ser o "X" ou o "O". Vocês vão se revezar colocando o seu símbolo nas lacunas vazias. O objetivo é fazer uma linha reta com os seus símbolos: pode ser na horizontal, na vertical ou na diagonal. Se ninguém conseguir fazer uma linha e todas as lacunas forem preenchidas, o jogo acaba em empate.
O principal objetivo desse projeto foi realizar a criação de uma plataforma que se comunicasse através de um servidor onde seria possivel jogar tanto com uma máquina randomica cliente/servidor, mas também contra outro jogador realizando a comunicação de cliente/cliente.
Foi realizado a escolha do jogo da velha devido a sua simplicidade e de conhecimento de todos por parte de suas regras. No decorrer deste documento, serão abordados os detalhes da implementação, incluindo a escolha das tecnologias a serem utilizadas, a arquitetura do sistema, os recursos oferecidos aos jogadores e os desafios técnicos envolvidos

### Desenvolvimento

Durante o desenvolvimento do projeto verificamos quais seriam os requisitos para a produção de um jogo da velha na linguagem de Java, após termos escolhido o jogo e verificar as instruções propostas pelo professor seguimos para parte de desenvolvimento onde buscamos realizar a estruturação do código via Jframe pois buscamos realizar algo interativo ao usuário.
Após termos escolhido a forma que realizaríamos a estrutura do projeto seguimos com a para a comunicação de servidor e cliente onde, inicialmente, a ideia principal foi gerar uma porta e IP fixos para rodar o projeto e começar a produzir o Back-end. Após a implementação do cliente/servidor por meio do método "Try" e "Catch" começamos a realizar a implementação da interface do usuário para que o mesmo conseguisse se comunicar com o servidor e obtesse uma resposta.
Durante a etapa de implementação da lógica para a validação de movimentos e armazenamento das informações utilizamos uma array para os jogadores e um método de armazenamento de dados em botões onde, ao jogar contra outro jogador, é possível receber as informações em tempo real de cada jogada e uma função de aviso caso o mesmo tente jogar caso não seja sua vez.
Durante o projeto buscamos melhorar a experiência do usuário utilizando elementos gráficos como tela de carregamento e um ambiente interativo por meio do Jframe e imagens para escolha do modo de jogo.

### Conclusão

Ao longo deste projeto, desenvolvemos um jogo da velha em Java, implementando um servidor e cliente para permitir partidas interativas, para garantir a validação dos movimentos e o armazenamento das informações, utilizamos uma matriz de botões e uma lógica para verificar a vez de cada jogador. Também adicionamos recursos visuais, como uma tela de carregamento e imagens para a escolha do modo de jogo, aprimorando a experiência do usuário.

O desenvolvimento deste projeto nos permitiu aplicar conceitos de programação em Java, desenvolvimento de interfaces gráficas e lógica de jogo. Enfrentamos desafios técnicos ao estabelecer a comunicação cliente/servidor e validar os movimentos, mas fomos capazes de superá-los com dedicação e resolução de problemas.
Em suma, o resultado final foi um jogo da velha interativo e funcional, que proporciona aos jogadores uma experiência divertida e envolvente. Este projeto nos permitiu aprimorar nossas habilidades de programação, continuaremos explorando novos projetos e expandindo nosso conhecimento em desenvolvimento de jogos e aplicações. Agradecemos a oportunidade de realizar este trabalho e buscaremos expandir nosso conhecimento a fim de cada vez mais desenvolver nossos projetos e aprimorar os já realizados.

### Ilustrações

<p align="center">
     <img alt="png" src="./Imagens Github/SplashScreen.png" height="250"/>
     <img alt="png" src="./Imagens Github/EscolherModo.png" height="250"/>
     <img alt="png" src="./Imagens Github/PcVsPlayer.png" height="250"/>
     <img alt="png" src="./Imagens Github/DoisJogadores.png" height="250"/>
     <img alt="png" src="./Imagens Github/Aviso.png" height="250"/>

</p>


### Rodar o Projeto

Navegue até o diretório Server e rode o Server.java

<p align="center">
     <img alt="png" src="./Imagens Github/RodarProjeto-1.png" height="300"/>

     O programa irá pedir que você insira o Ip e Porta, siga o exemplo 9191 e 127.0.0.1 e o servidor irá permitir conexões de clientes.
</p>

Logo após, navegue até o diretório Client e rode o Client.java

<p align="center">
     <img alt="png" src="./Imagens Github/RodarProjeto-2.png" height="300"/>

     Assim, insira o IP e Porta para se conectar o servidor. Assim você poderá jogar no modo JogadorVsComputador.
</p>

<p align="center">
     <img alt="png" src="./Imagens Github/RodarProjeto-3.png" height="300"/>

     Para jogar no modo dois jogadores você navegar até o diretório Server e rodar o ServerDoisJogadores.java, inserindo uma porta (Deve ser diferente da porta do Servidor anterior). 
</p>

<p align="center">
     <img alt="png" src="./Imagens Github/RodarProjeto-4.png" height="300"/>

     No aplicativo já aberto navegue até o menu JogadorVsJogador, e insira a porta do servidor dois jogadores, no nosso exemplo 1818. Dessa forma, quando dois jogadores se conectarem o jogo irá iniciar.
</p>



### Autores

* 12522135201 - Henrique Ferreira Marques Costa
* 12522142460 - João Nicolas Melo Dantas
* 12522142882 - Wesley Menezes
* 12522145054 - Vinicius Lordaro

<table align="center">
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/RickyMarq"><img src="https://avatars.githubusercontent.com/u/86681672?s=96&v=4" width="100px;" alt="Henrique Marques"/><br /><sub><b>Henrique M</b></sub></a><br /><a href="https://github.com/RickyMarq" </td>
     <td align="center" valign="top" width="14.28%"><a href="https://github.com/nicolasdantasss"><img src="https://avatars.githubusercontent.com/u/129739030?v=4" width="100px;" alt="Henrique Marques"/><br /><sub><b>Nicolas D</b></sub></ a><br /><a href="https://github.com/RickyMarq" </td>
     <td align="center" valign="top" width="14.28%"><a href="https://github.com/xxwelldone"><img src="https://avatars.githubusercontent.com/u/102559266?v=4" width="100px;" alt="Henrique Marques"/><br /><sub><b>Wesley M </b></sub></ a><br /><a href="https://github.com/RickyMarq" </td>
     <td align="center" valign="top" width="14.28%"><a href="https://github.com/Vlordaro"><img src="https://avatars.githubusercontent.com/u/106718023?v=4" width="100px;" alt="Henrique Marques"/><br /><sub><b>Vinicius L</b></sub></ a><br /><a href="https://github.com/RickyMarq" </td>
    </tr>
  </tbody>
</table> 
