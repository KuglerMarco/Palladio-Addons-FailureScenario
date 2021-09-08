package org.palladiosimulator.failuremodel.qualitygatemeasuringpoint.impl;

public class QualitygateMeasuringPointImpl extends QualitygateMeasuringPointImplGen {
    
    @Override
    public String getResourceURIRepresentation() {
        if(this.getQualitygate() != null) {
            return this.qualitygate.getId();
        } else {
            return null;
        }
        
    }
    
    @Override
    public String getStringRepresentation() {
        if(this.getQualitygate() != null) {
            return this.getQualitygate().getEntityName();
        } else {
            return null;
        }
        
    }

}
