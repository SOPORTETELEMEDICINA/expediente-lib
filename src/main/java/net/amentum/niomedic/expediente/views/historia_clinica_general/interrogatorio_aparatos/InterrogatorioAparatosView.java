package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioAparatosView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    SentidoVisionView interrogatorioOrganoSentidosVision;
    SentidoAudicionView interrogatorioOrganoSentidosAudicion;
    SentidoOlfatoView interrogatorioOrganoSentidosOlfato;
    SentidoGustoView interrogatorioOrganoSentidosGusto;
    SentidoTactoView interrogatorioOrganoSentidosTacto;
    InterrogatorioRespiratorioView interrogatorioRespiratorio;
    InterrogatorioCardiovascularView interrogatorioCardiovascular;
    InterrogatorioDigestivoView interrogatorioDigestivo;
    InterrogatorioEndocrinoView interrogatorioEndocrino;
    InterrogatorioSistemaNerviosoView interrogatorioSistemaNervioso;
    InterrogatorioPielAnexosView interrogatorioPielyAnexos;
    InterrogatorioPsiquiatricoView interrogatorioPsiquiatrico;
    InterrogatorioGenitourinarioView interrogatorioGenitourinario;
    InterrogatorioUrinarioView interrogatorioUrinario;
    InterrogatorioReproductorView interrogatorioReproductor;
    InterrogatorioHemolinfaticoView interrogatorioHemolinfatico;
    InterrogatorioMusculoEsqueleticoView interrogatorioMusculoEsqueletico;
    InterrogatorioOncologicoView interrogatorioOncologico;
    InterrogatorioHematologicoView interrogatorioHematologico;
    String notas;
}
