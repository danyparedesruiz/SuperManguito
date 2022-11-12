package clasesDAO;

import model.Emprendimiento;

public class EmprendimientoDAOHibernateJPA extends GenericDAOHibernateJPA<Emprendimiento> implements EmprendimientoDAO {

	EmprendimientoDAOHibernateJPA() {
		super(Emprendimiento.class);
	}

	@Override
	public Emprendimiento recuperarEmprendedor(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
