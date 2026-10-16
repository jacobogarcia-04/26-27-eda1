Explicacion de eleccion en estructura de datos y algoritmos

##Array de votos tipo (int)
- Almacena en el array los votos hacia cada candidato. 
- tamaño : en nuestro caso ha sido tres candiadtos y le sumo 2 que seria **Nulos**.y **Abstencion**.
- Iriamos aumentando segun vayan entrando votos hacia cada persona.
- Desde mi punto de vista el primer espacio de este array seria para el primer candiadto, el segundo para el segundo candidato y asi sucesivamente.

##Array de candidatos(string)
- tamaño de inicializacion: dependera de los candidatos de la votacion
- Sera un array de tipo string por ejemplo por ejemplo-> Jacobo,Hugo,Hector,Nulo,Abstencion-> para almacenar los nombres de los candidatos

- | Estructura de datos | Tipo de dato | Tamaño | Descripción |
|---|---|---|---|
| Array de votos | `int` | Número de candidatos + 2 (Nulos y Abstención) | Almacena la cantidad de votos recibidos por cada candidato, además de los votos nulos y las abstenciones. Los valores se incrementan a medida que se registran los votos. Cada posición corresponde a un candidato o a una de estas dos categorías. |
| Array de candidatos | `string` | Número de candidatos + 2 | Almacena los nombres de los candidatos y las categorías adicionales de Nulos y Abstención. Por ejemplo: `["Jacobo", "Hugo", "Hector", "Nulo", "Abstencion"]`. |
