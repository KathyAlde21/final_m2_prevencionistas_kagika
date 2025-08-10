@echo off
echo ========================================
echo    SISTEMA DE PREVENCION DE RIESGOS
echo    Prevencionistas KaGiKa
echo ========================================
echo.

echo Compilando el proyecto...
javac -cp src src/main/Principal.java

if %errorlevel% neq 0 (
    echo.
    echo ERROR: No se pudo compilar el proyecto.
    echo Verifique que Java esté instalado y configurado correctamente.
    pause
    exit /b 1
)

echo.
echo Compilacion exitosa!
echo.
echo Ejecutando el programa...
echo.

java -cp src main.Principal

echo.
echo Programa finalizado.
pause
