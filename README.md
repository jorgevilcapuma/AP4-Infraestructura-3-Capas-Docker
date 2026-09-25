## Estado de Infraestructura y Endpoints para Validación

La infraestructura del proyecto está implementada mediante una arquitectura de tres capas, compuesta por **Frontend, Backend y Base de Datos**. Los siguientes endpoints permiten comprobar la conectividad y el correcto funcionamiento de los servicios.

### 1. Estado del Backend

Endpoint:

```text
http://localhost:8080/api/status
```

Este endpoint permite verificar que el servicio Backend se encuentra activo y puede responder correctamente a las solicitudes.

### 2. Frontend

El Frontend se encuentra disponible mediante el puerto configurado para la aplicación web:

```text
http://localhost:4200
```

Desde este servicio se puede acceder a la interfaz de usuario y comprobar la comunicación con el Backend.

### 3. Base de Datos

La base de datos se encuentra configurada mediante el servicio correspondiente dentro de Docker.

La conectividad puede validarse verificando los contenedores activos:

```bash
docker ps
```

### 4. Verificación de contenedores

Para comprobar el estado de toda la infraestructura:

```bash
docker ps
```

Se deben verificar los servicios correspondientes a:

* Frontend
* Backend
* Base de Datos

### 5. Prueba de conectividad Backend

Desde el contenedor del Frontend se puede realizar una prueba de comunicación con el Backend:

```bash
docker exec -it angular_ui curl http://backend:8080/api/status
```

Si la comunicación es correcta, el Backend deberá devolver una respuesta de estado.

### 6. Resultado esperado

La validación permite comprobar:

* Funcionamiento del Frontend.
* Disponibilidad del Backend.
* Comunicación entre las capas.
* Conectividad con la Base de Datos.
* Correcta ejecución de los contenedores Docker.

> **Nota:** Los nombres de los contenedores, puertos y URLs deben coincidir con la configuración definida en `docker-compose.yml`.
