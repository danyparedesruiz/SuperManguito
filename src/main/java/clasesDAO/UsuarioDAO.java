package clasesDAO;
import model.Usuario;
public interface UsuarioDAO extends GenericDAO<Usuario> {
	public Usuario recuperarUsuario(String username);
}
