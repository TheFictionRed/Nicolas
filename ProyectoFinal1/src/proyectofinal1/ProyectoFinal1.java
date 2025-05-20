package proyectofinal1;


import javax.swing.JOptionPane;
/**
 *
 * @author FERNANDO
 */
public class ProyectoFinal1 extends javax.swing.JFrame {

    
    public ProyectoFinal1() {
        
        
        //Se inicializan todos los componentes gráficos
        initComponents();
        //Darle una direccion a la ventana para que esta aparezca en el centro
        setLocationRelativeTo(null);
        
        //Problema 1
        txtArea.setEditable(false);
        txtFare.setEditable(false);//Para evitar que el usuario modifique el resultad
        
        //Problema 3
        txtPP.setEditable(false);
        txtMetros.setVisible(false);
        Metros.setVisible(false);
        txtR.setVisible(false);
        txtPP.setVisible(false);
        btnR3.setVisible(false);
        btnAtras3.setVisible(false);
        
        //Problema 4
        txtInvertido.setEditable(false);
    }

       //METODO PARA SACAR EL AREA DE UN TRIANGULO
    public void area(){
    
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());
     
        double peri = (a + b + c)/2;
        txtArea.setText(String.valueOf(Math.sqrt(peri*(peri-a)*(peri-b)*(peri-c))));
    
    
    
    }
          
       //METODO PARA CONVERTIR GRADOS CELSIUS A FAHRENHEIT
    public void celsius(){
    
        
        double gr = Double.parseDouble(txtCel.getText());
        txtFare.setText(String.valueOf((gr*1.8)+32));
    
    
    }
    
    
    //METODO PARA CONVERTIR METROS A PIES
    public void pies(){
    
    double m = Double.parseDouble(txtMetros.getText());
    double pies = m * 3.28084;
    txtPP.setText(String.valueOf(pies));
    
    }
    
    
    //METODO PARA CONVERTIR METROS A PULGADAS
    public void pulg(){
        
        double m = Double.parseDouble(txtMetros.getText());
        double pulg = m * 39.3701;
        txtPP.setText(String.valueOf(pulg));
                
    }
    //METODO PARA INVERTIR UN NUMERO DE 5 DIGITOS
    public void invertir(){
    
        
    int num = Integer.parseInt(txtNum.getText());
        if (num < 10000 || num > 99999) {
            
            JOptionPane.showMessageDialog(null, "El numero no es de cinco cifras");
            
        }else{
        
            int inv = 0;
            
            while(num>0){
            
            inv = inv * 10 + num %10;
            num/=10;
            
            }
            
            txtInvertido.setText(String.valueOf(inv));
        
        }
    
    
    
    
    }
    //METODO QUE DICE DE QUE MANERA FUERON INTRODUCIDOS LOS NUMEROS
    public void numAD(){
     
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        
        if (num1<num2) {
            txtOrden.setText("Ascendente");
        }
        else if (num1>num2) {
            txtOrden.setText("Descendente");
        }else
            txtOrden.setText("Los números son iguales");
        
    }
      //METODO QUE DICE QUE ETAPA DE LA VIDA ES DEPENDIENDO LA EDAD
    public void etapaVida(){
  
    int edad = Integer.parseInt(txtEdad.getText());
    
        if (edad<0) {
            
            JOptionPane.showMessageDialog(null, "La edad que se ingreso no es valida");
            
        }else if (edad<13) {
            txtEtapa.setText("<html>La etapa en la que te encuentras es este punto de tu vida es la Niñez<html>");
        }else if (edad<18) {
            txtEtapa.setText("<html>La etapa en la que te encuentras es este punto de tu vida es la Adolescencia<html>");
        }else if (edad<60) {
            txtEtapa.setText("<html>La etapa en la que te encuentras es este punto de tu vida es la Adultez<html>");
        }else
            txtEtapa.setText("<html>La etapa en la que te encuentras es este punto de tu vida es la Vejez<html>");
        

    }
    
    //METODO QUE CALCULA EL DIA DEL AÑO EN QUE FUE PASCUA
    public void pascua(){
    int year= Integer.parseInt(txtYear.getText());
     if (year < 1900 || year > 2100) {
            JOptionPane.showMessageDialog(null,"El año debe estar entre 1900 y 2100. Su solicitud no puede ser atendida.");
        }

        
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19 * a + 24) % 30;
        int e = (2 * b + 4 * c + 6 * d + 5) % 7;
        int dia = 22 + d + e;

        if (dia > 31) {
            
            txtPascua.setText(dia+"/abril/"+year);
        } else {
            
            txtPascua.setText(dia+"/marzo/"+year);
        }
    
    
    
    
    }
    
    //METODO PARA SACAR EL NUMERO FACTORIAL DE UN NUMERO
    public void factorial(){
    
    int n = Integer.parseInt(txtNumF.getText());
    int aux=1;
        for (int i = 2; i <= n; i++) {
            aux*=i;
        }
           
    txtFact.setText(String.valueOf(aux));
    
    }
    
    public void minusculaArea(){
    
        String texto = txtArea8.getText();
      
       
        StringBuilder minusculas = new StringBuilder();

        
        for (int i = 0; i < texto.length(); i++) {
              char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                minusculas.append(c);
                minusculas.append("-");
            }
        }
      txtR8.setText(minusculas.toString());
                
    
    
    }
    
    
    
    //METODO PARA CALCULAR NUMEROS EXPONENCIALES
    public void potencia(){
        
            
        
    int n = Integer.parseInt(txtBase.getText());
    int x = Integer.parseInt(txtExp.getText());
    
        if (x==0) 
            
           txtR10.setText("1"); 
        
        else{
          int aux=1;
              for (int i = 0; i < x; i++) {
                  aux*=n;
           
              }
    
    txtR10.setText(String.valueOf(aux));
    
        }
        
    }
    
    
    
    public long potencia(int base, int exponente) {
        long resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
        
    }
    
    public void serie11(){
    
        int n = Integer.parseInt(txtN11.getText());
               
                
        if (n < 2) {
            JOptionPane.showMessageDialog(null, "n no puede ser menor a 2");
        }
       
            long suma = 0;

             for (int i = 2; i <= n; i++) {
               
                 suma += potencia(i, i);
                 
              }       
        
        
        txtR11.setText(String.valueOf(suma));
        
    
    
    
    
    }
    public void serie12(){
    
    int n = Integer.parseInt(txtS12.getText());
        if (n<2) {
            JOptionPane.showMessageDialog(null, "El número debe ser igual o mayor a 2");
        }else if (n>20) {
            JOptionPane.showMessageDialog(null, "Wl número debe ser menor a 20");
        }else{
        
        long sumaTotal = 0;
    
    for (int i = 2; i <= n; i++) {
        sumaTotal += (long) Math.pow(i, i);
    }
    
      txtR12.setText(String.valueOf("<html>El resultado es: <p><html>"+sumaTotal));
        
        
        
        
        }
    
    
    
    }
    public void serie13(){
     int n = Integer.parseInt(txtN13.getText());
        double suma = 0.0;
    
            for (int i = 0; i < n; i++) {
               double termino = 1.0 / (2 * i + 1); // Término actual: 1/(2n+1)
               if (i % 2 == 1) { // Si el índice es impar, el término es negativo
               termino *= -1;
        }
        suma += termino;
    }
    
            txtR13.setText(String.valueOf(suma));
    
    
    
    
    }
 
    public void serie14(){
    
        int x = Integer.parseInt(txtX14.getText());
        int n = Integer.parseInt(txtN14.getText());
        
        if (n < 0) {
            JOptionPane.showMessageDialog(null, "El problema pide que n sea mayor o igual a 0");
        }else if (x < 1) {
            JOptionPane.showMessageDialog(null, "El problema pide que X sea mayor o igual a 1");
        }
    
    
        double suma = 0;
        int signo = 1;
        
        for (int i = 0; i <= n; i++) {
            int expo = 2 * i;
            double termino = signo * Math.pow(x, expo);
            suma += termino;
            signo *= -1;
        }
        
         txtR14.setText(String.valueOf(suma));
    }
    /* 
    
   
    
    */
    public void maclaurin(){
    
    
    
    
    
    }
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        barraBtn = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnDiez = new javax.swing.JButton();
        btnOnce = new javax.swing.JButton();
        btnDoce = new javax.swing.JButton();
        btnTrece = new javax.swing.JButton();
        btnCatorce = new javax.swing.JButton();
        btnQuince = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        panelProblema = new javax.swing.JPanel();
        txtProblema = new javax.swing.JLabel();
        panelGeneral = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        txtInicio = new javax.swing.JLabel();
        uno = new javax.swing.JPanel();
        txtLadoA = new javax.swing.JLabel();
        txtLadoB = new javax.swing.JLabel();
        txtLadoC = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        aTriangulo = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        btnR1 = new javax.swing.JButton();
        dos = new javax.swing.JPanel();
        cel = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        fare = new javax.swing.JLabel();
        txtFare = new javax.swing.JTextField();
        btnR2 = new javax.swing.JButton();
        tres = new javax.swing.JPanel();
        btnPies = new javax.swing.JButton();
        btnPulgadas = new javax.swing.JButton();
        Metros = new javax.swing.JLabel();
        txtR = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        txtPP = new javax.swing.JTextField();
        btnR3 = new javax.swing.JButton();
        btnAtras3 = new javax.swing.JButton();
        cuatro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtInvertido = new javax.swing.JTextField();
        btnR4 = new javax.swing.JButton();
        cinco = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        txtOrden = new javax.swing.JLabel();
        btnR5 = new javax.swing.JButton();
        seis = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtEtapa = new javax.swing.JLabel();
        btnR6 = new javax.swing.JButton();
        siete = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPascua = new javax.swing.JLabel();
        btnR7 = new javax.swing.JButton();
        ocho = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea8 = new javax.swing.JTextArea();
        btnR8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtR8 = new javax.swing.JTextArea();
        nueve = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNumF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFact = new javax.swing.JLabel();
        btnR9 = new javax.swing.JButton();
        diez = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtExp = new javax.swing.JTextField();
        txtR10 = new javax.swing.JLabel();
        btnR10 = new javax.swing.JButton();
        once = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtN11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtR11 = new javax.swing.JLabel();
        btnR11 = new javax.swing.JButton();
        doce = new javax.swing.JPanel();
        txtS12 = new javax.swing.JTextField();
        txtR12 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnR12 = new javax.swing.JButton();
        trece = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtN13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtR13 = new javax.swing.JLabel();
        btnR13 = new javax.swing.JButton();
        catorce = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtX14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtN14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtR14 = new javax.swing.JLabel();
        btnR14 = new javax.swing.JButton();
        quince = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(0, 121, 121));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraBtn.setBackground(new java.awt.Color(226, 136, 90));

        btnUno.setText("1");
        btnUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUnoMouseClicked(evt);
            }
        });

        btnDos.setText("2");
        btnDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDosMouseClicked(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTresMouseClicked(evt);
            }
        });

        btnCuatro.setText("4");
        btnCuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuatroMouseClicked(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCincoMouseClicked(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeisMouseClicked(evt);
            }
        });

        btnSiete.setText("7");
        btnSiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSieteMouseClicked(evt);
            }
        });

        btnOcho.setText("8");
        btnOcho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOchoMouseClicked(evt);
            }
        });

        btnNueve.setText("9");
        btnNueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNueveMouseClicked(evt);
            }
        });

        btnDiez.setText("10");
        btnDiez.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiezMouseClicked(evt);
            }
        });

        btnOnce.setText("11");
        btnOnce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOnceMouseClicked(evt);
            }
        });

        btnDoce.setText("12");
        btnDoce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoceMouseClicked(evt);
            }
        });

        btnTrece.setText("13");
        btnTrece.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTreceMouseClicked(evt);
            }
        });

        btnCatorce.setText("14");
        btnCatorce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatorceMouseClicked(evt);
            }
        });

        btnQuince.setText("15");
        btnQuince.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuinceMouseClicked(evt);
            }
        });

        btnInicio.setText("Inicio");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraBtnLayout = new javax.swing.GroupLayout(barraBtn);
        barraBtn.setLayout(barraBtnLayout);
        barraBtnLayout.setHorizontalGroup(
            barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraBtnLayout.createSequentialGroup()
                        .addGroup(barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(btnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrece, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCatorce, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuince, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraBtnLayout.createSequentialGroup()
                        .addComponent(btnOnce, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 170, Short.MAX_VALUE))
                    .addGroup(barraBtnLayout.createSequentialGroup()
                        .addGroup(barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDiez, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        barraBtnLayout.setVerticalGroup(
            barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUno)
                    .addComponent(btnDoce))
                .addGap(18, 18, 18)
                .addGroup(barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDos)
                    .addComponent(btnTrece))
                .addGap(18, 18, 18)
                .addGroup(barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTres)
                    .addComponent(btnCatorce))
                .addGap(18, 18, 18)
                .addGroup(barraBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuatro)
                    .addComponent(btnQuince))
                .addGap(18, 18, 18)
                .addComponent(btnCinco)
                .addGap(18, 18, 18)
                .addComponent(btnSeis)
                .addGap(18, 18, 18)
                .addComponent(btnSiete)
                .addGap(18, 18, 18)
                .addComponent(btnOcho)
                .addGap(18, 18, 18)
                .addComponent(btnNueve)
                .addGap(18, 18, 18)
                .addComponent(btnDiez)
                .addGap(18, 18, 18)
                .addComponent(btnOnce)
                .addGap(16, 16, 16))
        );

        bg.add(barraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 600));

        panelProblema.setBackground(new java.awt.Color(0, 94, 94));

        txtProblema.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProblema.setForeground(new java.awt.Color(255, 255, 255));
        txtProblema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelProblemaLayout = new javax.swing.GroupLayout(panelProblema);
        panelProblema.setLayout(panelProblemaLayout);
        panelProblemaLayout.setHorizontalGroup(
            panelProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtProblema, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        panelProblemaLayout.setVerticalGroup(
            panelProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtProblema, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        bg.add(panelProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 640, 140));

        panelGeneral.setBackground(new java.awt.Color(79, 79, 79));

        inicio.setBackground(new java.awt.Color(79, 79, 79));

        txtInicio.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        txtInicio.setForeground(new java.awt.Color(95, 241, 241));
        txtInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInicio.setText("PROYECTO FINAL");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        panelGeneral.addTab("tab1", inicio);

        uno.setBackground(new java.awt.Color(79, 79, 79));

        txtLadoA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtLadoA.setForeground(new java.awt.Color(255, 255, 255));
        txtLadoA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLadoA.setText("Lado (A)");

        txtLadoB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtLadoB.setForeground(new java.awt.Color(255, 255, 255));
        txtLadoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLadoB.setText("Lado (B)");

        txtLadoC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtLadoC.setForeground(new java.awt.Color(255, 255, 255));
        txtLadoC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLadoC.setText("Lado (C)");

        txtA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtB.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aTriangulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        aTriangulo.setForeground(new java.awt.Color(255, 255, 255));
        aTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTriangulo.setText("Área del triangulo");

        txtArea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnR1.setBackground(new java.awt.Color(0, 255, 0));
        btnR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout unoLayout = new javax.swing.GroupLayout(uno);
        uno.setLayout(unoLayout);
        unoLayout.setHorizontalGroup(
            unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unoLayout.createSequentialGroup()
                .addGroup(unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(unoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLadoB, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtLadoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLadoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtA)
                            .addComponent(txtB)
                            .addComponent(txtC, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGap(135, 135, 135)
                        .addComponent(btnR1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(unoLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(unoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(aTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        unoLayout.setVerticalGroup(
            unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unoLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(unoLayout.createSequentialGroup()
                        .addGroup(unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(txtLadoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtB, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(txtLadoB, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC)))
                    .addComponent(btnR1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(aTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab2", uno);

        dos.setBackground(new java.awt.Color(79, 79, 79));

        cel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cel.setForeground(new java.awt.Color(255, 255, 255));
        cel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cel.setText("Grados Celsius");

        txtCel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fare.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fare.setForeground(new java.awt.Color(255, 255, 255));
        fare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fare.setText("Grados Fahrenheit");

        txtFare.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFare.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnR2.setBackground(new java.awt.Color(0, 255, 0));
        btnR2.setBorder(null);
        btnR2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dosLayout = new javax.swing.GroupLayout(dos);
        dos.setLayout(dosLayout);
        dosLayout.setHorizontalGroup(
            dosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dosLayout.createSequentialGroup()
                .addGroup(dosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cel)
                        .addGap(18, 18, 18)
                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(fare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addComponent(btnR2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        dosLayout.setVerticalGroup(
            dosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dosLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(dosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(dosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnR2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGroup(dosLayout.createSequentialGroup()
                        .addGroup(dosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(dosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab3", dos);

        tres.setBackground(new java.awt.Color(79, 79, 79));
        tres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnPies.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPies.setText("Metros a pies");
        btnPies.setBorder(null);
        btnPies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPiesMouseClicked(evt);
            }
        });

        btnPulgadas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPulgadas.setText("Metros a pulgadas");
        btnPulgadas.setBorder(null);
        btnPulgadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPulgadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPulgadasMouseClicked(evt);
            }
        });

        Metros.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Metros.setForeground(new java.awt.Color(255, 255, 255));
        Metros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Metros.setText("Metros");

        txtR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtR.setForeground(new java.awt.Color(255, 255, 255));
        txtR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtMetros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtMetros.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnR3.setBackground(new java.awt.Color(0, 255, 0));
        btnR3.setBorder(null);
        btnR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR3MouseClicked(evt);
            }
        });

        btnAtras3.setText("Atrás");
        btnAtras3.setBorder(null);
        btnAtras3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtras3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tresLayout = new javax.swing.GroupLayout(tres);
        tres.setLayout(tresLayout);
        tresLayout.setHorizontalGroup(
            tresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tresLayout.createSequentialGroup()
                .addGroup(tresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tresLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnPies, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tresLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(tresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tresLayout.createSequentialGroup()
                                .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPP, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tresLayout.createSequentialGroup()
                                .addComponent(Metros, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addComponent(btnR3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        tresLayout.setVerticalGroup(
            tresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tresLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(tresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPies, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(tresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tresLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(tresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Metros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(tresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tresLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnR3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(btnAtras3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        panelGeneral.addTab("tab4", tres);

        cuatro.setBackground(new java.awt.Color(79, 79, 79));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa un número de cinco cifras");

        txtNum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Número invertido");

        txtInvertido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtInvertido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnR4.setBackground(new java.awt.Color(0, 255, 0));
        btnR4.setForeground(new java.awt.Color(0, 255, 0));
        btnR4.setBorder(null);
        btnR4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cuatroLayout = new javax.swing.GroupLayout(cuatro);
        cuatro.setLayout(cuatroLayout);
        cuatroLayout.setHorizontalGroup(
            cuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuatroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(cuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(txtInvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnR4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        cuatroLayout.setVerticalGroup(
            cuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuatroLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cuatroLayout.createSequentialGroup()
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnR4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtInvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab5", cuatro);

        cinco.setBackground(new java.awt.Color(79, 79, 79));
        cinco.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresa el primer numero");
        jLabel4.setRequestFocusEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresa el segundo numero");

        txtNum1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNum2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOrden.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtOrden.setForeground(new java.awt.Color(255, 255, 255));
        txtOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnR5.setBackground(new java.awt.Color(0, 255, 0));
        btnR5.setBorder(null);
        btnR5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cincoLayout = new javax.swing.GroupLayout(cinco);
        cinco.setLayout(cincoLayout);
        cincoLayout.setHorizontalGroup(
            cincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cincoLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnR5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(cincoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(60, 60, 60))
            .addGroup(cincoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        cincoLayout.setVerticalGroup(
            cincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cincoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(cincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cincoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cincoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnR5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        panelGeneral.addTab("tab7", cinco);

        seis.setBackground(new java.awt.Color(79, 79, 79));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresa tu edad");

        txtEdad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEtapa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEtapa.setForeground(new java.awt.Color(255, 255, 255));
        txtEtapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnR6.setBackground(new java.awt.Color(0, 255, 0));
        btnR6.setBorder(null);
        btnR6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout seisLayout = new javax.swing.GroupLayout(seis);
        seis.setLayout(seisLayout);
        seisLayout.setHorizontalGroup(
            seisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seisLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(seisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEdad)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                    .addComponent(txtEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnR6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        seisLayout.setVerticalGroup(
            seisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seisLayout.createSequentialGroup()
                .addGroup(seisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seisLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seisLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnR6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab6", seis);

        siete.setBackground(new java.awt.Color(79, 79, 79));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Introduce el año");

        txtYear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pascua fue un:");

        txtPascua.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPascua.setForeground(new java.awt.Color(255, 255, 255));
        txtPascua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnR7.setBackground(new java.awt.Color(0, 255, 0));
        btnR7.setBorder(null);
        btnR7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sieteLayout = new javax.swing.GroupLayout(siete);
        siete.setLayout(sieteLayout);
        sieteLayout.setHorizontalGroup(
            sieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sieteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(sieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtYear, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(txtPascua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sieteLayout.createSequentialGroup()
                .addContainerGap(426, Short.MAX_VALUE)
                .addComponent(btnR7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        sieteLayout.setVerticalGroup(
            sieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sieteLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(sieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtYear, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(sieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(txtPascua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(btnR7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab8", siete);

        ocho.setBackground(new java.awt.Color(79, 79, 79));

        txtArea8.setBackground(new java.awt.Color(79, 79, 79));
        txtArea8.setColumns(20);
        txtArea8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtArea8.setForeground(new java.awt.Color(255, 255, 255));
        txtArea8.setRows(5);
        jScrollPane1.setViewportView(txtArea8);

        btnR8.setBackground(new java.awt.Color(0, 255, 0));
        btnR8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR8MouseClicked(evt);
            }
        });

        txtR8.setBackground(new java.awt.Color(79, 79, 79));
        txtR8.setColumns(20);
        txtR8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtR8.setForeground(new java.awt.Color(255, 255, 255));
        txtR8.setRows(5);
        jScrollPane2.setViewportView(txtR8);

        javax.swing.GroupLayout ochoLayout = new javax.swing.GroupLayout(ocho);
        ocho.setLayout(ochoLayout);
        ochoLayout.setHorizontalGroup(
            ochoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ochoLayout.createSequentialGroup()
                .addGroup(ochoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnR8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        ochoLayout.setVerticalGroup(
            ochoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ochoLayout.createSequentialGroup()
                .addGroup(ochoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ochoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ochoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnR8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGeneral.addTab("tab9", ocho);

        nueve.setBackground(new java.awt.Color(79, 79, 79));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Número: n!");

        txtNumF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNumF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Su facorial es: ");

        txtFact.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtFact.setForeground(new java.awt.Color(255, 255, 255));
        txtFact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnR9.setBackground(new java.awt.Color(0, 255, 0));
        btnR9.setBorder(null);
        btnR9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nueveLayout = new javax.swing.GroupLayout(nueve);
        nueve.setLayout(nueveLayout);
        nueveLayout.setHorizontalGroup(
            nueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nueveLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(nueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumF, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(txtFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnR9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        nueveLayout.setVerticalGroup(
            nueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nueveLayout.createSequentialGroup()
                .addGroup(nueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nueveLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(nueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumF, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(nueveLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnR9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(nueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFact, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab10", nueve);

        diez.setBackground(new java.awt.Color(79, 79, 79));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Número base");

        txtBase.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtBase.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Exponente");

        txtExp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtExp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtR10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtR10.setForeground(new java.awt.Color(255, 255, 255));
        txtR10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnR10.setBackground(new java.awt.Color(0, 255, 0));
        btnR10.setBorder(null);
        btnR10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnR10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout diezLayout = new javax.swing.GroupLayout(diez);
        diez.setLayout(diezLayout);
        diezLayout.setHorizontalGroup(
            diezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diezLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(diezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diezLayout.createSequentialGroup()
                        .addComponent(txtR10, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(diezLayout.createSequentialGroup()
                        .addGroup(diezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(diezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBase, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(txtExp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addComponent(btnR10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        diezLayout.setVerticalGroup(
            diezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diezLayout.createSequentialGroup()
                .addGroup(diezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diezLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(diezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBase, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(diezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtExp, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                    .addGroup(diezLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnR10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addComponent(txtR10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab11", diez);

        once.setBackground(new java.awt.Color(79, 79, 79));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("n");

        txtN11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtN11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Resultado");

        txtR11.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtR11.setForeground(new java.awt.Color(255, 255, 255));
        txtR11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnR11.setBackground(new java.awt.Color(0, 255, 0));
        btnR11.setForeground(new java.awt.Color(0, 255, 0));
        btnR11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout onceLayout = new javax.swing.GroupLayout(once);
        once.setLayout(onceLayout);
        onceLayout.setHorizontalGroup(
            onceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onceLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(onceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(onceLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnR11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(onceLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtN11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtR11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        onceLayout.setVerticalGroup(
            onceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onceLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(onceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtR11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtN11, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnR11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab12", once);

        doce.setBackground(new java.awt.Color(79, 79, 79));

        txtS12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtS12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtR12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtR12.setForeground(new java.awt.Color(255, 255, 255));
        txtR12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Número (n)");

        btnR12.setBackground(new java.awt.Color(0, 255, 0));
        btnR12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout doceLayout = new javax.swing.GroupLayout(doce);
        doce.setLayout(doceLayout);
        doceLayout.setHorizontalGroup(
            doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(doceLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnR12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtS12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtR12, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        doceLayout.setVerticalGroup(
            doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doceLayout.createSequentialGroup()
                .addGroup(doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doceLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtS12, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(btnR12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(doceLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtR12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab13", doce);

        trece.setBackground(new java.awt.Color(79, 79, 79));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("n");

        txtN13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtN13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Resultado");

        txtR13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtR13.setForeground(new java.awt.Color(255, 255, 255));
        txtR13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnR13.setBackground(new java.awt.Color(0, 255, 0));
        btnR13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout treceLayout = new javax.swing.GroupLayout(trece);
        trece.setLayout(treceLayout);
        treceLayout.setHorizontalGroup(
            treceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treceLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(treceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnR13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(treceLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtN13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtR13, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        treceLayout.setVerticalGroup(
            treceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treceLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(treceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtR13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtN13)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnR13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab15", trece);

        catorce.setBackground(new java.awt.Color(79, 79, 79));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Introduce la X");

        txtX14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtX14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Introduce la N");

        txtN14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtN14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("El resultado de la serie es:");

        txtR14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtR14.setForeground(new java.awt.Color(255, 255, 255));
        txtR14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnR14.setBackground(new java.awt.Color(0, 255, 0));
        btnR14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnR14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout catorceLayout = new javax.swing.GroupLayout(catorce);
        catorce.setLayout(catorceLayout);
        catorceLayout.setHorizontalGroup(
            catorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catorceLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtR14, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(catorceLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(catorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(catorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtX14, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(txtN14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnR14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        catorceLayout.setVerticalGroup(
            catorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catorceLayout.createSequentialGroup()
                .addGroup(catorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catorceLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(catorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtX14, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(catorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(txtN14)))
                    .addGroup(catorceLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnR14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(catorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtR14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        panelGeneral.addTab("tab14", catorce);

        quince.setBackground(new java.awt.Color(79, 79, 79));

        javax.swing.GroupLayout quinceLayout = new javax.swing.GroupLayout(quince);
        quince.setLayout(quinceLayout);
        quinceLayout.setHorizontalGroup(
            quinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        quinceLayout.setVerticalGroup(
            quinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        panelGeneral.addTab("tab16", quince);

        bg.add(panelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 640, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
             //EVENTOS EN LOS BOTONES PARA ABRIR LAS VENTANAS
    private void btnUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnoMouseClicked
        panelGeneral.setSelectedIndex(1);
        txtProblema.setText("Calcular el área de un triangulo en función de la longuitud de sus lados");
    }//GEN-LAST:event_btnUnoMouseClicked

    private void btnDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDosMouseClicked
        panelGeneral.setSelectedIndex(2);
        txtProblema.setText("Convertir grados Celsius a grados Fahrenheit");
    }//GEN-LAST:event_btnDosMouseClicked

    private void btnTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTresMouseClicked
        panelGeneral.setSelectedIndex(3);
        txtProblema.setText("Convertir metros a pies y pulgadas");
    }//GEN-LAST:event_btnTresMouseClicked

    private void btnCuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuatroMouseClicked
        panelGeneral.setSelectedIndex(4);
        txtProblema.setText("Recibir un número entero de cinco cifras y mostrarlo invertido");
    }//GEN-LAST:event_btnCuatroMouseClicked

    private void btnCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCincoMouseClicked
        panelGeneral.setSelectedIndex(5);
        txtProblema.setText("<html>Recibir dos números enteros e indicar si fueron proporcionados <p>en orden ascendente o descendente<html>");
    }//GEN-LAST:event_btnCincoMouseClicked

    private void btnSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeisMouseClicked
        panelGeneral.setSelectedIndex(6);
        txtProblema.setText("Recibir la edad de una persona e indicarle la etapa de vida en la que se encuentra");
    }//GEN-LAST:event_btnSeisMouseClicked

    private void btnSieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSieteMouseClicked
        panelGeneral.setSelectedIndex(7);
        txtProblema.setText("En que domingo fue Pascua dependiendo del año entre los años (1900-2100)");
    }//GEN-LAST:event_btnSieteMouseClicked

    private void btnOchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOchoMouseClicked
        panelGeneral.setSelectedIndex(8);
        txtProblema.setText("Mostrar todos los caracteres correspondiantes a las letras minúsculas");
    }//GEN-LAST:event_btnOchoMouseClicked

    private void btnNueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNueveMouseClicked
        panelGeneral.setSelectedIndex(9);
        txtProblema.setText("Calcular el factorial de un número proporcionado por el usuario");
    }//GEN-LAST:event_btnNueveMouseClicked

    private void btnDiezMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiezMouseClicked
        panelGeneral.setSelectedIndex(10);
        txtProblema.setText("Calcuar el resultado de elevar un valor (base), a un exponente dado");
    }//GEN-LAST:event_btnDiezMouseClicked

    private void btnOnceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOnceMouseClicked
        panelGeneral.setSelectedIndex(11);
        txtProblema.setText("Calcular el resultado de la serie: (1-3+5-7+8-13-...±2n+1), para n>=0");
    }//GEN-LAST:event_btnOnceMouseClicked

    private void btnDoceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoceMouseClicked
        panelGeneral.setSelectedIndex(12);
        txtProblema.setText("<html>Calcular el resultado de la serie: <p>(2^2 + 3^3 + 4^4 + n^n), para n>=0, n>2, n>20<html>");
    }//GEN-LAST:event_btnDoceMouseClicked

    private void btnTreceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTreceMouseClicked
        panelGeneral.setSelectedIndex(13);
        txtProblema.setText("Calcular el resultado de la serie: (1 - 1/3 + 1/5 - 1/7 + 1/9 -...±1/(2n+1)), para n>=0");
    }//GEN-LAST:event_btnTreceMouseClicked

    private void btnCatorceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatorceMouseClicked
        panelGeneral.setSelectedIndex(14);
        txtProblema.setText("Calcular el resultado de la serie: (1 - x^2 + x^4 - x^6 + x^8 -...x^2n), para n>=0 y x>=1");
    }//GEN-LAST:event_btnCatorceMouseClicked

    private void btnQuinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuinceMouseClicked
        panelGeneral.setSelectedIndex(15);
        txtProblema.setText("Calcular el resultado de la serie de Maclaurin de la función exponencial para n>=0 y x>=1");
    }//GEN-LAST:event_btnQuinceMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
       panelGeneral.setSelectedIndex(0);
       txtProblema.setText("");
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR1MouseClicked
        area();
    }//GEN-LAST:event_btnR1MouseClicked

    private void btnR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR2MouseClicked
        celsius();
    }//GEN-LAST:event_btnR2MouseClicked

    private void btnPiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPiesMouseClicked
        txtPP.setVisible(true);
        txtMetros.setVisible(true);
        Metros.setVisible(true);
        txtR.setText("Pies");
        txtR.setVisible(true);
        btnPies.setVisible(false);
        btnPulgadas.setVisible(false);
        btnR3.setVisible(true);
        btnAtras3.setVisible(true);
    }//GEN-LAST:event_btnPiesMouseClicked

    private void btnPulgadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPulgadasMouseClicked
        
        txtMetros.setVisible(true);
        Metros.setVisible(true);
        txtR.setText("Pulgadas");
        txtR.setVisible(true);
        txtPP.setVisible(true);
        btnPulgadas.setVisible(false);
        btnPies.setVisible(false);
        btnR3.setVisible(true);
        btnAtras3.setVisible(true);
        
    }//GEN-LAST:event_btnPulgadasMouseClicked

    private void btnAtras3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtras3MouseClicked
        txtPP.setVisible(false);
        txtMetros.setVisible(false);
        Metros.setVisible(false);
        txtR.setVisible(false);
        btnPulgadas.setVisible(true);
        btnPies.setVisible(true);
        btnR3.setVisible(false);
        btnAtras3.setVisible(false);
        txtPP.setText("");
        txtMetros.setText("");

    }//GEN-LAST:event_btnAtras3MouseClicked

    
    
    private void btnR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR3MouseClicked
        if (txtR.getText().equals("Pulgadas")) {
            pulg();
        }else if (txtR.getText().equals("Pies")) {
            pies();
        }
    }//GEN-LAST:event_btnR3MouseClicked

    private void btnR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR4MouseClicked
        invertir();
    }//GEN-LAST:event_btnR4MouseClicked

    private void btnR6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR6MouseClicked
        etapaVida();
    }//GEN-LAST:event_btnR6MouseClicked

    private void btnR5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR5MouseClicked
        numAD();
    }//GEN-LAST:event_btnR5MouseClicked

    private void btnR7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR7MouseClicked
        pascua();
    }//GEN-LAST:event_btnR7MouseClicked

    private void btnR9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR9MouseClicked
        factorial();
    }//GEN-LAST:event_btnR9MouseClicked

    private void btnR10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR10MouseClicked
        potencia();
    }//GEN-LAST:event_btnR10MouseClicked

    private void btnR11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR11MouseClicked
        serie11();
    }//GEN-LAST:event_btnR11MouseClicked

    private void btnR12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR12MouseClicked
        serie12();
    }//GEN-LAST:event_btnR12MouseClicked

    private void btnR13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR13MouseClicked
        serie13();
    }//GEN-LAST:event_btnR13MouseClicked

    private void btnR14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR14MouseClicked
        serie14();
    }//GEN-LAST:event_btnR14MouseClicked

    private void btnR8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnR8MouseClicked
        minusculaArea();
    }//GEN-LAST:event_btnR8MouseClicked
      
    
    public static void main(String args[]) {
               /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoFinal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Metros;
    private javax.swing.JLabel aTriangulo;
    private javax.swing.JPanel barraBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAtras3;
    private javax.swing.JButton btnCatorce;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDiez;
    private javax.swing.JButton btnDoce;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnOnce;
    private javax.swing.JButton btnPies;
    private javax.swing.JButton btnPulgadas;
    private javax.swing.JButton btnQuince;
    private javax.swing.JButton btnR1;
    private javax.swing.JButton btnR10;
    private javax.swing.JButton btnR11;
    private javax.swing.JButton btnR12;
    private javax.swing.JButton btnR13;
    private javax.swing.JButton btnR14;
    private javax.swing.JButton btnR2;
    private javax.swing.JButton btnR3;
    private javax.swing.JButton btnR4;
    private javax.swing.JButton btnR5;
    private javax.swing.JButton btnR6;
    private javax.swing.JButton btnR7;
    private javax.swing.JButton btnR8;
    private javax.swing.JButton btnR9;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTrece;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel catorce;
    private javax.swing.JLabel cel;
    private javax.swing.JPanel cinco;
    private javax.swing.JPanel cuatro;
    private javax.swing.JPanel diez;
    private javax.swing.JPanel doce;
    private javax.swing.JPanel dos;
    private javax.swing.JLabel fare;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel nueve;
    private javax.swing.JPanel ocho;
    private javax.swing.JPanel once;
    private javax.swing.JTabbedPane panelGeneral;
    private javax.swing.JPanel panelProblema;
    private javax.swing.JPanel quince;
    private javax.swing.JPanel seis;
    private javax.swing.JPanel siete;
    private javax.swing.JPanel trece;
    private javax.swing.JPanel tres;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextArea txtArea8;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JLabel txtEtapa;
    private javax.swing.JTextField txtExp;
    private javax.swing.JLabel txtFact;
    private javax.swing.JTextField txtFare;
    private javax.swing.JLabel txtInicio;
    private javax.swing.JTextField txtInvertido;
    private javax.swing.JLabel txtLadoA;
    private javax.swing.JLabel txtLadoB;
    private javax.swing.JLabel txtLadoC;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtN11;
    private javax.swing.JTextField txtN13;
    private javax.swing.JTextField txtN14;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNumF;
    private javax.swing.JLabel txtOrden;
    private javax.swing.JTextField txtPP;
    private javax.swing.JLabel txtPascua;
    private javax.swing.JLabel txtProblema;
    private javax.swing.JLabel txtR;
    private javax.swing.JLabel txtR10;
    private javax.swing.JLabel txtR11;
    private javax.swing.JLabel txtR12;
    private javax.swing.JLabel txtR13;
    private javax.swing.JLabel txtR14;
    private javax.swing.JTextArea txtR8;
    private javax.swing.JTextField txtS12;
    private javax.swing.JTextField txtX14;
    private javax.swing.JTextField txtYear;
    private javax.swing.JPanel uno;
    // End of variables declaration//GEN-END:variables
}
