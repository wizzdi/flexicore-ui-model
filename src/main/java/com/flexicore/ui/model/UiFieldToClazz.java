package com.flexicore.ui.model;

import com.flexicore.model.Baseclass;
import com.flexicore.model.Baselink;
import com.flexicore.model.Clazz;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class UiFieldToClazz extends Baselink {
    static UiFieldToClazz s_Singleton = new UiFieldToClazz();
    public static UiFieldToClazz s() {
        return s_Singleton;
    }

    private int priority;
    private boolean visible;
    private String context;
    private String categoryName;
    private String displayName;




    @Override
    @ManyToOne(targetEntity =UiField.class, cascade = {CascadeType.MERGE ,CascadeType.PERSIST})
    public UiField getLeftside() {
        return (UiField) super.getLeftside();
    }

    public void setLeftside(UiField leftside) {
        super.setLeftside(leftside);
    }

    @Override
    public void setLeftside(Baseclass leftside) {
        super.setLeftside(leftside);
    }

    @Override
    @ManyToOne(targetEntity =Clazz.class, cascade = {CascadeType.MERGE ,CascadeType.PERSIST})
    public Clazz getRightside() {
        return (Clazz) super.getRightside();
    }

    public void setRightside(Clazz rightside) {
        super.setRightside(rightside);
    }

    @Override
    public void setRightside(Baseclass rightside) {
        super.setRightside(rightside);
    }


    public int getPriority() {
        return priority;
    }

    public UiFieldToClazz setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public boolean isVisible() {
        return visible;
    }

    public UiFieldToClazz setVisible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String getContext() {
        return context;
    }

    public UiFieldToClazz setContext(String context) {
        this.context = context;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public UiFieldToClazz setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public UiFieldToClazz setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
