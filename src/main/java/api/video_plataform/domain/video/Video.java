package api.video_plataform.domain.video;

import api.video_plataform.domain.professor.DadosAtualizacaoProfessor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "videos")
@Entity(name = "Video")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String url;

    private Boolean ativo;

    public Video(DadosCadastroVideo dados){
        this.titulo = dados.titulo();
        this.url = dados.url();
        this.ativo = true;
    }

    public void atualizarInformacoesVideo(DadosAtualizacaoVideo dados){
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.url() != null) {
            this.url = dados.url();
        }
        if(dados.ativo() != null){
            this.ativo = dados.ativo();
        }
    }

    public void excluir() {
        this.ativo = false;
    }

}
