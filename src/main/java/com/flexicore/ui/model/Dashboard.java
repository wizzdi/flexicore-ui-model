package com.flexicore.ui.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.model.Baseclass;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Dashboard extends Baseclass {
    static Dashboard s_Singleton = new Dashboard();
    public static Dashboard s() {
        return s_Singleton;
    }

    @Lob
    private String contextString;


    @OneToMany(targetEntity = DashboardElement.class,mappedBy = "dashboard",cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JsonIgnore
    private List<DashboardElement> dashboardElements=new ArrayList<>();

    @OneToMany(targetEntity = DashboardElement.class,mappedBy = "dashboard",cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JsonIgnore
    public List<DashboardElement> getDashboardElements() {
        return dashboardElements;
    }

    public <T extends Dashboard> T setDashboardElements(List<DashboardElement> dashboardElements) {
        this.dashboardElements = dashboardElements;
        return (T) this;
    }

    @Lob
    public String getContextString() {
        return contextString;
    }

    public <T extends Dashboard> T setContextString(String contextString) {
        this.contextString = contextString;
        return (T) this;
    }
}
