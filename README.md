# Taller 1 ARSW  
## Nicolas Palacios  
## 08/06/2022 
### En que consiste el proyecto?
El proyecto consiste en la creacion de un programa el cual permita contar la cantidad de lineaas que contienen varios archivos dentro de una carpeta especificada, este proyecto fue realizado en 2 horas.  
 Este programa solo recive 2 argumentos, el primero indicando el metodo de conteo y el 2 indicando la ruta de la carpeta.  

 Comando utilizado: java -cp "target/classes" edu.escuelaing.arsw.ASE.app.App loc src\main\java\edu\escuelaing\arsw\ASE\app
### Diagrama de Clases
<img src="imagen\imagen.png">  
 
 En el diagrama de clases vemos la clase App, en esta estan los metodos Lector_archivos, contadorLineas y el main.  

ContadorLineas Cuenta todas las lineas del archivo y devuelve este numero, Lector_archivos es el metodo que recorre todos los archivos de un folder y suma lo que devuelve contadorLineas y main es el metodo que invoca a lector_archivos.

### Tests
Se realizan test por los 2 metodos principales, en el de contador lineas se testean ambos metodos de conteo de lineas.
<img src="imagen\tests.png">  

### Documentacion
Para ver la documentacion, se debe realizar el comando mvn javadoc:javadoc, luego en target/../index.html se visualizara esta.

### Estructura de archivos

|____pom.xml
|____src
| |____main
| | |____java
| | | |____edu
| | | | |____escuelaing
| | | | | |____app
| | | | | | |App.java
| |____test
| | |____java
| | | |____edu
| | | | |____escuelaing
| | | | | |____app
| | | | | | |____AppTest.java