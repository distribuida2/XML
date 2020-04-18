# XML - ejemplos básicos 

## Validar archivo XML y DTD de manera offline

Este script valida que el XML y el DTD asociado estén correctamente validados.

### Prerequisitos

- Tener PHP instalado

### Validación DTD

```bash
php validation_against_dtd.php path_archivo_xml.xml
```

Por ejemplo, parados en la carpeta **DTD/01.basico** podemos ejecutar

```bash
php ../validation_against_dtd.php quilmes.xml
```

## Validar un XML Schema de manera offline

Hay varios validadores online, pero si no tenemos internet, en este repositorio,dentro del directorio **XSD** existe un script PHP que valida que el archivo de esquema sea válido y que el XML respete el XML Schema. 

### Prerequisitos

- Tener PHP instalado
- Tener la libreria php-dom instalada (en Ubuntu/Debian sudo apt-get install -y php-dom)

### Validación

```bash
php validating_against_schema.php path_archivo.xml path_esquema.xsd
```

Por ejemplo, parados en la carpeta **XSD/01.basico** podemos ejecutar

```bash
php ../validating_against_schema.php quilmes.xml formacion.xsd
```

## Apunte de clase

https://docs.google.com/document/d/1tpnrrEKxbyeYndQxZjpakXcQOqfqx_bGJ3AE40DJoAg/edit#heading=h.y6f1qbwm0xeq


