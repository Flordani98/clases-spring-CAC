#Clase 17

Nuestra aplicación sera una app web con spring boot 

##¿Como estará estructurado nuestro proyecto final?

Vamos a iniciar nuestro proyecto con un modelo MVC

##MVC

Modelo-vista-controlador
Es un principio de arquitectura de modelado de desarrollo de software el cual dividimos en capas nuestra aplicación.
Viene a representar las capas que tiene el servidor.

En nuestro proyecto la vista queda en el lado del cliente, no va a estar del lado del servidor. Nosotros solo
trabajaremos con el lado del servidor realizando el modelo y el controlador.

El controlador va a ser el encargado de recibir todas las peticiones externas de las vistas por ej., y la va a
distribuir a los recursos.

Nuestros recursos en nuestro proyecto son los: Users/Accounts/Transfers

Los datos y la información de cada uno de nuestros recursos se encuentra en el modelo. 
El modelo representa la clase java(en este caso) de la entidad. Representa el modelo de negocio (entidades, recursos).

Por cada uno de nuestro recursos vamos a tener un controlador y un modelo.

El cliente-servidor se va a comunicar mediante el protocolo HTTP, el cual es nuestro canal de comunicación
principal.


!(imagenes/)