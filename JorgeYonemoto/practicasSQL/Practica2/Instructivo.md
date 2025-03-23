# **Instructivo sobre creación de tablas relacionadas entre si**

## **Pasos:**
1. **Buscar la terminal linux en Windows:**
    - En mi caso no tengo Linux, por eso recurrí a instalar una máquina vitual en Windows y se abrirá presionando la tecla Windows y escribiendo en la barra de búsqueda WSL
    ![Busqueda de la terminal en Linux en Windows](Practica2/WSL.png)

2. **Abrir la terminal Linux en Windows:**
    - Una vez realizado el paso 1 se abrirá una venta de la siguiente manera:
    ![Apertura de la terminal Linux en Windows](Practica2/TerminaLinux.png)

3. **Entrar a postgresql:**
    - Haremos uso del siguiente comando de Linux para entrar a postgresql la sintaxis es la siguiente:
    ![Entrar a postgresql](Practica2/comando.png)
    - Para este punto ya deberíamos tener configurado PostgreSQL, finalizado el paso anterior, nos perdira nuestra contraseña para acceder a la terminal:
    ![Acceder a PostgreSQL](Practica2/Contraseña.png)
    ![Dentro de PostgreSQL](Practica2/PostgreSQL.png)
4. **Entrar a la terminal psql con el usuario admin:**
    - Una vez dentro de PostgreSQL, accederemos a la terminal psql para poder continuar con nuestro ejercicio, pero antes debemos entrar con nuestro usuario admin en mi caso es user_itiz y escribiremos el siguiente comando:
    ![Terminal psql](Practica2/psql.png)
    - Nos solicitará escribir la contraseña que asiganmos al user_itiz al crearlo:
    ![Acceder a la terminal](Practica2/psql.png)
    - Una vez accedemos a la terminal psql entraremos a la base de datos que tambien creamos al configurar nuestro usuario en este caso user_itiz y su respectiva base de datos es db0
    ![Base de Datos db0](Practica2/psql.png)

5. **Creacion de la base de datos y Esquema:**
    - Comenzaremos con el requerimiento que nos solicita realizar una base de datos y un esquema para que podamos crear nuestras tablas, para crear cada uno los comandos son los siguientes:
    ![Base de datos](Practica2/CreaciónDByEsquema.png)

6. **Creación de las tablas:**
    - Una vez creada nuestra base de datos y esquema, podemos continuar con la creacion de nuestras tablas en este caso, como solicita el requerimiento es crear 2 tablas que tengan relación entre si y que tengas 3 atributos(columnas) y 10 registros(filas), utilizaremos el sigueinte comando:
    ![Creación de tablas](Practica2/Creacióndetablas.png)

7. **Registro de datos:**
    - Finalizado la creación de nuestras tablas, procederemos a realizar los registros de información en cada una de ellas, la primer tabla tiene una clave primaria y segunda tabla tiene una clave foránea, utilizarémos el siguente comando:
    ![Registro de datos](Practica2/Registrodedatostabla1.png)
    ![Registro de datos](Practica2/Registrodedatostabla2.png)
    - Para finalizar realizaremos consultas de ambas tablas para que se muestre la información que recién agregamos.


