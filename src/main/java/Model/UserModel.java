/**
 * @author Ana Karolyne da Silva
 * @author Danilo dos Santos Barbosa Martins
 * @author Jailson Jorge da Silva
 * @author João Vitor Araujo de Matos
 * @author Leonardo Feitosa da Silva
 * @author Luana Figueiredo de Andrade Caboz
 * @author Thomaz Gabriel Azevedo Oliveira  
 */

package Model;

public class UserModel {
    private String first_name;
    private String last_name;
    private String email;
    private String cpf;
    private int id;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
