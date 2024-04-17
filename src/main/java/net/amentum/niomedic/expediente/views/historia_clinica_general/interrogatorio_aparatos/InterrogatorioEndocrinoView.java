package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioEndocrinoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean endocriAsintomatico;
    Boolean gananciaPeso;
    Integer gananciaPesoCuanto;
    String gananciaPesoEvol;
    Boolean nerviosis;
    String diabetesTipo;
    String diabetesTiempoEvol;
    String diabetesTratamiento;
    Boolean pielseca;
    String hipertiroiTiempoEvol;
    String hipertiroiCaracteristicas;
    String hipertiroiTratamiento;
    Boolean poliuria;
    String enanismoCaracteristicas;
    Integer enanismoFamiliares;
    Boolean polidipsia;
    String poliuriaTiempoEvol;
    String poliuriaCaracteristicas;
    String poliuriaTratamiento;
    Boolean perdidaPeso1;
    Integer perdidaPesoCuanto;
    String perdidaPesoEvol;
    String intoleranciaFrio;
    String intoleranciaCalor;
    Boolean acumulacionGrasaDorsocervical;
    Boolean temblor;
    String hipotiroiTiempoEvol;
    String hipotiroiCaracteristicas;
    String hipotiroiTratamiento;
    Boolean acromegalia;
    String acromegaliaTiempoEvol;
    String acromegaliaCaracteristicas;
    String acromegaliaTratamiento;
    Boolean polifagia;
    String hipofisiariosTipo;
    String hipofisiariosTiempoEvol;
    String hipofisiariosCaracteristicas;
    String hipofisiariosTratamiento;
    String comentarios;
    Boolean convulsiones;
    Boolean epilepsia;
    Boolean migrania;
    Boolean perdidaEquilibrio;
    Boolean perdidaConciencia;
    Boolean perdidaMemoria;
    Boolean parkinson;
    Boolean demencia;
    Boolean hiposensibilidad;
    Boolean hipersensibilidad;
    Boolean alodinia;
    Boolean hiperalgesia;
    Boolean parestesias;
}
