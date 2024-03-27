package net.amentum.niomedic.expediente.views;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author  by marellano on 14/06/17.
 */
public class FormatView implements Serializable{

    private Long idFormat;
    @NotEmpty(message = "Es requerido el titulo del formato")
    private String title;
    @NotNull(message = "Es requerido el estatus del formato.")
    private Boolean active = Boolean.TRUE;
    private Integer version;
    @NotNull(message = "Es requerido el json.")
    private Map<String, Object> jsonFormat;
    @NotEmpty(message = "Es requerido el tipo de formato.")
    private String formatType;
    private String categoryName;

    private List<FormatResultView> formatResults = new ArrayList<>();

    public Long getIdFormat() {
        return idFormat;
    }

    public void setIdFormat(Long idFormat) {
        this.idFormat = idFormat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Map<String, Object> getJsonFormat() {
        return jsonFormat;
    }

    public void setJsonFormat(Map<String, Object> jsonFormat) {
        this.jsonFormat = jsonFormat;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }
    
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }



    @Override
    public String toString() {
        return "FormatView{" +
                "idFormat=" + idFormat +
                ", title='" + title + '\'' +
                ", active=" + active +
                ", version=" + version +
                ", jsonFormat='" + jsonFormat + '\'' +
                ", formatType='" + formatType + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }



    public String toStringResume() {
        return "FormatView{" +
                "idFormat=" + idFormat +
                ", title='" + title + '\'' +
                ", formatType='" + formatType + '\'' +
                '}';
    }
}
