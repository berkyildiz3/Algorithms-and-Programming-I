import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import cs101.sosgame.*;
/*
 *Hurol Volkan Kasikaralar 
 * Lab04b
 * SOSCanvas
 * * * * * * */

public class SOSCanvas extends JPanel{
  //varibles
  private int size;
  private ArrayList<Rectangle> cells;
  private int row;
  private int column;
  MouseListener event;
  SOS enter;  
  //constructor
  public SOSCanvas(SOS enter, MouseListener e){
    event = e;
    this.enter=enter;
    cells = new ArrayList<Rectangle>((column * row));
    size =enter.getDimension();
    setPreferredSize(new Dimension(501,501));
  }
  //paintcomponent
  @Override
  public void paintComponent(Graphics page){
    super.paintComponent(page);
    size = enter.getDimension();
    row = 0;
    column = 0;
    int d = (int)500 / size;
    
    for(int i = 0; i < size; i++){
      for(int k = 0; k < size ; k++){
        page.drawRect(row, column, d, d);
                row = row + d;
                String x = "" +enter.getCellContents(i,k);
                page.drawString(x,row-(d/2),column+(d/2)); 
      }
            column = column + d;
            row = 0;       
    }         
  }
}