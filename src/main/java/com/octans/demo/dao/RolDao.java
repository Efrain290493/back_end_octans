package com.octans.demo.dao;

import com.octans.demo.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolDao extends JpaRepository<Rol, Long> {
}
