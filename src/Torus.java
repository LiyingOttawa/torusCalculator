
public class Torus {
	//declaration of Class Torus' property 
	private float outerRadius;
	private float innerRadius;
	
	public Torus() {
		
	}
	//getter and setter
	public float getOuterRadius() {
		return outerRadius;
	}

	public void setOuterRadius(float outerRadius) {
		this.outerRadius = outerRadius;
	}

	public float getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(float innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public double getVolume() {
		//declarations r is for Tube radius and R is for Radius of revolution;
		float r;
		float R;
		double volume;
		
		r = (outerRadius - innerRadius)/2;
		R = (innerRadius + outerRadius)/2;
		volume = 2*Math.pow(Math.PI, 2)* Math.pow(r, 2)*R;
		
	return volume;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
