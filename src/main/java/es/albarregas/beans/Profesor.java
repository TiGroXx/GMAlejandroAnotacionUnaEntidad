package es.albarregas.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name = "profesoresAnot")
public class Profesor implements Serializable{
    
    @Id
    
    @GeneratedValue(strategy = IDENTITY)
    
    @Column(name="idProf")
    private int id;
    @Column(name = "nombre" , length = 20 , nullable=true)
    private String nombre;
    @Column(name = "ape1" , length = 15 , nullable = true)
    private String ape1;
    @Column(name = "ape2" , length = 15 , nullable = false)
    private String ape2;

    // Constructor implicito
    public Profesor() {
        
    }
    
    // Constructor explicito
    public Profesor(String nombre, String ape1, String ape2) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
    }

    /*  Existe la posibilidad de que cada atributo no tenga getters o setters pero entoces hay que especificar el atributo access="field"
        en el fichero de mapeo <property name="nombre_atributo" access="field" />
    */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }
    
    
}
