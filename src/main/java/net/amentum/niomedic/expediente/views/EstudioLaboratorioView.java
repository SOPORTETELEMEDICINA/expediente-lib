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
public class EstudioLaboratorioView implements Serializable {
    private Long idEstudioLaboratorio;
    private String idMedico;
    private Date fechaCreacion;
    private String tipoEstudio;
    private String observaciones;
   //   por nuevas pantallas
   private String nombreLaboratorio;
   private String idPaciente;
   private String resultado;
   private String rango;


    private Collection<ImagenLaboratorioView> imagenLaboratorioViewList = new ArrayList<>();

   @Override
   public String toString() {
      return "EstudioLaboratorioView{" +
         "idEstudioLaboratorio=" + idEstudioLaboratorio +
         ", idMedico='" + idMedico + '\'' +
         ", fechaCreacion=" + fechaCreacion +
         ", tipoEstudio='" + tipoEstudio + '\'' +
         ", observaciones='" + observaciones + '\'' +
         ", nombreLaboratorio='" + nombreLaboratorio + '\'' +
         ", idPaciente='" + idPaciente + '\'' +
         ", resultado='" + resultado + '\'' +
         ", rango='" + rango + '\'' +

         '}';
   }
}

