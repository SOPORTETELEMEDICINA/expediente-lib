package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.sql.Time;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class SaludIndNutriView implements Serializable {

    private Integer idindic;
    private String medidfk;
    private String pacidfk;
    private Float pesoinicial;
    private Float tallainicial;
    private Time p1hora;
    private Boolean nutri1lu;
    private Boolean nutri1ma;
    private Boolean nutri1mi;
    private Boolean nutri1ju;
    private Boolean nutri1vi;
    private Boolean nutri1sa;
    private Boolean nutri1do;
    private Time p2hora;
    private Boolean nutri2lu;
    private Boolean nutri2ma;
    private Boolean nutri2mi;
    private Boolean nutri2ju;
    private Boolean nutri2vi;
    private Boolean nutri2sa;
    private Boolean nutri2do;
    private Time p3hora;
    private Boolean nutri3lu;
    private Boolean nutri3ma;
    private Boolean nutri3mi;
    private Boolean nutri3ju;
    private Boolean nutri3vi;
    private Boolean nutri3sa;
    private Boolean nutri3do;
}
