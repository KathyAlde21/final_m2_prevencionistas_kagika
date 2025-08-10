**_<h1 align="center">:vulcan_salute: Evaluación Final Modulo 2 Grupal :computer:</h1>_**

**<h2>Proyecto Desarrollado por:</h2>**
<ul>
    <li>Katherine Alderete Gómez</li>
    <li>Katrina González Alarcón</li>
    <li>Giorgio Interdonato Palacios</li>
</ul>

**<h3>:blue_book: Contexto del Problema:</h3>**

<p>En la última década, han aumentado los índices de accidentabilidad, especialmente en las empresas del rubro industrial, minero y construcción. Las cifras son alarmantes, a pesar de las leyes y normativas que obligan a las empresas a tomar todas las medidas necesarias para protegerla vida y salud de los trabajadores.</p>

<p>Para dar cumplimiento a la normativa y mantener ambientes de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría profesional, lo cual representa un costo elevado y fomenta la disminución o la no implementación de medidas necesarias para la seguridad.</p>

<p>Muchas de las empresas que han optado por no invertir en asesoría preventiva, se ven expuestas a aplicación de multas de las entidades fiscalizadoras, gastos por días perdidos en accidentabilidad, bajas en la producción, alzas en el pago de cotizaciones (al organismo administrador del seguro de accidentes del trabajo, ley 16.744), entre otros. Además, hay que considerar posibles demandas y pagos de indemnizaciones a los trabajadores y familiares afectados por accidentes del trabajo.</p>

<p>Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos laborales y necesita una solución tecnológica que ayude a administrar los procesos que se deben ejecutar en cada una de las empresas que son clientes de la compañía.</p>

<p>Este servicio finalmente pretende ofrecer una solución completa en prevención de riesgos para las empresas a un costo razonable, cumpliendo estrictamente todos los procesos necesarios para dar cumplimiento a la normativa vigente, mejorando los ambientes de trabajo, la productividad, contribuyendo a un ahorro económico.</p>

**<h3>:orange_book: Problema Identificado:</h3>**

<p>La empresa no posee un sistema de información que le permita administrar toda la cantidad de información que se genera, ni controlar las actividades y el recurso humano.</p>

<p>Existen problemas con la planificación de las visitas, generalmente los profesionales están en terreno por lo que no están disponibles para informarles sus actividades futuras.</p>

<p>No existe registro del profesional que ha estado con mayor actividad ni se sabe dónde está cada uno.</p>

<p>Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el cliente. Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la ejecución de la capacitación, lo que trae consigo multas para la empresa.</p>

<p>No se tiene un control de los clientes que pagan y los que no, lo que hace que muchas actividades de los profesionales corran por cuenta de la empresa, generando desbalances financieros.</p>

<p>Las actividades se registran en carpetas lo que dificulta el seguimiento de las asesorías y el resumen de resultados por empresa.</p>

<p>Además, generalmente no se cumplen ciertas actividades de control de implementación de soluciones y a veces no se ha cumplido con la dirección del trabajo, lo que genera multas para los clientes, bajando la calidad del servicio.</p>

<p>Los profesionales que han atendido la empresa esporádicamente han variado, no existiendo un registro de la totalidad de actividades preventivas realizadas y no se tiene certeza de los avances.</p>

**<h3>:green_book: Planteamiento de la Solución:</h3>**

<p>Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información para la empresa y sus clientes.</p>

<p>El sistema debe permitir la planificación de actividades y el control de ejecución de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales y los clientes para la respuesta temprana ante incidentes de seguridad.</p>

<p>Además, se requiere que el sistema genere reportes y estadísticas que ayuden a tomar de decisiones y mejorar el rendimiento de la empresa, considerando la carga laboral, y la demanda de clientes y las actividades que cada uno involucra para el cumplimiento de los contratos.</p>

<p>Es imprescindible, mantener comunicación con los profesionales en todo momento, aún en terreno, y darle la posibilidad de realizar todas sus actividades aun no teniendo conectividad (internet), ya que muchas empresas se encuentran en zonas donde no hay conexión de ese tipo.</p>

**<h3>:blue_book: Solución Implemntada:</h3>**

