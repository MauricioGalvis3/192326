🔥 Desafío Salarial: El Controlador de Nómina
Contexto:

Eres parte del escuadrón de élite que mantiene en orden los datos de una empresa donde algunos empleados parecen creer que los sueldos negativos son una realidad alterna válida. Tu misión (sí, aceptada) es desarrollar un sistema robusto que no se deje engañar por errores humanos ni por cifras ilógicas.

🎯 Tu objetivo:

Crear un programa en Java que ayude a controlar la nómina de 10 empleados, validando cada paso como un auténtico vigilante de la lógica.


🧠 Requisitos de la misión:
🗣️ Pide amablemente (o no tan amablemente) el sueldo de cada empleado.

💡 Spoiler: Si el sueldo es negativo o cero... no lo aceptes. Devuélvelo al inframundo y vuelve a preguntar.

🧮 Si el sueldo está en el rango entre $100 y $300, cuenta ese sueldo como un guerrero del equilibrio.

💥 Sí, incluye el $100 y el $300. Los extremos también tienen derechos.

🚀 Si el sueldo es mayor a $300, márcalo como un sueldo VIP.

💰 Suma todos los sueldos ingresados en una variable double.

🎨 Pero al final, imprímelo bonito usando float... así la gerencia no se asusta con demasiados decimales.

🧾 Al final de la jornada, reporta:

Cuántos sueldos entraron en el rango de la justicia ($100 - $300).

Cuántos sueldos VIP superaron los $300.

El total acumulado, convertido a float como quien pone perfume antes de entregar el informe.


empezamos el problema.

importamos la biblioteca Scanner la cual nos ayudara a recibir valores de entrada del usurario.
por siguiente declararemos unas varialbles contadoras antes de usar el for que nos ayudara con el ciclo.(sueldojusto - sueldoVip - sueldototal).

ahora debemos buscar la manera de que el for nos sirva :`c.

aqui le agregamos un while para que luego evalue si el salario es menor igual a 0 y asi lo pida.

para esto tambien usaremos un if y elseif cuando se apruebe la condicion ,asi sabremos si el sueldo esta entre 100 y 300 agregaremos un sumador que agrege una al sueldo equilibrado
de esta misma forma si es mayor a 300 se le sumara una al sueldo VIP, asi tambien debemos sumar todos los sueldos anteriormente almacenados.


al momento de imprimir los sueldos debemos asignarlos a float. (float)( datos ).


asi imprimimos una tipo tabla que incluye el resultado del final de jornada , cuantos sueldos entran en el rango de justicia . los sueldos VIP y el total acomulado.























