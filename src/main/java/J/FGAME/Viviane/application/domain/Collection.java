package J.FGAME.Viviane.application.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Jogo_Viviane")
public class Collection {
    @Id
    private String email;
    private String name;
    private String password;
    private double score;
    private boolean acessoUnico;
    private int acesso;

    public Collection(String email, String name, String password, double score, boolean acessoUnico, int acesso) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.score = score;
        this.acessoUnico = acessoUnico;
        this.acesso = acesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isAcessoUnico() {
        return acessoUnico;
    }

    public void setAcessoUnico(boolean acessoUnico) {
        this.acessoUnico = acessoUnico;
    }

    public int getAcesso() {
        return acesso;
    }

    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", score=" + score +
                '}';
    }
}
