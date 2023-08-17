package entity;

import DAO.UsuarioDAO;

public class Usuario {
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String email;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Codigo Netto
    public void alter (String coluna, String newValue){
        switch(coluna){
            case "nome":
                this.nome = newValue;
                new UsuarioDAO().alterarUsuario(coluna, newValue, codigo);
                break;
            case "senha":
                this.senha = newValue;
                new UsuarioDAO().alterarUsuario(coluna, newValue, codigo);
                break;
            case "login":
                this.login = newValue;
                new UsuarioDAO().alterarUsuario(coluna, newValue, codigo);
                break;
            case "email":
                this.email = newValue;
                new UsuarioDAO().alterarUsuario(coluna, newValue, codigo);
                break;
            default:
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-= Erro de Alteração (usuario.java)=-=-=-=-=-=-=-=-=-=-=-=");
                break;
            
        }
    }

}
