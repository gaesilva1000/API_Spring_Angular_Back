package com.gaesilva.cadastro_V1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gaesilva.cadastro_V1.domain.Estate;

@Repository
public interface EstateRepository extends JpaRepository<Estate, Long> {

	Estate findByCnpj(String cnpj);

}
