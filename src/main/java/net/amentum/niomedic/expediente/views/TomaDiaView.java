package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TomaDiaView implements Serializable {
   private Long idTomaDia;
   private String nombreMedicamento;
   private Integer dosis;
   private String viaAdministracion;
   private String unidad;
   private Long idUsuario;
   private Date horaToma;
   private Integer frecuencia;
   private String periodo;
}
