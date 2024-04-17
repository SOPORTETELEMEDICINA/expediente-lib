package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CabezaView {
    Long idCabeza;
    Long idHistoriaClinica;
    @JsonIgnore
    Object boca;
    @JsonIgnore
    Object ojoIzquierdo;
    @JsonIgnore
    Object ojoDerecho;
    String tipo;
    String cueroCabelludo;
    Boolean endomorficos;
    String ojoIzquierdoCejasParpadoPestana;
    String ojoIzquierdoConjuntivas;
    String ojoIzquierdoConjuntivasDescripcion;
    String ojoIzquierdoPupilas;
    String ojoIzquierdoReflejosPupulas;
    String ojoIzquierdoMovimientos;
    String ojoIzquierdoTonoOcular;
    String ojoDerechoCejasParpadoPestana;
    String ojoDerechoConjuntivas;
    String ojoDerechoConjuntivasDescripcion;
    String ojoDerechoPupilas;
    String ojoDerechoReflejosPupulas;
    String ojoDerechoMovimientos;
    String ojoDerechoTonoOcular;
    String narizPermeabilidad;
    Boolean narizSenoFrontal;
    Boolean narizSenoMaxilar;
    String narizSecreciones;
    String narizLesiones;
    String narizMasas;
    String narizCuerposExtranos;
    String oidoPabellonAuricular;
    String oidoConductoAuditivo;
    String oidoConductoAuditivoDescripcion;
    String oidoMembranaTimpanica;
    String oidoMembranaTimpanicaDescripcion;
    Boolean bocaTrismus;
    Boolean bocaHalitosis;
    Boolean bocaMucosa;
    String bocaMucosaTipo;
    Boolean bocaCandidiasis;
    String bocaLengua;
    Boolean bocaOrofaringeDolor;
    Boolean bocaOrofaringeHiperemia;
    Boolean bocaOrofaringeAmigdalas;
    String  bocaOrofaringeAmigdalasTipo;
    Boolean bocaOrofaringeCuerpoExtrano;
    Boolean bocaOrofaringeHemorragia;
    String  bocaDientes;
    Boolean bocaEnciasGingivorragia;
    Boolean bocaEnciasGingivitis;
    String conjuntiva;
    String narinas;
    String orofaringe;
    String oidos;
    String cavidadOral;
    String dentadura;
    String comentarios;
    String pupilas1;
    String pupilas2;
}
