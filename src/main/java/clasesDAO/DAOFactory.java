package clasesDAO;

public class DAOFactory {
	
	public static EmprendedorDAOHibernateJPA getEmprendedor() {
		return new EmprendedorDAOHibernateJPA();
	}
	
	public static PostDAOHibernateJPA getPost() {
		return new PostDAOHibernateJPA();
	}
	
	public static EmprendimientoDAOHibernateJPA getEmprendimiento() {
		return new EmprendimientoDAOHibernateJPA();
	}

}
