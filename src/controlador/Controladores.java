package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Formulario;
import modelo.Conversor;

/**
 *
 * @author david
 */
public class Controladores implements ActionListener {

    private Formulario objVista;
    private Conversor objModel;

    public Controladores() {
        objVista = new Formulario();
        objVista.setLocationRelativeTo(null);
        objVista.setVisible(true);
        objVista.getBtn_Convertir().addActionListener(this);
        objVista.getBtn_Transaccion().addActionListener(this);
        objVista.getBtnProm().addActionListener(this);
        objModel = new Conversor();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == objVista.getBtn_Convertir()) {
            double valor = 0;
            String opcion = this.objVista.getJCDias().getSelectedItem().toString();
            String divisa = this.objVista.getJCDivisa().getSelectedItem().toString();
            String dato = objVista.getTxt_Cantidad().getText();
            valor = Double.parseDouble(dato);
            double rta = 0;
            objModel.setValor(valor);
            if (divisa == "dolares a pesos") {
                rta = objModel.ConvertirDivisaDolares(opcion);
                objVista.getLbl_rtaConversion().setText("$ " + String.format("%.2f", rta) + " pesos colombianos");
                this.objVista.getTxtTaza().setText("La taza del dia " + opcion + " es de " + String.format("%.2f", rta / valor) + " pesos colombianos ");
            } else if (divisa == "pesos a dolares") {
                rta = objModel.ConvertirDivisaPesos(opcion);
                objVista.getLbl_rtaConversion().setText("USD " + String.format("%.2f", rta) + " dolares");
            }

        } else if (ae.getSource() == objVista.getBtn_Transaccion()) {
            double valor = 0;
            String opcion = this.objVista.getJCDias().getSelectedItem().toString();
            String tipo_Trans = this.objVista.getJC_compra_venta().getSelectedItem().toString();
            String dato = objVista.getTxt_Transaccion().getText();
            valor = Double.parseDouble(dato);
            double rta = 0;
            objModel.setValor(valor);
            if(tipo_Trans=="Compra"){
                rta = objModel.Transaccion(tipo_Trans,opcion);

            objVista.getLbl_rtaTransaccion().setText("Con " + dato + " Pesos colombianos puede comprar " + String.format("%.2f", rta) + " dolares");
            objVista.getTxtCompra_venta().setText(" el valor de compra del dia "+opcion+" es de "+ String.format("%.2f", valor/rta));
            
            }else if(tipo_Trans=="Venta"){
                rta = objModel.Transaccion(tipo_Trans,opcion);

                objVista.getLbl_rtaTransaccion().setText("Con " + dato + " dolares puede obtener " + String.format("%.2f", rta) + " pesos colombianos");
                objVista.getTxtCompra_venta().setText(" el valor de venta del dia "+opcion+" es de "+ String.format("%.2f", rta/valor  ));
            }
            
        } else if (ae.getSource() == objVista.getBtnProm()) {
            double prom = 0;
            prom = this.objModel.promedioSemanas();
            objVista.getTxtProm().setText("El promedio de la semana es " + String.format("%.2f", prom));
        }
    }

}
