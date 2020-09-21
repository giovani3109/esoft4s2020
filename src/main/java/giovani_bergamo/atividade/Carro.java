package giovani_bergamo.atividade;

import java.util.ArrayList;

public class Carro {
    private String nome;
    private double ano;
    private String cor;
    
    public Carro(){

    }

    public Carro(String nome, double ano, String cor){
        this.nome = nome;
        this.valor = ano;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + " Ano: " + ano + " Cor: " + cor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor(){
        return ano;
    }

    public void setano(double ano){
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

}