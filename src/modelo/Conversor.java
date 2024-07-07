package modelo;

import vista.Formulario;

/**
 *
 * @author david
 */
public class Conversor {

    private double valor,prom;
    public double dolarL = 3586, dolarM = 3600, dolarMi = 3666, dolarJ = 3600, dolarV = 3589;//Valores respecto a semana correspondinte Abril 05-Abril 09
    
  

    public Conversor() {
        valor = 0;
        
    }

    public Conversor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " " + this.valor;
    }

    public double ConvertirDivisaDolares(String a) {

        if (a == "Lunes") {

            valor = valor * dolarL;

        } else if (a == "Martes") {
            valor = valor * dolarM;

        } else if (a == "Miercoles") {
            valor = valor * dolarMi;

        } else if (a == "Jueves") {
            valor = valor * dolarJ;

        } else if (a == "Viernes") {
            valor = valor * dolarV;

        }

        return valor;
    }

    public double ConvertirDivisaPesos(String a) {

        if (a == "Lunes") {
            valor = valor / dolarL;

        } else if (a == "Martes") {
            valor = valor / dolarM;

        } else if (a == "Miercoles") {
            valor = valor / dolarMi;

        } else if (a == "Jueves") {
            valor = valor / dolarJ;

        } else if (a == "Viernes") {
            valor = valor / dolarV;

        }

        return valor;
    }

    public double promedioSemanas() {
        
        prom = (dolarL + dolarM + dolarMi + dolarJ + dolarV) / 5;
        return prom;
    }

    public double Transaccion(String a, String b) {
        if (a == "Compra") {
            if (b == "Lunes") {
                double dolarLc = 3350;

                valor = valor / dolarLc;

            } else if (b == "Martes") {

                double dolarMc = 3400;

                valor = valor / dolarMc;

            } else if (b == "Miercoles") {
                double dolarMic = 3410;

                valor = valor / dolarMic;

            } else if (b == "Jueves") {
                double dolarJc = 3410;

                valor = valor / dolarJc;

            } else if (b == "Viernes") {
                double dolarVc = 3350;

                valor = valor / dolarVc;

            }
        } else if (a == "Venta") {
            if (b == "Lunes") {
                double dolarLv = 3400;;

                valor = valor * dolarLv;

            } else if (b == "Martes") {
                double dolarMv = 3500;

                valor = valor * dolarMv;

            } else if (b == "Miercoles") {
                double dolarMiv = 3500;

                valor = valor * dolarMiv;

            } else if (b == "Jueves") {
                double dolarJv = 3520;

                valor = valor * dolarJv;

            } else if (b == "Viernes") {
                double dolarVv = 3400;

                valor = valor * dolarVv;

            }
        }
        return valor;
    }

}
