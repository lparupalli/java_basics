package com.lalitha.shapesMultilevel;

public abstract class TwoDShapes {

    private  String shapeName;

    public TwoDShapes(String shapeName){
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract float area();
    public abstract float perimeter();

}
