#File Report Scheduler


#Descripción de la solución.

Para la Solución del problema. 
Se dividio en dos componentes.
Uno sería el que se encarga de interactuar con el usuario, para obtener los datos (UserRules) y luego generar las Rules y almacenarlas

- UserRuleParser
- RepositoryClient
- ademas de guardar deberia guardar los Eventos. de acuerdo a la Rule (Para esto se trabajaria con un Estrategy, esto está pendiente).
 

	
Luego se tiene un segundo componente, que se encargaría Obtener el directorio de archivos. 

RuleFinderTask
- Este RuleFinder se encargaria de Obtener los Eventos y cargar las Rules que deben ejecutarse. (esto no está en este momento, es un Dummy)

FileFinder
Se recorre la estructura con un Composite, y un Interprete nos indica si el File cumple con la Expresión de la Regla.
Es decir el File seria el Context del Interprete.
	
ReportGenerator  (Factory Method)
MailGenerator  (Factory Method)
EmailSender (Template Method)


-- En resumen en la solución
Se aplican los sgtes patrones.

~~~
*  Creational Patterns
    - Singleton
    - Factory Method 
*  Structural Patterns
    - Composite
    - Facade
*  Behavioral Patterns    
    - Interpreter
    - Observer
    - Strategy (Pendiente)
    - Template Method
~~~

#Diagrama de clases
![Diagrama de clases](https://lh3.googleusercontent.com/d/1LiV0gVSvZbZpq_0EZcpJRkJO7R6Tv4Bu)

[Para Ver en Draw.IO click Aquí](https://drive.google.com/file/d/1LiV0gVSvZbZpq_0EZcpJRkJO7R6Tv4Bu/view?usp=sharing)
