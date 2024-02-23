## SpringBoot
**spring/springboot is called as framework of frameworks** because it uses several other libraries and frameworks inside it like JDBC, ORM(object relational mapping), hibernate etc

1. **Inversion of control**: means giving spring control to do the mapping of the objects to the blueprint created wherever required
2. **Dependency injection**: the process of doing inversion of control

springboot comes with auto configured apache tomcat for deployment of the springboot application 

[Spring Initializr](https://start.spring.io/) : prepackage springboot project folder structure to quickstart with spring project

@SprintBootApplication : this annotation under the hood auto handle following configs -  @ComponentScan(excludeFilters ….), @EnableAutoConfiguration, @springBootConfiguration

@Component : org.springframework.stereotype.Component

@Controller : org.springframework.stereotype.Controller , it under the hood applies the @Component for the controllers.

@Restcontrolller : org.springframework.web.bind.annotation.RestController , it uses @ResponseBody annotation under the hood and hence returns response body

@RequestMapping(value=””, method = RequestMethod.GET)
