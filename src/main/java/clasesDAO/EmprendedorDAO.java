package clasesDAO;

import model.Emprendedor;

public interface EmprendedorDAO extends GenericDAO<Emprendedor> {
	public Emprendedor recuperarEmprendedor(String username);
}
