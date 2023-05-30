package model;

public class Posts {
        private int codPosts;
        private String conteudo;
        private String data;

    public Posts(){}    
        
    public Posts(String conteuto, String data) {
        this.conteudo = conteudo;
        this.data = data;
    }
    
    public Posts(int id, String conteudo, String data) {
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

    public String getconteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getdata() {
        return data;
    }

    public void setdata(String data) {
        this.data = data;
    }
    
}