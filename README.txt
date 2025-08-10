EVALUACIÓN FINAL MÓDULO 2 - PROGRAMACIÓN ORIENTADA A OBJETOS
================================================================

PROYECTO DESARROLLADO POR:
- Katherine Alderete Gómez
- Katrina González Alarcón  
- Giorgio Interdonato Palacios

================================================================

CONTEXTO DEL PROBLEMA:
================================================================

En la última década, han aumentado significativamente los índices de accidentabilidad, 
especialmente en las empresas del rubro industrial, minero y construcción. Las cifras 
son alarmantes, a pesar de las leyes y normativas que obligan a las empresas a tomar 
todas las medidas necesarias para proteger la vida y salud de los trabajadores.

Para dar cumplimiento a la normativa y mantener ambientes de trabajo seguros, muchas 
empresas se ven en la obligación de contratar asesoría profesional, lo cual representa 
un costo elevado y fomenta la disminución o la no implementación de medidas necesarias 
para la seguridad.

Muchas de las empresas que han optado por no invertir en asesoría preventiva, se ven 
expuestas a aplicación de multas de las entidades fiscalizadoras, gastos por días 
perdidos en accidentabilidad, bajas en la producción, alzas en el pago de cotizaciones 
(al organismo administrador del seguro de accidentes del trabajo, ley 16.744), entre 
otros. Además, hay que considerar posibles demandas y pagos de indemnizaciones a los 
trabajadores y familiares afectados por accidentes del trabajo.

Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos 
laborales y necesita una solución tecnológica que ayude a administrar los procesos que 
se deben ejecutar en cada una de las empresas que son clientes de la compañía.

Este servicio finalmente pretende ofrecer una solución completa en prevención de riesgos 
para las empresas a un costo razonable, cumpliendo estrictamente todos los procesos 
necesarios para dar cumplimiento a la normativa vigente, mejorando los ambientes de 
trabajo, la productividad, contribuyendo a un ahorro económico.

================================================================

PROBLEMA IDENTIFICADO:
================================================================

La empresa no posee un sistema de información que le permita administrar toda la 
cantidad de información que se genera, ni controlar las actividades y el recurso humano.

Existen problemas con la planificación de las visitas, generalmente los profesionales 
están en terreno por lo que no están disponibles para informarles sus actividades futuras.

No existe registro del profesional que ha estado con mayor actividad ni se sabe dónde 
está cada uno.

Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación 
con el cliente. Asisten trabajadores que no tienen que ver con la charla, o bien, no 
se coordina la ejecución de la capacitación, lo que trae consigo multas para la empresa.

No se tiene un control de los clientes que pagan y los que no, lo que hace que muchas 
actividades de los profesionales corran por cuenta de la empresa, generando desbalances 
financieros.

Las actividades se registran en carpetas lo que dificulta el seguimiento de las 
asesorías y el resumen de resultados por empresa.

Además, generalmente no se cumplen ciertas actividades de control de implementación 
de soluciones y a veces no se ha cumplido con la dirección del trabajo, lo que genera 
multas para los clientes, bajando la calidad del servicio.

Los profesionales que han atendido la empresa esporádicamente han variado, no existiendo 
un registro de la totalidad de actividades preventivas realizadas y no se tiene certeza 
de los avances.

================================================================

PLANTEAMIENTO DE LA SOLUCIÓN:
================================================================

Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio 
descritos y que proponga una mejora en la gestión, el control, la seguridad, y 
disponibilidad de información para la empresa y sus clientes.

El sistema debe permitir la planificación de actividades y el control de ejecución 
de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales 
y los clientes para la respuesta temprana ante incidentes de seguridad.

Además, se requiere que el sistema genere reportes y estadísticas que ayuden a tomar 
decisiones y mejorar el rendimiento de la empresa, considerando la carga laboral, y 
la demanda de clientes y las actividades que cada uno involucra para el cumplimiento 
de los contratos.

Es imprescindible, mantener comunicación con los profesionales en todo momento, aún 
en terreno, y darle la posibilidad de realizar todas sus actividades aun no teniendo 
conectividad (internet), ya que muchas empresas se encuentran en zonas donde no hay 
conexión de ese tipo.

================================================================

SOLUCIÓN IMPLEMENTADA:
================================================================

