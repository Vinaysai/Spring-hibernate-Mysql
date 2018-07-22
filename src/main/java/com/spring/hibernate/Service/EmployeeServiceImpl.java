package com.spring.hibernate.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.Dao.EmployeeDao;
import com.spring.hibernate.bean.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	 @Autowired
	    private EmployeeDao employeeDAO;
	 
	    /* (non-Javadoc)
		 * @see com.spring.hibernate.Service.EmployeeService#addEmployee(com.spring.hibernate.bean.Employee)
		 */
	    @Override
		@Transactional
	    public void addEmployee(Employee employee) {
	        employeeDAO.addEmployee(employee);
	    }
	 
	    /* (non-Javadoc)
		 * @see com.spring.hibernate.Service.EmployeeService#deleteEmployee(java.lang.Integer)
		 */
	    @Override
		@Transactional
	    public void deleteEmployee(Integer employeeId) {
	        employeeDAO.deleteEmployee(employeeId);
	    }
	 
	    /* (non-Javadoc)
		 * @see com.spring.hibernate.Service.EmployeeService#getAllEmployees()
		 */
	    @Override
		@Transactional
	    public List<Employee> getAllEmployees() {
	        return employeeDAO.getAllEmployees();
	    }
	 
	    /* (non-Javadoc)
		 * @see com.spring.hibernate.Service.EmployeeService#getEmployee(int)
		 */
	    @Override
		public Employee getEmployee(int empid) {
	        return employeeDAO.getEmployee(empid);
	    }
	 
	    /* (non-Javadoc)
		 * @see com.spring.hibernate.Service.EmployeeService#getEmployeeDAO()
		 */
	    @Override
		public EmployeeDao getEmployeeDAO() {
			return employeeDAO;
		}
	 
	    /* (non-Javadoc)
		 * @see com.spring.hibernate.Service.EmployeeService#setEmployeeDAO(com.spring.hibernate.Dao.EmployeeDao)
		 */
	    @Override
		public void setEmployeeDAO(EmployeeDao employeeDAO) {
	        this.employeeDAO = employeeDAO;
	    }

		/* (non-Javadoc)
		 * @see com.spring.hibernate.Service.EmployeeService#updateEmployee(com.spring.hibernate.bean.Employee)
		 */
		@Override
		public Employee updateEmployee(Employee employee) {
	        // TODO Auto-generated method stub
	        return employeeDAO.updateEmployee(employee);
	    }
	
	
	
	
}