<p>Hasta el momento se han definido algunas entidades que darán vida al sistema, y las validaciones que se aplicarán en cada atributo. Estas son:</p>

**Usuario:**
<ul>
    <li>Nombre: obligatorio, mínimo 10 caracteres, máximo 50</li>
    <li>Fecha de nacimiento: obligatorio, independiente si lo declara como una fecha o string, debe ser desplegado con el formato DD/MM/AAAA</li>
    <li>RUN: corresponde a un número menor a 99.999.999</li>
</ul>

**Cliente:**
<ul>
    <li>RUT: corresponde a un número menor a 99.999.999</li>
    <li>Nombres: obligatorio, mínimo 5 caracteres, máximo 30</li>
    <li>Apellidos: obligatorio, mínimo 5 caracteres, máximo 30</li>
    <li>Teléfono: obligatorio</li>
    <li>AFP: mínimo 4 caracteres, máximo 30</li>
    <li>Sistema de salud: 1 (Fonasa) o 2 (Isapre), debe ser solo una de las dos opciones indicadas</li>
    <li>Dirección: máximo 70 caracteres</li>
    <li>Comuna: máximo 50 caracteres</li>
    <li>Edad: obligatorio, número mayor o igual a cero, y menor a 150</li>
</ul>

**Profesional:**
<ul>
    <li>Título: obligatorio, mínimo 10 caracteres, máximo 50</li>
    <li>Fecha de ingreso: independiente si lo declara como una fecha o un String, debe ser desplegado con el formato DD/MM/AAAA</li>
</ul>

**Administrativo:**
<ul>
    <li>Área: obligatorio, mínimo 5 caracteres, máximo 20</li>
    <li>Experiencia previa: máximo 100 caracteres</li>
</ul>

**Capacitación:**
<ul>
    <li>Identificador: obligatorio, número interno de la capacitación manejado por la empresa</li>
    <li>RUT cliente: obligatorio</li>
    <li>Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y “Domingo” (en ese formato)</li>
    <li>Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)</li>
    <li>Lugar: obligatorio, mínimo 10 caracteres, máximo 50</li>
    <li>Duración: máximo 70 caracteres</li>
    <li>Cantidad de asistentes: obligatorio, número entero menor que 1000</li>
</ul>

**Accidente:**
<ul>
    <li>Identificador del accidente: obligatorio, número interno manejado por la compañía.</li>
    <li>RUT Cliente: obligatorio</li>
    <li>Día: fecha del accidente, independiente si lo declara como una fecha o un String, debe ser desplegado con el formato DD/MM/AAAA</li>
    <li>Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)</li>
    <li>Lugar: obligatorio, mínimo 10 caracteres, máximo 50</li>
    <li>Origen: máximo 100 caracteres</li>
    <li>Consecuencias: máximo 100 caracteres</li>
</ul>

**Visita en terreno**
<ul>
    <li>Identificador de la visita en terreno: obligatorio, número interno manejado por la compañía.</li>
    <li>RUT cliente: obligatorio</li>
    <li>Día: fecha del accidente, independiente si lo declara como una fecha o un String, debe ser desplegado con el formato DD/MM/AAAA</li>
    <li>Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)</li>
    <li>Lugar: obligatorio, mínimo 10 caracteres, máximo 50</li>
    <li>Comentarios: máximo 100 caracteres</li>
</ul>

**Revisión**
<ul>
    <li>Identificador de la revisión: obligatorio, número interno manejado por la compañía.</li>
    <li>Identificador de la visita en terreno: obligatorio, número de la vista a la que se asóciala revisión.</li>
    <li>Nombre alusivo a la revisión: obligatorio, mínimo 10 caracteres, máximo 50</li>
    <li>Detalle para revisar: máximo 100 caracteres</li>
    <li>Estado: 1 (sin problemas), 2 (con observaciones), 3 (no aprueba), solo se pueden ingresar los valores antes indicados.</li>
</ul>

