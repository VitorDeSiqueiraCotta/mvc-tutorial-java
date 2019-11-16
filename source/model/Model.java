package model;

import javax.swing.JOptionPane;

public class Model {
    
    private double result;

    public Model() {
        reset();
    }

    public final void reset() {
        result = 0;
    }
    
    public void somar(String valor) {
        try {
            result += Double.parseDouble(valor);
        }
        catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. " + ex.getMessage(), "Error", 0);
        }       
    }

    public String getResult() {
        return Double.toString(result);
    }
}
