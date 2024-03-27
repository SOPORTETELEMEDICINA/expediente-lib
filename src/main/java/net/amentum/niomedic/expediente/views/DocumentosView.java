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
public class DocumentosView implements Serializable {
   private Long idDocumentos;
   private String contentType;
   //    private byte[] imageContent;
   private String documentoName;
   //   por nuevas pantallas
   private String idPaciente;
   private Date fechaCreacion;
   private Long consultaId;
}
