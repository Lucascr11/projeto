package model;

public class Posts {
        private int codPosts;
        private Text conteudo;
        private Date data;

    public Posts(){}    
        
    public Posts(Text conteuto, Date data) {
        this.conteudo = conteudo;
        this.data = data;
    }
    
    public Posts(int id, Text conteudo, Date data) {
        this.codPosts = id;
        this.conteudo = conteudo;
        this.data = data;
    }

    public int getCodPosts() {
        return codPosts;
    }

    public void setCodPosts(int codPosts) {
        this.codPosts = codPosts;
    }

    public Text getconteudo() {
        return conteudo;
    }

    public void setConteudo(Text conteudo) {
        this.conteudo = conteudo;
    }

    public int getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}