# TestBeer
Proyecto de demostración de Cervezas, basado en una arquitectura CLEAN con MVVM.

## Funciones de la aplicación
- Los usuarios pueden iniciar sesión.
- Los usuarios pueden consultar y buscar cervezas.
- Los usuarios pueden hacer clic en cualquier cerveza para ver los detalles de la misma.

## Arquitectura de la aplicación
Basado en la arquitectura Clean y el patrón MVVM con Repository.

## La aplicación incluye los siguientes componentes principales:
- Un DataSource que trabaja con la BD, proporcionando una interfaz de datos unificada.
- Un ViewModel que proporciona datos específicos para la interfaz de usuario.
- La interfaz de usuario, que muestra una representación visual de los datos en ViewModel.

## Paquetes de aplicaciones
- constants.
- core.
- data.
- di.
- domain.
- ui.
- utils.

## Especificaciones de la aplicación
- SDK mínimo 26
- Java (en la rama maestra) y Kotlin (en la rama kotlin_support)
- Arquitectura MVVM
- Componentes de la arquitectura de Android (LiveData, ViewModel, Material Design).
- **ViewModel** para pasar datos del modelo a las vistas
- **LiveData**
- **Hilt** para inyección de dependencias.
- **Flow**
- **Room y Shared Preferences** para persistencia de datos.
- **Retrofit** para el consumo del servicio REST.
- Configuración del **Gradle** para la ofuscación de código el release.