package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class PadecimientoView implements Serializable {
   private Long idPadecimiento;
   private String idPaciente;
   private String idMedico;
   private Date fechaCreacion;
   private String creadoPor;

   private String resumen;
//   private String motivoConsulta;
//   private String exploracionFisica;
   private String diagnostico;

   private Collection<EstudioLaboratorioView> estudioLaboratorioViewList = new ArrayList<>();
   private Long consultaId;
   private Collection<DocumentosView> documentosViewList = new ArrayList<>();
   //   private Long catDiagnosticoId;
   private Long cie10Id;
//   por nuevas pantallas
   private Date fechaAlta;
   private Boolean presuntivo;
   private String idMedicoTratante;
//   private String sintomas;

   private String nombreMedicoTratante;
   private Boolean estatus;
   private String nombrePadecimiento;
   private String catalogKey;
   private String observaciones;

   private String esCauses;
   private String esSuiveMorb;
   private Integer esNuevo;

   // las relaciones
   private Collection<ConsultaView> consultaViewList = new ArrayList<>();

   @Override
   public String toString() {
      return "PadecimientoView{" +
         "idPadecimiento=" + idPadecimiento +
         ", idPaciente='" + idPaciente + '\'' +
         ", idMedico='" + idMedico + '\'' +
         ", fechaCreacion=" + fechaCreacion +
         ", creadoPor='" + creadoPor + '\'' +
         ", resumen='" + resumen + '\'' +
         ", diagnostico='" + diagnostico + '\'' +
         ", cie10Id=" + cie10Id +
         ", fechaAlta=" + fechaAlta +
         ", presuntivo=" + presuntivo +
         ", idMedicoTratante='" + idMedicoTratante + '\'' +
         ", nombreMedicoTratante='" + nombreMedicoTratante + '\'' +
         ", estatus=" + estatus +
         ", nombrePadecimiento='" + nombrePadecimiento + '\'' +
         ", catalogKey='"+catalogKey+'\''+
         ", observaciones='"+observaciones+'\''+
              ", esCauses='"+esCauses+'\''+
              ", esSuiveMorb='"+esSuiveMorb+'\''+
              ", esNuevo='"+esNuevo+'\''+


              '}';
   }

}
