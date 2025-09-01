package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print("Sua tela tem resolução ");
        System.out.println(resolucao.width + " x " + resolucao.height);
    }
}