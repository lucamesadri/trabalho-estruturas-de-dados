import estruturas.Iterador;
import estruturas.Lista;
import estruturas.Vetor;

public class VetorApp {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        Lista lista = new Lista();
        
        /* 
        vetor.adicionar(2);
        vetor.adicionar(7);
        vetor.adicionar(9);
        vetor.adicionar(12);
        vetor.adicionar(16);
        vetor.adicionar(21);
        vetor.adicionar(27);
        vetor.adicionar(33);
        vetor.adicionar(42);
        vetor.adicionar(54);
        System.out.println("-----");
        vetor.buscabinaria(54);
        vetor.adicionaraoinicio(2);
        System.out.println("-----");*/
        lista.adicionarAoInicio(2);
        lista.adicionarAoInicio(7);
        lista.adicionarAoInicio(9);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(16);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(33);
        lista.adicionarAoInicio(42);
        lista.adicionaraofinal(54);
        System.out.println("-----");
        // lista.adicionarnovalor(10, 12);
        // lista.mostrarNos();
        // lista.numeroNos();
        // System.out.println(lista.tamanho);
        System.out.println("-----");  
        Iterador iterador = new Iterador(lista, lista.inicio);
        iterador.inserirAposAtual(89);
        lista.mostrarNos();
        iterador.inserirAntesAtual(77);
        lista.mostrarNos();
        iterador.removerAposAtual();
        lista.mostrarNos();
    }
}