package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.io.Serializable;
import java.sql.Time;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaludIndCovidView implements Serializable {

    private Integer idindic;
    private String medidfk;
    private String pacidfk;
    private Time p1hora;
    private Boolean covid1lu;
    private Boolean covid1ma;
    private Boolean covid1mi;
    private Boolean covid1ju;
    private Boolean covid1vi;
    private Boolean covid1sa;
    private Boolean covid1do;
    private Time p2hora;
    private Boolean covid2lu;
    private Boolean covid2ma;
    private Boolean covid2mi;
    private Boolean covid2ju;
    private Boolean covid2vi;
    private Boolean covid2sa;
    private Boolean covid2do;
    private Time p3hora;
    private Boolean covid3lu;
    private Boolean covid3ma;
    private Boolean covid3mi;
    private Boolean covid3ju;
    private Boolean covid3vi;
    private Boolean covid3sa;
    private Boolean covid3do;
    private Time p4hora;
    private Boolean covid4lu;
    private Boolean covid4ma;
    private Boolean covid4mi;
    private Boolean covid4ju;
    private Boolean covid4vi;
    private Boolean covid4sa;
    private Boolean covid4do;
}