**Respecto de las clases anteriores se conoce lo siguiente:**
<ul>
    <li>Un cliente puede tener una o muchas capacitaciones.</li>
    <li>Un cliente puede registrar ninguno o muchos accidentes.</li>
    <li>Un cliente debe tener una o muchas visitas en terreno.</li>
    <li>Una visita en terreno debe tener una o más revisiones por cada ocasión.</li>
    <li><b>Todas las clases antes indicadas deben tener claramente declarados sus atributos</b> (definir el tipo de dato es parte de la solución), método toString (), un constructor que no reciba parámetros, un constructor que reciba todos los atributos de la clase como parámetros, métodos mutadores y métodos acceso res.</li>
    <li>Debe crear también una interface llamada Asesoría, la que debe tener declarado el método analizarUsuario (). Recuerde que, al ser una interface, solo deberá considerar la declaración del método.</li>
    <li>Las <b>clases Profesional, Administrativo y Cliente deben extender desde la clase Usuario</b>. Además, se pide que en cada clase existan los métodos adicionales siguientes:</li>
    <ul>
        <li><b>Usuario:</b> el método mostrarEdad (), el cual retorna un mensaje que diga “El usuario tiene X años” y en donde X es la edad del usuario en cuestión, y el método analizar Usuario (), que despliegue el nombre y el RUN. Considere que esta clase debe implementar la interface Asesoría.</li>
        <li><b>Cliente:</b> el método obtenerNombre(), que retorna un String con el nombre completo del cliente (nombres + apellidos), el método obtenerSistemaSalud() que de acuerdo al valor registrado en el objeto despliega el tipo de sistema de salud, y el método analizarUsuario() que debe desplegar los datos del método del mismo nombre correspondiente a la clase padre y la dirección del cliente junto con la comuna.</li>
        <li><b>Profesional:</b> debe implementar el método analizarUsuario(), el que debe desplegar los datos del método del mismo nombre de la clase padre, y el título y fecha de ingreso del profesional.</li>
        <li><b>Administrativo:</b> el método analizarUsuario(), el cual debe mostrar los datos del método del mismo nombre correspondiente a la clase padre, junto con el área a la que pertenece el administrativo y su experiencia previa.</li>
        <li><b>Capacitación:</b> el método mostrarDetalle(), que retorna un mensaje con el texto “La capacitación será en A a las B del día C, y durará D minutos”, en donde A es el lugar, B es la hora, C es el día y D son los minutos.</li>
        <li>Cree la clase **Contenedor**, la cual deberá tener declarado como atributos dos listas: una lista de instancias de la interface Asesoria, y una lista de objetos de la clase Capacitacion. En la primera lista pueden ser almacenados distintos tipos de usuarios. Los métodos que debe contener esta clase son:</li>
        <li><b>Almacenar cliente:</b> permite agregar un nuevo cliente a la lista de instancias de la interface Asesoria.</li>
        <li><b>Almacenar profesional:</b> permite agregar un nuevo profesional a la lista de instancias de la interface Asesoria.</li>
        <li><b>Almacenar administrativo:</b> permite agregar un nuevo administrativo a la lista de instancias de la interface Asesoria.</li>
        <li><b>Almacenar capacitación:</b> permite agregar una nueva capacitación a la lista de instancias de la clase Capacitación.</li>
        <li><b>Eliminar usuario:</b> permite eliminar un usuario desde la lista de interfaces de Asesoría acuerdo con el RUN del usuario.</li>
        <li><b>Listar usuarios:</b> permite desplegar la lista completa de usuarios, independiente del tipo. En este método solo se deben desplegar los datos de la clase usuario.</li>
        <li><b>Listar usuarios por tipo:</b> recibe un tipo de usuario (cliente, administrador o profesional), y retorna los datos respectivos según el tipo de usuario.</li>
        <li><b>Listar capacitaciones:</b> este método despliega las capacitaciones registradas en la lista respectiva, junto con los datos del cliente al que está asociada dicha capacitación.</li>
    </ul>
    <li>Finalmente, cree la <b>clase Principal</b>, la que tendrá como objetivo crear una instancia de la clase Contenedor, lo que creará con ello las dos listas que considera esta clase. Posterior a esto, deberá crear un menú principal con nueve opciones: ocho para las acciones indicadas en el listado anterior, y una opción para salir del programa. En caso de que se ingrese una opción incorrecta, se debe pedir nuevamente. El programa solo terminará una vez que ingrese la opción de salida.</li>
</ul>

