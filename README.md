# UD02CP3 Programación de Servicios
El código está compuesto por cuatro clases, dos de ellas se dedican al comportamiento que tienen los hilos con la variable compartida
`CustomThreadSET` se dedica a incrementar de 0 a 99 el valor de la variable compartida y lo muestra en la terminal, `CustomThreadGET`
se dedica a leer el valor de la variable compartida y lo muestra en la terminal. La clase `sharedVar` crea una variable entera iniciada 
en $0$ que aumenta su valor cuando se llama. En él `main` sé instancia una única variable compartida (por obvias razones) que después se 
pasa como parámetro a los dos hilos para que ejecuten su trabajo.

El resultado final es indeterminista y algo extraordinario. En este ordenador con 24 núcleos y 24 hilos y sistema operativo W11, los hilos 
se ejecutan secuencialmente, primero el hilo `CustomThreadSET` aumenta los valores hasta $99$ (Mostrándolos en terminal en el instante) y 
después el hilo `CustomThreadGET` entra en acción y muestra en la terminal los valores, por el efecto de su "ejecución secuencial" el hilo 
`CustomThreadGET` solo muestra $99$ y en algunas ocasiones $0$.

En la versión 2.0 se ha añadido la sincronización de los métodos de la clase `sharedVar` y en los métodos `run()` de los hilos personalizados,
ahora el resultado en la terminal debe ser siempre algo como:
```text
SET: 0
GET: 0
SET: 1
GET: 1
SET: 2
GET: 2
```