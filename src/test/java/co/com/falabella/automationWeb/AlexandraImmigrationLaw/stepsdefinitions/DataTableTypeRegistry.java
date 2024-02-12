package co.com.falabella.automationWeb.AlexandraImmigrationLaw.stepsdefinitions;

import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableTypeRegistry {

    @DataTableType
    public Map<String, String> mapConverter(Map<String, String> dataTable) {
        return dataTable;
    }
}
