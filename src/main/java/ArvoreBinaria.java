public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    // Questão A:
    // public int calcularNosEsquerda() {
    // return calcularNosEsquerda(raiz);
    // }

    // private int calcularNosEsquerda(No no) {
    // if (no == null) {
    // return 0;
    // }

    // int count = 0;

    // if (no.getEsq() != null) {
    // count += 1;
    // }

    // count += calcularNosEsquerda(no.getEsq());
    // count += calcularNosEsquerda(no.getDir());

    // return count;
    // }

    // Questão B:
    public void imprimirArvoreComRecuo() {
        imprimirComRecuo(raiz, 0);
    }

    // Método auxiliar recursivo para imprimir com recuo
    private void imprimirComRecuo(No no, int nivel) {
        if (no == null) {
            System.out.println("    ".repeat(nivel) + "-");
            return;
        }

        System.out.println("    ".repeat(nivel) + no.getId());

        imprimirComRecuo(no.getEsq(), nivel + 1);
        imprimirComRecuo(no.getDir(), nivel + 1);
    }
}