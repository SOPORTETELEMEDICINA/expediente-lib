package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioHemolinfaticoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean hemoAsintomatico;
    Boolean nodulos;
    String nodLocalizacion;
    Boolean petequias;
    Boolean astenia;
    Boolean adinamia;
    String comentarios;
}
