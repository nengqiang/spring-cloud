# spring-cloud
 * &nbsp;&nbsp; Understand Spring Cloud and microservices build
 
 ## -- contents --
 
 #### Recommended order：
 
 ### spring-cloud-pre module
 * &nbsp;&nbsp; The preparation for Spring Cloud
 * &nbsp;&nbsp; 1.For Spring Boot, the configuration file application.properties and application.yml are chosen one by one.
 * &nbsp;&nbsp; 2.In the traditional SpringMVC architecture, we generally put JSP and HTML pages under the webapps directory, 
 but Spring Boot does not have webapps, and there is no web.xml. If we want to write the interface, what should we do?   
 &nbsp;&nbsp; Spring Boot officially provides several template engines: FreeMarker, Velocity, Thymeleaf, Groovy, mustache, JSP.  
 &nbsp;&nbsp; Create two directories under resources: static and templates   
 &nbsp;&nbsp; The static directory is used to store static resources, such as CSS, JS, HTML, etc. 
 The templates directory stores the template engine files. We can create a file under templates: index.ftl 
 (freemarker default suffix is .ftl)
 
### eureka-server module
### eureka-client module
 * &nbsp;&nbsp; Service registration and discovery (Eureka) (Finchley version)
 * &nbsp;&nbsp; Spring cloud provides developers with tools to quickly build distributed systems, 
 including configuration management, service discovery, circuit breakers, routing, micro-proxies, event buses, global locks, 
 decision-making campaigns, distributed sessions, and more. It runs in a simple environment and can run on the developer's computer.