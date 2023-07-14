<div>
<div align="center">
<img  src="https://github.com/danieltistoj/currency-converter/assets/42653664/1f5444c9-1ade-4189-b84f-890137322ece"/>
</div>  
<div align="center">
  <a href="https://www.linkedin.com/in/daniel-tistoj-315661223" target="_blank"><img height="30px" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> 
    <a href="https://www.instagram.com/danieltistoj_/" target="_blank"><img height="30px" src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a>
   <a href="https://discord.gg/W95APtpY7y" target="_blank"><img height="30px" src="https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white" target="_blank"></a> 
   <a href="https://www.facebook.com/jose.tistoj.10/" target="_blank"><img height="30px" src="https://img.shields.io/badge/Facebook-1877F2?style=for-the-badge&logo=facebook&logoColor=white"></a> 
    <a href="https://portafolio-pi-sepia.vercel.app/" target="_blank"><img height="31px" src="https://img.shields.io/badge/website-000000?style=for-the-badge&logo=About.me&logoColor=white"></a> 
 </div>
</div>


## Índice
- [Descripción](#descripción)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Funcionalidades](#funcionalidades)
  - [Conversor de Monedas](#conversor-de-monedas)
  - [Conversor de Temperatura](#conversor-de-temperatura)
  - [Conversor de Distancia](#conversor-de-distancia)
- [Uso del Programa](#uso-del-programa)
- [Video explicativo](#video-explicativo)
## Descripción
El Conversor de Monedas, Distancia y Temperatura es un programa desarrollado como parte del desafío del Grupo 5 en el programa de formación de Alura Latam. Permite realizar conversiones entre diferentes unidades de monedas, distancias y temperaturas.

## Tecnologías Utilizadas
- JDK de Java versión 14
- Librería externa org.json-chargebee
- API Exchangerate-API para obtener tasas de cambio de moneda en tiempo real

## Funcionalidades

### Conversor de Monedas
El conversor de monedas permite convertir entre diferentes monedas utilizando las tasas de cambio proporcionadas por la API Exchangerate-API. El programa realiza una solicitud HTTP a la API para obtener las tasas de cambio actualizadas y luego realiza la conversión de acuerdo con las unidades de moneda de origen y destino seleccionadas.

### Conversor de Temperatura
El conversor de temperatura permite convertir entre Celsius, Fahrenheit, Kelvin y Rankine. El código utiliza una estructura de control `if-else if` para determinar la conversión adecuada según las unidades de temperatura seleccionadas. Cada condición verifica las unidades de temperatura de origen y destino y realiza el cálculo de conversión correspondiente.

### Conversor de Distancia
El conversor de distancia proporciona la capacidad de convertir entre distintas unidades de distancia, como centímetros, metros, kilómetros, millas y pies. El código utiliza condiciones `if-else if` para determinar la conversión adecuada según las unidades de distancia seleccionadas. Cada condición realiza el cálculo de conversión correspondiente y muestra el resultado.


## Uso del Programa
1. Selecciona el tipo de conversión que deseas realizar: monedas, distancias o temperaturas.
2. Ingresa el valor que deseas convertir.
3. Especifica la unidad de origen y la unidad de destino.
4. Haz clic en el botón "Convertir" para obtener el resultado de la conversión.

## Video explicativo
[![Alt text](https://img.youtube.com/vi/hy5YeItRLNc/0.jpg)](https://www.youtube.com/watch?v=hy5YeItRLNc)



