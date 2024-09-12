package models;

import jakarta.persistence.*;

@Entity
public class Bordillo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bordillo_codigo")
    private Long codigo;

    @Column(name = "bordillo_longitud")
    private Integer longitud;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_calzada", referencedColumnName = "calzada_codigo")
    private Calzada calzada;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Calzada getCalzada() {
        return calzada;
    }

    public void setCalzada(Calzada calzada) {
        this.calzada = calzada;
    }
}
