package com.fbayhan.iddia.repo;

import com.fbayhan.iddia.model.DenemeDeneme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenemeDenemeRepository extends JpaRepository<DenemeDeneme, Long> {
}
