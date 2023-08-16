package com.tpfinal.TrabajoFinal.Repository;

import com.tpfinal.TrabajoFinal.Model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository<Venta,Long> {
}
