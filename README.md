# Sistema de Gestión de Vehículos

Esta aplicación Spring Boot permite gestionar un registro de vehículos, proporcionando una interfaz web para crear y actualizar información de vehículos.

## Características

- Registro y actualización de vehículos
- Interfaz web intuitiva
- Base de datos H2 en memoria
- REST API para operaciones CRUD

## Requisitos

- Java 17 o superior
- Maven 3.6 o superior
- Spring Boot 3.1.6

## Configuración

1. Clonar el repositorio:
```bash
git clone [URL_DEL_REPOSITORIO]
cd vehiculos-app
```

2. Compilar el proyecto:
```bash
mvn clean install
```

3. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```

La aplicación estará disponible en: http://localhost:8081

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── miempresa/
│   │           └── vehiculos/
│   │               ├── VehiculosAppApplication.java
│   │               ├── controller/
│   │               ├── model/
│   │               └── repository/
│   └── resources/
│       ├── application.properties
│       └── static/
│           └── formulario.html
```

## API REST

### Crear Vehículo
```http
POST /vehiculos
Content-Type: application/json

{
    "marca": "Toyota",
    "modelo": "Corolla",
    "placa": "ABC123",
    "tipo": "Sedan"
}
```

### Actualizar Vehículo
```http
PUT /vehiculos/{id}
Content-Type: application/json

{
    "marca": "Toyota",
    "modelo": "Camry",
    "placa": "ABC123",
    "tipo": "Sedan"
}
```

## Interfaz Web

La interfaz web está disponible en `http://localhost:8081/formulario.html` y permite:
- Registrar nuevos vehículos
- Actualizar vehículos existentes

## Licencia

[MIT License](LICENSE)