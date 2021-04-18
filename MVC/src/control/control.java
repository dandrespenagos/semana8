
package control;

//Aqui donde se estructura las conexiones y control entre la vista y el modelo 

import java.awt.event.*;
import modelo.*;
import vista.*;


public class control implements ActionListener{
    
    private vista v;
    private modelo m;
    
    public control (vista v, modelo m){
        
        this.v = v;
        this.m = m;
        this.v.insertar.addActionListener(this);
        
    }
    public void iniciar()
    {
        
        v.setTitle
        
    }}
