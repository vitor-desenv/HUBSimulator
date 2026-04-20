package dev.integration.hub.controller;

import dev.integration.hub.model.Enterprise;
import dev.integration.hub.service.EnterpriseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/enterprise")
public class EnterpriseController {

    private final EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Enterprise> getAll(){
       return enterpriseService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Enterprise create(@RequestBody Enterprise enterprise){
      return enterpriseService.created(enterprise);
    }

    @PatchMapping("/{id}/contract/toggle")
    public Enterprise toggleContract(@PathVariable Long id){
        return enterpriseService.toggleContract(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long companyId){
        enterpriseService.deleteEnterprise(companyId);
    }

}
