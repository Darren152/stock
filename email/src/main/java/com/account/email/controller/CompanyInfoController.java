package com.account.email.controller;

import com.account.email.model.CompanyInfo;
import com.account.email.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CompanyInfoController {
 
    @Autowired
    CompanyInfoService companyInfoService;
    
    @RequestMapping(value = "/bio/{symbol}", method = RequestMethod.GET)
    public Optional<CompanyInfo> getBioBySymbol(@PathVariable String symbol){
        return companyInfoService.getCompanyBioBySymbol(symbol);
    }
    
    @RequestMapping(value = "/bio/{symbol}", method = RequestMethod.POST)
    public CompanyInfo createBio(@RequestBody CompanyInfo companyInfo){
        return companyInfoService.createCompanyBio(companyInfo);
    }
    
    @RequestMapping(value = "/bio/{symbol)", method = RequestMethod.PUT)
    public CompanyInfo updateBio(@RequestBody CompanyInfo companyInfo, @PathVariable String symbol){
        return companyInfoService.updateCompanyBio(companyInfo, symbol);
    }
    
    @RequestMapping(value = "/bio/{symbol)", method = RequestMethod.DELETE)
    public void deleteComapnyBio(@PathVariable String symbol){
        companyInfoService.deleteCompanyBio(symbol);
    }
}
