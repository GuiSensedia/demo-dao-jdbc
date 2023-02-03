package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	// Operação responsável por inserir no banco de dados o objeto enviado como parâmetro.
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
}
