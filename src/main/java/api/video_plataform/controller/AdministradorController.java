package api.video_plataform.controller;

import api.video_plataform.domain.administrador.*;
import api.video_plataform.repository.AdministradorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("administrador")
@CrossOrigin("*")
public class AdministradorController {
    @Autowired
    private AdministradorRepository repository;

    @PostMapping
    @Transactional
    @CrossOrigin(origins = "*",maxAge = 3600)
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroAdministrador dados, UriComponentsBuilder uriBuilder) {
        var administrador = new Administrador(dados);
        repository.save(administrador);

        var uri = uriBuilder.path("/medicos/{id}").buildAndExpand(administrador.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoAdministrador(administrador));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemAdministrador>> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        var page = repository.findAllByAtivoTrue(paginacao).map(DadosListagemAdministrador::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoAdministrador dados) {
        var administrador = repository.getReferenceById(dados.id());
        administrador.atualizarInformacoesAdministrador(dados);

        return ResponseEntity.ok(new DadosDetalhamentoAdministrador(administrador));
    }

    @DeleteMapping("/{id}")
    @org.springframework.transaction.annotation.Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        var administrador = repository.getReferenceById(id);
        administrador.excluir();

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var administrador = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoAdministrador(administrador));
    }
}
