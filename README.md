
<a id="readme-top"></a>

![Finalziado](http://img.shields.io/static/v1?label=STATUS&message=FINALIZADO&color=GREEN&style=for-the-badge)

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="https://github.com/user-attachments/assets/fc0a3d32-975f-4bee-9384-1633d955b247" alt="Logo" width="80" height="80">
  </a>


  <h3 align="center">Projeto - Sistema Bancario</h3>

  <p align="center">
    Criação de um projeto (em Java 17) para representar um sistema bancário utilizando threads e os conceitos vistos em sala na matéria de Programação Concorrente e Distribuída. :octocat:
    <br />
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Sumário</summary>
  <ol>
    <li>
      <a href="#sobre-o-projeto-">Sobre o Projeto</a>
      <ul>
        <li><a href="#desenvolvido-com">Desenvolvido com:</a></li>
      </ul>
    </li>
    <li>
      <a href="#configurando-projeto-localmente">Configurando Projeto Localmente</a>
      <ul>
        <li><a href="#pré-requisitos">Pré-requisitos</a></li>
        <li><a href="#instalação">Instalação</a></li>
      </ul>
    </li>
    <li><a href="#uso">Uso</a></li>
    <li><a href="#criado-por">Criado por:</a></li>
    <li><a href="#licença">Licença</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## Sobre o Projeto: 📁

O sistema contem as seguintes classes:
* Banco;
* Loja (2 no total);
* Funcionário (4 no total, 2 por loja);
* Cliente (10 no total);
* Conta (1 para cada cliente e loja e 2 por funcionário);

Cada cliente:
* É uma thread;
* Possuir uma conta com um saldo inicial de R$ 2.000,00;
* Realiza 2 compras em cada loja (4 compras no total);
* Cada compra têm um valor aleatório entre R$ 200,00 e R$ 500,00.

Cada loja:
* Possui uma conta, para receber os pagamentos dos clientes;
* Paga os funcionários assim que possui o valor dos seus salários (R$ 1.400,00);
  
Cada funcionário:
* É uma thread;
* Possuir duas contas, uma para receber o salário da loja e outra de investimentos;
* As contas iniciam zeradas;
* Investem 20% do salário na conta de investimentos logo após seu recebimento.

O banco:
* Intermedia as transações de forma síncrona e coordenada, garantindo a consistência dos saldos das contas.
* Além disso, o sistema exibe o valor das transferências e o saldo final de cada conta, garantindo que os saldos estejam consistentes ao fim da execução, independente da ordem em que as transações são feitas

<p align="right">(<a href="#readme-top">voltar ao inicio</a>)</p>

### Desenvolvido com: 
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/eclipse/eclipse-original-wordmark.svg" width="150px"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="150px"/>




          
          
          

<p align="right">(<a href="#readme-top">voltar ao inicio</a>)</p>



<!-- GETTING STARTED -->
## Configurando Projeto Localmente

### Pré-requisitos

Nesse progeto foi utilizado: 
* eclipse (como IDE) 
* Java 17

### Instalação
1. Instale o eclipse: https://www.eclipse.org/downloads/packages/installer
2. Clone o repositório
   ```sh
   git clone https://github.com/AnderMath7/Projeto-Sistema-Bancario.git
   ```
3. Abra o projeto no eclipse:
   <br>
   No eclipse, vá em:
   ```sh
   File --> Open Project from Fyle System...
   ```
   Selecione a pasta do projeto.
4. Execute a classe Banco
   
<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Uso

Esse projeto serve para estudo do uso de Threads e um dos exemplos de como elas podem ser usadas e funcionam de maneira prática.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


### Criado por:

|[<img src="https://avatars.githubusercontent.com/u/112136979?v=4" width=115><br><sub> Matheus Anderson </sub>](https://github.com/AnderMath7)|
| :---: |

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## Licença

[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
