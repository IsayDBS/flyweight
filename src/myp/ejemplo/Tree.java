package myp.ejemplo;
import java.awt.*;
//Clase contexto
//Contiene los estados unicos de cada arbol
public class Tree{
	private int x;
	private int y;
	private TreeType type;
	
	public Tree(int x, int y, TreeType type){
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public void draw(Graphics g){
		type.draw(g,x,y);
	}
}