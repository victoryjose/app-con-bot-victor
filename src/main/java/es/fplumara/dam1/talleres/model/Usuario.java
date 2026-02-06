package es.fplumara.dam1.talleres.model;

public class Usuario {

    private Long id;

    private Perfil perfil;

    private String discordUserId;

    private String curso;

    private String email;

    public Usuario(Perfil perfil, String discordUserId, String curso, String email) {
        this.perfil = perfil;
        this.discordUserId = discordUserId;
        this.curso = curso;
        this.email = email;
    }

    public Usuario (){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getDiscordUserId() {
        return discordUserId;
    }

    public void setDiscordUserId(String discordUserId) {
        this.discordUserId = discordUserId;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
