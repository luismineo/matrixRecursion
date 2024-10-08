# Imprimir matriz recursivamente

## Relatório:

- Primeiramente começei imprimindo a matriz, chamando a matriz já instanciada, e passando a linha e coluna como 0. Dessa forma imprimindo o primeiro elemento;
- Para percorrer, me baseei nos métodos para percorrer uma árvore binária, onde primeiro imprimia o elemento, e depois chamava o método recursivamente decidindo para que lado iria, neste caso, para qual linha/coluna;
- Com isso criei a primeira condição, onde se o índice da coluna atual for menor que a quantidade de colunas totais, significa que ainda estou na primeira linha;
- Então dentro desta condicional, eu chamo o método recursivamente passando a mesma linha, porém incrementando a coluna;
- Assim eu conseguia imprimir a primeira linha;
- Depois disso parti para uma forma de ir para a próxima linha, e cheguei na condição de que, se o índice da coluna atual for igual ao número de colunas, significa que passamos em 1 os índices existentes de colunas;
- Assim, significando que já imprimimos todos os elementos da primeira linha;
- Com isso, dentro desta condicional adicionei um println vazio, apenas para pular uma linha no terminal, e chamei novamente o método recursivamente;
- Agora passando o índice da linha mais 1, para ir para a próxima linha, e o índice da coluna como 0, para assim "resetar" a contagem de colunas;
- Dessa forma conseguia percorrer toda a matrix e imprimi-la;
- A partir daí pensei na condição de parada, usando a mesma lógica para trocar de coluna, porém agora com as linhas;
- Se o índice da linha atual, for igual ao número de linhas na matriz, significa que passamos em 1 o número de índices possíveis para as linhas, ou seja já passamos por todas as linhas com valores;
- Então, nesta condicional apenas retornamos o método, voltando assim completando a stack de chamadas recursivas, sem imprimir nada, pois as impressões já ocorreram.

**No método de impressão tem uma chamada de método após imprimir um valor, mas serve apenas para alinhar os elementos no terminal, assim deixa uma melhor vizualição. O método é apenas um monte de condicionais que imprimem espaços vazios dependendo do número de caracteres do valor na posição.**
