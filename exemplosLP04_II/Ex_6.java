/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosLP04_II;

/**
 *
 * @author Kenny
 */
public class Ex_6 {
    public static void main(String[] args) {
        double s_fixo, v_venda, s_total, comissao;
        s_fixo = 6.502;
        v_venda = 2.302;
        
        comissao = v_venda*0.15;
        s_total = s_fixo+comissao;
        
        System.out.println("Saldo fixo: R$"+s_fixo);
        System.out.println("Valor de venda: R$"+v_venda);
        System.out.println("Comissão: R$"+comissao);
        System.out.println("Saldo total: R$"+s_total);
    }
}
