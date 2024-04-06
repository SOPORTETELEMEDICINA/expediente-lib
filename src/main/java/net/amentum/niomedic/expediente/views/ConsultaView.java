package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.amentum.niomedic.catalogos.views.CatDolometroView;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class ConsultaView implements Serializable {
   private static final long serialVersionUID = -2050978349278925112L;
   private Long idConsulta;
   private UUID idPaciente;
   private UUID idMedico;
   private String creadoPor;
   private Date fechaCrecion;
   private Date fechaConsulta;
   private Date fechaConsultaFin;
   private Date fechaInicio;
   private Date fechaCancelacion;
   private Date feachaFin;
   @NotNull
   private Integer idEstadoConsulta;
   @NotNull
   private String estadoConsulta;
   @NotNull
   private String tipoConsulta;
   @NotNull
   private Integer idTipoConsulta;
   private String canal;
   private String motivoConsulta;
   private String analisis;
   private String subjetivo;
   private String planTerapeutico;
   private String objetivo;
   private String nombreMedico;
   private String nombrePaciente;
   private Long numeroConsulta;
   private String resumen;
   private String pronostico;
   private String especialidad;
   private Boolean consultaHis;
   private Map<String, Object> signosVitales;
   private Map<String, Object> exploracionFisica;
   private CatDolometroView catDolometroView;
   private Long idUsuario;
   private UUID idMedicoSolicitado;
   private String nombreMedicoSolicitado;
   private String especialidadMedicoSolicitado;
   private Boolean urgente;
   private Boolean samu;
   private Integer idServicio;
   private String servicio;
   private Integer idMotivoEnvio;
   private String motivoEnvio;
   private String referencia1;
   private String referencia2;
   private Map<String, Object> incapacidadTemporal;
   //info meeting
   private String meeting;
   private String idUsurioZoom;
   private Long idMeeting;
   //campos agregados  en el sprint2 14/04/2021
   private Integer servicioAtencion;
   //

   private Integer gradoDificultad;
   private Integer tipoDificultad;
   private Integer origenDificultad;

   private Integer idGradoDificultad;
   private Integer idTipoDificultad;
   private Integer idOrigenDificultad;

   private Integer primeraVezAnio;
   private Integer primeraVezUneme;
   private Boolean consultaExternaService;
   private Collection<Long> listaCatCie10 = new ArrayList<>();
   private Collection<PadecimientoView> listaPadecimiento = new ArrayList<>();
   private Collection<TratamientoView> listaTartamiento = new ArrayList<>();

   @Override
   public String toString() {
      return "ConsultaView {" +
         "idConsulta=" + idConsulta +
         ", idPaciente=" + idPaciente +
         ", idMedico=" + idMedico +
         ", creadoPor=" + creadoPor +
         ", fechaCrecion=" + fechaCrecion +
         ", fechaConsulta=" + fechaConsulta +
         ", fechaConsultaFin=" + fechaConsultaFin +
         ", fechaInicio=" + fechaInicio +
         ", fechaCancelacion=" + fechaCancelacion +
         ", feachaFin=" + feachaFin +
         ", idEstadoConsulta=" + idEstadoConsulta +
         ", estadoConsulta=" + estadoConsulta +
         ", tipoConsulta=" + tipoConsulta +
         ", idTipoConsulta=" + idTipoConsulta +
         ", canal=" + canal +
         ", motivoConsulta=" + motivoConsulta +
         ", analisis=" + analisis +
         ", subjetivo=" + subjetivo +
         ", planTerapeutico=" + planTerapeutico +
         ", objetivo=" + objetivo +
         ", nombreMedico=" + nombreMedico +
         ", nombrePaciente=" + nombrePaciente +
         ", numeroConsulta=" + numeroConsulta +
         ", resumen=" + resumen +
         ", pronostico=" + pronostico +
         ", especialidad=" + especialidad +
         ", consultaHis=" + consultaHis +
         ", signosVitales=" + signosVitales +
         ", exploracionFisica=" + exploracionFisica +
         ", idUsuario=" + idUsuario +
         ", idMedicoSolicitante=" + idMedicoSolicitado +
         ", nombreMedicoSolicitante=" + nombreMedicoSolicitado +
         ", especialidadMedicoSolicitante=" + especialidadMedicoSolicitado +
         ", urgente=" + urgente +
         ", samu=" + samu +
         ", idServicio=" + idServicio +
         ", servicio=" + servicio +
         ", idMotivoEnvio=" + idMotivoEnvio +
         ", motivoEnvio=" + motivoEnvio +
         ", referencia1=" + referencia1 +
         ", referencia2=" + referencia2 +
         ", meeting=" + meeting +
         ", idUsurioZoom=" + idUsurioZoom +
         ", idMeeting=" + idMeeting +
         ", incapacidadTemporal=" + incapacidadTemporal +
         //campos agregados  en el sprint2 14/04/2021
              ", servicioAtencion="+servicioAtencion+
         //
              ", idTipoDificultad="+idTipoDificultad+
              ", idGradoDificultad="+idGradoDificultad+
              ", idOrigenDificultad="+idOrigenDificultad+
              ", primeraVezAnio="+primeraVezAnio+
              ", primeraVezUneme="+primeraVezUneme+
              ", consultaExternaService="+consultaExternaService+

              "}";
   }


}
