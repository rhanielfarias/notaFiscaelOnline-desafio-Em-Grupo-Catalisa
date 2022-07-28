# notaFiscaelOnline-desafio-Em-Grupo-Catalisa
Desafio 02 do programa do Catalisa

Nome dos participantes:
- Rhaniel Farias
- Katia Dos Santos Queiroz
- Jhonatan Santos Tavares
- Kevin Richard

-Resolução do projeto :

1. Criação da classe abstrata usuario tendo como atributos: nome, email e cpf.
       Fechada para modificação (respeitandos os princípios do Solid)


2. Criação da classes modelo/filhas "Cliente" e "Vendedor"


3. Criação da Interface, onde contém os métodos "cadastrarVendedor", "cadastrarClinte", "listarVendedor" e "listarCliente"


4. Criação da classe vendas, com os atributos:  dataDeRegistro e valor


 5. Criação da classe de composição: "controleRegistro",  onde dentro desta classe tem Arraylist:  vendedor, cliente e venda... e em seguinte ainda nesta classe a  métodos para cadastro onde o vendedor, vai inserir os dados no qual vai existir uma condição para validar o cpf informado, caso o mesmo cpf já esteja na lista, uma mensagem de erro será apresentada na tela.
 Em "controleRegistro" ha um método "listarVendedores", onde a sua função é exibir os vendedores cadastrados e existentes na lista, e seguindo o mesmo exemplo temos os método: "cadastrarCliente" e listarCliente"


 6. Em "controleRegistro" ha um método "cadastrarVenda" que executa o registro e valida conforme os requisitos (cpf informado), esse método funciona após a validação do cpf.
 Informação que é buscada na lista de vendedores e lista de clientes, através do  método "procurarCpf"

 
7. Criação da Main para teste onde também tem um "switch" para acessar os métodos através de um menu de opções

