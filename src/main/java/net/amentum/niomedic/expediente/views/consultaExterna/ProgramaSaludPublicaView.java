package net.amentum.niomedic.expediente.views.consultaExterna;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProgramaSaludPublicaView {
    Integer imc519;
    String atencionPregestacionalRT;
    String riesgo;
    String relacionTemporalIEmbarazo;
    String trimestreGestacional;
    String primeraVezAltoRiesgo;
    String complicacionPorDiabetes;
    String complicacionPorInfeccionUrinaria;
    String complicacionPorPreenclampciaEclampsia;
    String complicacionPorHemorragia;
    String otrasAccAnalisisClinicos;
    String otrasAccPrescAcidoFolico;
    String otrasAccApoyoTranslado;
    String puerpera;
    String infeccionPuerpera;
    String terapiaHormonal;
    String periPostMenopausia;
    String its;
    String patologiaMamariaBenigna;
    String cancerMamario;
    String colposcopia;
    String cancerCervicouterino;
    String ninoSanoRT;
    String pesoParaTalla;
    String pruebaEDI;
    String resultadoEDI;
    String resultadoBatelle;
    String aplicacionCedulaCancer;
    String confirmacionCancer;
    String edasRT;
    String edasPlanTratamiento;
    String recuperadoDeshidratacion;
    String numeroSobresVSOTratamiento;
    String numeroSobresVSOPromocion;
    String irasRT;
    String irasPlanTratamiento;
    String neumoniaRT;
    String informacionPrevencionAccidentes;
    Integer lineaVida;
    Integer cartillaSalud;
    String referidoPor;
    String contraReferido;
    Integer telemedicina;
    String fechaProximaCita;
}
