@echo off
echo Hoy es dia %date% y son las %time%
set/p nombre=Nombre de la carpeta a crear
mkdir %nombre%
echo Carpeta %nombre% creada
echo Ahora se eliminara la carpeta %nombre%
pause >nul
rmdir %nombre%
echo Todo en orden ahora :)
echo Procedemos a crear un archivo de texto vacio
set/p archivo=Nombre del archivo a crear
type nul>%archivo%
echo Archivo %archivo% creado
pause >nul
echo Eliminamos el archivo %archivo%
pause >nul
erase %archivo%
echo Continua con tu vida
pause
exit