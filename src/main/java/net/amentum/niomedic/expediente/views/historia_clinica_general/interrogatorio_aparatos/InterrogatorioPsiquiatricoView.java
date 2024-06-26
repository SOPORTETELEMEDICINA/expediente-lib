package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InterrogatorioPsiquiatricoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean psiquiAsintomatico;
    Boolean depresion;
    String depresionTiempoEvol;
    String depresionCaracteristicas;
    String depresionTratamiento;
    Boolean trastornosAlimentacion;
    Boolean ingestaCompulsiva;
    String ingestaCompulsivaTiempoEvol;
    String ingestaCompulsivaCaracteristicas;
    String ingestaCompulsivaTratamiento;
    Boolean trastornoAlimentacionOtro;
    String trastornoAlimentacionOtroDescripcion;
    String trastornoAlimentacionOtroTiempoEvol;
    String trastornoAlimentacionOtroCaracteristicas;
    String trastornoAlimentacionOtroTratamiento;
    Boolean bulimia;
    String bulimiaTiempoEvol;
    String bulimiaCaracteristicas;
    String bulimiaTratamiento;
    Boolean perdidaInteresSex;
    String perdidaInteresSexTiempoEvol;
    String perdidaInteresSexCaracteristicas;
    String perdidaInteresSexTratamiento;
    Boolean muySensible;
    String muySensibleTiempoEvol;
    String muySensibleCaracteristicas;
    String muySensibleTratamiento;
    Boolean anorexiaNerviosa;
    String anorexiaNerviosaTiempoEvol;
    String anorexiaNerviosaCaracteristicas;
    String anorexiaNerviosaTratamiento;
    Boolean ansiedad;
    String ansiedadTiempoEvol;
    String ansiedadCaracteristicas;
    String ansiedadTratamiento;
    Boolean llantoFacil;
    String llantoFacilTiempoEvol;
    String llantoFacilCaracteristicas;
    String llantoFacilTratamiento;
    Boolean irritabilidad;
    Boolean irritabilidadAlto;
    Boolean irritabilidadMedio;
    Boolean irritabilidadBajo;
    Boolean pensamientosSuicidas;
    String pensamientosSuicidasTiempoEvol;
    String pensamientosSuicidasCaracteristicas;
    String pensamientosSuicidasTratamiento;
    Boolean pobreConcentra;
    Boolean alucinaciones;
    String alucinacionesTipo;
    String alucinacionesTiempoEvol;
    String alucinacionesCaracteristicas;
    String alucinacionesTratamiento;
    Boolean estres;
    Boolean estresAlto;
    Boolean estresMedio;
    Boolean estresBajo;
    Boolean pensamientoApresu;
    String pensamientoApresuTiempoEvol;
    String pensamientoApresuCaracteristicas;
    Boolean paranoia;
    String paranoiaTiempoEvol;
    String paranoiaCaracteristicas;
    String paranoiaTratamiento;
    Boolean cambiosAnimoSi;
    String cambiosAnimo;
    Boolean cambiosAnimoNegado;
    Boolean comportamientoArriesgadoSi;
    Boolean fobias;
    String fobiasTipo;
    String fobiasTiempoEvol;
    Boolean psicosis;
    String psicosisTipo;
    String psicosisTiempoEvol;
    String psicosisCaracteristicas;
    String psicosisTratamiento;
    String comentarios;
    Boolean panico;
    Boolean mania;
    Boolean apatia;
    Boolean trastornosComportamiento;
    Boolean hiperactividad;
    Boolean hiposomnia;
    Boolean hipersomnia;
    Boolean parasomnia;
    Boolean delirio;
}
