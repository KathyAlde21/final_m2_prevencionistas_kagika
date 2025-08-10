package modelo;

/**
 * Interfaz Asesoria que define el contrato para análisis de usuarios del sistema.
 * 
 * <p>Esta interfaz establece el método analizarUsuario() que debe ser implementado
 * por todas las clases que representen usuarios en el sistema de prevención de riesgos.</p>
 * 
 * <p>La interfaz permite el polimorfismo y la gestión unificada de diferentes tipos
 * de usuarios (clientes, profesionales, administrativos) a través de un contrato común.</p>
 * 
 * <p>El método analizarUsuario() está diseñado para mostrar información relevante
 * de cada tipo de usuario, facilitando la generación de reportes y análisis del sistema.</p>
 * 
 * @author Katherine Alderete Gómez
 * @author Katrina González Alarcón  
 * @author Giorgio Interdonato Palacios
 * @version 1.0
 * @since 2024
 */

public interface Asesoria {
	/**
     * Método que permite analizar los datos del usuario.
     * 
     * <p>Este método debe ser implementado por todas las clases que representen
     * usuarios en el sistema. Debe mostrar información relevante del usuario
     * de manera legible y organizada.</p>
     * 
     * <p>La implementación puede variar según el tipo de usuario, mostrando
     * información específica de cada clase (datos básicos, información de contacto,
     * datos profesionales, etc.).</p>
     * 
     * <p>Es utilizado para generar reportes y análisis del sistema de prevención
     * de riesgos laborales.</p>
     */
    void analizarUsuario();
}
