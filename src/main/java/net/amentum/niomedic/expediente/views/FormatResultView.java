package net.amentum.niomedic.expediente.views;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;


/**
 * @author marellano
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormatResultView implements Serializable {

   private static final long serialVersionUID = 8121122330112979921L;

   private Long idFormatResult;
   private String username;
   private FormatView formatView = new FormatView();
   private Timestamp createdDate;
   //nuevo campo para la version de formatos
   @NotNull(message = "El json de respuesta es requerido")
   private Map<String, Object> jsonAnswer;
   private String deviceId;
   @NotNull(message = "El id Consulta no puede ir vacio")
   private Long idConsulta;

   @Override
   public String toString() {
      return "FormatResultView{" +
         "idFormatResult=" + idFormatResult +
         ", username='" + username + '\'' +
         ", formatView=" + formatView +
         ", createdDate=" + createdDate +
         ", jsonAnswer=" + jsonAnswer +
         ", deviceId='" + deviceId + '\'' +
         '}';
   }


   public String toStringResume() {
      return "FormatResultView{" +
         "idFormatResult=" + idFormatResult +
         ", username='" + username + '\'' +
         '}';
   }
}
