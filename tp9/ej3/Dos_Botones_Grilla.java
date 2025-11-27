
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.border.*;
class Dos_Botones_Grilla extends JFrame {
/*Objetos Gráficos*/
  private MiEtiqueta etiqueta;
  private JButton  botonPerro,botonGato;
  private JPanel panelControl,panelImagen;
  
  public Dos_Botones_Grilla() {
//Establece los valores de los atributos del frame
     setLayout(new GridLayout(1,2));
     setSize(420, 300);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
//Arma los paneles
     armaPanelBotones();
     armaPanelImagen();
//Inserta los paneles en el panel del frame	    
     getContentPane().add(panelControl);
     getContentPane().add(panelImagen);	 
}

private void armaPanelBotones(){

  panelControl = new JPanel();
  panelControl.setBackground(Color.BLUE);
  botonPerro = new JButton("Perro");
  botonGato = new JButton("Gato"); 
  botonPerro.setPreferredSize(new Dimension(124, 50));
  botonPerro.setSize(150, 50);
  botonPerro.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.GREEN, 3, false),null));
  OyenteBotonP oyentePerro = new OyenteBotonP();
  botonPerro.addActionListener(oyentePerro);
  botonGato.setPreferredSize(new Dimension(124, 50));
  botonGato.setSize(150, 50);
  botonGato.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.GREEN, 3, false),null));
  OyenteBotonG oyenteGato = new OyenteBotonG();
  
//Insertar los botones en el panel de control
  panelControl.add(botonPerro);
  panelControl.add(botonGato);

 }
 
private void armaPanelImagen(){
  panelImagen = new JPanel();
  etiqueta = new MiEtiqueta();
  panelImagen.add(etiqueta);

}
 
private class OyenteBotonP implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    etiqueta.setIcon(new ImageIcon("perro.gif"));
    etiqueta.setText("Jack");
   }  
}
 private class OyenteBotonG implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    etiqueta.setIcon(new ImageIcon("gato.gif"));
    etiqueta.setText("Tom");
   }  
 }
}