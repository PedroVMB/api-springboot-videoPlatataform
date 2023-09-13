package api.video_plataform.domain.administrador;

import api.video_plataform.domain.aluno.Aluno;

public record DadosListagemAdministrador(Long id, String nome, String email, String senha) {
    public DadosListagemAdministrador(Administrador administrador){
        this(administrador.getId(), administrador.getNome(), administrador.getEmail(), administrador.getSenha());
    }
}
