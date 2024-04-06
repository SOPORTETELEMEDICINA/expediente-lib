package net.amentum.niomedic.expediente.views.padronProfesional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DescripcionPuestoXmlView {
    String idDescripcionPuesto;
    String curp;
    String rfc;
    String nombre;
    String apPaterno;
    String apMaterno;
    String nacionalidad;
    String sexo;
    String codigoPuesto;
    String descripcionPuesto;
    String idEntidadPlaza;
    String idInstitucionPlaza;
    String idTipoRecurso;
    String idActividad;
    String idAreaTrabajo;
    String idCluesNomina;
    String idCluesReal;
    String idJornada;
    String horaEntrada;
    String horaSalida;
    String diasLaborales;
    String escolaridad1;
    Integer cedula1;
    String titulo1;
    String escolaridad2;
    Integer cedula2;
    String titulo2;
    String escolaridad3;
    Integer cedula3;
    String titulo3;
    Integer chkResidente;
    String idAnioResidencia;
    String certificados;
    String idTipoContrato;
    String idTipoPlaza;
    String cuentaFiel;
    String vigenciaFiel;
    Integer status;
    String fechaIngresoRegistro;
    String fechaIngresoInstitucion;
    String salarioMensual;
    String noEmpleado;
    String correo;
    String especialidadd;
}
