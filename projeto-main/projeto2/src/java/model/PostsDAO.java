package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PostsDAO {
        private static Connection conn;
        
        public PostsDAO() throws ClassNotFoundException, SQLException {
            conn = MyConn.getConnection();
        }
        
        //Método para inserir dados
        public void insertPosts(Posts po) {
            //Query genérica para o método inserir
            String sql = "INSERT INTO posts(conteudo, data)"
                                + "VALUES(?, ?)";
            
            //Objeto para preparar o envio da query ao banco de dados
            try {
                PreparedStatement prep = conn.prepareStatement(sql);
                prep.setString(1, po.getconteudo());
                prep.setString(2, po.getdata());
                
                prep.execute();
                prep.close();
                
            } catch (SQLException erro) {
                System.out.println("Erro ao inserir..." + erro);
            }
        }//Fim do método inserir
        
        
        //Método para listar todos os registros
        public ArrayList<Posts> listPosts() throws SQLException{
            ArrayList<Posts> list = new ArrayList<>();
            
            String sql = "select * from posts";
            
            PreparedStatement prep = conn.prepareStatement(sql);
            ResultSet result = prep.executeQuery();
            
            while(result.next()){
              Posts p = new Posts();
              
              p.setCodPosts(result.getInt("cod_posts"));
              p.setConteudo(result.getString("conteudo"));
              p.setdata(result.getString("data"));
              
              list.add(p);
            }
            
            return list;
        }
        
        
        //Método para excluir
        public void deletePosts(int id) throws SQLException {
            String query = "DELETE FROM posts WHERE "
                    + "cod_posts = " + id;
            
            PreparedStatement prep = conn.prepareStatement(query);
            
            prep.execute();
            prep.close();
        }
        
        
        //Método para listar pelo ID (um registro)
        public Posts listOnePosts(int id) throws SQLException {
            String query = "SELECT * FROM posts WHERE "
                                                    + "cod_posts = " + id;
            
            PreparedStatement prep = conn.prepareStatement(query);
            ResultSet result = prep.executeQuery();
            
            Posts pos = new Posts();
            
            if(result.next()){
                pos.setCodPosts(result.getInt("cod_posts"));
                pos.setConteudo(result.getString("conetudo"));
                pos.setdata(result.getString("data"));
            }
            
            return pos;
        }
        
        
        //Método para atualizar um registro
        public void updatePosts(Posts p) throws SQLException {
            String sql = "UPDATE posts SET ceonteudo = ?,"
                    + "data = ? WHERE cod_posts = ?";
            
            PreparedStatement prep = conn.prepareStatement(sql);
            
            prep.setString(1, p.getconteudo());
            prep.setString(2, p.getdata());
            prep.setInt(4,p.getCodPosts());
            
            prep.execute();
            prep.close();
        }
        
}//Fim da classe