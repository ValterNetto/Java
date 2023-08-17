import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

         

        new UsuarioDAO().deleteAll();

        Usuario u = new Usuario();
        u.setCodigo(1);
        u.setNome("Deverlyn");
        u.setLogin("dev");
        u.setSenha("1234");
        u.setEmail("deverlyn@gmail.com");

        // Código Netto
        Usuario u2 = new Usuario();
        //u2.setCodigo(2);
        u2.setNome("Flavia");
        u2.setLogin("mae");
        u2.setSenha("12345");
        u2.setEmail("flawia@gmail.com");

        Usuario u3 = new Usuario();
        //u3.setCodigo(3);
        u3.setNome("Netto");
        u3.setLogin("valter");
        u3.setSenha("123456");
        u3.setEmail("netto@gmail.com");

        
        new UsuarioDAO().cadastrarUsuario(u);
        new UsuarioDAO().cadastrarUsuario(u2);
        new UsuarioDAO().cadastrarUsuario(u3);
        //new UsuarioDAO().cadastrarUsuario(u4);
        
        u2.alter("nome", "Nome Alterado");
        
    }


}
