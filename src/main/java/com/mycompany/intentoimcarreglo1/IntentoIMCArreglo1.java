
package com.mycompany.intentoimcarreglo1;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class IntentoIMCArreglo1 {

        int edad[];
        String nombres[];
        double altura [];
        double peso [];
        double cImc [];
    
   public class Procesos {
     public void Procesos() {
        String menu;
        menu = "OPCIONES\n";
        menu += "1. Registrar personas\n";
        menu += "2. Imprimir nombres\n";
        menu += "3. Buscar por nombre\n";
        menu += "4. Salir\n\n";

        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            validarMenu(opc);
        } while (opc != 4);
    }

    public void validarMenu(int cod) {
        switch (cod) {
            case 1:
                ingresarDatos();
                break;
            case 2:
                imprimirDatos();
                break;
            case 3:
                buscarPorNombre();
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    
	
	public void ingresarDatos() {
		System.out.println("llenar datos");
		int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
		nombres=new String[tam];
             edad = new int [nombres.length];
		
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]=JOptionPane.showInputDialog("Ingrese el nombre "+(i+1));//"Nombre"+(i+1);
                        edad[i]=Integer.parseInt(JOptionPane.showInputDialog("ingres la edad" +(i+1)));
		}
                
		
	}
       
	public void imprimirDatos() {
		System.out.println("ImprimirDatos, nombres=");
            for (int i=0; i<nombres.length; i++) {
                System.out.println(nombres[i] + "tiene una edad de " + edad[i]);
            }
	}
        
        public void encontrarImc() {
        for (int i = 0; i < peso[0]; i++) {
            cImc[i]= peso[i] / (altura[i] * altura[i]);
           

            if (cImc[i] < 18) {
                System.out.println(nombres[i] + " tiene anorexia");
            } else if (cImc[i] >= 18 && cImc[i] < 20) {
                System.out.println(nombres[i] + " tiene delgadez");
            } else if (cImc[i] >= 20 && cImc[i] < 27) {
                System.out.println(nombres[i] + " esta en el peso normal ");
            } else if (cImc[i] >= 27 && cImc[i] < 30) {
                System.out.println(nombres[i] + " tiene obesidad (Grado 1) ");
            } else if (cImc[i] >= 30 && cImc[i] < 35) {
               
    
            System.out.println(nombres[i] + " tiene obesidad (Grado 1) ");
              } else if (cImc[i] >= 35 && cImc[i]  < 40) {
             } else if (cImc[i] >= 40) {
                System.out.println(nombres[i] + " tiene obesidad (Grado 1) ");
             }
             }
             }
	
        
	public void buscarPorNombre() {
		System.out.println("buscarNombre, nombres=");
		int cont=0;
		String nombreBuscar=JOptionPane.showInputDialog("Ingrese el nombre a buscar");
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
				System.out.println("Lo encontre en la pos: "+i);
				cont++;
			}
		}
		
		if (cont>0) {
			System.out.println("Encontre a "+nombreBuscar+" "+cont+" veces");
		}else {
			System.out.println("la persona "+nombreBuscar+" no fue registrada");
		}
    }
        
        
        public void buscarnombre() {
		System.out.println("buscarNombre, nombres=");
		int cont=0;
		String nombreBuscar=JOptionPane.showInputDialog("Ingrese el nombre a buscar");
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
				System.out.println("Lo encontre en la pos: "+i);
				cont++;
			}
		}
		
		if (cont>0) {
			System.out.println("Encontre a "+nombreBuscar+" "+cont+" veces");
		}else {
			System.out.println("la persona "+nombreBuscar+" no fue registrada");
		}
    }
    
    }
    
    
}
