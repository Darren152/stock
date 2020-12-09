package com.account.email.repositories;

import com.account.email.model.CompanyInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoRepository extends CrudRepository<CompanyInfo, String> {
}