**<h3>:orange_book: Algunas consideraciones:</h3>**
<ul>
    <li>Como entregable, se pide subir a la plataforma respectiva en la sección creada para dicho efecto, un archivo comprimido en el que se disponga el proyecto creado de manera completa.</li>
    <li>Además, se solicita subir el proyecto a un repositorio GitHub. Esto es parte del portafolio que se solicita a cada alumno.</li>
</ul>

**<h3>:green_book: Entregable:</h3>**
<ul>
    <li>Componentes para evaluar: Debe entregar su respuesta en un archivo de extensión *.rar o*.zip.</li>
    <li>Deberá realizar la actividad según requerimientos técnicos, el resultado deberá ser entregado como un proyecto Java, acompañado por archivo de texto plano Readme.txt, contextualizando el problema y planteamiento de la solución.</li>
    <li>La solución deberá ser gestionada a repositorio GitHub para su posterior revisión.</li>
</ul>

**<h3>:blue_book: Estructura:</h3>**

```
📁src/
├── 📁main/
│   └── Principal.java (Clase principal con menú del sistema)
├── 📁menu/
│   ├── MenuCliente.java (Gestión de clientes)
│   ├── MenuUsuario.java (Gestión general de usuarios)
│   ├── MenuProfesional.java (Gestión de profesionales)
│   ├── MenuAdministrativo.java (Gestión de administrativos)
│   ├── MenuCapacitacion.java (Gestión de capacitaciones)
│   ├── MenuAccidente.java (Gestión de accidentes)
│   ├── MenuVisitaTerreno.java (Gestión de visitas a terreno)
│   └── MenuRevision.java (Gestión de revisiones)
├── 📁modelo/
│   ├── Usuario.java (Clase abstracta base)
│   ├── Cliente.java (Extiende Usuario)
│   ├── Profesional.java (Extiende Usuario)
│   ├── Administrativo.java (Extiende Usuario)
│   ├── Capacitacion.java (Entidad de capacitación)
│   ├── Accidente.java (Entidad de accidente)
│   ├── VisitaTerreno.java (Entidad de visita a terreno)
│   ├── Revision.java (Entidad de revisión)
│   └── Asesoria.java (Interfaz para análisis de usuarios)
├── 📁servicio/
│   └── Contenedor.java (Clase contenedora principal)
└── 📁util/
    └── Validador.java (Clase de validaciones)

```

**<h3>:book: Ejemplo de Salida:</h3>**

<img src="./img/menu_consola_menu_principal.java.jpg" alt="" style="width: 100%;">

**<h3>:blue_book: Requerimientos Cumplidos:</h3>**
<ul>
    <li>Todas las clases implementadas con atributos, constructores, getters y setters</li>
    <li>Interfaz Asesoria con método analizarUsuario()</li>
    <li>Herencia correcta: Cliente, Profesional y Administrativo extienden Usuario</li>
    <li>Métodos específicos implementados en cada clase</li>
    <li>Clase Contenedor con todas las funcionalidades requeridas</li>
    <li>Clase Principal con menú completo de 20 opciones</li>
    <li>Validaciones de datos implementadas</li>
    <li>Documentación JavaDoc completa</li>
    <li>Comentarios explicativos para no programadores</li>
    <li>Estructura de paquetes organizada</li>
    <li>Manejo de errores en entrada de datos</li>
</ul>

**<h3>:orange_book: Instrucciones de Uso:</h3>**
<ul>
    <li>Compilar el proyecto: javac -cp src src/main/Principal.java</li>
    <li>Ejecutar el programa: java -cp src main.Principal</li>
    <li>Seguir las opciones del menú principal</li>
    <li>Ingresar datos según las validaciones solicitadas</li>
    <li>Seleccionar opción 20 para salir del sistema</li>
</ul>

**<h3>:green_book: Tecnologías Utilizadas:</h3>**
<ul>
    <li>Java 21</li>
    <li>Programación Orientada a Objetos</li>
    <li>Herencia y Polimorfismo</li>
    <li>Interfaces</li>
    <li>Colecciones (ArrayList)</li>
    <li>Validaciones de entrada</li>
    <li>Documentación JavaDoc</li>
</ul>

