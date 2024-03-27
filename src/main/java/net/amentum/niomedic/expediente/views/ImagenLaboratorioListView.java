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
public class ImagenLaboratorioListView implements Serializable {
   private Long idImagenLaboratorio;
   private String contentType;
   //    private byte[] imageContent;
   private String imageName;
   //   por nuevas pantallas
   private String idPaciente;
   private Date fechaCreacion;
   private Long consultaId;
}
