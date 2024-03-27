package net.amentum.niomedic.expediente.views;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ConsultaPadecimientoView implements Serializable {
    private Long idConsulta;
    private Long idPadecimiento;

    @Override
    public String toString() {
        return "ConsultaPadecimientoView {" +
                "idConsulta=" + idConsulta +
                ", idPadecimiento=" + idPadecimiento +
                "}";

    }
}
