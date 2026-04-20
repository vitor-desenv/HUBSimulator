package dev.integration.hub.controller;

import dev.integration.hub.model.Department;
import dev.integration.hub.service.DepartmentService;
import dev.integration.hub.service.EnterpriseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/department")
public class DepartmentController {

    private final DepartmentService departmentService;
    private final EnterpriseService enterpriseService;

    public DepartmentController(DepartmentService departmentService, EnterpriseService enterpriseService) {
        this.departmentService = departmentService;
        this.enterpriseService = enterpriseService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Department> listAll(){
        return departmentService.getAll();
    }

    @PostMapping("{companyId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Department created(
            @PathVariable("companyId") Long companyId,
            @RequestBody Department department){
        return departmentService.create(companyId, department);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleted(@PathVariable("id") Long departmentId){
        departmentService.delete(departmentId);
    }

}
