package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExploracionFisicaView {
    Long idExploracionFisica;
    Long idHistoriaClinica;
    Integer peso;
    Integer talla;
    Double temperatura;
    Double imc;
    Double frecuenciaCardiaca;
    Double frecuenciaRespiratoria;
    Integer saturacionOxigeno;
    TensionArterialView tensionArterial;
    EstadoConscienciaView estadoConciencia;
    HabitusExteriorView habitusExterior;
    SistemaNerviosoView sistemaNervioso;
    CabezaView cabeza;
    CuelloView cuello;
    ToraxView torax;
    AbdomenView abdomen;
    PielView piel;
    GenitalesView genitales;
    ExtremidadesView extremidades;
    String notas;
}
