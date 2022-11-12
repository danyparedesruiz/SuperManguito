package clasesDAO;

import model.Post;

public interface PostDAO extends GenericDAO<Post> {
	public Post recuperarPost(long id);
}
