package ar.edu.unlp.info.oo1;

import com.sun.source.doctree.EscapeTree;

import java.time.LocalDate;

public class Mamifero {
    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero madre;
    private Mamifero padre;

    public Mamifero(){
        this.identificador = "Sin Identificador";
        this.especie = "Desconocida";
        this.fechaNacimiento = LocalDate.now();
    }

    public Mamifero(String identificador){
        this.identificador = identificador;
        this.especie = "Desconocida";
        this.fechaNacimiento = LocalDate.now();
    }

    public Mamifero(String identificador, String especie) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaNacimiento = LocalDate.now();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getAbuelaMaterna(){
        if(this.madre != null){
            return this.madre.getMadre();
        }
        return null;
    }

    public Mamifero getAbueloMaterno(){
        if(this.madre != null){
            return this.madre.getPadre();
        }
        return null;
    }

    public Mamifero getAbueloPaterno(){
        if(this.padre != null){
            return this.padre.getPadre();
        }
        return null;
    }

    public Mamifero getAbuelaPaterna(){
        if(this.padre != null){
            return this.padre.getMadre();
        }
        return null;
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero){
        if(this.madre != null){
            if(this.madre.equals(unMamifero)){
                return true;
            }
            if(this.madre.tieneComoAncestroA(unMamifero)){
                return true;
            }
        }
        if(this.padre != null){
            if(this.padre.equals(unMamifero)){
                return true;
            }
            return this.padre.tieneComoAncestroA(unMamifero);
        }
        return false;
    }


}
