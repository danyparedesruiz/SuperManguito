package clasesDAO;

import model.Emprendedor;
import model.Emprendimiento;

public interface EmprendimientoDAO extends GenericDAO<Emprendimiento> {
	public Emprendimiento recuperarEmprendedor(String username);
}
