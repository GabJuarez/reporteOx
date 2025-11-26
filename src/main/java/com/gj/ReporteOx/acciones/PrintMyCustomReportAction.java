package com.gj.ReporteOx.acciones;

import com.gj.ReporteOx.modelo.TuPrimeraEntidad;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import org.openxava.actions.JasperReportBaseAction;

import java.util.HashMap;
import java.util.Map;

public class PrintMyCustomReportAction extends JasperReportBaseAction {

    @Override
    protected JRDataSource getDataSource() throws Exception {

        return new JREmptyDataSource();
    }

    @Override
    protected String getJRXML() throws Exception {
        return "MyCustomReport.jrxml";
    }

    @Override
    protected Map getParameters() throws Exception {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("AutorReporte", "Gabriel Juarez");
        parameters.put("Titulo personalizado", "MI REPORTE PERSONALIZADO");
        return parameters;
    }

}