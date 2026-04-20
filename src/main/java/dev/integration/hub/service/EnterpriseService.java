package dev.integration.hub.service;

import dev.integration.hub.model.Enterprise;
import dev.integration.hub.repository.EnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {

    private final EnterpriseRepository enterpriseRepository;

    public EnterpriseService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    // Method Create Enterprise
    public Enterprise created(Enterprise enterprise){
        return enterpriseRepository.save(enterprise);
    }

    // Method List Enterprise
    public List<Enterprise> getAll(){
        return enterpriseRepository.findAll();
    }

    // Method Delete Enterprise
    public void deleteEnterprise(Long companyId){
        enterpriseRepository.deleteById(companyId);
    }

    // Toggle
    public Enterprise toggleContract(Long companyId){

        Enterprise enterprise = enterpriseRepository.findById(companyId)
                .orElseThrow(() -> new RuntimeException("Empresa não encontrada!"));

        enterprise.setContractActive(!enterprise.getContractActive());

        return enterpriseRepository.save(enterprise);

    }

}
