# notaFiscaelOnline-desafio-Em-Grupo-Catalisa
Desafio 02 do programa do Catalisa

Nome dos participantes:
- Rhaniel Farias
- Katia Dos Santos Queiroz
- Jhonatan Santos Tavares
- Kevin Richard

-Resolu��o do projeto :

1. Cria��o da classe abstrata usuario tendo como atributos: nome, email e cpf.
       Fechada para modifica��o (respeitandos os princ�pios do Solid)


2. Cria��o da classes modelo/filhas "Cliente" e "Vendedor"


3. Cria��o da Interface, onde cont�m os m�todos "cadastrarVendedor", "cadastrarClinte", "listarVendedor" e "listarCliente"


4. Cria��o da classe vendas, com os atributos:  dataDeRegistro e valor


 5. Cria��o da classe de composi��o: "controleRegistro",  onde dentro desta classe tem Arraylist:  vendedor, cliente e venda... e em seguinte ainda nesta classe a  m�todos para cadastro onde o vendedor, vai inserir os dados no qual vai existir uma condi��o para validar o cpf informado, caso o mesmo cpf j� esteja na lista, uma mensagem de erro ser� apresentada na tela.
 Em "controleRegistro" ha um m�todo "listarVendedores", onde a sua fun��o � exibir os vendedores cadastrados e existentes na lista, e seguindo o mesmo exemplo temos os m�todo: "cadastrarCliente" e listarCliente"


 6. Em "controleRegistro" ha um m�todo "cadastrarVenda" que executa o registro e valida conforme os requisitos (cpf informado), esse m�todo funciona ap�s a valida��o do cpf.
 Informa��o que � buscada na lista de vendedores e lista de clientes, atrav�s do  m�todo "procurarCpf"

 
7. Cria��o da Main para teste onde tamb�m tem um "switch" para acessar os m�todos atrav�s de um menu de op��es

