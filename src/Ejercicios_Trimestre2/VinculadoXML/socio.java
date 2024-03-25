package Ejercicios_Trimestre2.VinculadoXML;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="socio")
@XmlType(propOrder = {"nombreSocio","direccion","fechaAlta"})
@XmlAccessorType(XmlAccessType.FIELD)

public class socio{
    @XmlAttribute(name = "id", required = true)
    private Integer identificacion;
    @XmlElement(name = "nombre")
    private String nombreSocio;
    @XmlElement(name = "direccion")
    private String direccion;
    @XmlElement(name = "alta")
    private String fechaAlta;

    public socio() {}

    public socio(Integer identificacion, String nombreSocio, String direccion, String fechaAlta) {
        this.identificacion = identificacion;
        this.nombreSocio = nombreSocio;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
    }





}

