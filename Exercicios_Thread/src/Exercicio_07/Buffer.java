package Exercicio_07;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marih Bianchini
 */


public class Buffer {
    private List<Atualizacao> atualizacoes;
    
    public Buffer(){
        atualizacoes = new ArrayList<>();
    }
    
    public synchronized boolean temAtualizacao() {
        return(atualizacoes.size() > 0);
    }

    public synchronized Atualizacao getAtualizacao() {
        if(atualizacoes.size() > 0)
            return atualizacoes.remove(0);
        return null;
    }

    public synchronized void addAtualizacao(Atualizacao at) {
        atualizacoes.add(at);
    }
    
    
    
}
