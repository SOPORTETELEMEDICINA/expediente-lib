package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioRespiratorioView {
    Long idInterrogatorio;
    @NotNull(message = "id de historia clinica general vacio")
    Long idHistoriaClinica;
    Boolean resAsintomatico;
    Boolean dolorToracico;
    String dolorToracicoEvolucion;
    String dolorToracicoTrata;
    Boolean hemoptisis;
    String hemoptisisEvolucion;
    String hemoptisisTrata;
    Boolean cianosis;
    String cianosisEvolucion;
    String cianosisTrata;
    Boolean ortopnea;
    Boolean humpro;
    Boolean humnopro;
    Boolean toseca;
    Boolean hipo;
    Boolean silvidores;
    Integer almohadasDuerme;
    Boolean estornudos;
    String estornudosSalva;
    Boolean rinitis;
    String rinititsEvolucion;
    String rinitisTrata;
    Boolean dolorMandibular;
    Boolean mandibularDerecha;
    Boolean mandibularIzquierda;
    Boolean diaforesis;
    String diaforesisInput;
    Boolean disnea;
    String disneaMotivo;
    Boolean disneaGesfuerzos;
    Boolean disneaMesfuerzos;
    Boolean disneaPesfuerzos;
    String disneaEvolucion;
    Boolean usoOxigeno;
    String oxigenoEvolucion;
    Boolean rinorreaSi;
    String rinorrea;
    Boolean rinolaliaSi;
    String rinolalia;
    Boolean disfonia;
    String disfoniaEvolucion;
    String disfoniaTratamiento;
    Boolean amigdalitis;
    String amigdalitisFrecuencia;
    String amigdalitisEvolucion;
    String amigdalitisTratamiento;
    Boolean expectoracion;
    String expecTipo;
    Boolean expecVerde;
    Boolean expecAmarilla;
    Boolean expecTransparente;
    Boolean expecBlanquecina;
    String expecEvolucion;
    String expecTratamiento;
    Boolean faringitis;
    String faringitisEvolucion;
    String faringitisTratamiento;
    Boolean dolorTorax;
    String dolorToraxEvolucion;
    String dolorToraxTratamiento;
    Boolean ruidos;
    String ruidosFrecuencia;
    String ruidosEvolucion;
    String comentarios;
}
