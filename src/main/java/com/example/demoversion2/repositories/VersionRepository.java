package com.example.demoversion2.repositories;

import com.example.demoversion2.entites.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionRepository extends JpaRepository<Version, Long> {
    Version findByPlatform(String platform);
}

