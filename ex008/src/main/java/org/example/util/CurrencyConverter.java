package org.example.util;

public class CurrencyConverter {

    public static void TotalInReal(double dolarPreco, double quantidade) {
         System.out.print("REAL: R$" + (dolarPreco * quantidade * 1.06));
    }

}
