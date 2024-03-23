1.- Three branches were created within the repository with the following nomenclature: cabrales_backend, cabrales_frontend, cabrales_bd.
2.- Create a database script that should contain the following:
2.1 Create the database, the name should be as follows: bd_cabrales.
2.2 A table called 'person' with the fields (id, name, lastname, birthdate, position, and salary).
2.3 The id field must be auto-incremental."


--------Date BASE -----

CREATE DATABASE bd_cabrale;


CREATE TABLE person (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    apellido VARCHAR(255),
    puesto VARCHAR(255),
    sueldo INT(10, 2)
);


create usr 

CREATE USER 'conexion'@'localhost' IDENTIFIED BY '123456';

GRANT ALL PRIVILEGES ON *.* TO 'conexion'@'localhost' WITH GRANT OPTION;

--------------------Spring boot (backend)----------------------
-GET
-POST
-OPTION
-DELETEE

---CREATE MODEL---
@Table (name = "person")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String name;
    private String apellido;
    private String puesto;
    private int sueldo;
    public Long getId() {
        return id;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Long id) {
        this.id = id;
    }



------ROUTERS POSTMAN------
http://localhost:8080/user      ------GET LIST ----
[
    {
        "id": 1,
        "name": "francisco",
        "apellido": "cabrales",
        "puesto": "developer",
        "sueldo": 20
    },
    {
        "id": 2,
        "name": "fernando",
        "apellido": "perez",
        "puesto": "administ",
        "sueldo": 2169
    },
    {
        "id": 3,
        "name": "Rosa",
        "apellido": "Rodriguez",
        "puesto": "Magnament",
        "sueldo": 12346
    }
]



http://localhost:8080/user/1      ------GET BY ID ----
{
    "id": 1,
    "name": "francisco",
    "apellido": "cabrales",
    "puesto": "developer",
    "sueldo": 20
}


http://localhost:8080/user  -----POST ADD ----
http://localhost:8080/user/{ID}  -----DELETE ----





-----FRONTEND ---------

---LIST---

--![Captura de Pantalla 2024-03-23 a la(s) 17 32 04](https://github.com/FranciscoCabrales/testsfullstack/assets/60235523/04377b41-6114-45f0-961a-5d768343da80)





---EDIT----

![Captura de Pantalla 2024-03-23 a la(s) 17 34 21](https://github.com/FranciscoCabrales/testsfullstack/assets/60235523/a26d0961-ea0d-444d-82a7-d2fc5512407d)





----SAVE-----


![Captura de Pantalla 2024-03-23 a la(s) 17 34 56](https://github.com/FranciscoCabrales/testsfullstack/assets/60235523/9e85d1af-257f-4164-93c4-44c1989a03b0)















