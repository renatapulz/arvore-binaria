public class Main {
  public static void main(String[] args) {
    ArvoreBinaria arvore = new ArvoreBinaria();

    // Exemplo pra validar método calcularNosEsquerda (questao A)
    // No no1 = new No(1, null, null);
    // No no2 = new No(2, null, null);

    // No no3 = new No(3, no1, no2);
    // No no4 = new No(4, null, null);
    // No no5 = new No(5, no3, no4);
    // arvore.setRaiz(no5);

    // // Conta e imprimi na tela o número de nós da esquerda festiva
    // int count = arvore.calcularNosEsquerda();
    // System.out.println("O número de nós da esquerda festiva é: " + count);

    // Exemplo pra validar método imprimirArvoreComRecuo (questão B)
    No no1 = new No(111, null, null);
    No no2 = new No(444, null, null);
    No no3 = new No(333, no1, no2);
    No no4 = new No(999, null, null);
    No no5 = new No(888, null, no4);
    No no6 = new No(555, no3, no5);

    arvore.setRaiz(no6);

    // Imprimir a árvore
    arvore.imprimirArvoreComRecuo();
  }
}