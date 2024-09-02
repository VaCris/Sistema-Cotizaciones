package com.sptv.cotiprogram.logica;

import com.sptv.cotiprogram.logica.Cliente;
import com.sptv.cotiprogram.logica.Producto;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-22T22:25:01", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile SingularAttribute<Cotizacion, Date> fecha;
    public static volatile SingularAttribute<Cotizacion, Cliente> cliente;
    public static volatile SingularAttribute<Cotizacion, Double> total;
    public static volatile SingularAttribute<Cotizacion, String> estado;
    public static volatile SingularAttribute<Cotizacion, Integer> numcoti;
    public static volatile SingularAttribute<Cotizacion, Integer> id;
    public static volatile ListAttribute<Cotizacion, Producto> productos;

}