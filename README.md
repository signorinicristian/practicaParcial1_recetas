# Practica Parcial1 de Objetos II

## Consideraciones Iniciales

- El código entregado debe compilar obligatoriamente. Un parcial entregado cuyo código no compila queda desaprobado automáticamente.

- Se realizará un control exhaustivo, incluyendo distintas herramientas de análisis estático de código para identificar posibles copias entre las soluciones entregadas.

- La solución debe aplicar patrones de diseño apropiados para la problemática planteada.

- El código entregado debe tener los test suficientes que garantice el correcto funcionamiento de la solucion que propone el alumno

- No se aceptan entregas fuera de plazo ni que no estén correctamente subidas al repositorio del classroom de la materia

# 🥗 Recetas Saludables del Nutricionista 🍲

Un nutricionista nos pidió que modelemos un sistema que le permita definir las recetas para recomendar a clientes. Nuestro nutricionista siempre intenta que todos los clientes estén satisfechos con su comida 😋.

---

## 🎯 ¿Te gusta la Receta?

Cada cliente conoce el **criterio de recetas** que le gustan. Existen los siguientes criterios:

- 🟢 **Come Tutti**: cualquier receta le gusta. Es el criterio por defecto de todos los clientes ya que lógicamente el nutricionista no conoce de antemano sus gustos.
- 🥩 **Alto Valor Nutricional**: le gustan las recetas que aporten más de una cierta cantidad mínima de calorías.
- 🥑 **Premium**: quieren que la receta sea de alguno de sus autores preferidos. En el criterio se debe configurar de autores preferidos (ej. "Gato Dumas", "Francis Mallmann", "Germán Martitegui").
- 🕰️ **Recetas Tradicionales**: le gustan las recetas tradicionales.


---

## 🍛 Recetas 

Las recetas tienen definido un **nombre**, **autor**, **valor nutricional base** y **años de tradición**. Por ahora solo nos interesa las recetas calóricas (podemos llamarle Receta a secas) pero más adelante pueden surgir nuevas.
Se define que una receta es **tradicional** si tiene **al menos 20 años de tradición** 🕰️.
Además, a cada receta se la puede "customizar" según decisión del nutricionista. En esa línea, podría agregarse a cada una ingredientes que irán a aportar más valor nutricional. De momento se conocen los siguientes y más adelante nuestro sistema debe soportar agregar más:
- semillas de chia: 490
- rodajas de palta: 160
- frutos secos: 594

## 👥 Clientes 
De los clientes solo nos interesa conocer su **DNI** 🪪 y el **criterio** de receta que le gusta. Cada cliente puede cambiar su criterio cuando lo desee.  
Su **DNI, en cambio, nunca se puede cambiar**.  
Por otro lado, también lleva el registro de las **recetas recibidas** 📜.
Cada cliente nos debe poder decir la lista de sus recetas incluyendo el valor total nutricional de cada una.
---

## 👨‍🍳 El Nutricionista

El nutricionista es quien nos encargó el sistema y quien tiene la **lista de recetas disponibles** 📒. 
Se permite agregar nuevas recetas.

Cuando el nutricionista ejecuta la acción de **visitar a un cliente** ocurre lo siguiente:

- Busca en su lista la **primera receta adecuada** que encuentre para el cliente.
- Según su criterio, le agrega alguno o varios ingredientes adicionales (y nutricionales) para darle al cliente.
- En caso de que **ninguna receta resulte adecuada**, se debe generar una receta de emergencia con:

  - **nombre**: “batido mágico"
  - **autor**: en este caso es el nombre del nutricionista.
  - **valor nutricional base**: 2000 calorías saludables
  - **tradición**: 0 años
  
## Restricciones de Diseño
- No se permite modificar las recetas base cada vez que el nutricionista decide agregarle alguno al momento de darsela al cliente.
- El sistema debe quedar preparado para incorporar nuevos ingredientes nutricionales en el futuro sin romper código existente.
- Las responsabilidades deben estar correctamente distribuidas entre objetos.
