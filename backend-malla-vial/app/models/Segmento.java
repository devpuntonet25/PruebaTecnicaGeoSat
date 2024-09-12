package models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Segmento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;

    private Integer longitud;

    private String nomenclatura;

    /*@OneToMany(mappedBy = "segmento", fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private List<Calzada> calzadasList;*/

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    /*
    public List<Calzada> getCalzadasList() {
        return calzadasList;
    }

    public void setCalzadasList(List<Calzada> calzadasList) {
        this.calzadasList = calzadasList;
    }*/
}
