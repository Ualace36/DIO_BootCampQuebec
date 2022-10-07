Projeto_BancoDigital


No Projeto BancoDigital além das classes de Banco, Conta, IConta(interface), Cliente, ContaPoucpança e ContaCorrente, adicionei as classes de Endereco e ContaTeste.
Por meio da class Endereco pude associar o cliente com seu endereço. Por outro lado, a class ContaTeste possibilitou-me testar e debugar os métodos de SAQUE(), DEPOSITO(), TRANSFERIR() e  o de ObterSaldo(). Além dessa melhorias, implementei as validações nos metódos, a fim de eliminar inconsistência, por exemplo, sacar um valor maior que o que possue no saldo.

🚀Começando
Para fazer uma cópia do projeto vá até a branch main pelo terminal do git e faça um comando pull no seu repositório local ou pode navegar pelos os arquivos na branch em questão, pelo o gitHub e baixa-los diretamente. Porém, nesse caso será necessário baixa as dependencias do arquivo pom.xml para poder rodar o projeto como as dependencias do JUnit para teste unitários.

Consulte Implantação para saber como implantado o projeto.

📋Pré-requisitos
De que coisas você precisa para instalar o software e como instalá-lo?
Primeiro baixe o jdk do java.
verifique os pre-requesito para o seu sistema operacional, a saber:

Windowsx64: 
152,33 MB https://download.oracle.com/java/18/archive/jdk-18.0.2.1_windows-x64_bin.msi

Linux Arm 64:
172,70 MB https://download.oracle.com/java/18/archive/jdk-18.0.2.1_linux-aarch64_bin.tar.gz

macOS Arm 64:
168,42 MB https://download.oracle.com/java/18/archive/jdk-18.0.2.1_macos-aarch64_bin.tar.gz

Proxima etapa, baixe uma IDE da sua preferência.
🔧No meu caso estou usando a intellij, por isso, irei por o link dessa IDE para Download, a saber:
Windows: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windowsZip
Linux: https://www.jetbrains.com/idea/download/download-thanks.html?platform=linux
MacOS: https://www.jetbrains.com/idea/download/download-thanks.html?platform=mac

Após seguirem as etapas de Download tanto do arquivo JDK e da IDE você terá um ambiente preparado para rodar o sistema do bancoDigital


⚙️Executando os testes
Nesse sistema utlizamos o teste unitário JUnit.

🔩Analise os testes de ponta a ponta
Empregamos os testes unitários aos metódos de saque(), Transferir(), depositar() e otberSaldo() na class ContaTeste. Os mótivos são de ordem de segurança e consistencia.

 exemplos
⌨️Empregamos o teste para verificar se no metodo de tranferencia a opereção ocorria de maneira consistente, ou seja, se a conta A depósita x a conta B, agora o saldo de A é igual Saldo - x. Por outro lado, o saldo de B é Saldo + x.

Dar exemplos
📦Implantação de Validação
validamos todos os metodos já citados, a fim de eliminar a inconsistência do sistema.
Por exemplo, se o Saldo do Banco A é R$ 100, o mesmo não poderá fazer um saque ou uma tranferência de um valor superior

🛠️Construído com
O ambiente de desenvolvimento foi a IDE Intellij, JAVA version 18, projeto Maven. Para testes unitários foi utilizado o JUnit.
git para controle de versionamento

Maven - Gerente de Dependência

🖇️Colaborando
Por favor, leia o COLABORACAO.md para obter detalhes sobre o nosso código de conduta e o processo para nos enviar pedido de solicitação.

📌Versão
Nós usamos o git para controle da versão. 

✒️Autores
Ualace Santos

Desenvolvedor responsável por todas as etapas de desenvolvimento.
📄Licença
Este projeto está sob a licença (sua licença) - veja o arquivo LICENSE.md para detalhes.

🎁Gratidão

Muito agradecido pelo o BootCamp Québec Java DIgital por proporcionar a pessoas como eu a conseguir seu protagonismo através de projetos práticos como este que o desafia e no final temos a certeza que somos sim capazes de propor soluções e resolver problemas🫂.
