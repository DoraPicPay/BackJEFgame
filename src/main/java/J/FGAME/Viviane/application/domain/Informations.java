package J.FGAME.Viviane.application.domain;

public class Informations {
    private String email;
    private String name;
    private String password;
    private double score;
    private boolean acessoUnico;
    private int acesso;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public double getScore() {
        return score;
    }

    public boolean isAcessoUnico() {
        return acessoUnico;
    }

    public int getAcesso() {
        return acesso;
    }

    @Override
    public String toString() {
        return "Informations{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", score=" + score +
                '}';
    }
}
