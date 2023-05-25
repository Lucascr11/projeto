package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostsDAO {
        private static Connection conn;
        
        public PostsDAO() throws ClassNotFoundException, SQLException {
            conn = MyConn.getConnection();
        }
        
        //Método para inserir dados
        public void insertPosts(Posts transp) {
            //Query genérica para o método inserir
            String sql = "INSERT INTO transportes(tipo, assentos)"
                                + "VALUES(?, ?, ?)";
            
            //Objeto para preparar o envio da query ao banco de dados
            try {
                PreparedStatement prep = conn.prepareStatement(sql);
                prep.setDate(1, posts.getData());
                prep.setText(2, posts.getConteudo());
                
                prep.execute();
                prep.close();
                
            } catch (SQLException erro) {
                System.out.println("Erro ao inserir..." + erro);
            }
        
        //Método para excluir
        public void deletePosts(int id) throws SQLException {
            String query = "DELETE FROM posts WHERE "
                    + "cod_posts = " + id;
            
            PreparedStatement prep = conn.prepareStatement(query);
            
            prep.execute();
            prep.close();
        }
        
        //Método para atualizar um registro
        public void updatePosts(Posts t) throws SQLException {
            String sql = "UPDATE posts SET tipo = ?,"
                    + "WHERE id_post = ?";
            
            PreparedStatement prep = conn.prepareStatement(sql);
            
            prep.setInt(1, t.getId_post());
            prep.setDate(2, t.getData());
            prep.setText(3, t.getConteudo());
            
            prep.execute();
            prep.close();
        }
        
}//Fim da classe