package com.account.email.service;

import com.account.email.model.CompanyInfo;
import com.account.email.repositories.CompanyInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyInfoService {
    
    @Autowired
    CompanyInfoRepository companyInfoRepository;
    
    public Optional<CompanyInfo> getCompanyBioBySymbol(String symbol){
        return companyInfoRepository.findById(symbol);
    }
    
    public CompanyInfo createCompanyBio(CompanyInfo companyInfo){
        return companyInfoRepository.save(companyInfo);
    }
    
    public CompanyInfo updateCompanyBio(CompanyInfo companyInfo, String symbol){
        companyInfoRepository.findById(symbol);
        return companyInfoRepository.save(companyInfo);
    }
    
    public void deleteCompanyBio(String symbol){
        companyInfoRepository.deleteById(symbol);
    }
}
