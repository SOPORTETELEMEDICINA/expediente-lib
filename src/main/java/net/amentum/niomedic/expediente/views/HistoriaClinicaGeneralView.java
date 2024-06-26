package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HistoriaClinicaGeneralView implements Serializable {
   private Long idHistoriaClinicaGeneral;
   private UUID idPaciente;
   private Date fechaCreacion;
   private Float version;
   private Date vigencia;
   private Date ultimaModificacion;
   private Boolean activo;
   private String creadoPor;
   private String hcg;
   private Integer idGroup;
}
