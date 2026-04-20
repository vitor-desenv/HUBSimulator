package dev.integration.hub.service;

import dev.integration.hub.model.Department;
import dev.integration.hub.model.Enterprise;
import dev.integration.hub.repository.DepartmentRepository;
import dev.integration.hub.repository.EnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final EnterpriseRepository enterpriseRepository;

    public DepartmentService(DepartmentRepository departmentRepository, EnterpriseRepository enterpriseRepository) {
        this.departmentRepository = departmentRepository;
        this.enterpriseRepository = enterpriseRepository;
    }

    //Method: Create departments linked to the company
    public Department create(Long companyId, Department department){

        Enterprise enterprise = enterpriseRepository.findById(companyId)
                .orElseThrow(() -> new RuntimeException("Empresa não encontrada!"));

        department.setEnterprise(enterprise);

        return departmentRepository.save(department);
    }

    //Method List Departments
    public List<Department> getAll(){
        return departmentRepository.findAll();
    }

    //Method Delete Departments
    public void delete(Long departmentId){
        departmentRepository.deleteById(departmentId);
    }

}
