# Ejemplos de SPRING

Ejemplos realizados a partir de la charla realizada por [ipalbeniz](https://github.com/ipalbeniz/charla-spring).

### 01-app-sin-spring
Se trata de un módulo simple sin ningún tipo de configuración. Tiene los típicos paquetes
* Model: capa de clases del modelo.
* Service: capa de servicio con sus interfaces e implementaciones.
* DAO: capa de acceso a datos. Se emula con un map de clave<->Objeto.

### 02-app-sin-spring-ioc
Se trata de un módulo simple sin ningún tipo de configuración. Tiene los típicos paquetes
* Model: capa de clases del modelo.
* Service: capa de servicio con sus interfaces e implementaciones.
* DAO: capa de acceso a datos. Se emula con un map de clave<->Objeto.

En este módulo, en comaración con el anterior, se han realizado una serie de cambios para desacoplar la capa de servicio con la de DAO. Se crea un constructor en en el servicio para recibir un objeto de la capa DAO.

### 03-app-spring-xml-beans
Se trata de un módulo simple con configuración xml para especificar los beans. Tiene los típicos paquetes
* Model: capa de clases del modelo.
* Service: capa de servicio con sus interfaces e implementaciones.
* DAO: capa de acceso a datos. Se emula con un map de clave<->Objeto.

En este módulo, en comaración con el anterior, se ha agregado en el paquete de resources el archivo xml que define los beans que Spring se debe encargar de gestionar. Posteriormente, en la clas DemoApp, se ve cómo obtener un bean de este tipo mediante el ApplicationContext de spring.

### 04-app-spring-java-beans
Se trata de un módulo simple con configuración spring en una clase. Tiene los típicos paquetes
* Model: capa de clases del modelo.
* Service: capa de servicio con sus interfaces e implementaciones.
* DAO: capa de acceso a datos. Se emula con un map de clave<->Objeto.

En este módulo, en comaración con el anterior, no existe el xml de configuración para los beans, sino que se ha creado un paquete de configuración y una clase que su objetivo es definir los beans. Se anota la clase como @Configuration y se crean 2 métodos anotados como @Bean que devolverán instancias de los objetos correspondientes. Posteriormente, en la clase DemoApp, la manera de obtener el ApplicationContext es diferente ya qu en vez de hacerlo a partir del archivo de configuración xml, se hace a partir de la clase anotada como @Configuration.

### 07-app-spring-mongo
Ejemplo de cómo se pueden utilizar las anotaciones explicitas @EnableMongoRepositories o bien con lo subpaquetes de @SpringBootApplication para guardar entidades en una db nosql Mongo.

### 08-app-spring-cache
En este módulo, se puede ver el uso que se puede hace de las caches con Spring. Se emula atacando a métodos de servicio en los que hay que estan cacheados y tiene emulación de dalays. Al contrario que los que no estan cacheados con delay, se ve que una vez se existe el objeto en cache, no pasa por el método de delay, sino que lo coge de caché.

### 09-app-spring-job
Aplicación para probar las tareas programadas con @Scheduled ademas de configuración para obtener las propiedades de ficheros properties.ç
Se puede probar con spring boot ejecutando el comando mvn spring-boot:run

### Cómo ejecutar y probar los módulos
Existe la clase DemoApp para ver la ejecución del Servicio:
> \src\main\java\DemoApp.java

También existe una clase de test para testear el servicio:
> \src\test\java\com.demo.service\GameServiceTest.java

