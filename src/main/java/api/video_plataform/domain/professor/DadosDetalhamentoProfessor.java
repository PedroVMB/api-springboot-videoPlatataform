package api.video_plataform.domain.professor;

public record DadosDetalhamentoProfessor(Long id, String nome, String email, String senha) {
    public DadosDetalhamentoProfessor(Professor professor){
        this(professor.getId(), professor.getNome(), professor.getEmail(), professor.getSenha());
    }
}
