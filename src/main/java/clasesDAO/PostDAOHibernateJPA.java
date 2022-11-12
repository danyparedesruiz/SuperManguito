package clasesDAO;

import model.Emprendedor;
import model.Post;

public class PostDAOHibernateJPA extends GenericDAOHibernateJPA<Post> implements PostDAO {

	PostDAOHibernateJPA() {
		super(Post.class);
	}

	@Override
	public Post recuperarPost(long id) {
		javax.persistence.Query consulta = EMF.getEMF().createEntityManager()
				.createQuery("select p from Post p where p.id =?");
		consulta.setParameter(1, id);
		Post resultado = (Post) consulta.getSingleResult();
		return resultado;
	}
}
