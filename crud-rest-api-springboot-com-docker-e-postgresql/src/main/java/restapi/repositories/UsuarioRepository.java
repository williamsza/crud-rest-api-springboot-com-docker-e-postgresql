package restapi.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import restapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    }




