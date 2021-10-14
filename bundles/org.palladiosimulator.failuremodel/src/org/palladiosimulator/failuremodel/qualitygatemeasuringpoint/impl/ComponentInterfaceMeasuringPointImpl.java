package org.palladiosimulator.failuremodel.qualitygatemeasuringpoint.impl;

public class ComponentInterfaceMeasuringPointImpl extends ComponentInterfaceMeasuringPointImplGen {
    
    @Override
    public String getResourceURIRepresentation() {
        if(this.getRole() != null) {
            return this.role.getId();
        } else {
            return null;
        }
        
    }
    
    @Override
    public String getStringRepresentation() {
        if(this.getRole() != null) {
            return this.getRole().getEntityName();
        } else {
            return null;
        }
        
    }
    
    
    
    
    
    
}
