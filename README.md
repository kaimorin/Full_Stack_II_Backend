# Full_Stack_II_Backend
 Hola buenas querido desarrollador en este readme agregare los endpoints de el microservicio de login asi como tambien la estructura del json para probar endpoints y la estructura de flujo y de arranque del proyecto:

 ***Importante: Tienes que tener instalado Java21 en tu pc y en el Editor de codigo,ideal usar Laragon para activar el puerto 3306 y workbenchSQL para verificar que la logica de base de datos haya sido creada y se este ejecutando de manera optima, el editor de codigo de tu preferencia precisa tener springboot y las extensiones de java.***
 
 Arranque(Debemos tener activo el puerto 3306 con mysql en localHost /**esto se puede hacer con laragon**):
    
    Paso-1: Para iniciar el proyecto primero debemos ejecutar el servicio de eureka que es quien escuchara a todos los microservicios y hara posible que todos conversen entre ellos.

    Paso-2: Para iniciar el microservicio deseado si tenemos el puerto 3306 abierto debemos configurar la contraseña en el archivo application.yml del microservicio, en caso de que la contraseña sea nula dejar el espacio en blanco, de lo contrario insertar la contraseña en la seccion que dice ***password*** dejando un espacio despues de los dos puntos.

    Paso-3: Levantar el microservicio que deseamos probar en este caso el login esta finalizado con todos sus endpoints funcionando a continuacion se listaran los endpoints de este microservicio y sus respectivos json y resultados esperados.

EndPoints-Login:
    Peticion tipo [Get]:
        /api/v1/users/list : Esta peticion muestra la lista de usuarios.
    Peticion tipo [Post]:
        /api/v1/users/register : Esta peticion registra un usuario nuevo en nuestra base de datos de usuarios.
    Peticion tipo [Post]:
        /api/v1/users/login : Esta peticion Logea al usuario consultando nuestra base de datos de usuarios, **adicionalmente** esta peticion devuelve un token similar a este: "eydqebsuiaywedgh8qo7ehdg1q29oedb8oqisdgo8iq7ghdxoihbans zx-.asdfc,.-asf,.as-,fardfqwh" este token necesita ser copiado **sin las comillas** y validado en el siguiente endpoint.
    Peticion tipo [Get]:
        /api/v1/users/validate : Esta peticion verifica que el token insertado sea validado para poder acceder a los demas endpoints.

Pruebas endpoints[json]:
    En esta ocasion el microservicio de login se esta ejecutando en el puerto 9000 en localhost porque aun no a sido desplegado, este puede ser probado de varias formas atraves de Postman o del Navegador usando Swagger porfavor utilizar la que le acomode mas.

    Postman:
        $$URL-Lista de usuarios$$:
        Peticion tipo [Get]: ***No necesita un Json***
            localhost:9000/api/v1/users/list
        Json:
            {vacio}
        
        $$URL-Registrarse$$:
        Peticion tipo [Post]:
            localhost:9000/api/v1/users/register
        Json:
            {  
                "username": "tu_usuario",
                "password": "tu_password123",
                "roleId": 1
            }
        Resultado esperado:
            Code:201
            "Usuario se a registrado exitosamente"
        
        $$URL-Login$$:
        Peticion tipo [Post]:
            localhost:9000/api/v1/users/login
        Json:
            {
                "username": "tu_usuario",
                "password": "tu_password123"
            }
        Resultado esperado:
            Code:201
            token:"eydqebsuiaywedgh8qo7ehdg1q29oedb8oqisdgo8iq7ghdxoihbans zx-.asdfc,.-asf,.as-,fardfqwh" ***copiar sin comillas***

        $$URL-Validar Token$$
        Peticion tipo [Get]: ***No necesita un Json***
            localhost:9000/api/v1/users/validate?token=***Pegar aquí el token copiado***
        Json:
            {vacio}
        Resultado esperado:
            Code:201
            "Token valido"
    Swagger:
        Para probar con swagger solo necesitas acceder a esta web atravez de tu navegador de confianza:
        http://localhost:9000/swagger-ui/swagger-ui/index.html

Hasta aquí la documentacion necesaria del microservicio del microservicio login, en un futuro sera actualizada para la dockerizacion de las base de datos y de los microservicios.


        


        
        
        






