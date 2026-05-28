package ar.edu.unahur.obj2.practicaparcial1.Receta;

public class Receta implements IReceta {
    private String nombre;
    private String autor;
    private Integer valorNutricionalBase;
    private Integer añosDeTradicion;

    public Receta(String nombre, String autor, Integer valorNutricionalBase, Integer añosDeTradicion) {
        if (añosDeTradicion < 0) {
            throw new IllegalArgumentException("Los años no pueden ser menores a 0.");
        }
        this.nombre = nombre;
        this.autor = autor;
        this.valorNutricionalBase = valorNutricionalBase;
        this.añosDeTradicion = añosDeTradicion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public Integer getValorNutricionalBase() {
        return valorNutricionalBase;
    }

    public void setValorNutricionalBase(Integer valorNutricionalBase) {
        this.valorNutricionalBase = valorNutricionalBase;
    }

    @Override
    public Integer getAñosDeTradicion() {
        return añosDeTradicion;
    }

    public void setAñosDeTradicion(Integer añosDeTradicion) {
        this.añosDeTradicion = añosDeTradicion;
    }

    @Override
    public Boolean esTradicional() {
        return Boolean.valueOf(añosDeTradicion >= 20);
    }
}
