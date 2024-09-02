package com.sptv.cotiprogram.logica;

import com.sptv.cotiprogram.logica.Rol;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-22T22:25:01", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SetAttribute<Usuario, Rol> rol;
    public static volatile SingularAttribute<Usuario, String> contraseña;

}