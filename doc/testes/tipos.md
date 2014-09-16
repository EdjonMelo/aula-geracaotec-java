Tipos de Testes
===

Teste de unidade
---
Também conhecida como teste unitário ou teste de módulo, é a fase em que se testam as menores unidades de software desenvolvidas (pequenas partes ou unidades do sistema). O universo alvo desse tipo de teste são as subrotinas, métodos, classes ou mesmo pequenos trechos de código. Assim, o objetivo é o de encontrar falhas de funcionamento dentro de uma pequena parte do sistema funcionando independentemente do todo.

- <a href="http://junit.org/" target="_blank">http://junit.org/</a>

Teste de integração
---
Na fase de teste de integração, o objetivo é encontrar falhas provenientes da integração interna dos componentes de um sistema. Geralmente os tipos de falhas encontradas são de transmissão de dados. Por exemplo, um componente A pode estar aguardando o retorno de um valor X ao executar um método do componente B; porém, B pode retornar um valor Y, gerando uma falha. Não faz parte do escopo dessa fase de teste o tratamento de interfaces com outros sistemas (integração entre sistemas). Essas interfaces são testadas na fase de teste de sistema, apesar de, a critério do gerente de projeto, estas interfaces podem ser testadas mesmo antes de o sistema estar plenamente construído.

Teste de sistema
---
Na fase de teste de sistema, o objetivo é executar o sistema sob ponto de vista de seu usuário final, varrendo as funcionalidades em busca de falhas em relação aos objetivos originais. Os testes são executados em condições similares – de ambiente, interfaces sistêmicas e massas de dados – àquelas que um usuário utilizará no seu dia-a-dia de manipulação do sistema. De acordo com a política de uma organização, podem ser utilizadas condições reais de ambiente, interfaces sistêmicas e massas de dados.

- http://casperjs.org/
- http://www.seleniumhq.org/

Teste de aceitação
---
Geralmente, os testes de aceitação são realizados por um grupo restrito de usuários finais do sistema, que simulam operações de rotina do sistema de modo a verificar se seu comportamento está de acordo com o solicitado. Teste formal conduzido para determinar se um sistema satisfaz ou não seus critérios de aceitação e para permitir ao cliente determinar se aceita ou não o sistema. Validação de um software pelo comprador, pelo usuário ou por terceira parte, com o uso de dados ou cenários especificados ou reais. Pode incluir testes funcionais, de configuração, de recuperação de falhas, de segurança e de desempenho.

- <a href="http://cukes.info/" target="_blank">http://cukes.info/</a>

Teste de operação
---
Nessa fase o teste é conduzido pelos administradores do ambiente final em que o sistema ou software entrará em ambiente produtivo. Vale ressaltar que essa fase é aplicável somente a sistemas de informação próprios de uma organização, cujo acesso pode ser feito interna ou externamente a essa organização. Nessa fase de teste devem ser feitas simulações para garantir que a entrada em produção do sistema será bem sucedida. Envolve testes de instalação, simulações com cópia de segurança dos bancos de dados, etc.. Em alguns casos um sistema entrará em produção para substituir outro e é necessário garantir que o novo sistema continuará garantindo o suporte ao negócio.

Teste de volume
---
Testa o comportamento do sistema operando com o volume “normal”  de dados  e transações envolvendo o banco de dados durante um longo período de tempo.

Teste de performance
---
O teste de performance se divide em 3 tipos:

- Teste de carga: Testa o software  sob as condições normais de uso. Ex.: tempo de resposta, número de transações por minuto, usuários simultâneos, etc.
- Teste de stress: Testa o software sob condições extremas de uso. Grande volume de transações e usuários simultâneos. Picos excessivos de carga em curtos períodos de tempo.
- Teste de estabilidade: Testa se o sistema se mantém funcionando de maneira satisfatória após um período de uso.


Testes de caixa branca e caixa preta
---
Basicamente, teste de caixa branca envolve o código e o de caixa-preta, não.

Teste de regressão
---
Reteste de um sistema ou componente para verificar se alguma modificação recente causou algum efeito indesejado e para certificar que o sistema ainda atende aos requisitos.

- <a href=" https://travis-ci.org/sass/libsass/builds" target="_blank">https://travis-ci.org/sass/libsass/builds</a>
- <a href="https://travis-ci.org/rossan/mongoose-history" target="_blank">https://travis-ci.org/rossan/mongoose-history</a>
- <a href="http://jenkins-ci.org/" target="_blank">http://jenkins-ci.org/</a>

Teste de manutenção
---
Testa se a mudança de ambiente não interferiu no funcionamento do sistema.

Testes alfa e beta
---
Em casos especiais de processos de desenvolvimento de software – sistemas operacionais, sistemas gerenciadores de bancos de dados e outros softwares distribuídos em escala nacional e internacional – os testes requerem fases também especiais antes do produto ser disponibilizado a todos os usuários.

O período entre o término do desenvolvimento e a entrega é conhecido como fase alfa e os testes executados nesse período, como testes alfa.

Candidato a lançamento
---
Ultimamente, e principalmente na comunidade de software livre, é comum utilizar o termo candidato a lançamento (release candidate) para indicar uma versão que é candidata a ser a versão final, em função da quantidade de erros encontradas. Tais versões são um passo além do teste beta, sendo divulgadas para toda a comunidade.



<br/>

*Ref.*
---
https://pt.wikipedia.org/wiki/Teste_de_unidade
http://crowdtest.me/tipos-teste-software/