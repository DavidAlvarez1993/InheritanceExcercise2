/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author David
 */
public class Television {
    private int resolution;
    private boolean DTTTuner;

    public Television() {
    }

    public Television(int resolution, boolean DTTTuner) {
        this.resolution = resolution;
        this.DTTTuner = DTTTuner;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isDTTTuner() {
        return DTTTuner;
    }

    public void setDTTTuner(boolean DTTTuner) {
        this.DTTTuner = DTTTuner;
    }

    @Override
    public String toString() {
        return "Television{" + "resolution=" + resolution + ", DTTTuner=" + DTTTuner + '}';
    }
    
    
}
