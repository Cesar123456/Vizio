package Main;

import java.util.ArrayList;

public class Clase {

    private String nombre;
    private ArrayList<Atributo> atributos = new ArrayList();
    private ArrayList<Interface> interfaces = new ArrayList();
    private ArrayList<Método> métodos = new ArrayList();
    private Clase padre;
    private String visibilidad = "";
    private boolean abstracto;

    public Clase() {
    }

    public Clase(String nombre, Clase padre, boolean abstracto) {
        this.nombre = nombre;
        this.padre = padre;
        this.abstracto = abstracto;
    }

    public void createConstructor() {
        Método constructor = new Método(nombre, "", "", "public", false);
        String cuerpo = "\n";
        for (Atributo atributo : atributos) {
            cuerpo += "this." + atributo.getNombre() + " = " + atributo.getNombre();
        }
        Método constructorS = new Método(nombre, "", cuerpo, "public", false);
        for (Atributo atributo : atributos) {
            constructorS.getParametros().add(atributo);
        }
        métodos.add(constructor);
        métodos.add(constructor);
    }

    public Clase(boolean abstracto) {
        this.abstracto = abstracto;
    }

    public boolean isAbtracto() {
        return abstracto;
    }

    public void setAbtracto(boolean abtracto) {
        this.abstracto = abtracto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;

    }

    public ArrayList<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(ArrayList<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public ArrayList<Método> getMétodos() {
        return métodos;
    }

    public void setMétodos(ArrayList<Método> métodos) {
        this.métodos = métodos;
    }

    public Clase getPadre() {
        return padre;
    }

    public void setPadre(Clase padre) {
        this.padre = padre;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
