package uri1023.drought;

public class NoCasa implements Comparable<NoCasa>{
    
    private int pessoas;
    private int consumo;
    private double consumomedio;
    private NoCasa noProximo;
    private NoCasa noPrevio;

    public NoCasa(int pessoas, int consumo, double consumomedio){
        this.pessoas = pessoas;
        this.consumo = consumo;
        this.consumomedio = consumomedio;

    }

    public NoCasa(){
        
    }

    public int getPessoas(){
        return pessoas;
    }

    public void setPessoas(int pessoas){
        this.pessoas = pessoas;
    }

    public int getConsumo(){
        return consumo;
    }

    public void setConsumo(int consumo){
        this.consumo = consumo;
    }

    public double getConsumoMedio(){
        return consumomedio;
    }

    public void setConsumoMedio(double consumomedio){
        this.consumomedio = consumomedio;
    }

    public NoCasa getNoProximo(){
        return noProximo;
    }

    public void setNoProximo(NoCasa noProximo){
        this.noProximo = noProximo;
    }

    public NoCasa getNoPrevio(){
        return noPrevio;
    }

    public void setNoPrevio(NoCasa noPrevio){
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString(){
        return "NoDuplo{"+
                "pessoas=" + pessoas +
                "consumo=" + consumo +
                "consumo medio=" + consumomedio +
                '}';
    }
    
    // Ordem crescente de ordenação
    @Override
    public int compareTo(NoCasa o) {
        if(this.consumomedio > o.consumomedio){
            return 1;
        }
        else if(this.consumomedio < o.consumomedio){
            return -1;
        }
        else{
            return 0;
        }
    }}
/*
public int compareTo(Casa casa){
        
        if(this.consumo_medio > casa.consumo_medio){
            return 1;
        }
        else if(this.consumo_medio < casa.consumo_medio){
           return -1;
        }
        else{
            return 0;
        }
        
    }
*/