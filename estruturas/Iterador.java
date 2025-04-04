package estruturas;

public class Iterador {
    
    Lista lista;
    No atual;

    public Iterador(Lista lista, No atual) {
        this.lista = lista;
        this.atual = atual;
    }

    public Boolean haProximo() {
        return this.atual.proximo != null;
    }

    public Boolean haAnterior() {
        return this.atual.anterior != null;
    }

    public void proximo() {
        this.atual = atual.proximo;
    }

    public int getDadoAnterior() {
        return this.atual.anterior.dado;
    }

    public int getDadoProximo() {
        return this.atual.proximo.dado;
    }

    public int getDado() {
        return this.atual.dado;
    }

    public No getAtual() {
        return this.atual;
    }

    public No getAnterior() {
        return this.atual.anterior;
    }

    public No getProximo() {
        return this.atual.proximo;
    }


    public void resetar() {
        this.atual = this.lista.inicio;
    }

    public void display() {
        if (this.haAnterior()) {
            System.out.print("Anterior -> " + this.getDadoAnterior() + " | ");
        }

        System.out.print("No " + this.getDado());
        
        if (this.haProximo()) {
            System.out.println(" | Proximo -> " + this.getDadoProximo());
        }
        System.out.println("");
        this.proximo();
    }

    public void inserirAposAtual(int dado) {
        No novoNo = new No(dado);
        novoNo.anterior = getAtual();
        novoNo.proximo = getAtual().proximo;
    
        if (haProximo()) {
            getAtual().proximo.anterior = novoNo;
        }
    
        getAtual().proximo = novoNo;
    }

    public void removerAposAtual() {
        if (haProximo() != true) {
            return;
        }

    
        No noRemovido = getAtual().proximo;
        getAtual().proximo = noRemovido.proximo;
    
        if (noRemovido.proximo != null) {
            noRemovido.proximo.anterior = getAtual();
        }
    }

    public void inserirAntesAtual(int dado) {
        No novoNo = new No(dado);
        novoNo.proximo = getAtual();
        novoNo.anterior = getAtual().anterior;
    
        if (haAnterior() == false) {
            this.lista.inicio = novoNo;
        } else {
            getAtual().anterior.proximo = novoNo;
        }
    
        getAtual().anterior = novoNo;
    }
    
    public void removerAntesAtual() {
        if (haAnterior() == false){
            return;
        }
    
        No noRemovido = getAtual().anterior;
        getAtual().anterior = noRemovido.anterior;
    
        if (noRemovido.anterior != null) {
            noRemovido.anterior.proximo = getAtual();
        } else {
            this.lista.inicio = getAtual();
        }
    }
    
}