Se ha desarrollado un sistema de gestión de prevención de riesgos laborales en Java 
utilizando programación orientada a objetos que incluye:

1. GESTIÓN DE USUARIOS:
   - Cliente: Almacena información completa de las empresas cliente
   - Profesional: Gestiona los profesionales que realizan las asesorías
   - Administrativo: Maneja el personal administrativo de la empresa

2. GESTIÓN DE ACTIVIDADES:
   - Capacitación: Registra y gestiona las capacitaciones realizadas
   - Accidente: Documenta los accidentes ocurridos
   - Visita a Terreno: Controla las visitas realizadas a las empresas
   - Revisión: Gestiona las revisiones asociadas a las visitas

3. CARACTERÍSTICAS TÉCNICAS:
   - Arquitectura orientada a objetos con herencia y polimorfismo
   - Interfaz Asesoria para gestión unificada de usuarios
   - Validaciones completas de datos de entrada
   - Sistema de menús interactivo para todas las operaciones
   - Almacenamiento en memoria con listas dinámicas
   - Documentación completa con JavaDoc

4. FUNCIONALIDADES PRINCIPALES:
   - Almacenamiento de todas las entidades del sistema
   - Listado y consulta de información
   - Eliminación de registros
   - Validación de datos de entrada
   - Generación de reportes básicos
   - Datos de prueba para demostración
   - Función de limpieza de datos

================================================================

ESTRUCTURA DEL PROYECTO:
================================================================

src/
├── main/
│   └── Principal.java (Clase principal con menú del sistema)
├── menu/
│   ├── MenuCliente.java (Gestión de clientes)
│   ├── MenuUsuario.java (Gestión general de usuarios)
│   ├── MenuProfesional.java (Gestión de profesionales)
│   ├── MenuAdministrativo.java (Gestión de administrativos)
│   ├── MenuCapacitacion.java (Gestión de capacitaciones)
│   ├── MenuAccidente.java (Gestión de accidentes)
│   ├── MenuVisitaTerreno.java (Gestión de visitas a terreno)
│   └── MenuRevision.java (Gestión de revisiones)
├── modelo/
│   ├── Usuario.java (Clase abstracta base)
│   ├── Cliente.java (Extiende Usuario)
│   ├── Profesional.java (Extiende Usuario)
│   ├── Administrativo.java (Extiende Usuario)
│   ├── Capacitacion.java (Entidad de capacitación)
│   ├── Accidente.java (Entidad de accidente)
│   ├── VisitaTerreno.java (Entidad de visita a terreno)
│   ├── Revision.java (Entidad de revisión)
│   └── Asesoria.java (Interfaz para análisis de usuarios)
├── servicio/
│   └── Contenedor.java (Clase contenedora principal)
└── util/
    └── Validador.java (Clase de validaciones)

================================================================

REQUERIMIENTOS CUMPLIDOS:
================================================================

✓ Todas las clases implementadas con atributos, constructores, getters y setters
✓ Interfaz Asesoria con método analizarUsuario()
✓ Herencia correcta: Cliente, Profesional y Administrativo extienden Usuario
✓ Métodos específicos implementados en cada clase
✓ Clase Contenedor con todas las funcionalidades requeridas
✓ Clase Principal con menú completo de 22 opciones
✓ Validaciones de datos implementadas
✓ Documentación JavaDoc completa
✓ Comentarios explicativos para no programadores
✓ Estructura de paquetes organizada
✓ Manejo de errores en entrada de datos
✓ Datos de prueba para demostración
✓ Función de limpieza de datos

================================================================

INSTRUCCIONES DE USO:
================================================================

1. Compilar el proyecto: javac -cp src src/main/Principal.java
2. Ejecutar el programa: java -cp src main.Principal
3. Seguir las opciones del menú principal
4. Opción 20: Cargar datos de prueba para explorar funcionalidades
5. Opción 21: Borrar todos los datos para comenzar desde cero
6. Seleccionar opción 22 para salir del sistema

================================================================

TECNOLOGÍAS UTILIZADAS:
================================================================

- Java 21
- Programación Orientada a Objetos
- Herencia y Polimorfismo
- Interfaces
- Colecciones (ArrayList)
- Validaciones de entrada
- Documentación JavaDoc

================================================================

FECHA DE ENTREGA: 2024
VERSIÓN: 1.0
