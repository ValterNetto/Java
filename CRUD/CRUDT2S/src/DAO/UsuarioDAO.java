package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO crudtabela (IDUSUARIO, NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, usuario.getCodigo());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getLogin());
            ps.setString(4, usuario.getSenha());
            ps.setString(5, usuario.getEmail());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("----------------- Erro no cadastro --------------------");
        }

        // Código Netto
    }

    public void deletarUsuario(Usuario usuario) {
        String sql = "DELETE FROM crudtabela WHERE idusuario = (?) OR nome = (?) OR login = (?) OR email = (?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, usuario.getCodigo());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getLogin());
            ps.setString(4, usuario.getEmail());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("================= Erro ao deletar unico =================");
        }

    }

    public void deletarUsuario(int x) {
        String sql = "DELETE FROM crudtabela WHERE idusuario = (?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, x);

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("================= Erro ao deletar por codigo =================");
        }

    }

    public void alterarUsuario(String coluna, String newValue, int codigo) {
        String sql = "UPDATE crudtabela SET " + coluna + " = ? WHERE idusuario = ?";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, newValue);
            ps.setInt(2, codigo);

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("-=-=-=-=-=-=-=-=-=- Erro na Alteração(dao.java) -=-=-=-=-=-=-=-=-=-=-");
        }
    }

    public void deleteAll() {
        String sql = "DELETE FROM crudtabela WHERE idusuario <> 0;";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("-=-=-=-=-=-=-=-=-=- Erro ao Deletar todos -=-=-=-=-=-=-=-=-=-=-");
        }
    }

}
