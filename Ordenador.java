class Ordenador {
    String marca, procesador, pantalla;
    boolean ordenadorEncendido, presentacion;

    void encenderOrdenador(){
        if (ordenadorEncendido == true)
            System.out.println("El ordenador ya esta en marcha");
            else{
                ordenadorEncendido = true;
                System.out.println("El ordenador se ha encendido");
            }
    }

    void estado(){
        System.out.println("Estado del ordenador\n" + "Marca: " + marca + "\nProcesador: " + procesador + "\nPantalla: " + pantalla + "\n");
        if (ordenadorEncendido == true)
            System.out.println("El ordenador esta encendido");
        else
            System.out.println("El ordenador esta apagado");
    }
    public static void main(String[] args) {
        //clase ordenador, el objeto es MiPC
        Ordenador MiPC = new Ordenador();
        MiPC.marca = "IBM";
        MiPC.procesador = "Intel Pentium IV";
        MiPC.pantalla = "TFT";
        MiPC.encenderOrdenador();
        MiPC.estado();
    }
    
}
