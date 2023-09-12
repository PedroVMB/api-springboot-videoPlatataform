package api.video_plataform.domain.professor;

public record DadosListagemProfessor(Long id, String nome, String email, String senha) {
    public DadosListagemProfessor(Professor professor){
        this(professor.getId(), professor.getNome(), professor.getEmail(), professor.getSenha());
    }
}
