/**
 * 
 */
package info.goyun.sample;

import javax.inject.Named;

/**
 * @author Ruz
 * 
 */
@Named
public class Bean1 {
	public String getHello() {
		return "Hello CDI";
	}
}
