package controller;

import model.Model;
import view.View;
import java.awt.event.*;
import view.ViewSobre;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.addListenerBtnSomar(new btnSomar());
        view.addListenerBtnLimpar(new btnLimpar());
        view.addListenerBtnSobre(new btnSobre());
    }

    private class btnSomar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.somar(view.getEntrada());
            view.setResult(model.getResult());
        }
    }

    private class btnLimpar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.reset();
            view.setResult("");
        }
    }
    
    private class btnSobre implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ViewSobre().setVisible(true);
        }
    }
}