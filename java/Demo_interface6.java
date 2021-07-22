/**
 * 
 */
package com.ust.examples;

/**
 interface example 6
 *
 */

abstract interface MusicPlayer{
  
  public static final int defaultVolume = 30;
  
  public abstract void play();
  public abstract void stop();
}

class Mp3player  implements MusicPlayer{
	  public  void play() {
		System.out.println("playing");  
	  }
	  public  void stop(){
		System.out.println("stopped playing");  
	  }
}
public class Demo_interface6 {

	
	public static void main(String[] args) {
		
		Mp3player obj= new Mp3player();
		obj.play();
		obj.stop();
	}

}
