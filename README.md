Este proyecto es un CRUD desarrollado con Play Framework de Java.
Para la base de datos se utilizó postgresql.
Para las operaciones crud realizadas sobre la base de datos se utilizó JPA con su implementación hibernate.
El proyecto implementa también asincronía para no bloquear los hilos al ejecutar el JDBC.

Si desea entender cómo está diseñada la base de datos, tiene en la raíz de este proyecto los jpeg del modelo entidad relación, que pasó por una circularidad y fue eliminada, y también cuenta con
el modelo relacional. El modelo relacional que se utilizó finalmente fue el MER_Malla_Vial_Eliminando_Circularidad.jpeg

Para utilizarlo, debe tener en cuenta no solo contar con el SBT y el Play Framework 3, sino que también antes de levantar el servidor ejecutando el comando sbt run, debe 
dirigirse al archivo conf/application.conf y digitar la contraseña que usa para conectarse a su gestor de postresql, esto lo hace modificando default.password = "tu password", 
también debe indicar el nombre de la base de datos ya creada (Solo crea la base de datos, las tablas son creadas de forma automática por JPA), indique el nombre de la 
base de datos en default.url = "jdbc:postgresql://localhost:5432/tu_base_de_datos", también debe hacer lo mismo en el archivo /conf/META-INF/persistence.xml, aquí debe modificar las propiedades
de <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/tu_base_de_datos"/> y <property name="javax.persistence.jdbc.password" value="tu_password*"/>. 

Una vez considere lo anterior ya puede ejecutar el comando sbt run lo cual levantará el servicio en http://localhost:9000/

Las rutas que puede utilizar están definidas en el archivo conf/routes
