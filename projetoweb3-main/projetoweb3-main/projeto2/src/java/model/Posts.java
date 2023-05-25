package model;

public class Posts {
        private int codTransporte;
        private Text conteudo;
        private date data;

    public Posts(){}    
        
    public Posts(Text conteudo, date data) {
        this.conteudo = conteudo;
        this.data = data;
    }
    
    public Posts(int id, Text conteudo, date data) {
        this.codTransporte = id;
        this.conteudo = conteudo;
        this.data = data;
    }

    public int getCodid_posts() {
        return codTransporte;
    }

    public void setCodId_posts(int codTransporte) {
        this.codTransporte = codTransporte;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(Text conteudo) {
        this.conteudo = conteudo;
    }

    public int getData() {
        return data;
    }

    public void setData(date data) {
        this.data = data ;
    }
    
}