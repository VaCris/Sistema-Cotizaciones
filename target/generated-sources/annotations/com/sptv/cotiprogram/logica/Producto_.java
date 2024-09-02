package com.sptv.cotiprogram.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-22T22:25:01", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, String> marca;
    public static volatile SingularAttribute<Producto, String> codigo;
    public static volatile SingularAttribute<Producto, Double> PunitConIGV;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile SingularAttribute<Producto, Double> PunitSinIGV;

}