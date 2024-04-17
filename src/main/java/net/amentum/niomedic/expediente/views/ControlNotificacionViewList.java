package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ControlNotificacionViewList {
    Long idUserApp;
    String idDevice;
    String idNotification;
    Time hora;
    Integer periodo;
}
