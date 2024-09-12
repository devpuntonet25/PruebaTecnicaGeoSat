package models;

import jakarta.persistence.*;

@Entity
public class Calzada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calzada_codigo")
    private Long codigo;
    @Column(name = "calzada_longitud")
    private Integer longitud;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "numero_segmento", referencedColumnName = "numero")
    private Segmento segmento;

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

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }
}
