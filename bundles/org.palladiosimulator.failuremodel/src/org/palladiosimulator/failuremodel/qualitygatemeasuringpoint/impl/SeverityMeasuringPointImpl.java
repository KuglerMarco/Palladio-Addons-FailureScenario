package org.palladiosimulator.failuremodel.qualitygatemeasuringpoint.impl;


public class SeverityMeasuringPointImpl extends SeverityMeasuringPointImplGen {

    @Override
    public String getResourceURIRepresentation() {
        if(this.getSystem() != null) {
            return this.getSystem().getEntityName();
        } else {
            return null;
        }
    }
    
    @Override
    public String getStringRepresentation() {
        return "SeverityOfBrokenQualitygates";
    }
   

}
