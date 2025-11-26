package com.gj.ReporteOx.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

/**
 * Esto es un ejemplo de una entidad.
 * 
 * Siéntete libre de renombrarla, modificarla o borrarla a tu gusto.
 */

@Entity @Getter @Setter
public class TuPrimeraEntidad extends Identifiable {

    @Column(length =50)  @Required
    String nombre;

	@Column(length=50) @Required
	String descripcion;

    @Column(length = 50) @Stereotype("MONEY") @Required
    BigDecimal precio;

    @Column(length = 50)
    Integer cantidad;

    @Column(length = 50) @Stereotype("DATE") @Required
	LocalDate fecha;
}
