package memoriaarrayslistas.exerciciosvetores.entities;

public class StudentsRoom {
    public String nome;
    public String email;

    public StudentsRoom(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String toString(){
        return " Name: " + nome + "|| Email: " + email;
    }
}
