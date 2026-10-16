# Explicación de eleccion en estructura de datos y algoritmos

## Array de votos tipo (int).
- Almacena en el array los votos hacia cada candidato. 
- tamaño : en nuestro caso ha sido tres candiadtos y le sumo 2 que seria **Nulos** y **Abstencion**.
- Iriamos aumentando segun vayan entrando votos hacia cada persona.
- Desde mi punto de vista el primer espacio de este array seria para el primer candiadto, el segundo para el segundo candidato y asi sucesivamente.

## Array de candidatos (string).
- tamaño de inicializacion: dependera de los candidatos de la votación.
- Sera un array de tipo string por ejemplo por ejemplo-> Jacobo,Hugo,Hector,Nulo,Abstencion **--->** para almacenar los nombres de los candidatos.

| Array | Tipo de dato | Tamaño | Funcionamiento |
|---|---|---|---|
| Array de votos | `int` | 5 posiciones (3 candidatos + Nulos + Abstención) | Almacena los votos de cada candidato. El valor de cada posición aumenta a medida que se registran votos. Cada posición corresponde a un candidato o a las categorías Nulos y Abstención. |
| Array de candidatos | `string` | 3 posiciones (número de candidatos) | Almacena los nombres de los candidatos. Ejemplo: Jacobo, Hugo y Hector. |
