package prueba;

import clasesDAO.DAOFactory;
import clasesDAO.EmprendedorDAOHibernateJPA;
import clasesDAO.EmprendimientoDAOHibernateJPA;
import model.Emprendedor;
import model.Emprendimiento;

public class Prueba {

	public static void main(String[] args) {
	
		Emprendimiento e = new Emprendimiento("Oasis");
		// e.setEmprendedor(e1);
		EmprendimientoDAOHibernateJPA emprendimientoDAOHibernateJPA = DAOFactory.getEmprendimiento();
		e = emprendimientoDAOHibernateJPA.persist(e);
		System.out.println("Datos insertados: "+emprendimientoDAOHibernateJPA.recuperarTodos("nombre"));

		/*
		 * Emprendedor e1 = new Emprendedor("Paula", "Rios"); EmprendedorDAOHibernateJPA
		 * emprendedoresDaoHibernateJPA = DAOFactory.getEmprendedor(); e1 =
		 * emprendedoresDaoHibernateJPA.persist(e1);
		 * System.out.println("Datos insertados: "+emprendedoresDaoHibernateJPA.
		 * recuperarTodos("nombre"));
		 */

		// e.setEmprendedor(e1);
		// emprendimientoDAOHibernateJPA.actualizar(e);
		// PostDAOHibernateJPA postDAOHibernateJPA = DAOFactory.getPost();
		// Post p = new Post();
		// p.setMensaje("Hola");
		// postDAOHibernateJPA.persist(p);*/ // TODO Auto-generated method stub

	}

}
