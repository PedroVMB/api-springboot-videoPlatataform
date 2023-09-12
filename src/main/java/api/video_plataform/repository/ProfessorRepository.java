package api.video_plataform.repository;

import api.video_plataform.domain.professor.Professor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;

public interface ProfessorRepository  extends JpaRepository<Professor, Long> {
    Page<Professor> findAllByAtivoTrue(Pageable paginacao);
}
