package com.uco.myproject.dominio.validador;

public class validadorAtributos {

    private static final String PATRON_CONTRASENA = "^(?=.*[a-z])(?=.*[A-Z])(?=.*?[0-9]).{8,}$";
    private static final String PATRON_CORREO = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void longitudContrasena(String valor, String mensaje)
    {
        if(valor.length()>=8 && valor.length()<=15)
        {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static boolean patronDeAceptacionClave(String dato, String patron)
    {
        return dato.matches(patron);
    }

    public static boolean patronDeAceptacionCorreo(String dato, String patron)
    {
        return dato.matches(patron);
    }

    public static void implemetacionCaracteresEspecialesPassword(String clave, String mensaje)
    {
        if(!patronDeAceptacionClave(clave, PATRON_CONTRASENA))
        {
            throw new IllegalArgumentException(mensaje);
        }
        else{
            validadorAtributos.longitudContrasena(clave, mensaje);
        }
    }

    public static void implemetacionCaracteresEspecialesCorreo(String correo, String mensaje)
    {
        if(!patronDeAceptacionCorreo(correo, PATRON_CORREO))
        {
            throw new IllegalArgumentException(mensaje);
        }
    }

}
