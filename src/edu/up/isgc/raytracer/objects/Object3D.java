package edu.up.isgc.raytracer.objects;

import edu.up.isgc.material.MaterialShader;
import edu.up.isgc.raytracer.Intersection;
import edu.up.isgc.raytracer.Ray;
import edu.up.isgc.raytracer.Vector3D;

/**
 *
 * @author Alan Maldonado
 */
public abstract class Object3D {  
    private Vector3D position;
    private MaterialShader shader;

    /***
     * 
     * @param position
     * @param shader
     */
    public Object3D(Vector3D position, MaterialShader shader){
        setPosition(position);
        setShader(shader);
    }
    
    /***
     * Get Object Position
     * @return
     */
    public Vector3D getPosition() {
        return position;
    }

    /***
     * Set object position
     * @param position
     */
    public void setPosition(Vector3D position) {
        this.position = position;
    }

    
    public abstract Intersection getIntersection(Ray ray);

    /***
     * Get Object Shader
     * @return
     */
	public MaterialShader getShader() {
		return shader;
	}

	/***
	 * Set Object Shader
	 * @param shader
	 */
	public void setShader(MaterialShader shader) {
		this.shader = shader;
	}
    
}
