package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioCardiovascularView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean hipertension; 
    String hipertensionEvolucion;
    String hipertensionTratamiento;
    Boolean palpitacion;
    String palpiEvolucion;
    Boolean cardioAsintomatico;
    String plapiTratamiento;
    Boolean bradicardia;
    String bradicardiaEvolucion;
    String bradicardiaTratamiento;
    Boolean cardiopatia;
    Boolean diaforesis;
    String cardiopatiaTipo;
    String cardiopatiaEvolucion;
    String cardiopatiaTratamiento;
    Boolean dolorOpresivo;
    Boolean taquicardia;
    String taquicardiaEvolucion;
    String taquicardiaTratamiento;
    Boolean arritmias;
    String arritmiasEvolucion;
    String arritmiasTratamiento;
    Boolean mareos;
    String mareosEvolucion;
    Boolean mareosIncorporarse;
    Boolean mareosflexionarse;
    Boolean mareosTodoMomento;
    Boolean cefalea;
    Boolean cefaleaGeneral;
    Boolean cefaleaFrontal;
    Boolean cefaleaOccipital;
    Boolean cefaleaBiparietal;
    Boolean cefaleaBitemporal;
    Boolean cefaleaUniDerecha;
    Boolean cefaleaUniIzquierda;
    Boolean disneaGesfuerzos;
    Boolean disneaMesfuerzos;
    Boolean disneaPesfuerzos;
    String disneaEvolucion;
    Boolean disneaOxigenoterapia;
    Boolean sincope;
    String sincopeEvolucion;
    String sincopeTratamiento;
    Boolean cianosisPeribucal;
    Boolean cianosisDistales;
    String petequiasSi;
    String petequias;
    Boolean edema;
    String edemaLocalizacion;
    String edemaEvolucion;
    String edemaTratamiento;
    Boolean soplo;
    String soploEvolucion;
    String soploTipo;
    Boolean hiperlipidemia;
    Boolean hiperTipo;
    Boolean hipercolesterol;
    Boolean hiperglicerol;
    String hiperEvolucion;
    String hiperTratamiento;
    String comentarios;
}
