package estruturas;

public class Lista {

    public No inicio;
    public int tamanho;

    public void Lista() {
        this.inicio = null;
    }

    public void adicionarAoInicio(int valor) {
        No no = new No(valor);

        if (this.inicio == null) {
            this.inicio = no;
            return;
        }

        this.inicio.anterior = no;

        no.proximo = this.inicio;
        this.inicio = no;
        this.tamanho++;
    }

    public void mostrarNos() {
        Iterador iterador = this.getIterador();
        
        while (iterador.getAtual() != null) {
            iterador.display();
        }
    }

    public void remover(int valor) {
        No noAux = this.inicio;

        while (noAux != null && noAux.dado != valor) {
            noAux = noAux.proximo;
        }

        if (noAux == null) {
            System.out.println("Valor não encontrado");
            return;
        }

        noAux.anterior.proximo = noAux.proximo;
        noAux.proximo.anterior = noAux.anterior;
        this.tamanho--;
    }

    public Iterador getIterador() {
        return new Iterador(this, this.inicio);
    }

    public void adicionaraofinal(int valor){
        No no = new No(valor);
        No noAux = this.inicio;
        while (noAux.proximo != null) {
            noAux = noAux.proximo;
            
        }
        noAux.proximo = no;
        noAux.anterior = noAux;
        this.tamanho++;
    }

    public void numeroNos() {
        int contador = 0;
        if (inicio == null) {
        System.out.println("Não há nós");
        } else {
            No temp = inicio;

        while (temp.proximo != null) {
            temp = temp.proximo;
            contador = contador + 1;
        }
        }
        System.out.println("Essa lista encadeada têm: " + contador + " nós");
    }

    public void adicionarnovalor(int valor, int informado){
        No no = new No(valor);
        No noAux = this.inicio;
        while (noAux.dado != informado) {
            noAux = noAux.proximo;
        }
        System.out.println(noAux.dado
        );
        System.out.println(no.dado);
        no.proximo = noAux.proximo;
        no.proximo.anterior = no;
        noAux.proximo = no;

    }

}
