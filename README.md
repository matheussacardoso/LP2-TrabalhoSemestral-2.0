# LP2-TrabalhoSemestral-2.0

## EXPLICAÇÃO DAS FUNÇÕES CRIADAS NA APLICAÇÃO

Os pacotes e as classes criadas no projeto foram baseadas em um padrão de arquitetura chamado camada MVC (Model, View, Controller). 

É um padrão de arquitetura de software que separa sua aplicação em 3 camadas: “a camada de interação do usuário (View),  camada de manipulação dos dados (Model) e a camada de controle(Controller). [7]” 

Ou seja, é uma maneira mais organizada de construir aplicações web. Vale ressaltar que, muitos frameworks (estruturas compostas por um conjunto de códigos genéricos) possuem funções, bibliotecas que facilitam a implementação desse padrão MVC, portanto é de suma importância seu uso.

1. Model: responsável pela leitura e escrita de dados, e também de suas validações. 
2. View: exibição dos dados, sendo ela por meio de uma página HTML ou XML. 
3. Controller: Seus métodos chamados actions são responsáveis por uma página, controlando qual model usar e qual view será mostrado ao usuário.

No projeto foi aplicado isso por meio do Spring Boot, framework Java Open Source com foco em aplicações web. Levando em conta o padrão MVC, criamos 3 pacotes: Model, View e Controller.

1. O pacote Model possui as classes Java com os objetos que serão criados ao longo da aplicação. Nessas classes, esses objetos se transformarão em uma tabela com a utilização de uma dependência chamada JPA. “Ela é um framework ORM (Mapeamento Objeto-Relacional), responsável por abstrair um banco de dados relacional, permitindo que você trabalhe como se fosse um banco de dados orientado a objetos[8].”

2. O pacote View (representado pela src/main/resources) possui páginas HTML com o intuito de exibir todas as informações necessárias para que o usuário possa utilizar a aplicação. No projeto, foi utilizado conceitos de interação humano-máquina para construir interfaces que fossem de fácil uso e coesas.
O pacote Controller possui todos métodos get e post da aplicação que servem, principalmente, para enviar dados ou consultar dados do banco por meio de requisições HTTP.

Além disso, foram criados 2 pacotes para funcionamento da integração entre o banco e a aplicação. 

1. O primeiro foi o pacote repository, responsável pela criação de consultas a partir de uma interface chamada JPAREPOSITORY, onde possui várias funções para criar as consultas [9].

2. O segundo pacote foi o service, o qual pertence à camada de serviço da aplicação.

## REFERÊNCIAS
[7] https://tableless.com.br/mvc-afinal-e-o-que/  (O que é MVC?)

[8] https://www.devmedia.com.br/jpa-e-hibernate-acessando-dados-em-aplicacoes-java/32711 (JPA e Hibernate: Acessando dados em aplicações Java)

[9] https://blog.algaworks.com/spring-data-jpa/ (O que é Spring Data JPA?)
