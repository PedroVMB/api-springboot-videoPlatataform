package api.video_plataform.domain.video;

import api.video_plataform.domain.professor.DadosDetalhamentoProfessor;

public record DadosDetalhamentoVideo(Long id, String titulo, String url, Boolean ativo) {
    public DadosDetalhamentoVideo(Video video){
        this(video.getId(), video.getTitulo(), video.getUrl(), video.getAtivo());
    }
}
